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
                        .setTex(0, "ironchest:block/diamondchesttop", Side.TOP)
                        .setTex(0, "ironchest:block/steelchestbottom", Side.BOTTOM)
                        .setTex(0, "ironchest:block/steelchestfront", Side.NORTH)
                        .setTex(0, "ironchest:block/steelchestside", Side.SOUTH)
                        .setTex(0, "ironchest:block/steelchestside", Side.EAST)
                        .setTex(0, "ironchest:block/steelchestside", Side.WEST)

        );
        ModelHelper.setBlockModel(ModBlocks.ironCupboard,() ->
                new BlockModelHorizontalRotation<>(ModBlocks.ironCupboard)
                        .setTex(0, MOD_ID+":block/ironcupboardside", Side.TOP)
                        .setTex(0, MOD_ID+":block/ironcupboardside", Side.BOTTOM)
                        .setTex(0, MOD_ID+":block/ironcupboardfront", Side.NORTH)
                        .setTex(0, MOD_ID+":block/ironcupboardside", Side.SOUTH)
                        .setTex(0, MOD_ID+":block/ironcupboardside", Side.EAST)
                        .setTex(0, MOD_ID+":block/ironcupboardside", Side.WEST)

        );
        ModelHelper.setBlockModel(ModBlocks.goldCupboard,() ->
                new BlockModelHorizontalRotation<>(ModBlocks.goldCupboard)
                        .setTex(0, MOD_ID+":block/goldcupboardside", Side.TOP)
                        .setTex(0, MOD_ID+":block/goldcupboardside", Side.BOTTOM)
                        .setTex(0, MOD_ID+":block/goldcupboardfront", Side.NORTH)
                        .setTex(0, MOD_ID+":block/goldcupboardside", Side.SOUTH)
                        .setTex(0, MOD_ID+":block/goldcupboardside", Side.EAST)
                        .setTex(0, MOD_ID+":block/goldcupboardside", Side.WEST)

        );
        ModelHelper.setBlockModel(ModBlocks.diamondCupboard,() ->
                new BlockModelHorizontalRotation<>(ModBlocks.diamondCupboard)
                        .setTex(0, MOD_ID+":block/diamondcupboardside", Side.TOP)
                        .setTex(0, MOD_ID+":block/diamondcupboardside", Side.BOTTOM)
                        .setTex(0, MOD_ID+":block/diamondcupboardfront", Side.NORTH)
                        .setTex(0, MOD_ID+":block/diamondcupboardside", Side.SOUTH)
                        .setTex(0, MOD_ID+":block/diamondcupboardside", Side.EAST)
                        .setTex(0, MOD_ID+":block/diamondcupboardside", Side.WEST)

        );
        ModelHelper.setBlockModel(ModBlocks.steelCupboard,() ->
                new BlockModelHorizontalRotation<>(ModBlocks.steelCupboard)
                        .setTex(0, MOD_ID+":block/steelcupboardside", Side.TOP)
                        .setTex(0, MOD_ID+":block/steelcupboardside", Side.BOTTOM)
                        .setTex(0, MOD_ID+":block/steelcupboardfront", Side.NORTH)
                        .setTex(0, MOD_ID+":block/steelcupboardside", Side.SOUTH)
                        .setTex(0, MOD_ID+":block/steelcupboardside", Side.EAST)
                        .setTex(0, MOD_ID+":block/steelcupboardside", Side.WEST)

        );
        ModelHelper.setBlockModel(ModBlocks.crystalChest,() ->
                new BlockModelHorizontalRotation<>(ModBlocks.crystalChest)
                        .setTex(0, "ironchest:block/ironchesttop", Side.TOP)
                        .setTex(0, "ironchest:block/steelchestbottom", Side.BOTTOM)
                        .setTex(0, "ironchest:block/steelchestfront", Side.NORTH)
                        .setTex(0, "ironchest:block/steelchestside", Side.SOUTH)
                        .setTex(0, "ironchest:block/steelchestside", Side.EAST)
                        .setTex(0, "ironchest:block/steelchestside", Side.WEST)

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
