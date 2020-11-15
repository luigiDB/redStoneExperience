package com.luigiDB.redstoneexperience;

import com.luigiDB.redstoneexperience.blocks.NotBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RedStoneExperience.MOD_ID);

    public static final RegistryObject<Block> TUTORIAL_BLOCK = BLOCKS.register("tutorial_block", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> NOT_BLOCK = BLOCKS.register("not_block", () -> new NotBlock(Block.Properties.create(Material.ROCK)));
}
