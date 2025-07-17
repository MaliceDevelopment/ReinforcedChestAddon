package midford.reinforcedchest;

import net.minecraft.core.item.Items;
import sunsetsatellite.signalindustries.SIItems;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class IronChestRecipes implements RecipeEntrypoint {
    @Override
    public void onRecipesReady() {
        RecipeBuilder.Shaped(IronChestMain.MOD_ID)
                .setShape(
                        "AAA",
                        "ABA",
                        "AAA")
                .addInput('A', SIItems.crystalAlloyIngot)
                .addInput('B', "minecraft:chests")
                .create("iron_chest", ModBlocks.reinforcedChest.getDefaultStack());

        RecipeBuilder.Shaped(IronChestMain.MOD_ID)
                .setShape(
                        "AAA",
                        "ABA",
                        "AAA")
                .addInput('A', SIItems.reinforcedCrystalAlloyIngot)
                .addInput('B', "minecraft:chests")
                .create("iron_chest", ModBlocks.reinforcedChest.getDefaultStack());
    }

    @Override
    public void initNamespaces() {
        RecipeBuilder.initNameSpace(IronChestMain.MOD_ID);
    }
}
