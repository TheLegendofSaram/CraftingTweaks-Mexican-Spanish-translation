package net.blay09.mods.craftingtweaks.net;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.blay09.mods.craftingtweaks.CraftingTweaks;

public class NetworkHandler {

    public static final SimpleNetworkWrapper instance = NetworkRegistry.INSTANCE.newSimpleChannel(CraftingTweaks.MOD_ID);

    public static void init() {
        instance.registerMessage(HandlerRotate.class, MessageRotate.class, 0, Side.SERVER);
        instance.registerMessage(HandlerClear.class, MessageClear.class, 1, Side.SERVER);
    }

}
