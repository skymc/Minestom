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
public final class LightBlueShulkerBox {
  public static final BlockState LIGHT_BLUE_SHULKER_BOX_0 = new BlockState(NamespaceID.from("minecraft:light_blue_shulker_box_0"), (short) 9300, Block.LIGHT_BLUE_SHULKER_BOX, "facing=north");

  public static final BlockState LIGHT_BLUE_SHULKER_BOX_1 = new BlockState(NamespaceID.from("minecraft:light_blue_shulker_box_1"), (short) 9301, Block.LIGHT_BLUE_SHULKER_BOX, "facing=east");

  public static final BlockState LIGHT_BLUE_SHULKER_BOX_2 = new BlockState(NamespaceID.from("minecraft:light_blue_shulker_box_2"), (short) 9302, Block.LIGHT_BLUE_SHULKER_BOX, "facing=south");

  public static final BlockState LIGHT_BLUE_SHULKER_BOX_3 = new BlockState(NamespaceID.from("minecraft:light_blue_shulker_box_3"), (short) 9303, Block.LIGHT_BLUE_SHULKER_BOX, "facing=west");

  public static final BlockState LIGHT_BLUE_SHULKER_BOX_4 = new BlockState(NamespaceID.from("minecraft:light_blue_shulker_box_4"), (short) 9304, Block.LIGHT_BLUE_SHULKER_BOX, "facing=up");

  public static final BlockState LIGHT_BLUE_SHULKER_BOX_5 = new BlockState(NamespaceID.from("minecraft:light_blue_shulker_box_5"), (short) 9305, Block.LIGHT_BLUE_SHULKER_BOX, "facing=down");

  static {
    Registries.registerBlockState(LIGHT_BLUE_SHULKER_BOX_0);
    Registries.registerBlockState(LIGHT_BLUE_SHULKER_BOX_1);
    Registries.registerBlockState(LIGHT_BLUE_SHULKER_BOX_2);
    Registries.registerBlockState(LIGHT_BLUE_SHULKER_BOX_3);
    Registries.registerBlockState(LIGHT_BLUE_SHULKER_BOX_4);
    Registries.registerBlockState(LIGHT_BLUE_SHULKER_BOX_5);
  }

  public static void initStates() {
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_0);
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_1);
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_2);
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_3);
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_4);
    Block.LIGHT_BLUE_SHULKER_BOX.addBlockState(LIGHT_BLUE_SHULKER_BOX_5);
  }
}
