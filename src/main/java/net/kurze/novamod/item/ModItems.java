package net.kurze.novamod.item;

import net.kurze.novamod.Nova;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Nova.MODID);

        public static final DeferredItem<SwordItem> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
                        () -> new SwordItem(ModToolTiers.AMETHYST, new Item.Properties()
                                        .attributes(SwordItem.createAttributes(ModToolTiers.AMETHYST, 3, -2.4f))));
}
