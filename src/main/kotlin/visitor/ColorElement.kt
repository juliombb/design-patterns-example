package visitor

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/10/19
 */
abstract class ColorElement {
    abstract fun accept(visitor: ColorVisitor): String
}