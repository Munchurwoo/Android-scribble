package fastcampus.aop.part2.kotlinproject

fun main(){
    println(a(4,3))
    println(b(5,7))
    checkNumber(100)
    /*
    * array List 문법 공부
    * */

}

fun a(a:Int, b:Int):Int{
    if(a>b)
        return a
    else
        return b
}

fun b(a:Int, b:Int):Int = if(a>b) a else b

fun checkNumber(score:Int){
    when(score){
        0-> println("0점입니다.")
        1-> println("1점입니다.")
        else -> println("점수를 획득하지 못했습니다.")
    }
    var b=when(score){
        0-> 0
        1-> 1
        else -> 2
    }
    when(score){
        in 90..100-> println("great")
        in 10..80->println("fuck")
        else ->println("아무것도 포함되지 않는다")
    }
    println("b : ${b}")
}
/*
*
*
* */
