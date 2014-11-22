package com.vykor.vykormod.init;

import com.vykor.vykormod.item.ItemLMRB;
import com.vykor.vykormod.item.ItemMapleLeaf;
import com.vykor.vykormod.reference.Names;
import com.vykor.vykormod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, Names.Items.MAPLE_LEAF);
    }
}
