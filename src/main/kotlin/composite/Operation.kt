package composite

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/8/19
 */
enum class Operation(val apply: (ArithmeticExpression, ArithmeticExpression) -> Double) {

    PLUS({ f1, f2 -> f1 + f2 }),
    MINUS({ f1, f2 -> f1 - f2 }),
    TIMES({ f1, f2 -> f1 * f2 }),
    DIV({ f1, f2 -> f1 / f2 });
}