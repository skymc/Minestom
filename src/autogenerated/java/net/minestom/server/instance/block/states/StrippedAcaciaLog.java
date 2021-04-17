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
public final class StrippedAcaciaLog {
  public static final BlockState STRIPPED_ACACIA_LOG_0 = new BlockState(NamespaceID.from("minecraft:stripped_acacia_log_0"), (short) 100, Block.STRIPPED_ACACIA_LOG, "axis=x");

  public static final BlockState STRIPPED_ACACIA_LOG_1 = new BlockState(NamespaceID.from("minecraft:stripped_acacia_log_1"), (short) 101, Block.STRIPPED_ACACIA_LOG, "axis=y");

  public static final BlockState STRIPPED_ACACIA_LOG_2 = new BlockState(NamespaceID.from("minecraft:stripped_acacia_log_2"), (short) 102, Block.STRIPPED_ACACIA_LOG, "axis=z");

  static {
    Registries.registerBlockState(STRIPPED_ACACIA_LOG_0);
    Registries.registerBlockState(STRIPPED_ACACIA_LOG_1);
    Registries.registerBlockState(STRIPPED_ACACIA_LOG_2);
  }

  public static void initStates() {
    Block.STRIPPED_ACACIA_LOG.addBlockState(STRIPPED_ACACIA_LOG_0);
    Block.STRIPPED_ACACIA_LOG.addBlockState(STRIPPED_ACACIA_LOG_1);
    Block.STRIPPED_ACACIA_LOG.addBlockState(STRIPPED_ACACIA_LOG_2);
  }
}
