package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED
 */
@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CommandBlock {
  public static final BlockState COMMAND_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:command_block_0"), (short) 5648, Block.COMMAND_BLOCK, "conditional=true","facing=north");

  public static final BlockState COMMAND_BLOCK_1 = new BlockState(NamespaceID.from("minecraft:command_block_1"), (short) 5649, Block.COMMAND_BLOCK, "conditional=true","facing=east");

  public static final BlockState COMMAND_BLOCK_2 = new BlockState(NamespaceID.from("minecraft:command_block_2"), (short) 5650, Block.COMMAND_BLOCK, "conditional=true","facing=south");

  public static final BlockState COMMAND_BLOCK_3 = new BlockState(NamespaceID.from("minecraft:command_block_3"), (short) 5651, Block.COMMAND_BLOCK, "conditional=true","facing=west");

  public static final BlockState COMMAND_BLOCK_4 = new BlockState(NamespaceID.from("minecraft:command_block_4"), (short) 5652, Block.COMMAND_BLOCK, "conditional=true","facing=up");

  public static final BlockState COMMAND_BLOCK_5 = new BlockState(NamespaceID.from("minecraft:command_block_5"), (short) 5653, Block.COMMAND_BLOCK, "conditional=true","facing=down");

  public static final BlockState COMMAND_BLOCK_6 = new BlockState(NamespaceID.from("minecraft:command_block_6"), (short) 5654, Block.COMMAND_BLOCK, "conditional=false","facing=north");

  public static final BlockState COMMAND_BLOCK_7 = new BlockState(NamespaceID.from("minecraft:command_block_7"), (short) 5655, Block.COMMAND_BLOCK, "conditional=false","facing=east");

  public static final BlockState COMMAND_BLOCK_8 = new BlockState(NamespaceID.from("minecraft:command_block_8"), (short) 5656, Block.COMMAND_BLOCK, "conditional=false","facing=south");

  public static final BlockState COMMAND_BLOCK_9 = new BlockState(NamespaceID.from("minecraft:command_block_9"), (short) 5657, Block.COMMAND_BLOCK, "conditional=false","facing=west");

  public static final BlockState COMMAND_BLOCK_10 = new BlockState(NamespaceID.from("minecraft:command_block_10"), (short) 5658, Block.COMMAND_BLOCK, "conditional=false","facing=up");

  public static final BlockState COMMAND_BLOCK_11 = new BlockState(NamespaceID.from("minecraft:command_block_11"), (short) 5659, Block.COMMAND_BLOCK, "conditional=false","facing=down");

  static {
    Registries.registerBlockState(COMMAND_BLOCK_0);
    Registries.registerBlockState(COMMAND_BLOCK_1);
    Registries.registerBlockState(COMMAND_BLOCK_2);
    Registries.registerBlockState(COMMAND_BLOCK_3);
    Registries.registerBlockState(COMMAND_BLOCK_4);
    Registries.registerBlockState(COMMAND_BLOCK_5);
    Registries.registerBlockState(COMMAND_BLOCK_6);
    Registries.registerBlockState(COMMAND_BLOCK_7);
    Registries.registerBlockState(COMMAND_BLOCK_8);
    Registries.registerBlockState(COMMAND_BLOCK_9);
    Registries.registerBlockState(COMMAND_BLOCK_10);
    Registries.registerBlockState(COMMAND_BLOCK_11);
  }

  public static void initStates() {
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_0);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_1);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_2);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_3);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_4);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_5);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_6);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_7);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_8);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_9);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_10);
    Block.COMMAND_BLOCK.addBlockState(COMMAND_BLOCK_11);
  }
}
