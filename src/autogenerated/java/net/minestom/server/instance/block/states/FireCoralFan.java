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
public final class FireCoralFan {
  public static final BlockState FIRE_CORAL_FAN_0 = new BlockState(NamespaceID.from("minecraft:fire_coral_fan_0"), (short) 9560, Block.FIRE_CORAL_FAN, "waterlogged=true");

  public static final BlockState FIRE_CORAL_FAN_1 = new BlockState(NamespaceID.from("minecraft:fire_coral_fan_1"), (short) 9561, Block.FIRE_CORAL_FAN, "waterlogged=false");

  static {
    Registries.registerBlockState(FIRE_CORAL_FAN_0);
    Registries.registerBlockState(FIRE_CORAL_FAN_1);
  }

  public static void initStates() {
    Block.FIRE_CORAL_FAN.addBlockState(FIRE_CORAL_FAN_0);
    Block.FIRE_CORAL_FAN.addBlockState(FIRE_CORAL_FAN_1);
  }
}
