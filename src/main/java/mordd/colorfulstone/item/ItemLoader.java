package mordd.colorfulstone.item;

import mordd.colorfulstone.ColorfulStone;
import net.minecraft.creativetab.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@EventBusSubscriber(modid = "colorfulstone")
public class ItemLoader {
    public static Item redIngot;
    public static Item orangeIngot;
    public static Item yellowIngot;
    public static Item greenIngot;
    public static Item cyanIngot;
    public static Item blueIngot;
    public static Item purpleIngot;
    public static final CreativeTabs COLORFUL_STONE = new CreativeTabs("colorfulstone") {
    @Override
    public ItemStack createIcon() {
        return new ItemStack(redIngot);
        }
    };
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
    define();
    event.getRegistry().registerAll(new Item[]{redIngot,orangeIngot,yellowIngot,
       greenIngot,cyanIngot,blueIngot,
       purpleIngot
    });
    for (int i=0;i<50;i++){
    ColorfulStone.logger.error("The Event has Loaded!");
    }
    }
    private static void define(){
     redIngot = new Item().setRegistryName("colorfulstone:red_ingot").setTranslationKey("colorfulstone.redIngot").setCreativeTab(COLORFUL_STONE);
     orangeIngot = new Item().setRegistryName("colorfulstone:orange_ingot").setCreativeTab(COLORFUL_STONE).setTranslationKey("colorfulstone.orangeIngot");
     yellowIngot = new Item().setRegistryName("colorfulstone:yellow_ingot").setCreativeTab(COLORFUL_STONE).setTranslationKey("colorfulstone.yellowIngot");
     greenIngot = new Item().setRegistryName("colorfulstone:green_ingot").setCreativeTab(COLORFUL_STONE).setTranslationKey("colorfulstone.greenIngot");
     cyanIngot = new Item().setRegistryName("colorfulstone:cyan_ingot").setCreativeTab(COLORFUL_STONE).setTranslationKey("colorfulstone.cyanIngot");
     blueIngot = new Item().setRegistryName("colorfulstone:blue_ingot").setCreativeTab(COLORFUL_STONE).setTranslationKey("colorfulstone.blueIngot");
     purpleIngot = new Item().setRegistryName("colorfulstone:purple_ingot").setCreativeTab(COLORFUL_STONE).setTranslationKey("colorfulstone.purpleIngot");
    }
}
