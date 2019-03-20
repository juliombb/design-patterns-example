package strategy.strategies

import strategy.DeliveryStrategy
import strategy.model.DeliveryRequest
import java.time.Duration

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 3/20/19
 */
class PrivateDeliveryStrategy : DeliveryStrategy {
    override fun calculatePrice(request: DeliveryRequest): Long = request.distanceToReceiver * 3

    override fun calculateTime(request: DeliveryRequest): Duration = Duration.ofDays(request.distanceToReceiver)

    override fun deliver(request: DeliveryRequest) {
        println("The delivery request $request will be delivered by a private company and will take: ")
        println("${calculateTime(request).toDays()} days to arrive")
        println("${calculatePrice(request) / 100} BRL to be paid")
    }
}