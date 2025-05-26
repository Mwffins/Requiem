package me.moof.requiem.registry;

import me.moof.requiem.Requiem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RequiemItems {

    public static final Item SOUL_SICKLES = registerItem("soul_sickles", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Requiem.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Requiem.LOGGER.info("Registering items for {}", Requiem.MOD_ID);
    }
}