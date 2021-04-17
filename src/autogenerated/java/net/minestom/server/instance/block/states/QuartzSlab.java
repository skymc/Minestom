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
public final class QuartzSlab {
  public static final BlockState QUARTZ_SLAB_0 = new BlockState(NamespaceID.from("minecraft:quartz_slab_0"), (short) 8394, Block.QUARTZ_SLAB, "type=top","waterlogged=true");

  public static final BlockState QUARTZ_SLAB_1 = new BlockState(NamespaceID.from("minecraft:quartz_slab_1"), (short) 8395, Block.QUARTZ_SLAB, "type=top","waterlogged=false");

  public static final BlockState QUARTZ_SLAB_2 = new BlockState(NamespaceID.from("minecraft:quartz_slab_2"), (short) 8396, Block.QUARTZ_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState QUARTZ_SLAB_3 = new BlockState(NamespaceID.from("minecraft:quartz_slab_3"), (short) 8397, Block.QUARTZ_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState QUARTZ_SLAB_4 = new BlockState(NamespaceID.from("minecraft:quartz_slab_4"), (short) 8398, Block.QUARTZ_SLAB, "type=double","waterlogged=true");

  public static final BlockState QUARTZ_SLAB_5 = new BlockState(NamespaceID.from("minecraft:quartz_slab_5"), (short) 8399, Block.QUARTZ_SLAB, "type=double","waterlogged=false");

  static {
    Registries.registerBlockState(QUARTZ_SLAB_0);
    Registries.registerBlockState(QUARTZ_SLAB_1);
    Registries.registerBlockState(QUARTZ_SLAB_2);
    Registries.registerBlockState(QUARTZ_SLAB_3);
    Registries.registerBlockState(QUARTZ_SLAB_4);
    Registries.registerBlockState(QUARTZ_SLAB_5);
  }

  public static void initStates() {
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_0);
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_1);
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_2);
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_3);
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_4);
    Block.QUARTZ_SLAB.addBlockState(QUARTZ_SLAB_5);
  }
}
