package midford.reinforcedchest.blocks;

import midford.reinforcedchest.tileEntities.TileEntityIronCupboard;
import midford.reinforcedchest.tileEntities.TileEntitySteelCupboard;
import net.brokenmoon.afloydironchest.blocks.IronChest;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.player.inventory.container.Container;

public class SteelCupboard extends DiamondCupboard {

    public SteelCupboard(Block<?> block, Material material) {
        super(block, material);
        block.withEntity(TileEntitySteelCupboard::new);
    }
}