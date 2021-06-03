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
        fizzBuzzWoof(11) shouldEqual "11"
        fizzBuzzWoof(14) shouldEqual "Woof"
        fizzBuzzWoof(3 * 5) shouldEqual "FizzBuzz"
        fizzBuzzWoof(3 * 7) shouldEqual "FizzWoof"
        fizzBuzzWoof(5 * 7) shouldEqual "BuzzWoof"
        fizzBuzzWoof(3 * 5 * 7) shouldEqual "FizzBuzzWoof"
    }

    private fun fizzBuzzWoof(n: Int): String =
        when {
            n.rem(3) == 0 && n.rem(5) == 0 && n.rem(7) == 0 -> "FizzBuzzWoof"
            n.rem(3) == 0 && n.rem(5) == 0                  -> "FizzBuzz"
            n.rem(3) == 0 && n.rem(7) == 0                  -> "FizzWoof"
            n.rem(5) == 0 && n.rem(7) == 0                  -> "BuzzWoof"
            n.rem(3) == 0                                   -> "Fizz"
            n.rem(5) == 0                                   -> "Buzz"
            n.rem(7) == 0                                   -> "Woof"
            else                                            -> n.toString()
        }
}







