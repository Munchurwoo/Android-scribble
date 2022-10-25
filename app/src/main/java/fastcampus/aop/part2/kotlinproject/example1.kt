package fastcampus.aop.part2.kotlinproject

fun main(){
    helloworld()
    println(add(3,4))
    // String Template
    val name:String="cherwoo"
    println("my name is ${name}")
    println("money is 2\$a")
}
/*
*
* */

fun helloworld(){
    println("hellow world")
}

fun add(a:Int, b:Int): Int {
    return a+b
}

fun a(){
    val a:Int=2
    var b:Int=10
    b=11

    var c=2
    c=3
    val d=4
    var e:String = "cherwoo"
    e="aa"
}