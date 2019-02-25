package memento

import java.util.*
import java.util.concurrent.LinkedBlockingQueue

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 2/25/19
 */
fun main() {
    val lifetime = LinkedBlockingQueue<LifeMoment>()
    var life = Life("1985")

    println(life)
    lifetime.add(life.freeze())

    life = Life("2018")
    println(life)
    lifetime.add(life.freeze())

    life = lifetime.remove().recoverLife()
    println(life)

    println(Arrays.toString(lifetime.toArray()))
}