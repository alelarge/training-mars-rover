import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals



class MarsRoverClassTest {
@Test
    fun `rover should initialize at position 0 0`() {
        val rover = MarsRover(Position(0, 0))
        assertEquals(Position(0, 0), rover.position)
    }

@Test
    fun `rover should initialize the direction is the north`() {
        val rover = MarsRover(Direction.NORTH)
        assertEquals(Direction.NORTH, rover.direction)
        }
}

