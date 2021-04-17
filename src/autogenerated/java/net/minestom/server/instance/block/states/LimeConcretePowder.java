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
public final class LimeConcretePowder {
  public static final BlockState LIME_CONCRETE_POWDER_0 = new BlockState(NamespaceID.from("minecraft:lime_concrete_powder_0"), (short) 9463, Block.LIME_CONCRETE_POWDER);

  static {
    Registries.registerBlockState(LIME_CONCRETE_POWDER_0);
  }

  public static void initStates() {
    Block.LIME_CONCRETE_POWDER.addBlockState(LIME_CONCRETE_POWDER_0);
  }
}
