package com.r4mble.scarygrannymod.common.item;

import com.r4mble.scarygrannymod.ScaryGrannyMod;
import com.r4mble.scarygrannymod.common.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScaryGrannyMod.MOD_ID);

    public static Item.Properties basicProperties() {
        return new Item.Properties().group(ModItemGroups.GRANNY_MOD_TAB);
    }
    public static final RegistryObject<Item> ASHES = ITEMS.register("ashes",
            () -> new Item(basicProperties()));
    public static final RegistryObject<Item> TOTEM_OF_GRANNY = ITEMS.register("totem_of_granny",
            () -> new TotemOfGranny(basicProperties().maxStackSize(1)));
    public static final RegistryObject<Item> ASHES_DIAMOND = ITEMS.register("ashes_diamond",
            () -> new Item(basicProperties()));
    public static final RegistryObject<Item> GRANNY_BAT = ITEMS.register("granny_bat",
            () -> new SwordItem(ItemTier.IRON,10,1.6f, basicProperties().defaultMaxDamage(100)));
    }
