package r

import io.lettuce.core.RedisClient
import io.lettuce.core.RedisURI
import java.time.Duration

trait RedisConn {

  private val uri = RedisURI
    .Builder
    .redis("redis.service.bcdev")
    .withTimeout(Duration.ofMillis(5000))
    .build()

  private val client = RedisClient.create(uri)

  val cmd = client.connect.sync()

}
