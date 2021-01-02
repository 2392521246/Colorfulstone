package mordd.colorfulstone;

import mordd.colorfulstone.item.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.Logger;


@Mod(modid = ColorfulStone.MODID,name = ColorfulStone.NAME,version = ColorfulStone.VERSION,acceptedMinecraftVersions = "1.12.2")
public class ColorfulStone{
  public static final String MODID = "colorfulstone";
  public static final String NAME = "ColorfulStone";
  public static final String VERSION = "0.1.0";
  @Mod.Instance(MODID)
  public static ColorfulStone instance;
  public static Logger logger;
  public ColorfulStone(){
  instance = this;
  }
  @EventHandler
  public void preInit (FMLPreInitializationEvent event){
  logger= event.getModLog();
  logger.info("start.");
  new ItemLoader();
  new ModelMapper();
  logger.info("end.");
  }
  @EventHandler 
  public void init (FMLInitializationEvent event){}
  @EventHandler 
  public void postInit (FMLPostInitializationEvent event){}
}