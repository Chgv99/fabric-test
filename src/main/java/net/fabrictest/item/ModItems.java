package net.fabrictest.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabrictest.fabrictest;
import net.fabrictest.item.PruebitaIngot;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    public static final Item PRUEBITA_INGOT = registerItem("pruebita_ingot", 
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));

    public static final Item PRUEBITA_PICKAXE = registerItem("pruebita_pickaxe", 
            new PickaxeBase(new ToolMaterialPruebita()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(fabrictest.MOD_ID, name), item);
    }

    public static void register() {
        // TODO Auto-generated method stub
        System.out.println("Registering items.");
    }

}
