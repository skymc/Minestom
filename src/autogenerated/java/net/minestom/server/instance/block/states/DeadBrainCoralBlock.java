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
public final class DeadBrainCoralBlock {
  public static final BlockState DEAD_BRAIN_CORAL_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:dead_brain_coral_block_0"), (short) 9515, Block.DEAD_BRAIN_CORAL_BLOCK);

  static {
    Registries.registerBlockState(DEAD_BRAIN_CORAL_BLOCK_0);
  }

  public static void initStates() {
    Block.DEAD_BRAIN_CORAL_BLOCK.addBlockState(DEAD_BRAIN_CORAL_BLOCK_0);
  }
}
