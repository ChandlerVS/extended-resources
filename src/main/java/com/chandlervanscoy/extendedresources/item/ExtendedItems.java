package com.chandlervanscoy.extendedresources.item;

import com.chandlervanscoy.extendedresources.block.ExtendedBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExtendedItems {
    public static final Item COPPER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item NICKEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TITANIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("extendedresources", "copper_ingot"), COPPER_INGOT);
        Registry.register(Registry.ITEM, new Identifier("extendedresources", "nickel_ingot"), NICKEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier("extendedresources", "titanium_ingot"), TITANIUM_INGOT);
    }
}
