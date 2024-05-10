package net.pixeldreamstudios.heraclesbutton.util;

import earth.terrarium.heracles.client.HeraclesClient;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.Screens;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.network.chat.Component;

public class ClientStuff {
    public static void createQuestButton() {
        ScreenEvents.AFTER_INIT.register((client, screen, scaledWidth, scaledHeight) -> {
            if (screen instanceof InventoryScreen) {
                Screens.getButtons(screen).add(Button.builder(Component.literal("Quests"), p -> HeraclesClient.openQuestScreen()).pos(scaledWidth / 2 - 40, scaledHeight / 2 + 98).size(80, 16).build());
            }
        });
    }

}
