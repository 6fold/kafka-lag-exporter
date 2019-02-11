package com.lightbend.kafka.core

import scala.concurrent.duration.FiniteDuration

trait SimpleConfig {
  def pollInterval: FiniteDuration
  def port: Int
  def clientGroupId: String
}

final case class KafkaCluster(name: String, bootstrapBrokers: String)
