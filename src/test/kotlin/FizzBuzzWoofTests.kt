
import datsok.shouldEqual
import org.junit.jupiter.api.Test

class FizzBuzzWoofTests {
    @Test fun `convert number to FizzBuzzWoof string`() {
        fizzBuzzWoof(1) shouldEqual "1"
        fizzBuzzWoof(2) shouldEqual "2"
        fizzBuzzWoof(3) shouldEqual "Fizz"
        fizzBuzzWoof(4) shouldEqual "4"
        fizzBuzzWoof(5) shouldEqual "Buzz"
    }
}

fun fizzBuzzWoof(n: Int): String {
    if (n.rem(3) == 0) return "Fizz"
    if (n.rem(5) == 0) return "Buzz"
    return n.toString()
}




