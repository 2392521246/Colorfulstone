package mordd.ColorfulStone.Item;

import mordd.ColorfulStone.ColorfulStone;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.relauncher.Side;


@EventBusSubscriber(value = Side.CLIENT, modid = "colorfulstone")
public final class ModelMapper {
    @SubscribeEvent
    public static void onModelReg(ModelRegistryEvent event) {
        ModelRegistry(ItemLoader.redIngot);
        ModelRegistry(ItemLoader.orangeIngot);
        ModelRegistry(ItemLoader.yellowIngot);
        ModelRegistry(ItemLoader.greenIngot);
        ModelRegistry(ItemLoader.cyanIngot);
        ModelRegistry(ItemLoader.blueIngot);
        ModelRegistry(ItemLoader.purpleIngot);
        for (int i=0;i<50;i++){
        ColorfulStone.logger.error("The Event has Loaded! A");
        }
    }
    private void ModelRegistry (Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0,new ModelResourceLocation(item.getRegistryName(),"inventory"));
   }
}

