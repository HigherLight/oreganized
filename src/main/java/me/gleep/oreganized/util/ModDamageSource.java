package me.gleep.oreganized.util;

import net.minecraft.util.DamageSource;

public class ModDamageSource extends DamageSource {
    public static final DamageSource MOLTEN_LEAD = new ModDamageSource("molten_lead").setFireDamage();

    public ModDamageSource(String damageTypeIn) {
        super(damageTypeIn);
    }
}
