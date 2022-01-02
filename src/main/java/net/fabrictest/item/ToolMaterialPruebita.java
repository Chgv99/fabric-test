package net.fabrictest.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialPruebita implements ToolMaterial {

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 30f;
    }

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 2.1f;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(ModItems.PRUEBITA_INGOT);
    }
    
}
