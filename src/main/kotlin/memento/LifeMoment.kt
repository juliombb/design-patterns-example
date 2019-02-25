package memento

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 2/25/19
 */
data class LifeMoment(private val life: Life) {
    fun recoverLife() = life.copy()
}