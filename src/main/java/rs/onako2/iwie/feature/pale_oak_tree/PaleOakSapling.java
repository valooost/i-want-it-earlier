package rs.onako2.iwie.feature.pale_oak_tree;

import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Optional;

public class PaleOakSapling {
    public static final SaplingGenerator PALE;

    public static final RegistryKey<ConfiguredFeature<?, ?>> PALE_REGISTRY = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of("iwie", "pale_tree"));

    static {
        PALE = new SaplingGenerator("pale_tree", Optional.of(PALE_REGISTRY), Optional.empty(), Optional.empty());

    }
}
