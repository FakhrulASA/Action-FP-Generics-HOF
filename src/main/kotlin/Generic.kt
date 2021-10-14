class Generic<G,D>(private val value:G,private val name:D) {
    fun getValu(callback:(G)->Unit){
        callback((value as String+name) as G)
    }
}
fun printArray(array: Array<*>){
    array.forEach {
        println(it)
    }
}