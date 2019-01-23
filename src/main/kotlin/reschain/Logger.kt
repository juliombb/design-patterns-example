package reschain

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/23/19
 */

fun main() {
    val warnLog = WarnLog(null)
    val errorLog = ErrorLog(warnLog)
    val debugLog = DebugLog(errorLog)
    val log = BaseLog(debugLog)

    (log as LogHandler).log("Testing info", Priority.INFO)

    log.log("Testing debug", Priority.DEBUG)

    log.log("Testing error", Priority.ERROR)

    log.log("Testing warning", Priority.WARN)
}