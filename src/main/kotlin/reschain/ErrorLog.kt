package reschain

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/23/19
 */
class ErrorLog(nh: LogHandler?): LogHandler(nh) {

    override fun log(text: String, priority: Priority) {
        if (priority.lvl == Priority.ERROR.lvl) {
            println("[error_log] $text")
        }

        super.log(text, priority)
    }
}