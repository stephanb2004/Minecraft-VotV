package net.mcreator.votv.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AriralOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (true) {
			if (Mth.nextInt(RandomSource.create(), 1, 10) <= 1) {
				if (!entity.level.isClientSide())
					entity.discard();
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 1, false, false));
			}
		}
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("custom").bypassArmor(), 1);
		}
	}
}
