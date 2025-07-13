package midford.reinforcedchest.blocks;

import net.brokenmoon.afloydironchest.MixinInterfaces.IEntityPlayer;
import midford.reinforcedchest.tileEntities.TileEntityCrystalChest;
import net.brokenmoon.afloydironchest.blocks.IronChest;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.player.inventory.container.Container;


public class CrystalChest extends IronChest {

    public CrystalChest(Block<?> block, Material material) {
        super(block, material);
        block.withEntity(TileEntityCrystalChest::new);
    }


    public void displayGui(Player player, Container inventory){
        ((IEntityPlayer)player).afloydironchest$displayGUIDiamondChest(inventory);
    }
}
