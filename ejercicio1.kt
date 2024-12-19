fun main() {

    do {
        println("============ Calculadora de Area de Figuras ============")
        println("1. Triangulo")
        println("2. Circulo")
        println("3. Cuadrado")
        println("0. Salir")
        print("Opcion: ")
        val option = readLine()!!.toInt()
        when (option) {
            0 -> {
                break
            }
            1 -> {
                print("Ingrese la base: ")
                val base = readLine()!!.toDouble()
                print("Ingrese la altura: ")
                val height = readLine()!!.toDouble()
                println("El area del triangulo es  ${triangleArea(base, height)}")
            }
            2 -> {
                print("Ingrese el radio:")
                val radius = readLine()!!.toDouble()
                println("El area del circulo es  ${circleArea(radius)}")
            }
            3 -> {
                print("Ingrese el lado:")
                val side = readLine()!!.toDouble()
                println("El area del cuadrado es  ${squareArea(side)}")
            }
            else -> {
                println("Opcion invalida")
            }
        }
    } while (true)
}

fun triangleArea(base: Double, height: Double): Double {
    return 0.5 * base * height
}

fun circleArea(radius: Double): Double {
    return Math.PI * radius * radius
}

fun squareArea(side: Double): Double {
    return side * side
}