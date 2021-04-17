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
public final class EnchantingTable {
  public static final BlockState ENCHANTING_TABLE_0 = new BlockState(NamespaceID.from("minecraft:enchanting_table_0"), (short) 5136, Block.ENCHANTING_TABLE);

  static {
    Registries.registerBlockState(ENCHANTING_TABLE_0);
  }

  public static void initStates() {
    Block.ENCHANTING_TABLE.addBlockState(ENCHANTING_TABLE_0);
  }
}
