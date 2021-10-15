import java.text.SimpleDateFormat
import java.util.*

object ActionController {
    val dower = Dower()
    val actions = object : Actions {
        override fun addY() {
            dower.addLambda(20, 30) { a: Int, b: Int ->
                val triangleArea = (a*b)/2
                triangleArea
            }
        }

        override fun loopY() {
            dower.looper(1..10, "Looping") { a: String, b: Int ->
                val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
                val currentDate = sdf.format(Date())
                a + " Index $b and next Index is ${b + 1} and time $currentDate"
            }
        }

        override fun sortY() {
            dower.printBig(listOf(5, 100, 2, 1, 0)) {
                println(it)
            }
        }

        override fun detY() {
            dower.detailer("Dohn Doe", 3.9f, 2020) {
                println(it)
            }
        }

        override fun makeString() {
            dower.makeString(10,{
                it
            },{a:Int,b:String->
               println("This is the $a no index and the value is $b") 
            })
        }

        override fun detPrintY() {
            dower.detailerPrint("Dohn Doe", 3.9f, 2020) { a: String -> a }
        }
    }
}