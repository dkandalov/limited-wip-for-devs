import datsok.shouldEqual
import org.junit.jupiter.api.Test

class FizzBuzzWoofTests {
    @Test fun `convert number to FizzBuzzWoof string`() {
        fizzBuzzWoof(1) shouldEqual "1"
        fizzBuzzWoof(2) shouldEqual "2"
        fizzBuzzWoof(3) shouldEqual "Fizz"
        fizzBuzzWoof(4) shouldEqual "4"
        fizzBuzzWoof(5) shouldEqual "Buzz"
        fizzBuzzWoof(6) shouldEqual "Fizz"
        fizzBuzzWoof(7) shouldEqual "Woof"
        fizzBuzzWoof(8) shouldEqual "8"
        fizzBuzzWoof(9) shouldEqual "Fizz"
        fizzBuzzWoof(10) shouldEqual "Buzz"
        fizzBuzzWoof(14) shouldEqual "Woof"
        fizzBuzzWoof(15) shouldEqual "FizzBuzz"
        fizzBuzzWoof(3 * 7) shouldEqual "FizzWoof"
        fizzBuzzWoof(5 * 7) shouldEqual "BuzzWoof"
        fizzBuzzWoof(3 * 5 * 7) shouldEqual "FizzBuzzWoof"
        fizzBuzzWoof(3 * 5 * 7 + 1) shouldEqual "106"
    }
}

fun fizz(n: Int) = if (n.rem(3) == 0) "Fizz" else ""
fun buzz(n: Int) = if (n.rem(5) == 0) "Buzz" else ""
fun woof(n: Int) = if (n.rem(7) == 0) "Woof" else ""

fun fizzBuzzWoof(n: Int) =
    (fizz(n) + buzz(n) + woof(n))
        .ifEmpty { n.toString() }







