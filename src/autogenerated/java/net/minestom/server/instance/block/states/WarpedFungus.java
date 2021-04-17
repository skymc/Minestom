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
public final class WarpedFungus {
  public static final BlockState WARPED_FUNGUS_0 = new BlockState(NamespaceID.from("minecraft:warped_fungus_0"), (short) 14979, Block.WARPED_FUNGUS);

  static {
    Registries.registerBlockState(WARPED_FUNGUS_0);
  }

  public static void initStates() {
    Block.WARPED_FUNGUS.addBlockState(WARPED_FUNGUS_0);
  }
}
