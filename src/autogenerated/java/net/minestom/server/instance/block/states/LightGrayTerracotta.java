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
public final class LightGrayTerracotta {
  public static final BlockState LIGHT_GRAY_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:light_gray_terracotta_0"), (short) 6859, Block.LIGHT_GRAY_TERRACOTTA);

  static {
    Registries.registerBlockState(LIGHT_GRAY_TERRACOTTA_0);
  }

  public static void initStates() {
    Block.LIGHT_GRAY_TERRACOTTA.addBlockState(LIGHT_GRAY_TERRACOTTA_0);
  }
}
