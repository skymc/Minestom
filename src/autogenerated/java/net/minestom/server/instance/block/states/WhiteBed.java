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
public final class WhiteBed {
  public static final BlockState WHITE_BED_0 = new BlockState(NamespaceID.from("minecraft:white_bed_0"), (short) 1049, Block.WHITE_BED, "facing=north","occupied=true","part=head");

  public static final BlockState WHITE_BED_1 = new BlockState(NamespaceID.from("minecraft:white_bed_1"), (short) 1050, Block.WHITE_BED, "facing=north","occupied=true","part=foot");

  public static final BlockState WHITE_BED_2 = new BlockState(NamespaceID.from("minecraft:white_bed_2"), (short) 1051, Block.WHITE_BED, "facing=north","occupied=false","part=head");

  public static final BlockState WHITE_BED_3 = new BlockState(NamespaceID.from("minecraft:white_bed_3"), (short) 1052, Block.WHITE_BED, "facing=north","occupied=false","part=foot");

  public static final BlockState WHITE_BED_4 = new BlockState(NamespaceID.from("minecraft:white_bed_4"), (short) 1053, Block.WHITE_BED, "facing=south","occupied=true","part=head");

  public static final BlockState WHITE_BED_5 = new BlockState(NamespaceID.from("minecraft:white_bed_5"), (short) 1054, Block.WHITE_BED, "facing=south","occupied=true","part=foot");

  public static final BlockState WHITE_BED_6 = new BlockState(NamespaceID.from("minecraft:white_bed_6"), (short) 1055, Block.WHITE_BED, "facing=south","occupied=false","part=head");

  public static final BlockState WHITE_BED_7 = new BlockState(NamespaceID.from("minecraft:white_bed_7"), (short) 1056, Block.WHITE_BED, "facing=south","occupied=false","part=foot");

  public static final BlockState WHITE_BED_8 = new BlockState(NamespaceID.from("minecraft:white_bed_8"), (short) 1057, Block.WHITE_BED, "facing=west","occupied=true","part=head");

  public static final BlockState WHITE_BED_9 = new BlockState(NamespaceID.from("minecraft:white_bed_9"), (short) 1058, Block.WHITE_BED, "facing=west","occupied=true","part=foot");

  public static final BlockState WHITE_BED_10 = new BlockState(NamespaceID.from("minecraft:white_bed_10"), (short) 1059, Block.WHITE_BED, "facing=west","occupied=false","part=head");

  public static final BlockState WHITE_BED_11 = new BlockState(NamespaceID.from("minecraft:white_bed_11"), (short) 1060, Block.WHITE_BED, "facing=west","occupied=false","part=foot");

  public static final BlockState WHITE_BED_12 = new BlockState(NamespaceID.from("minecraft:white_bed_12"), (short) 1061, Block.WHITE_BED, "facing=east","occupied=true","part=head");

  public static final BlockState WHITE_BED_13 = new BlockState(NamespaceID.from("minecraft:white_bed_13"), (short) 1062, Block.WHITE_BED, "facing=east","occupied=true","part=foot");

  public static final BlockState WHITE_BED_14 = new BlockState(NamespaceID.from("minecraft:white_bed_14"), (short) 1063, Block.WHITE_BED, "facing=east","occupied=false","part=head");

  public static final BlockState WHITE_BED_15 = new BlockState(NamespaceID.from("minecraft:white_bed_15"), (short) 1064, Block.WHITE_BED, "facing=east","occupied=false","part=foot");

  static {
    Registries.registerBlockState(WHITE_BED_0);
    Registries.registerBlockState(WHITE_BED_1);
    Registries.registerBlockState(WHITE_BED_2);
    Registries.registerBlockState(WHITE_BED_3);
    Registries.registerBlockState(WHITE_BED_4);
    Registries.registerBlockState(WHITE_BED_5);
    Registries.registerBlockState(WHITE_BED_6);
    Registries.registerBlockState(WHITE_BED_7);
    Registries.registerBlockState(WHITE_BED_8);
    Registries.registerBlockState(WHITE_BED_9);
    Registries.registerBlockState(WHITE_BED_10);
    Registries.registerBlockState(WHITE_BED_11);
    Registries.registerBlockState(WHITE_BED_12);
    Registries.registerBlockState(WHITE_BED_13);
    Registries.registerBlockState(WHITE_BED_14);
    Registries.registerBlockState(WHITE_BED_15);
  }

  public static void initStates() {
    Block.WHITE_BED.addBlockState(WHITE_BED_0);
    Block.WHITE_BED.addBlockState(WHITE_BED_1);
    Block.WHITE_BED.addBlockState(WHITE_BED_2);
    Block.WHITE_BED.addBlockState(WHITE_BED_3);
    Block.WHITE_BED.addBlockState(WHITE_BED_4);
    Block.WHITE_BED.addBlockState(WHITE_BED_5);
    Block.WHITE_BED.addBlockState(WHITE_BED_6);
    Block.WHITE_BED.addBlockState(WHITE_BED_7);
    Block.WHITE_BED.addBlockState(WHITE_BED_8);
    Block.WHITE_BED.addBlockState(WHITE_BED_9);
    Block.WHITE_BED.addBlockState(WHITE_BED_10);
    Block.WHITE_BED.addBlockState(WHITE_BED_11);
    Block.WHITE_BED.addBlockState(WHITE_BED_12);
    Block.WHITE_BED.addBlockState(WHITE_BED_13);
    Block.WHITE_BED.addBlockState(WHITE_BED_14);
    Block.WHITE_BED.addBlockState(WHITE_BED_15);
  }
}
