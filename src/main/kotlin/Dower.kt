class Dower {
    fun addLambda(a: Int, b: Int, add: (a: Int, b: Int) -> Int) {
        println(add(a,b))
    }

    fun looper(a:IntRange,s:String, loopfun:(v:String)->String){
        for(i in a){
            println(loopfun(s))
        }
    }
    fun printBig(a:List<Int>,big:(a:Int)->Unit){
        val x:List<Int> = a.toIntArray().sortedWith(Comparator.reverseOrder())
        big.invoke(x[0])
    }



    fun detailer(name:String,cg:Float,year:Long,conLm:(String)->Unit){
        conLm("Name of the Student: $name\nCGPA: $cg\nYear of Passing: $year\n")
    }
    fun detailerPrint(name:String,cg:Float,year:Long,conLm:(String)->String){
        println(conLm("Name of the Student: $name\nCGPA: $cg\nYear of Passing: $year\n"))
    }
}