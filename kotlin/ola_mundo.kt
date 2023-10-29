//kotlinc ola_mundo.kt -include-runtime -d ola_mundo.jar & java -jar ola_mundo.jar 
/*Ola*/

//package kotlin;
//https://kotlinlang.org/docs/getting-started.html
val a : Int = 5 //variaveis imutaveis
var b : Int = 9
val c : Int = a + b

fun maxOf(a: Int, b: Int) = if (a > b) a else b // If usado como uma expressão.

fun main () {
  println("\n$a menos $b é igual a ${a - b}\n")
  println("$a mais $b é $c")
  val result = maxOf(40, 200)
  println("O maior número é $result") // Exibe o resultado
  val familis = listOf("Lorenna", "Java", "Heitor")

  for (item in familis) {
    println(item)
  }
  //class Shape
 
}



