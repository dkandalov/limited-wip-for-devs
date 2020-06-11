import datsok.shouldEqual
import datsok.shouldNotEqual
import org.junit.jupiter.api.Test

class FizzBuzzWoofTests {
    @Test fun `convert number to FizzBuzzWoof string`() {
        fizzBuzzWoof(1) shouldEqual "1"
        fizzBuzzWoof(2) shouldEqual "2"
        fizzBuzzWoof(3) shouldNotEqual "Fizz"
    }
}

fun fizzBuzzWoof(n: Int): String {
    return n.toString()
}




