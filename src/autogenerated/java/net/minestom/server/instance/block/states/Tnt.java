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
public final class Tnt {
  public static final BlockState TNT_0 = new BlockState(NamespaceID.from("minecraft:tnt_0"), (short) 1430, Block.TNT, "unstable=true");

  public static final BlockState TNT_1 = new BlockState(NamespaceID.from("minecraft:tnt_1"), (short) 1431, Block.TNT, "unstable=false");

  static {
    Registries.registerBlockState(TNT_0);
    Registries.registerBlockState(TNT_1);
  }

  public static void initStates() {
    Block.TNT.addBlockState(TNT_0);
    Block.TNT.addBlockState(TNT_1);
  }
}
