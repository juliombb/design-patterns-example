package decorator

import decorator.decorators.ArrowDecorator
import decorator.decorators.BorderDecorator

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 2/26/19
 */
fun main() {
    val textField = ArrowDecorator(
        BorderDecorator(
            TextField(10)
        )
    )

    textField.draw()
}