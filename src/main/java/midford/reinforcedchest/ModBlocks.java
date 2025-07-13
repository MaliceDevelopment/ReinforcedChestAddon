package midford.reinforcedchest;

import midford.reinforcedchest.blocks.*;
import midford.reinforcedchest.blocks.CrystalChest;
import midford.reinforcedchest.blocks.ReinforcedChest;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.BlockInitEntrypoint;

import static midford.reinforcedchest.IronChestMain.MOD_ID;
import static midford.reinforcedchest.IronChestMain.config;

public class ModBlocks implements BlockInitEntrypoint {
    public static Block<?> reinforcedChest;
    public static Block<?> ironCupboard;
    public static Block<?> goldCupboard;
    public static Block<?> diamondCupboard;
    public static Block<?> steelCupboard;
    public static Block<?> crystalChest;

    @Override
    public void afterBlockInit() {
        reinforcedChest = new BlockBuilder(MOD_ID)
                .setBlockSound(BlockSounds.METAL)
                .setHardness(2.5f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("chest.reinforced", "reinforced_chest", config.getInt("ids.reinforcedChestID"),
                        (block) -> new ReinforcedChest(block, Material.metal));
        ironCupboard = new BlockBuilder(MOD_ID)
                .setBlockSound(BlockSounds.METAL)
                .setHardness(2.5f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("cupboard.iron", "iron_cupboard", config.getInt("ids.ironCupboardID"),
                        (block) -> new IronCupboard(block, Material.metal));
        goldCupboard = new BlockBuilder(MOD_ID)
                .setBlockSound(BlockSounds.METAL)
                .setHardness(2.5f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("cupboard.gold", "gold_cupboard", config.getInt("ids.goldCupboardID"),
                        (block) -> new GoldCupboard(block, Material.metal));
        diamondCupboard = new BlockBuilder(MOD_ID)
                .setBlockSound(BlockSounds.METAL)
                .setHardness(2.5f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("cupboard.diamond", "diamond_cupboard", config.getInt("ids.diamondCupboardID"),
                        (block) -> new DiamondCupboard(block, Material.metal));
        steelCupboard = new BlockBuilder(MOD_ID)
                .setBlockSound(BlockSounds.METAL)
                .setHardness(2.5f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("cupboard.steel", "steel_cupboard", config.getInt("ids.steelCupboardID"),
                        (block) -> new SteelCupboard(block, Material.metal));

        crystalChest = new BlockBuilder(MOD_ID)
                .setBlockSound(BlockSounds.METAL)
                .setHardness(2.5f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("chest.crystal", "crystal_chest", config.getInt("ids.crystalChestID"),
                        (block) -> new CrystalChest(block, Material.metal));
    }

}
