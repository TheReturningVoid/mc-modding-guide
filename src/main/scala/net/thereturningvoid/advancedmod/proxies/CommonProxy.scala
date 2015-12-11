package net.thereturningvoid.advancedmod.proxies

abstract class CommonProxy {

  def preInit(): Unit
  def init(): Unit
  def postInit(): Unit
}
