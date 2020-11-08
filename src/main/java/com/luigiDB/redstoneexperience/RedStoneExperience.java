package com.luigiDB.redstoneexperience;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RedStoneExperience.MOD_ID)
public class RedStoneExperience {

    public static final String MOD_ID = "redstoneexperience";

    public RedStoneExperience() {
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}