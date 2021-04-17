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
public final class BrewingStand {
  public static final BlockState BREWING_STAND_0 = new BlockState(NamespaceID.from("minecraft:brewing_stand_0"), (short) 5137, Block.BREWING_STAND, "has_bottle_0=true","has_bottle_1=true","has_bottle_2=true");

  public static final BlockState BREWING_STAND_1 = new BlockState(NamespaceID.from("minecraft:brewing_stand_1"), (short) 5138, Block.BREWING_STAND, "has_bottle_0=true","has_bottle_1=true","has_bottle_2=false");

  public static final BlockState BREWING_STAND_2 = new BlockState(NamespaceID.from("minecraft:brewing_stand_2"), (short) 5139, Block.BREWING_STAND, "has_bottle_0=true","has_bottle_1=false","has_bottle_2=true");

  public static final BlockState BREWING_STAND_3 = new BlockState(NamespaceID.from("minecraft:brewing_stand_3"), (short) 5140, Block.BREWING_STAND, "has_bottle_0=true","has_bottle_1=false","has_bottle_2=false");

  public static final BlockState BREWING_STAND_4 = new BlockState(NamespaceID.from("minecraft:brewing_stand_4"), (short) 5141, Block.BREWING_STAND, "has_bottle_0=false","has_bottle_1=true","has_bottle_2=true");

  public static final BlockState BREWING_STAND_5 = new BlockState(NamespaceID.from("minecraft:brewing_stand_5"), (short) 5142, Block.BREWING_STAND, "has_bottle_0=false","has_bottle_1=true","has_bottle_2=false");

  public static final BlockState BREWING_STAND_6 = new BlockState(NamespaceID.from("minecraft:brewing_stand_6"), (short) 5143, Block.BREWING_STAND, "has_bottle_0=false","has_bottle_1=false","has_bottle_2=true");

  public static final BlockState BREWING_STAND_7 = new BlockState(NamespaceID.from("minecraft:brewing_stand_7"), (short) 5144, Block.BREWING_STAND, "has_bottle_0=false","has_bottle_1=false","has_bottle_2=false");

  static {
    Registries.registerBlockState(BREWING_STAND_0);
    Registries.registerBlockState(BREWING_STAND_1);
    Registries.registerBlockState(BREWING_STAND_2);
    Registries.registerBlockState(BREWING_STAND_3);
    Registries.registerBlockState(BREWING_STAND_4);
    Registries.registerBlockState(BREWING_STAND_5);
    Registries.registerBlockState(BREWING_STAND_6);
    Registries.registerBlockState(BREWING_STAND_7);
  }

  public static void initStates() {
    Block.BREWING_STAND.addBlockState(BREWING_STAND_0);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_1);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_2);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_3);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_4);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_5);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_6);
    Block.BREWING_STAND.addBlockState(BREWING_STAND_7);
  }
}
