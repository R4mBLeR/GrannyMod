package com.r4mble.grannymod.common.item;

import com.r4mble.grannymod.common.entity.custom.GrannyEntity;
import com.r4mble.grannymod.common.entity.custom.ModEntities;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TotemOfGranny extends Item {
    public TotemOfGranny(Properties properties)
    {
        super(properties);
    }
    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        World world = context.getWorld();
        ItemStack totem = context.getItem();
        world.setRainStrength(10);
        world.setThunderStrength(10);
        totem.setCount(0);
        GrannyEntity granny = new GrannyEntity(ModEntities.GRANNY.get(), world);
        granny.moveForced(context.getHitVec());
        world.addEntity(granny);

        return super.onItemUseFirst(stack,context);
    }
}
