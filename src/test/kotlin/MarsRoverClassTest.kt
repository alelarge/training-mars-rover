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
        val rover = MarsRover((Position(0, 0)),Direction.NORTH)
        assertEquals(Direction.NORTH, rover.direction)
    }

    @Test
    fun `rover with the position 0-0 direction North change a position at 0-1 direction North`() {
        val rover = MarsRover((Position(0, 0)),Direction.NORTH)
        rover.execute()
        assertEquals(Position(0, 1), rover.position)
        assertEquals(Direction.NORTH, rover.direction)
    }
}

