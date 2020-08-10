package mordd.ColorfulStone.Item;

import mordd.ColorfulStone.Block.BlockLoader;
import net.minecraft.block.Block;
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
        

        ModelRegistry(BlockLoader.redBlock);
        ModelRegistry(BlockLoader.orangeBlock);
        ModelRegistry(BlockLoader.yellowBlock);
        ModelRegistry(BlockLoader.greenBlock);
        ModelRegistry(BlockLoader.cyanBlock);
        ModelRegistry(BlockLoader.blueBlock);
        ModelRegistry(BlockLoader.purpleBlock);     
    }
    private static void ModelRegistry (Item item){
        ModelLoader.setCustomMopdelResourceLocation(item, 0,new ModelResourceLocation(item.getRegistryName(),"inventory"));
   }
    private static void ModelRegistry (Block block){
        ModelLoader.setCustomMopdelResourceLocation(Item.getItemFromBlock(block), 0,new ModelResourceLocation(block.getRegistryName(),"inventory"));
   }
}

