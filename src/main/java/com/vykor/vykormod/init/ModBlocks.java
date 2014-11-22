package com.vykor.vykormod.init;

import com.vykor.vykormod.block.BlockFlag;
import com.vykor.vykormod.block.BlockLMRB;
import com.vykor.vykormod.reference.Names;
import com.vykor.vykormod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
    }
}
