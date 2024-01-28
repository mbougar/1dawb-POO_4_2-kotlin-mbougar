
/**
 * Representa a una persona con su peso, altura y nombre.
 * @property peso El peso de la persona.
 * @property altura La altura de la persona.
 * @property nombre El nombre de la persona.
 * @property imc El índice de masa corporal (IMC) de la persona.
 * @constructor Crea una instancia de Persona con el peso, altura y nombre especificados.
 */
class Persona(var peso: Double, var altura: Double) {

    var nombre: String = "Sin Nombre"
    private var imc: Double = 0.0
        get() = calcImc()
        private set

    init {
        require(altura > 0) { "La altura debe ser un valor positivo." }
        require(peso > 0) { "El peso debe ser un valor positivo." }
    }

    /**
     * Crea una instancia de Persona con el nombre, peso y altura especificados.
     * @param nombre El nombre de la persona.
     * @param peso El peso de la persona.
     * @param altura La altura de la persona.
     */
    constructor(nombre: String, peso: Double, altura: Double) : this( peso, altura) {
        require(nombre.isNotEmpty()) {"El nombre no puede estar vacío."}
        this.nombre = nombre
    }

    /**
     * Calcula el índice de masa corporal (IMC) de la persona.
     * @return El valor del IMC.
     */
    private fun calcImc() = peso/(altura*altura)

    /**
     * Devuelve una representación en formato de cadena de la persona.
     * @return La representación de la persona.
     */
    override fun toString(): String {
        return "nombre: ${this.nombre},  peso: ${this.peso},  altura: ${this.altura}, imc: %.2f".format(imc)
    }

    /**
     * Compara esta persona con otro objeto.
     * @param other El objeto con el que comparar.
     * @return true si el objeto es igual a esta persona, false en caso contrario.
     */
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}