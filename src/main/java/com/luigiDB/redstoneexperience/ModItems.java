package com.luigiDB.redstoneexperience;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RedStoneExperience.MOD_ID);

    public static final RegistryObject<Item> TUTORIAL_DUST = ITEMS.register("tutorial_dust", () -> new Item(new Item.Properties()));

    //Item Block
    public static final RegistryObject<Item> TUTORIAL_BLOCK = ITEMS.register("tutorial_block", () -> new BlockItem(ModBlocks.TUTORIAL_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> NOT_BLOCK = ITEMS.register("not_block", () -> new BlockItem(ModBlocks.NOT_BLOCK.get(), new Item.Properties()));

}
