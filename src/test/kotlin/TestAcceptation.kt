import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AcceptationTest {
  @Test
    fun `rover should move forward`() {
        val rover = MarsRover(Position(0, 0), Direction.NORTH)
        rover.execute("F")
        assertEquals(Position(0, 1), rover.position)
        assertEquals(Direction.NORTH, rover.direction)
    }

  @Test
  fun `rover should turn right`() {
    /*  val rover = MarsRover(Position(0, 0), Direction.NORTH)
      rover.execute("R")
      assertEquals(Direction.EAST, rover.direction)*/
      TODO()
  }
}