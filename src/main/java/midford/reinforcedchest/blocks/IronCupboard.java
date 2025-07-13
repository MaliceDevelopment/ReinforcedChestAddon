package midford.reinforcedchest.blocks;

import midford.reinforcedchest.tileEntities.TileEntityIronCupboard;
import net.brokenmoon.afloydironchest.blocks.IronChest;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.player.inventory.container.Container;

public class IronCupboard extends IronChest {

    public IronCupboard(Block<?> block, Material material) {
        super(block, material);
        block.withEntity(TileEntityIronCupboard::new);
    }

    public void displayGui(Player player, Container inventory){

        ((net.brokenmoon.afloydironchest.MixinInterfaces.IEntityPlayer)player).afloydironchest$displayGUIIronChest(inventory);
    }

}