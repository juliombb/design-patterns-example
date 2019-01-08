package composite

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/8/19
 */
abstract class ArithmeticExpression {
    abstract fun evaluate(): Double

    operator fun plus(other: ArithmeticExpression) =
        evaluate() + other.evaluate()

    operator fun minus(other: ArithmeticExpression) =
        evaluate() - other.evaluate()

    operator fun times(other: ArithmeticExpression) =
        evaluate() * other.evaluate()

    operator fun div(other: ArithmeticExpression) =
        evaluate() / other.evaluate()
}