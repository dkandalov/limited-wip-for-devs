import kotlincommon.test.shouldEqual
import org.junit.jupiter.api.Test

class FizzBuzzWoofTests {
    @Test fun `convert number to FizzBuzzWoof string`() {
        fizzBuzzWoof(1) shouldEqual "1"
        fizzBuzzWoof(2) shouldEqual "2"
        // fizzBuzzWoof(3) shouldEqual "Fizz"
    }
}

fun fizzBuzzWoof(n: Int): String {
    return n.toString()
}
