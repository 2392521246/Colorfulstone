package mordd.ColorfulStone.Item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.mod.EventBusSubscriber;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = "colorfulstone")
public final class ModelMapper {
    @SubscribeEvent
    public static void onModelReg(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(ItemLoader.redIngot, 0, new ModelResourceLocation(ItemLoader.redIngot.getRegistryName(), "inventory"));
    }
}

