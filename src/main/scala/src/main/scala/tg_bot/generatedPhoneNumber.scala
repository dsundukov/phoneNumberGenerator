package src.main.scala.tg_bot

object generatedPhoneNumber {

  def main(args: Array[String]): Unit = {

    while( true ){
      val phoneCode = "79"
      var str = scala.util.Random.between(100000000,999999999).toString
      val phoneGenerted = phoneCode + str
      println(phoneGenerted)
      Thread.sleep(10000) // wait for 1000 millisecond
    } }
  }
