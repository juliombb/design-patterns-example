package decorator

import decorator.interfaces.Widget

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 2/26/19
 */
class TextField(private val width: Int): Widget {
    override fun draw() = repeat(width) { print("_") }
}