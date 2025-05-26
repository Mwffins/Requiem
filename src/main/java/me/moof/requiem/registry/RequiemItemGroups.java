package me.moof.requiem.registry;

import me.moof.requiem.Requiem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class RequiemItemGroups {

    public static final ItemGroup REQUIEM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Requiem.MOD_ID, "requiem_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RequiemItems.SOUL_SICKLES))
                    .displayName(Text.translatable("itemgroup.requiem.requiem_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(RequiemItems.SOUL_SICKLES);
                    }).build());

    public static final ItemGroup REQUIEM_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Requiem.MOD_ID, "requiem_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RequiemBlocks.TEST_BLOCK))
                    .displayName(Text.translatable("itemgroup.requiem.requiem_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(RequiemBlocks.TEST_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        Requiem.LOGGER.info("Registering item groups for {}", Requiem.MOD_ID);
    }

}
