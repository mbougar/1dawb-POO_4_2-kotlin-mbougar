
fun main() {

    val persona1 = Persona(60.2, 1.74)
    println(persona1.toString())
    val persona2 = Persona("Manuel",103.5, 1.85)
    println(persona2.toString())
    val persona3 = Persona("Marcos",90.2, 1.94)
    println(persona3.toString())

    println("*************************************")

    persona1.nombre = pedirNombre()
    println("Nombre: ${persona1.nombre}, peso: ${persona1.peso}, altura: ${persona1.altura}.")

    println("*************************************")

    println(persona3)
    persona3.altura = 1.80
    println(persona3)

    println("*************************************")

    persona2.altura = 1.80
    println(persona2)
    println(persona3)

    println("*************************************")

    if (persona3.equals(persona2)) {
        println("Manuel y Marcos son iguales")
    } else {
        println("Manuel y Marcos NO son iguales")
    }
}

/**
 * Solicita al usuario que introduzca un nombre por consola.
 * @return El nombre introducido por el usuario.
 */
fun pedirNombre(): String {
    var nombre: String?
    do {
        print("Introduzca un nombre: ")
        nombre = readln()
    } while (nombre.isNullOrBlank())

    return nombre
}