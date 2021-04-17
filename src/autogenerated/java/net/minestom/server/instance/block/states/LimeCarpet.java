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
public final class LimeCarpet {
  public static final BlockState LIME_CARPET_0 = new BlockState(NamespaceID.from("minecraft:lime_carpet_0"), (short) 7875, Block.LIME_CARPET);

  static {
    Registries.registerBlockState(LIME_CARPET_0);
  }

  public static void initStates() {
    Block.LIME_CARPET.addBlockState(LIME_CARPET_0);
  }
}
