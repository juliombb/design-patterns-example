package visitor

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/10/19
 */
open class ColorVisitor {
    fun visit(element: ColorElement) =
        element.accept(this)

    fun visit(element: BlueColor) =
        "Visited blue!!"

    fun visit(element: RedColor) =
        "Visited red!!"
}