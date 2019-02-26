package decorator.decorators

import decorator.interfaces.Decorator
import decorator.interfaces.Widget

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 2/26/19
 */
class BorderDecorator(wrapee: Widget): Decorator(wrapee) {
    override fun draw() {
        print("| ")
        super.draw()
        print(" |")
    }
}