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
public final class WitherSkeletonWallSkull {
  public static final BlockState WITHER_SKELETON_WALL_SKULL_0 = new BlockState(NamespaceID.from("minecraft:wither_skeleton_wall_skull_0"), (short) 6530, Block.WITHER_SKELETON_WALL_SKULL, "facing=north");

  public static final BlockState WITHER_SKELETON_WALL_SKULL_1 = new BlockState(NamespaceID.from("minecraft:wither_skeleton_wall_skull_1"), (short) 6531, Block.WITHER_SKELETON_WALL_SKULL, "facing=south");

  public static final BlockState WITHER_SKELETON_WALL_SKULL_2 = new BlockState(NamespaceID.from("minecraft:wither_skeleton_wall_skull_2"), (short) 6532, Block.WITHER_SKELETON_WALL_SKULL, "facing=west");

  public static final BlockState WITHER_SKELETON_WALL_SKULL_3 = new BlockState(NamespaceID.from("minecraft:wither_skeleton_wall_skull_3"), (short) 6533, Block.WITHER_SKELETON_WALL_SKULL, "facing=east");

  static {
    Registries.registerBlockState(WITHER_SKELETON_WALL_SKULL_0);
    Registries.registerBlockState(WITHER_SKELETON_WALL_SKULL_1);
    Registries.registerBlockState(WITHER_SKELETON_WALL_SKULL_2);
    Registries.registerBlockState(WITHER_SKELETON_WALL_SKULL_3);
  }

  public static void initStates() {
    Block.WITHER_SKELETON_WALL_SKULL.addBlockState(WITHER_SKELETON_WALL_SKULL_0);
    Block.WITHER_SKELETON_WALL_SKULL.addBlockState(WITHER_SKELETON_WALL_SKULL_1);
    Block.WITHER_SKELETON_WALL_SKULL.addBlockState(WITHER_SKELETON_WALL_SKULL_2);
    Block.WITHER_SKELETON_WALL_SKULL.addBlockState(WITHER_SKELETON_WALL_SKULL_3);
  }
}
