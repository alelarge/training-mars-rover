import org.junit.jupiter.api.Test

class MarsRoverClass {
    @Test
    fun `create position at 0 0`() {
        val position = (Position(0, 0))
        assertThat(position.x).isEqualTo(0)
        assertThat(position.y).isEqualTo(0)
    }
}