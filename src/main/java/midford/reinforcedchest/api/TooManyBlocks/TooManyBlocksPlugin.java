package midford.reinforcedchest.api.TooManyBlocks;

import midford.reinforcedchest.IronChestMain;
import midford.reinforcedchest.gui.ScreenReinforcedChest;
import net.minecraft.client.gui.achievements.ScreenAchievements;
import turing.tmb.TMB;
import turing.tmb.api.ITMBPlugin;
import turing.tmb.api.TMBEntrypoint;
import turing.tmb.api.drawable.gui.IGuiHelper;

public class TooManyBlocksPlugin implements ITMBPlugin, TMBEntrypoint {
    @Override
    public void onGatherPlugins(boolean b) {
        TMB.LOGGER.info("Loading plugin: " + this.getClass().getSimpleName() + " from " + IronChestMain.MOD_ID);
        TMB.registerPlugin(this);
    }

    @Override
    public void registerExtraScreens(IGuiHelper helper) {
        ITMBPlugin.super.registerExtraScreens(helper);
        helper.blacklistScreen(ScreenReinforcedChest.class);

    }
}
