package midford.reinforcedchest;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelHorizontalRotation;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static midford.reinforcedchest.IronChestMain.MOD_ID;

public class ModModels implements ModelEntrypoint {
    @Override
    public void initBlockModels(BlockModelDispatcher blockModelDispatcher) {
        // THIS IS ACCESSING TEXTURES FROM THE IRON CHEST MOD, REMEMBER TO CHANGE THE MOD ID IF YOU ADD CUSTOM BLOCK TEXTURES
        ModelHelper.setBlockModel(ModBlocks.reinforcedChest,() ->
                new BlockModelHorizontalRotation<>(ModBlocks.reinforcedChest)
                        .setTex(0, "extendedchests:block/reinforcedchesttop", Side.TOP)
                        .setTex(0, "extendedchests:block/reinforcedchestbottom", Side.BOTTOM)
                        .setTex(0, "extendedchests:block/reinforcedchestfront", Side.NORTH)
                        .setTex(0, "extendedchests:block/reinforcedchestside", Side.SOUTH)
                        .setTex(0, "extendedchests:block/reinforcedchestside", Side.EAST)
                        .setTex(0, "extendedchests:block/reinforcedchestside", Side.WEST)

        );
        ModelHelper.setBlockModel(ModBlocks.crystalChest,() ->
                new BlockModelHorizontalRotation<>(ModBlocks.crystalChest)
                        .setTex(0, "extendedchests:block/crystalchesttop", Side.TOP)
                        .setTex(0, "extendedchests:block/crystalchestbottom", Side.BOTTOM)
                        .setTex(0, "extendedchests:block/crystalchestfront", Side.NORTH)
                        .setTex(0, "extendedchests:block/crystalchestside", Side.SOUTH)
                        .setTex(0, "extendedchests:block/crystalchestside", Side.EAST)
                        .setTex(0, "extendedchests:block/crystalchestside", Side.WEST)

        );
    }

    @Override
    public void initItemModels(ItemModelDispatcher itemModelDispatcher) {

    }

    @Override
    public void initEntityModels(EntityRenderDispatcher entityRenderDispatcher) {

    }

    @Override
    public void initTileEntityModels(TileEntityRenderDispatcher tileEntityRenderDispatcher) {

    }

    @Override
    public void initBlockColors(BlockColorDispatcher blockColorDispatcher) {

    }
}
