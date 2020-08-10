package mordd.ColorfulStone.Block;

import mordd.ColorfulStone.Item.ItemLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = "colorfulstone")
public class BlockLoader {
    public Block redBlock;
    public Block orangeBlock;
    public Block yellowBlock;
    public Block greenBlock;
    public Block cyanBlock;
    public Block blueBlock;
    public Block purpleBlock;

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
    define();
       event.getRegistry().registerAll(new Block[]{redBlock,orangeBlock,yellowBlock 
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
  
    public static define(){
        redBlock = new Block(Material.ROCK).setUnlocalizedName("colorfulstone.red_block").setHardness(1.8F).setStepSound(soundTypeStone)
        .setResistance(4F).setCreativeTab(ItemLoader.COLORFUL_STONE).setHarvestLevel("pickaxe",0).setRegistryName("colorfulstone:red_block");
        orangeBlock = new Block(Material.ROCK).setUnlocalizedName("colorfulstone.orange_block").setHardness(1.45F).setStepSound(soundTypeStone)
        .setResistance(3.8F).setCreativeTab(ItemLoader.COLORFUL_STONE).setHarvestLevel("pickaxe",0).setRegistryName("colorfulstone:orange_block");
        yellowBlock = new Block(Material.ROCK).setUnlocalizedName("colorfulstone.yellow_block").setHardness(1.35F).setStepSound(soundTypeStone)
        .setResistance(3.4F).setCreativeTab(ItemLoader.COLORFUL_STONE).setHarvestLevel("pickaxe",0)setRegistryName("colorfulstone:yellow_block");
        greenBlock = new Block(Material.ROCK).setUnlocalizedName("colorfulstone.green_block").setHardness(0.95F).setStepSound(soundTypeStone)
        .setResistance(2.9F).setCreativeTab(ItemLoader.COLORFUL_STONE).setHarvestLevel("pickaxe",0)setRegistryName("colorfulstone:green_block");
        cyanBlock = new Block(Material.ROCK).setUnlocalizedName("colorfulstone.cyan_block").setHardness(1.45F).setStepSound(soundTypeStone)
        .setResistance(3.6F).setCreativeTab(ItemLoader.COLORFUL_STONE).setHarvestLevel("pickaxe",0)setRegistryName("colorfulstone:cyan_block");
        blueBlock = new Block(Material.ROCK).setUnlocalizedName("colorfulstone.blue_block").setHardness(1.7F).setStepSound(soundTypeStone)
        .setResistance(3.9F).setCreativeTab(ItemLoader.COLORFUL_STONE).setHarvestLevel("pickaxe",0)setRegistryName("colorfulstone:blue_block");
        purpleBlock = new Block(Material.ROCK).setUnlocalizedName("colorfulstone.purple_block").setHardness(2.1F).setStepSound(soundTypeStone)
        .setResistance(4.3F).setCreativeTab(ItemLoader.COLORFUL_STONE).setHarvestLevel("pickaxe",0)setRegistryName("colorfulstone:purple_block");
       }
    
    public static Item[] Transfer(Block[] block){
        size=block.length;
        Item[] a=new Item[size]
        for(int i=0;i<size;i++){
        a[i]=new ItemBlock(block[i]).setRegistryName(block[i].getRegistryName());
        }
        return a;
    }
}
