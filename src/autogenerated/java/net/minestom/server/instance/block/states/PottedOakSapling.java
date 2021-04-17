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
public final class PottedOakSapling {
  public static final BlockState POTTED_OAK_SAPLING_0 = new BlockState(NamespaceID.from("minecraft:potted_oak_sapling_0"), (short) 6310, Block.POTTED_OAK_SAPLING);

  static {
    Registries.registerBlockState(POTTED_OAK_SAPLING_0);
  }

  public static void initStates() {
    Block.POTTED_OAK_SAPLING.addBlockState(POTTED_OAK_SAPLING_0);
  }
}
