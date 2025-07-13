package midford.reinforcedchest.tileEntities;

import com.mojang.nbt.tags.CompoundTag;
import midford.reinforcedchest.IronChestMain;
import net.brokenmoon.afloydironchest.tileEntities.TileEntityIronChest;

public class TileEntityIronCupboard extends TileEntityIronChest {
    public boolean shouldRenderMirrored = false;

    @Override
    public String getNameTranslationKey() {
        return "container."+ IronChestMain.MOD_ID +".ironCupboard.name";
    }


    @Override
    public void readFromNBT(CompoundTag nbttagcompound) {
        super.readFromNBT(nbttagcompound);
        this.shouldRenderMirrored = nbttagcompound.getBoolean("Mirrored");
    }

    @Override
    public void writeToNBT(CompoundTag nbttagcompound) {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.putBoolean("Mirrored", this.shouldRenderMirrored);
    }


}
