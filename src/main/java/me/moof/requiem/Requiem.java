package me.moof.requiem;

import me.moof.requiem.registry.RequiemBlocks;
import me.moof.requiem.registry.RequiemItemGroups;
import me.moof.requiem.registry.RequiemItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Requiem implements ModInitializer {
	public static final String MOD_ID = "requiem";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		RequiemItems.registerModItems();
		RequiemBlocks.registerModBlocks();
		RequiemItemGroups.registerItemGroups();
	}
}