package net.kurze.novamod.item;

import net.kurze.novamod.Nova;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier AMETHYST = new SimpleTier(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1200, // Durability: Between Iron (250) and Diamond (1561)
            7.0f, // Mining Speed: Between Iron (6.0f) and Diamond (8.0f)
            2.5f, // Attack Damage Bonus
            15, // Enchantability: Higher than Diamond (10), same as Iron (14) roughly
            () -> Ingredient.of(Items.AMETHYST_SHARD));
}
