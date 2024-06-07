package com.r4mble.scarygrannymod.common.item;

import com.r4mble.scarygrannymod.ScaryGrannyMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.SwordItem.createAttributes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScaryGrannyMod.MOD_ID);
    public static final RegistryObject<Item> ASHES = ITEMS.register("ashes",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOTEM_OF_GRANNY = ITEMS.register("totem_of_granny",
            () -> new TotemOfGranny(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ASHES_DIAMOND = ITEMS.register("ashes_diamond",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRANNY_BAT = ITEMS.register("granny_bat",
            () -> new SwordItem(Tiers.IRON, new Item.Properties().attributes(createAttributes(Tiers.IRON, 7, -2.4f)).durability(100)));

}
