package strategy.model

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 3/20/19
 */
data class DeliveryRequest(
    val sizeInCm: Long,
    val distanceToReceiver: Long,
    val priority: DeliveryPriority
)

enum class DeliveryPriority {
    COST,
    TIME
}