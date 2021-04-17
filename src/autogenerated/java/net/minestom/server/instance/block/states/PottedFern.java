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
public final class PottedFern {
  public static final BlockState POTTED_FERN_0 = new BlockState(NamespaceID.from("minecraft:potted_fern_0"), (short) 6316, Block.POTTED_FERN);

  static {
    Registries.registerBlockState(POTTED_FERN_0);
  }

  public static void initStates() {
    Block.POTTED_FERN.addBlockState(POTTED_FERN_0);
  }
}
