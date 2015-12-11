package net.thereturningvoid.advancedmod.util

import cpw.mods.fml.common.FMLLog
import net.thereturningvoid.advancedmod.reference.Reference
import org.apache.logging.log4j.Level

object Logger {

  def logMessage(level: Level, log: AnyRef): Unit = FMLLog.log(Reference.MOD_NAME, level, String.valueOf(log))

  def fatal(log: AnyRef): Unit = logMessage(Level.FATAL, log)
  def error(log: AnyRef): Unit = logMessage(Level.ERROR, log)
  def warn(log: AnyRef): Unit = logMessage(Level.WARN, log)
  def info(log: AnyRef): Unit = logMessage(Level.INFO, log)
  def debug(log: AnyRef): Unit = logMessage(Level.DEBUG, log)
  def trace(log: AnyRef): Unit = logMessage(Level.TRACE, log)
  def all(log: AnyRef): Unit = logMessage(Level.ALL, log)
  def off(log: AnyRef): Unit = logMessage(Level.OFF, log)

}
