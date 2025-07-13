package midford.reinforcedchest.tileEntities;

import midford.reinforcedchest.IronChestMain;
import net.brokenmoon.afloydironchest.tileEntities.TileEntityIronChest;

public class TileEntityGoldCupboard extends TileEntityIronCupboard {

    @Override
    public String getNameTranslationKey() {
        return "container."+ IronChestMain.MOD_ID +".goldCupboard.name";
    }
}
