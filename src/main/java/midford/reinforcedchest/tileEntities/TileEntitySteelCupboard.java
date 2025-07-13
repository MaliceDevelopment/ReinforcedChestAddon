package midford.reinforcedchest.tileEntities;

import midford.reinforcedchest.IronChestMain;
import net.brokenmoon.afloydironchest.tileEntities.TileEntityDiamondChest;
import net.brokenmoon.afloydironchest.tileEntities.TileEntityIronChest;

public class TileEntitySteelCupboard extends TileEntityDiamondCupboard {

    @Override
    public String getNameTranslationKey() {
        return "container."+ IronChestMain.MOD_ID +".steelCupboard.name";
    }
}
