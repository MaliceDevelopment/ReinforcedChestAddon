package midford.reinforcedchest.blocks;

import midford.reinforcedchest.tileEntities.TileEntityGoldCupboard;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;

public class GoldCupboard extends IronCupboard {

    public GoldCupboard(Block<?> block, Material material) {
        super(block, material);
        block.withEntity(TileEntityGoldCupboard::new);
    }
}