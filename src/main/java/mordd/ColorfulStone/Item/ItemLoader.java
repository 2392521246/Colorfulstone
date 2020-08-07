package mordd.ColorfulStone.Item;

import mordd.ColorfulStone.ColorfulStone;
import net.minecraft.creativetab.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@EventBusSubscriber(modid = "colorfulstone")
public class ItemLoader {
    public static Item redIngot;
    public static final CreativeTabs COLORFUL_STONE = new CreativeTabs("colorfulstone") {
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(redIngot);
        }
    };
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
    define();
    event.getRegistry().registerAll(new Item[]{redIngot});
    for (int i=0;i<50;i++){
    ColorfulStone.logger.error("The Event has Loaded!");
    }
    }
    private static void define(){
     redIngot = new Item().setRegistryName("colorfulstone:red_ingot").setCreativeTab(COLORFUL_STONE).setUnlocalizedName("colorfulstone.redIngot");
    }
}
