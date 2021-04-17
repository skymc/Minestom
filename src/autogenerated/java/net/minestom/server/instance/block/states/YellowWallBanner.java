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
public final class YellowWallBanner {
  public static final BlockState YELLOW_WALL_BANNER_0 = new BlockState(NamespaceID.from("minecraft:yellow_wall_banner_0"), (short) 8173, Block.YELLOW_WALL_BANNER, "facing=north");

  public static final BlockState YELLOW_WALL_BANNER_1 = new BlockState(NamespaceID.from("minecraft:yellow_wall_banner_1"), (short) 8174, Block.YELLOW_WALL_BANNER, "facing=south");

  public static final BlockState YELLOW_WALL_BANNER_2 = new BlockState(NamespaceID.from("minecraft:yellow_wall_banner_2"), (short) 8175, Block.YELLOW_WALL_BANNER, "facing=west");

  public static final BlockState YELLOW_WALL_BANNER_3 = new BlockState(NamespaceID.from("minecraft:yellow_wall_banner_3"), (short) 8176, Block.YELLOW_WALL_BANNER, "facing=east");

  static {
    Registries.registerBlockState(YELLOW_WALL_BANNER_0);
    Registries.registerBlockState(YELLOW_WALL_BANNER_1);
    Registries.registerBlockState(YELLOW_WALL_BANNER_2);
    Registries.registerBlockState(YELLOW_WALL_BANNER_3);
  }

  public static void initStates() {
    Block.YELLOW_WALL_BANNER.addBlockState(YELLOW_WALL_BANNER_0);
    Block.YELLOW_WALL_BANNER.addBlockState(YELLOW_WALL_BANNER_1);
    Block.YELLOW_WALL_BANNER.addBlockState(YELLOW_WALL_BANNER_2);
    Block.YELLOW_WALL_BANNER.addBlockState(YELLOW_WALL_BANNER_3);
  }
}
