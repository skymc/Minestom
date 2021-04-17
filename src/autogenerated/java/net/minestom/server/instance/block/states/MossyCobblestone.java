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
public final class MossyCobblestone {
  public static final BlockState MOSSY_COBBLESTONE_0 = new BlockState(NamespaceID.from("minecraft:mossy_cobblestone_0"), (short) 1433, Block.MOSSY_COBBLESTONE);

  static {
    Registries.registerBlockState(MOSSY_COBBLESTONE_0);
  }

  public static void initStates() {
    Block.MOSSY_COBBLESTONE.addBlockState(MOSSY_COBBLESTONE_0);
  }
}
