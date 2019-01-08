package composite

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/8/19
 */
class CompositeOperand(private val first: ArithmeticExpression,
                       private val second: ArithmeticExpression,
                       private val operation: Operation): ArithmeticExpression() {

    override fun evaluate(): Double = operation.apply(first, second)

    override fun toString() = " Operand { $first ${operation.name} $second } "
}