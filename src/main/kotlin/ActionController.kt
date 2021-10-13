object ActionController {
    val dower = Dower()
    val actions=object : Actions{
        override fun addY() {
            dower.addLambda(20, 30) { a: Int, b: Int ->
                a*b-2/3+2
            }
        }

        override fun loopY() {
            dower.looper(1..10,"Looping") { a: String ->
                a
            }
        }

        override fun sortY() {
            dower.printBig(listOf(5,100,2,1,0)){
                println(it)
            }
        }

        override fun detY() {
            dower.detailer("Dohn Doe",3.9f,2020){
                println(it)
            }
        }

        override fun detPrintY() {
            dower.detailerPrint("Dohn Doe",3.9f,2020) { a: String -> a }
        }
    }
}