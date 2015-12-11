package net.thereturningvoid.advancedmod

import cpw.mods.fml.common.{SidedProxy, Mod}
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLInitializationEvent, FMLPreInitializationEvent}
import net.thereturningvoid.advancedmod.proxies.CommonProxy
import net.thereturningvoid.advancedmod.reference.Reference._
import net.thereturningvoid.advancedmod.util.Logger

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION, modLanguage = "scala")
object AdvancedMod {

  @SidedProxy(clientSide = CLIENT_SIDE_PROXY, serverSide = SERVER_SIDE_PROXY, modId = MOD_ID)
  var proxy: CommonProxy = null

  @EventHandler
  def preInit(e: FMLPreInitializationEvent): Unit = {
    proxy.preInit()
    Logger.info("Pre-init complete!")
  }

  @EventHandler
  def init(e: FMLInitializationEvent): Unit = {
    proxy.init()
    Logger.info("Init complete!")
  }

  @EventHandler
  def postInit(e: FMLPostInitializationEvent): Unit = {
    proxy.postInit()
    Logger.info("Post-init complete!")
  }
}
