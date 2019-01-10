package visitor

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/10/19
 */
class BlueColor: ColorElement() {
    override fun accept(visitor: ColorVisitor) = visitor.visit(this)
}