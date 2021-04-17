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
public final class RedstoneWallTorch {
  public static final BlockState REDSTONE_WALL_TORCH_0 = new BlockState(NamespaceID.from("minecraft:redstone_wall_torch_0"), (short) 3889, Block.REDSTONE_WALL_TORCH, "facing=north","lit=true");

  public static final BlockState REDSTONE_WALL_TORCH_1 = new BlockState(NamespaceID.from("minecraft:redstone_wall_torch_1"), (short) 3890, Block.REDSTONE_WALL_TORCH, "facing=north","lit=false");

  public static final BlockState REDSTONE_WALL_TORCH_2 = new BlockState(NamespaceID.from("minecraft:redstone_wall_torch_2"), (short) 3891, Block.REDSTONE_WALL_TORCH, "facing=south","lit=true");

  public static final BlockState REDSTONE_WALL_TORCH_3 = new BlockState(NamespaceID.from("minecraft:redstone_wall_torch_3"), (short) 3892, Block.REDSTONE_WALL_TORCH, "facing=south","lit=false");

  public static final BlockState REDSTONE_WALL_TORCH_4 = new BlockState(NamespaceID.from("minecraft:redstone_wall_torch_4"), (short) 3893, Block.REDSTONE_WALL_TORCH, "facing=west","lit=true");

  public static final BlockState REDSTONE_WALL_TORCH_5 = new BlockState(NamespaceID.from("minecraft:redstone_wall_torch_5"), (short) 3894, Block.REDSTONE_WALL_TORCH, "facing=west","lit=false");

  public static final BlockState REDSTONE_WALL_TORCH_6 = new BlockState(NamespaceID.from("minecraft:redstone_wall_torch_6"), (short) 3895, Block.REDSTONE_WALL_TORCH, "facing=east","lit=true");

  public static final BlockState REDSTONE_WALL_TORCH_7 = new BlockState(NamespaceID.from("minecraft:redstone_wall_torch_7"), (short) 3896, Block.REDSTONE_WALL_TORCH, "facing=east","lit=false");

  static {
    Registries.registerBlockState(REDSTONE_WALL_TORCH_0);
    Registries.registerBlockState(REDSTONE_WALL_TORCH_1);
    Registries.registerBlockState(REDSTONE_WALL_TORCH_2);
    Registries.registerBlockState(REDSTONE_WALL_TORCH_3);
    Registries.registerBlockState(REDSTONE_WALL_TORCH_4);
    Registries.registerBlockState(REDSTONE_WALL_TORCH_5);
    Registries.registerBlockState(REDSTONE_WALL_TORCH_6);
    Registries.registerBlockState(REDSTONE_WALL_TORCH_7);
  }

  public static void initStates() {
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_0);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_1);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_2);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_3);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_4);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_5);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_6);
    Block.REDSTONE_WALL_TORCH.addBlockState(REDSTONE_WALL_TORCH_7);
  }
}
