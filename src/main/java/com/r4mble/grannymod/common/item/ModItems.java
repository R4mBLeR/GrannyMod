package com.r4mble.grannymod.common.item;

import com.r4mble.grannymod.GrannyMod;
import com.r4mble.grannymod.common.ModItemGroups;
import com.r4mble.grannymod.common.entity.custom.GrannyEntity;
import com.r4mble.grannymod.common.entity.custom.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GrannyMod.MOD_ID);

    public static Item.Properties basicProperties() {
        return new Item.Properties().tab(ModItemGroups.GRANNY_MOD_TAB);
    }
    public static final RegistryObject<Item> ASHES = ITEMS.register("ashes",
            () -> new Item(basicProperties()));
    public static final RegistryObject<Item> TOTEM_OF_GRANNY = ITEMS.register("totem_of_granny",
            () -> new TotemOfGranny(basicProperties().stacksTo(1)));
    public static final RegistryObject<Item> ASHES_DIAMOND = ITEMS.register("ashes_diamond",
            () -> new Item(basicProperties()));
    public static final RegistryObject<Item> GRANNY_SWORD = ITEMS.register("granny_sword",
            () -> new SwordItem(ItemTier.DIAMOND,10,1.6f, basicProperties()));
    public static final RegistryObject<ForgeSpawnEggItem> GRANNY_SPAWN_EGG = ITEMS.register("granny_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GRANNY, 0x1E51ED,0x34BD27, basicProperties()));
}
