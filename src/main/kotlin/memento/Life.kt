package memento

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 2/25/19
 */
data class Life(val era: String) {
    fun freeze(): LifeMoment = LifeMoment(this)
}