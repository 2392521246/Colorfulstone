package mordd.colorfulstone.block;

import mordd.colorfulstone.item.ItemLoader;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = "colorfulstone")
public class BlockLoader {
    public static Block redBlock = new Block(Material.ROCK).setTranslationKey("colorfulstone.red_block").setHardness(1.8F)
            .setResistance(4F).setCreativeTab(ItemLoader.COLORFUL_STONE).setRegistryName("colorfulstone:red_block");
    
    public static Block orangeBlock = new Block(Material.ROCK).setTranslationKey("colorfulstone.orange_block").setHardness(1.45F)
            .setResistance(3.8F).setCreativeTab(ItemLoader.COLORFUL_STONE).setRegistryName("colorfulstone:orange_block");
    public static Block yellowBlock = new Block(Material.ROCK).setTranslationKey("colorfulstone.yellow_block").setHardness(1.35F)
            .setResistance(3.4F).setCreativeTab(ItemLoader.COLORFUL_STONE).setRegistryName("colorfulstone:yellow_block");
    public static Block greenBlock = new Block(Material.ROCK).setTranslationKey("colorfulstone.green_block").setHardness(0.95F)
            .setResistance(2.9F).setCreativeTab(ItemLoader.COLORFUL_STONE).setRegistryName("colorfulstone:green_block");
    public static Block cyanBlock = new Block(Material.ROCK).setTranslationKey("colorfulstone.cyan_block").setHardness(1.45F)
            .setResistance(3.6F).setCreativeTab(ItemLoader.COLORFUL_STONE).setRegistryName("colorfulstone:cyan_block");
    public static Block blueBlock = new Block(Material.ROCK).setTranslationKey("colorfulstone.blue_block").setHardness(1.7F)
            .setResistance(3.9F).setCreativeTab(ItemLoader.COLORFUL_STONE).setRegistryName("colorfulstone:blue_block");
    public static Block purpleBlock = new Block(Material.ROCK).setTranslationKey("colorfulstone.purple_block").setHardness(2.1F)
            .setResistance(4.3F).setCreativeTab(ItemLoader.COLORFUL_STONE).setRegistryName("colorfulstone:purple_block");

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
    	redBlock.setHarvestLevel("pickaxe",0);
    	orangeBlock.setHarvestLevel("pickaxe",0);
    	yellowBlock.setHarvestLevel("pickaxe",0);
    	greenBlock.setHarvestLevel("pickaxe",0);
    	cyanBlock.setHarvestLevel("pickaxe",0);
    	blueBlock.setHarvestLevel("pickaxe",0);
    	purpleBlock.setHarvestLevel("pickaxe",0);
       event.getRegistry().registerAll(new Block[]{redBlock,orangeBlock,yellowBlock, 
       greenBlock,cyanBlock,blueBlock,
       purpleBlock
    });
    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
    	event.getRegistry().registerAll(Transfer(new Block[]{redBlock,orangeBlock,yellowBlock,
        greenBlock,cyanBlock,blueBlock,
        purpleBlock}));
    }
  
    
    public static Item[] Transfer(Block[] block){
        int size=block.length;
        Item[] a=new Item[size];
        for(int i=0;i<size;i++){
        a[i]=new ItemBlock(block[i]).setRegistryName(block[i].getRegistryName());
        }
        return a;
    }
}
