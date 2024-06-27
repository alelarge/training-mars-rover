import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MarsRoverClassTest {
@Test
    fun `rover should initialize at position 0 0`() {
        val rover = MarsRover(Position(0, 0))
        assertEquals(Position(0, 0), rover.position)
    }
}