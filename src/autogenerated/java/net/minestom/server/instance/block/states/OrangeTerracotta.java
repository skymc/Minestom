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
public final class OrangeTerracotta {
  public static final BlockState ORANGE_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:orange_terracotta_0"), (short) 6852, Block.ORANGE_TERRACOTTA);

  static {
    Registries.registerBlockState(ORANGE_TERRACOTTA_0);
  }

  public static void initStates() {
    Block.ORANGE_TERRACOTTA.addBlockState(ORANGE_TERRACOTTA_0);
  }
}
