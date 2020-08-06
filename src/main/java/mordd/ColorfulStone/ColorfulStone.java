package mordd.ColorfulStone;

import mordd.ColorfulStone.Item.*
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;



@mod(modid = ColorfulStone.MODID,name = ColorfulStone.NAME,version = ColorfulStone.VERSION,acceptedMinecraftVersions = "[1.12.2]")
public class ColorfulStone{
  public static final String MODID = "colorfulstone";
  public static final String NAME = "ColorfulStone";
  public static final String VERSION = "0.1.0"
  @Instance(MODID)
  public static ColorfulStone instance;

  public ColorfulStone(){
  instance = this;
  }
  @EventHandler
  public void preInit (FMLPreInitializationEvent event){
  new ItemLoader();
  new ModelMapper();
  }
  @EventHandler 
  public void init (FMLInitializationEvent event){}
  @EventHandler 
  public void postInit (FMLPostInitializationEvent event){}
}