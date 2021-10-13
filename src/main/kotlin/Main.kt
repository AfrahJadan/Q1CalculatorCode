fun main(args: Array<String>) {
    println("Hello user I am your calculator")
    println("Enter two number please")
    var num1 = readLine()!!.toDouble()
    println("Enter First number please")
    var num2 = readLine()!!.toDouble()
    println("Enter Second number please")
    var ope= readLine()!!.toInt()
    println("Enter one of these operations (+.-,*,/,%)")
    if (ope==+){
        println("num1 + num2 = ${num1 + num2}")
    }
    else if(ope=='-'){
    println("num1 - num2 = ${num1 - num2}")
    }else if(ope== *)
    { println("num1 * num2 = ${num1 * num2}")
    } else if(ope== /){
     println("num1 / num2 = ${num1 / num2}")
    }else if(ope== %)
    { println("num1 % num2 = ${num1 % num2}") }
    else  println("the operation is false")
}