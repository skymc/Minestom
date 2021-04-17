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
public final class AncientDebris {
  public static final BlockState ANCIENT_DEBRIS_0 = new BlockState(NamespaceID.from("minecraft:ancient_debris_0"), (short) 15835, Block.ANCIENT_DEBRIS);

  static {
    Registries.registerBlockState(ANCIENT_DEBRIS_0);
  }

  public static void initStates() {
    Block.ANCIENT_DEBRIS.addBlockState(ANCIENT_DEBRIS_0);
  }
}
