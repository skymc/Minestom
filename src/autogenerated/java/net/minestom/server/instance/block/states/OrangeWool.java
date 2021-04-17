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
public final class OrangeWool {
  public static final BlockState ORANGE_WOOL_0 = new BlockState(NamespaceID.from("minecraft:orange_wool_0"), (short) 1385, Block.ORANGE_WOOL);

  static {
    Registries.registerBlockState(ORANGE_WOOL_0);
  }

  public static void initStates() {
    Block.ORANGE_WOOL.addBlockState(ORANGE_WOOL_0);
  }
}
