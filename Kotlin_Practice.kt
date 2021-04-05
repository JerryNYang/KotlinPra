/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    println("Hello, world!!!")
    
    val cat : Float = 5F
    println(cat)
    
    val myARRAY = arrayOfNulls<String>(4)
    myARRAY[0] = "2"
    myARRAY[1] = "44"
    myARRAY[2] = "32323"
    myARRAY[3] = "777"
    
    println(myARRAY[3])
    
    val myNUMARRAY = intArrayOf(11,222,3444,331)
    println(myNUMARRAY.size)
    println(myNUMARRAY.get(0))
    
    var item = 4
    println(item::class.java)
    
    var items:Long = 5534444444
    println(items)
    println(items::class.java)
    
    val hisName: String? = null
    println(hisName)
    
    
    println("myfx() " + myfx())
    helloMJ()
    
}


fun myfx():Int
{
    return 4
}

// Unit = void
fun helloMJ():Unit
{
 	println("MJ Hee")   
}
