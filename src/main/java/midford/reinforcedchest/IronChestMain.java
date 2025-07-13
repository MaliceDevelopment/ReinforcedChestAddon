package midford.reinforcedchest;

import midford.reinforcedchest.blocks.IronCupboard;
import midford.reinforcedchest.tileEntities.*;
import net.brokenmoon.afloydironchest.tileEntities.*;
import net.minecraft.core.util.HardIllegalArgumentException;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.server.net.handler.PacketHandlerServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.Properties;


public class IronChestMain implements GameStartEntrypoint {
    public static final String MOD_ID = "reinforcedchest";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ConfigHandler config;
    static {
        // Config
        Properties prop = new Properties();
        prop.setProperty("ids.reinforcedChestID","2504");
        prop.setProperty("ids.ironCupboardID","2505");
        prop.setProperty("ids.goldCupboardID","2506");
        prop.setProperty("ids.diamondCupboardID","2507");
        prop.setProperty("ids.steelCupboardID","2508");
        prop.setProperty("ids.reinforcedWindowID","22");
        config = new ConfigHandler(MOD_ID, prop);
    }



    public static void logNetwork(String message){ // Might fix some weird class missing crash
        PacketHandlerServer.LOGGER.info(message);
    }

    @Override
    public void beforeGameStart() {

    }

    @Override
    public void afterGameStart() {
        try {
            EntityHelper.createTileEntity(TileEntityReinforcedChest.class, NamespaceID.getPermanent(MOD_ID+":reinforced_chest"));
            EntityHelper.createTileEntity(TileEntityIronCupboard.class, NamespaceID.getPermanent(MOD_ID+":iron_cupboard"));
            EntityHelper.createTileEntity(TileEntityGoldCupboard.class, NamespaceID.getPermanent(MOD_ID+":gold_cupboard"));
            EntityHelper.createTileEntity(TileEntityDiamondCupboard.class, NamespaceID.getPermanent(MOD_ID+":diamond_cupboard"));
            EntityHelper.createTileEntity(TileEntitySteelCupboard.class, NamespaceID.getPermanent(MOD_ID+":steel_cupboard"));
        } catch (HardIllegalArgumentException e) {
            throw new RuntimeException(e);
        }

        LOGGER.info("ExtendedChests initialized.");
    }
}
