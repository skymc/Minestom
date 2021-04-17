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
public final class OakLog {
  public static final BlockState OAK_LOG_0 = new BlockState(NamespaceID.from("minecraft:oak_log_0"), (short) 73, Block.OAK_LOG, "axis=x");

  public static final BlockState OAK_LOG_1 = new BlockState(NamespaceID.from("minecraft:oak_log_1"), (short) 74, Block.OAK_LOG, "axis=y");

  public static final BlockState OAK_LOG_2 = new BlockState(NamespaceID.from("minecraft:oak_log_2"), (short) 75, Block.OAK_LOG, "axis=z");

  static {
    Registries.registerBlockState(OAK_LOG_0);
    Registries.registerBlockState(OAK_LOG_1);
    Registries.registerBlockState(OAK_LOG_2);
  }

  public static void initStates() {
    Block.OAK_LOG.addBlockState(OAK_LOG_0);
    Block.OAK_LOG.addBlockState(OAK_LOG_1);
    Block.OAK_LOG.addBlockState(OAK_LOG_2);
  }
}
