package r

import org.scalatest.funsuite.AnyFunSuite

class LearnRedisAPI extends AnyFunSuite with RedisConn {

  test("1") {
    val x = cmd.get("user:123")
    pprint.log(x)
  }

  test("2") {
    val x = cmd.incr("user:123")
    pprint.log(x)
  }

  test("3") {
    val x = cmd.ttl("user:123")
    pprint.log(x)
  }

}
