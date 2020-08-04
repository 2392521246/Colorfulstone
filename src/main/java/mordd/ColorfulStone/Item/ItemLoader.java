package mordd.ColorfulStone.Item;

import net.minecraftforge.fml.common.mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.Item;

@Mod.EventBusSubscriber(modid = "ColorfulStone")
public class ItemLoader {
    // WIP
    public static Item RegistryList[];
    public static Item redIngot;

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
    event.getRegistry().registerAll(RegistryList);
    }
    private void define(){
    
    }
}

