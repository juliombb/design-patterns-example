package composite

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/8/19
 */
class NumericOperand(private val value: Double): ArithmeticExpression() {
    override fun evaluate() = value

    override fun toString() = " Numeric { $value } "
}