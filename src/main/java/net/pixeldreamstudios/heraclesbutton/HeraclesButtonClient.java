package net.pixeldreamstudios.heraclesbutton;

import net.fabricmc.api.ClientModInitializer;
import net.pixeldreamstudios.heraclesbutton.util.ClientStuff;

public class HeraclesButtonClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientStuff.createQuestButton();
    }
}
