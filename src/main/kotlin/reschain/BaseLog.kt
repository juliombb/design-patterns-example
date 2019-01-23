package reschain

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/23/19
 */
class BaseLog(nh: LogHandler?): LogHandler(nh) {

    override fun log(text: String, priority: Priority) {
        if (priority.lvl == Priority.INFO.lvl) {
            println("[base_log] $text")
        }

        super.log(text, priority)
    }
}

enum class Priority(val lvl: Int) {
    DEBUG(0),
    INFO(1),
    WARN(2),
    ERROR(3)
}