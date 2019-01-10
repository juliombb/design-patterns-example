package visitor

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/10/19
 */
fun main() {
    val blue: ColorElement = BlueColor()
    val red: ColorElement = RedColor()
    val visitor = ColorVisitor()

    println("Blue type: ${blue::class.java} | Red type: ${red::class.java} ")
    println()
    println("Visiting blue: ${ blue.accept(visitor) } | ${ visitor.visit(blue) }")
    println()
    println("Visiting red: ${ red.accept(visitor) } | ${ visitor.visit(red) }")
}