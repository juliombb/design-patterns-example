package strategy

import strategy.model.DeliveryRequest
import java.time.Duration

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 3/20/19
 */
interface DeliveryStrategy {
    fun calculatePrice(request: DeliveryRequest): Long
    fun calculateTime(request: DeliveryRequest): Duration

    fun deliver(request: DeliveryRequest)
}