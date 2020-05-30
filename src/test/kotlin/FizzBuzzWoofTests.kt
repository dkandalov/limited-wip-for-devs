import kotlincommon.test.shouldEqual
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
        fizzBuzzWoof(3 * 5) shouldEqual "FizzBuzz"
        fizzBuzzWoof(3 * 7) shouldEqual "FizzWoof"
        fizzBuzzWoof(5 * 7) shouldEqual "BuzzWoof"
        fizzBuzzWoof(3 * 5 * 7) shouldEqual "FizzBuzzWoof"
    }
}

fun fizz(n: Int) = if (n.rem(3) == 0) "Fizz" else ""
fun buzz(n: Int) = if (n.rem(5) == 0) "Buzz" else ""
fun woof(n: Int) = if (n.rem(7) == 0) "Woof" else ""

fun fizzBuzzWoof(n: Int): String {
    return fizz(n) + buzz(n) + woof(n) + when {
        n.rem(3) == 0 && n.rem(5) == 0 && n.rem(7) == 0 -> ""
        n.rem(3) == 0 && n.rem(7) == 0                  -> ""
        n.rem(5) == 0 && n.rem(7) == 0                  -> ""
        n.rem(3) == 0 && n.rem(5) == 0                  -> ""
        n.rem(3) == 0                                   -> ""
        n.rem(5) == 0                                   -> ""
        n.rem(7) == 0                                   -> ""
        else                                            -> n.toString()
    }
}
