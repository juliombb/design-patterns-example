package composite

import java.util.*
import kotlin.ConcurrentModificationException

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 1/8/19
 */
fun main() {
    val operation = "(${readLine()})"


    val stack = Stack<String>()

    var cop = findCleanOps(operation)

    while (true) {
        if (cop == null) { break }
        stack.add(cop)

        cop = findCleanOps(cop)
    }

    val current = stack.pop().split(' ').chunked(2).map { ops ->
        NumericOperand(ops.first().toDouble()) to when (ops.lastOrNull()) {
            "+" -> Operation.PLUS
            "-" -> Operation.MINUS
            "/" -> Operation.DIV
            "*" -> Operation.TIMES
            else -> null
        }
    }

    var exp = CompositeOperand(current.first().first, current[1].first, current.first().second!!)

    for (i in 1..(current.size - 1)) {
        if (current[i].second == null) {
            break
        }

        exp = CompositeOperand(exp, current[i+1].first, current[i].second!!)
    }


    println(exp)


}

fun findCleanOps(operation: String?): String? =
    operation?.indexOfFirst { it == '(' }
        ?.takeIf { it >= 0 }
        ?.let { it to operation.indexOfLast { o -> o == ')' } }
        ?.takeIf { it.second >= 0 }
        ?.let {
            operation.substring(it.first + 1, it.second)
        }
