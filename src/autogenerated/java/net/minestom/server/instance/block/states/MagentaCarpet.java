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
public final class MagentaCarpet {
  public static final BlockState MAGENTA_CARPET_0 = new BlockState(NamespaceID.from("minecraft:magenta_carpet_0"), (short) 7872, Block.MAGENTA_CARPET);

  static {
    Registries.registerBlockState(MAGENTA_CARPET_0);
  }

  public static void initStates() {
    Block.MAGENTA_CARPET.addBlockState(MAGENTA_CARPET_0);
  }
}
