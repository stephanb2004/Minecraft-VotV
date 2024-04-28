package net.mcreator.votv.procedures;

import net.minecraft.world.level.storage.WritableLevelData;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class KurfurspawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (world.getLevelData() instanceof WritableLevelData _levelData)
			_levelData.setSpawn(new BlockPos(x, y, z), 0);
		if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner)
			_toTame.tame(_owner);
	}
}
