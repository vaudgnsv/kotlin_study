package chap02.section2

fun main() {
    val num = 10
    val formattedString = """
        var a = 6
        var b = "kotlin"
        println(a + num) 
        """
    //num값은 $num
    println(formattedString)

}