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
public final class DeadBrainCoral {
  public static final BlockState DEAD_BRAIN_CORAL_0 = new BlockState(NamespaceID.from("minecraft:dead_brain_coral_0"), (short) 9526, Block.DEAD_BRAIN_CORAL, "waterlogged=true");

  public static final BlockState DEAD_BRAIN_CORAL_1 = new BlockState(NamespaceID.from("minecraft:dead_brain_coral_1"), (short) 9527, Block.DEAD_BRAIN_CORAL, "waterlogged=false");

  static {
    Registries.registerBlockState(DEAD_BRAIN_CORAL_0);
    Registries.registerBlockState(DEAD_BRAIN_CORAL_1);
  }

  public static void initStates() {
    Block.DEAD_BRAIN_CORAL.addBlockState(DEAD_BRAIN_CORAL_0);
    Block.DEAD_BRAIN_CORAL.addBlockState(DEAD_BRAIN_CORAL_1);
  }
}
