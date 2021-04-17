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
public final class CrimsonPressurePlate {
  public static final BlockState CRIMSON_PRESSURE_PLATE_0 = new BlockState(NamespaceID.from("minecraft:crimson_pressure_plate_0"), (short) 15067, Block.CRIMSON_PRESSURE_PLATE, "powered=true");

  public static final BlockState CRIMSON_PRESSURE_PLATE_1 = new BlockState(NamespaceID.from("minecraft:crimson_pressure_plate_1"), (short) 15068, Block.CRIMSON_PRESSURE_PLATE, "powered=false");

  static {
    Registries.registerBlockState(CRIMSON_PRESSURE_PLATE_0);
    Registries.registerBlockState(CRIMSON_PRESSURE_PLATE_1);
  }

  public static void initStates() {
    Block.CRIMSON_PRESSURE_PLATE.addBlockState(CRIMSON_PRESSURE_PLATE_0);
    Block.CRIMSON_PRESSURE_PLATE.addBlockState(CRIMSON_PRESSURE_PLATE_1);
  }
}
