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
public final class DeadBubbleCoral {
  public static final BlockState DEAD_BUBBLE_CORAL_0 = new BlockState(NamespaceID.from("minecraft:dead_bubble_coral_0"), (short) 9528, Block.DEAD_BUBBLE_CORAL, "waterlogged=true");

  public static final BlockState DEAD_BUBBLE_CORAL_1 = new BlockState(NamespaceID.from("minecraft:dead_bubble_coral_1"), (short) 9529, Block.DEAD_BUBBLE_CORAL, "waterlogged=false");

  static {
    Registries.registerBlockState(DEAD_BUBBLE_CORAL_0);
    Registries.registerBlockState(DEAD_BUBBLE_CORAL_1);
  }

  public static void initStates() {
    Block.DEAD_BUBBLE_CORAL.addBlockState(DEAD_BUBBLE_CORAL_0);
    Block.DEAD_BUBBLE_CORAL.addBlockState(DEAD_BUBBLE_CORAL_1);
  }
}
