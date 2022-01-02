package net.fabrictest;

import net.fabricmc.api.ModInitializer;
import net.fabrictest.block.ModBlocks;
import net.fabrictest.item.ModItems;

public class fabrictest implements ModInitializer {

    public static final String MOD_ID = "fabrictest";

    @Override
    public void onInitialize() {
        // TODO Auto-generated method stub
        ModItems.register();
        ModBlocks.register();
        
        //Registry.register(Registry.ITEM, new Identifier("fabrictest", "pruebita_ingot"), PRUEBITA_INGOT);
        //Registry.register(Registry.BLOCK, new Identifier("fabrictest", "pruebita_ore"), PRUEBITA_ORE);
        //Registry.register(Registry.ITEM, new Identifier("fabrictest", "pruebita_ore"), new BlockItem(PRUEBITA_ORE, new Item.Settings().group(ItemGroup.MATERIALS)));
        
    }
    
}
