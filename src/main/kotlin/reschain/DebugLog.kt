package reschain

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/23/19
 */
class DebugLog(nh: LogHandler?): LogHandler(nh) {

    override fun log(text: String, priority: Priority) {
        if (priority.lvl == Priority.DEBUG.lvl) {
            println("[debug_log] $text")
        }

        super.log(text, priority)
    }
}