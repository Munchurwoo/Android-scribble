package fastcampus.aop.part2.kotlinproject

fun main(){
    helloworld()
    println(add(3,4))
    // String Template
    val name:String="cherwoo"
    println("my name is ${name}")
    println("money is 2\$a")
    println(add1(1,2))
}
/*
*
* 내가 소질이 없는건지
* 노력을 안한건지 모르겠다.
* 실행력이 가장 중요한 것 같은데 나한테 그런 능력이 있는것인지;;
* */

fun helloworld(){
    println("hellow world")
}

fun add(a:Int, b:Int): Int {
    return a+b
}
fun add1(a:Int, b:Int) =a+b

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