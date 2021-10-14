import ActionController.actions

fun main() {

    /**
     * #Higher Order Functions
     * #Actions and Object
     */

    actions.addY()
    actions.loopY()
    actions.sortY()
    actions.detY()
    actions.detPrintY()

    /**
     * Generics
     */

    /**
     * Generics higher order
     */
    val p=Generic("Hello",5)
    p.getValu {
        println(it)
    }

    /**
     * Star Projections
     */
    printArray(arrayOf("A",1,"B",true,false,"ANotor"))
}


