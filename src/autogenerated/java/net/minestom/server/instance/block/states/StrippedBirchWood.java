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
public final class StrippedBirchWood {
  public static final BlockState STRIPPED_BIRCH_WOOD_0 = new BlockState(NamespaceID.from("minecraft:stripped_birch_wood_0"), (short) 133, Block.STRIPPED_BIRCH_WOOD, "axis=x");

  public static final BlockState STRIPPED_BIRCH_WOOD_1 = new BlockState(NamespaceID.from("minecraft:stripped_birch_wood_1"), (short) 134, Block.STRIPPED_BIRCH_WOOD, "axis=y");

  public static final BlockState STRIPPED_BIRCH_WOOD_2 = new BlockState(NamespaceID.from("minecraft:stripped_birch_wood_2"), (short) 135, Block.STRIPPED_BIRCH_WOOD, "axis=z");

  static {
    Registries.registerBlockState(STRIPPED_BIRCH_WOOD_0);
    Registries.registerBlockState(STRIPPED_BIRCH_WOOD_1);
    Registries.registerBlockState(STRIPPED_BIRCH_WOOD_2);
  }

  public static void initStates() {
    Block.STRIPPED_BIRCH_WOOD.addBlockState(STRIPPED_BIRCH_WOOD_0);
    Block.STRIPPED_BIRCH_WOOD.addBlockState(STRIPPED_BIRCH_WOOD_1);
    Block.STRIPPED_BIRCH_WOOD.addBlockState(STRIPPED_BIRCH_WOOD_2);
  }
}
