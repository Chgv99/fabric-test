package net.fabrictest.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fabrictest.fabrictest;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PRUEBITA_ORE = registerBlock("pruebita_ore",
        new Block(FabricBlockSettings.of(Material.STONE)
            .strength(1.5f)
            .breakByHand(false)
            //.breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()),
        ItemGroup.BUILDING_BLOCKS);
    //Registry.register(Registry.BLOCK, new Identifier("fabrictest", "pruebita_ore"), PRUEBITA_ORE);
    //Registry.register(Registry.ITEM, new Identifier("fabrictest", "pruebita_ore"), new BlockItem(PRUEBITA_ORE, new Item.Settings().group(ItemGroup.MATERIALS)));


    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(fabrictest.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(
            Registry.ITEM, 
            new Identifier(fabrictest.MOD_ID, name), 
            new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void register() {
        // TODO Auto-generated method stub
        //Registry.register(Registry.ITEM, new Identifier("fabrictest", "pruebita_ingot"), PRUEBITA_INGOT);
        System.out.println("Registering blocks.");
    }

}
