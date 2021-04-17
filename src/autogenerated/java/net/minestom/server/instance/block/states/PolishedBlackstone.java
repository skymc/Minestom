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
public final class PolishedBlackstone {
  public static final BlockState POLISHED_BLACKSTONE_0 = new BlockState(NamespaceID.from("minecraft:polished_blackstone_0"), (short) 16258, Block.POLISHED_BLACKSTONE);

  static {
    Registries.registerBlockState(POLISHED_BLACKSTONE_0);
  }

  public static void initStates() {
    Block.POLISHED_BLACKSTONE.addBlockState(POLISHED_BLACKSTONE_0);
  }
}
