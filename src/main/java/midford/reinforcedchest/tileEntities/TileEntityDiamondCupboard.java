package midford.reinforcedchest.tileEntities;

import midford.reinforcedchest.IronChestMain;
import net.brokenmoon.afloydironchest.tileEntities.TileEntityIronChest;

public class TileEntityDiamondCupboard extends TileEntityGoldCupboard {

    @Override
    public String getNameTranslationKey() {
        return "container."+ IronChestMain.MOD_ID +".diamondCupboard.name";
    }
}
