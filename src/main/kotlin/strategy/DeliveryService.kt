package strategy

import strategy.model.DeliveryPriority
import strategy.model.DeliveryRequest
import strategy.strategies.GovernmentDeliveryStrategy
import strategy.strategies.PrivateDeliveryStrategy
import java.io.InputStreamReader
import java.util.*

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 3/20/19
 */
fun main() {
    val strategies = listOf(GovernmentDeliveryStrategy(), PrivateDeliveryStrategy())
    val sc = Scanner(InputStreamReader(System.`in`))

    val priority = selectPriority(sc)
    val size = selectSize(sc)
    val distance = selectDistance(sc)

    val request = DeliveryRequest(size, distance, priority)

    val strategy = when (request.priority) {
        DeliveryPriority.COST -> strategies.sortedBy { it.calculatePrice(request) }
                                           .first()

        DeliveryPriority.TIME -> strategies.sortedBy { it.calculateTime(request).toMillis() }
                                           .first()
    }

    strategy.deliver(request)
}

private fun selectDistance(sc: Scanner): Long {
    print("Set a distance in cm: ")
    var read = sc.next()

    while (read.toLongOrNull() == null) {
        println("'$read' is an invalid long...")
        print("Set a distance in cm: ")
        read = sc.next()
    }

    return read.toLong()
}

private fun selectSize(sc: Scanner): Long {
    print("Set a size in cm: ")
    var read = sc.next()

    while (read.toLongOrNull() == null) {
        println("'$read' is an invalid long...")
        print("Set a size in cm: ")
        read = sc.next()
    }

    return read.toLong()
}

private fun selectPriority(sc: Scanner): DeliveryPriority {
    println("Request a delivery")
    print("You want to prior Price (p) or delivery time? (t) ")
    var read = sc.next()

    while (read !in setOf("p", "t")) {
        println("'$read' is an invalid option...")
        print("You want to prior Price (p) or delivery time? (t) ")
        read = sc.next()
    }

    return when (read) {
        "p" -> DeliveryPriority.COST
        "t" -> DeliveryPriority.TIME
        else -> throw Exception("boom")
    }
}