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
public final class BrownCarpet {
  public static final BlockState BROWN_CARPET_0 = new BlockState(NamespaceID.from("minecraft:brown_carpet_0"), (short) 7882, Block.BROWN_CARPET);

  static {
    Registries.registerBlockState(BROWN_CARPET_0);
  }

  public static void initStates() {
    Block.BROWN_CARPET.addBlockState(BROWN_CARPET_0);
  }
}
