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
public final class NetherQuartzOre {
  public static final BlockState NETHER_QUARTZ_ORE_0 = new BlockState(NamespaceID.from("minecraft:nether_quartz_ore_0"), (short) 6731, Block.NETHER_QUARTZ_ORE);

  static {
    Registries.registerBlockState(NETHER_QUARTZ_ORE_0);
  }

  public static void initStates() {
    Block.NETHER_QUARTZ_ORE.addBlockState(NETHER_QUARTZ_ORE_0);
  }
}
