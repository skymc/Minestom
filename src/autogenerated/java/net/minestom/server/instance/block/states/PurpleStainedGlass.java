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
public final class PurpleStainedGlass {
  public static final BlockState PURPLE_STAINED_GLASS_0 = new BlockState(NamespaceID.from("minecraft:purple_stained_glass_0"), (short) 4105, Block.PURPLE_STAINED_GLASS);

  static {
    Registries.registerBlockState(PURPLE_STAINED_GLASS_0);
  }

  public static void initStates() {
    Block.PURPLE_STAINED_GLASS.addBlockState(PURPLE_STAINED_GLASS_0);
  }
}
