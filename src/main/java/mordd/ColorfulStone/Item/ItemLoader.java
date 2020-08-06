package mordd.ColorfulStone.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.event.RegistryEvent;


@EventBusSubscriber(modid = "ColorfulStone")
public class ItemLoader {
    public static Item redIngot;
    public static final CreativeTabs COLORFUL_STONE = new CreativeTabs("colorful_stone") {
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(redIngot);
        }
    };
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
    define();
    event.getRegistry().registerAll(new Item[]{redIngot});
    }
    private static void define(){
     redIngot = new Item().setRegistryName("colorfulstone:red_ingot").setCreativeTab(COLORFUL_STONE).setUnlocalizedName("colorfulstone.redIngot");
    }
}
