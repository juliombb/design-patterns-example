package reschain

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/23/19
 */
abstract class LogHandler(val nextHandler: LogHandler?) {

    open fun log(text: String, priority: Priority) { nextHandler?.log(text, priority) }
}