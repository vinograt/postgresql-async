package com.github.mauricio.async.db.pool

trait ConnectionPoolListener {
  def connectionTaken(available: Int, inUse: Int, queued: Int): Unit
  def connectionGivenBack(available: Int, inUse: Int, queued: Int): Unit
}
