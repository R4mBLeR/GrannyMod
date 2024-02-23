package com.r4mble.grannymod.common.event;


import com.r4mble.grannymod.GrannyMod;
import com.r4mble.grannymod.common.entity.custom.GrannyEntity;
import com.r4mble.grannymod.common.entity.custom.ModEntities;
import com.r4mble.grannymod.common.event.loot.AshesStructureAdditionsModifier;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = GrannyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class clientEventBus {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GRANNY.get(), GrannyEntity.setCustomAttributes().create());
    }
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new AshesStructureAdditionsModifier.Serializer().setRegistryName
                        (new ResourceLocation(GrannyMod.MOD_ID,"ashes_in_pyramids"))
        );
    }

}
