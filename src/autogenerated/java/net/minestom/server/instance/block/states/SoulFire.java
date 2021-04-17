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
public final class SoulFire {
  public static final BlockState SOUL_FIRE_0 = new BlockState(NamespaceID.from("minecraft:soul_fire_0"), (short) 1952, Block.SOUL_FIRE);

  static {
    Registries.registerBlockState(SOUL_FIRE_0);
  }

  public static void initStates() {
    Block.SOUL_FIRE.addBlockState(SOUL_FIRE_0);
  }
}
