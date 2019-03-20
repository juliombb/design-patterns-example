package strategy.strategies

import strategy.DeliveryStrategy
import strategy.model.DeliveryRequest
import java.time.Duration

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 3/20/19
 */
class GovernmentDeliveryStrategy : DeliveryStrategy {
    override fun calculatePrice(request: DeliveryRequest): Long = request.distanceToReceiver * 2

    override fun calculateTime(request: DeliveryRequest): Duration = Duration.ofDays(Math.round(request.distanceToReceiver * 1.5))

    override fun deliver(request: DeliveryRequest) {
        println("The delivery request $request will be delivered by the government and will take: ")
        println("${calculateTime(request).toDays()} days to arrive")
        println("${calculatePrice(request)/100} BRL to be paid")
    }
}