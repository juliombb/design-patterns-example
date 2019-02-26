package decorator.interfaces

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 2/26/19
 */
abstract class Decorator(baseWidget: Widget): Widget by baseWidget