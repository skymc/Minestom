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
public final class SeaLantern {
  public static final BlockState SEA_LANTERN_0 = new BlockState(NamespaceID.from("minecraft:sea_lantern_0"), (short) 7866, Block.SEA_LANTERN);

  static {
    Registries.registerBlockState(SEA_LANTERN_0);
  }

  public static void initStates() {
    Block.SEA_LANTERN.addBlockState(SEA_LANTERN_0);
  }
}
