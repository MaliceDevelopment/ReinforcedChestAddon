package midford.reinforcedchest.tileEntities;

import midford.reinforcedchest.IronChestMain;
import net.brokenmoon.afloydironchest.tileEntities.TileEntityBigChest;
import net.minecraft.core.item.ItemStack;

public class TileEntityCrystalChest extends TileEntityBigChest {
    public TileEntityCrystalChest(){
        contents = new ItemStack[108];
    }
    @Override
    public String getNameTranslationKey() {
        return "container."+ IronChestMain.MOD_ID +".crystalChest.name";
    }
}
