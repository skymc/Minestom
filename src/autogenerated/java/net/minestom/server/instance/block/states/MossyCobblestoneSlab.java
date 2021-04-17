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
public final class MossyCobblestoneSlab {
  public static final BlockState MOSSY_COBBLESTONE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:mossy_cobblestone_slab_0"), (short) 10817, Block.MOSSY_COBBLESTONE_SLAB, "type=top","waterlogged=true");

  public static final BlockState MOSSY_COBBLESTONE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:mossy_cobblestone_slab_1"), (short) 10818, Block.MOSSY_COBBLESTONE_SLAB, "type=top","waterlogged=false");

  public static final BlockState MOSSY_COBBLESTONE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:mossy_cobblestone_slab_2"), (short) 10819, Block.MOSSY_COBBLESTONE_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState MOSSY_COBBLESTONE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:mossy_cobblestone_slab_3"), (short) 10820, Block.MOSSY_COBBLESTONE_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState MOSSY_COBBLESTONE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:mossy_cobblestone_slab_4"), (short) 10821, Block.MOSSY_COBBLESTONE_SLAB, "type=double","waterlogged=true");

  public static final BlockState MOSSY_COBBLESTONE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:mossy_cobblestone_slab_5"), (short) 10822, Block.MOSSY_COBBLESTONE_SLAB, "type=double","waterlogged=false");

  static {
    Registries.registerBlockState(MOSSY_COBBLESTONE_SLAB_0);
    Registries.registerBlockState(MOSSY_COBBLESTONE_SLAB_1);
    Registries.registerBlockState(MOSSY_COBBLESTONE_SLAB_2);
    Registries.registerBlockState(MOSSY_COBBLESTONE_SLAB_3);
    Registries.registerBlockState(MOSSY_COBBLESTONE_SLAB_4);
    Registries.registerBlockState(MOSSY_COBBLESTONE_SLAB_5);
  }

  public static void initStates() {
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_0);
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_1);
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_2);
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_3);
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_4);
    Block.MOSSY_COBBLESTONE_SLAB.addBlockState(MOSSY_COBBLESTONE_SLAB_5);
  }
}
