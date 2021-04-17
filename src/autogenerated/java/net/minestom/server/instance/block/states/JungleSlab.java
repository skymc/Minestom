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
public final class JungleSlab {
  public static final BlockState JUNGLE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:jungle_slab_0"), (short) 8322, Block.JUNGLE_SLAB, "type=top","waterlogged=true");

  public static final BlockState JUNGLE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:jungle_slab_1"), (short) 8323, Block.JUNGLE_SLAB, "type=top","waterlogged=false");

  public static final BlockState JUNGLE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:jungle_slab_2"), (short) 8324, Block.JUNGLE_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState JUNGLE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:jungle_slab_3"), (short) 8325, Block.JUNGLE_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState JUNGLE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:jungle_slab_4"), (short) 8326, Block.JUNGLE_SLAB, "type=double","waterlogged=true");

  public static final BlockState JUNGLE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:jungle_slab_5"), (short) 8327, Block.JUNGLE_SLAB, "type=double","waterlogged=false");

  static {
    Registries.registerBlockState(JUNGLE_SLAB_0);
    Registries.registerBlockState(JUNGLE_SLAB_1);
    Registries.registerBlockState(JUNGLE_SLAB_2);
    Registries.registerBlockState(JUNGLE_SLAB_3);
    Registries.registerBlockState(JUNGLE_SLAB_4);
    Registries.registerBlockState(JUNGLE_SLAB_5);
  }

  public static void initStates() {
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_0);
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_1);
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_2);
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_3);
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_4);
    Block.JUNGLE_SLAB.addBlockState(JUNGLE_SLAB_5);
  }
}
