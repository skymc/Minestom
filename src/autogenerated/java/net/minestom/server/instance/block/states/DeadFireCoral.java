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
public final class DeadFireCoral {
  public static final BlockState DEAD_FIRE_CORAL_0 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_0"), (short) 9530, Block.DEAD_FIRE_CORAL, "waterlogged=true");

  public static final BlockState DEAD_FIRE_CORAL_1 = new BlockState(NamespaceID.from("minecraft:dead_fire_coral_1"), (short) 9531, Block.DEAD_FIRE_CORAL, "waterlogged=false");

  static {
    Registries.registerBlockState(DEAD_FIRE_CORAL_0);
    Registries.registerBlockState(DEAD_FIRE_CORAL_1);
  }

  public static void initStates() {
    Block.DEAD_FIRE_CORAL.addBlockState(DEAD_FIRE_CORAL_0);
    Block.DEAD_FIRE_CORAL.addBlockState(DEAD_FIRE_CORAL_1);
  }
}
