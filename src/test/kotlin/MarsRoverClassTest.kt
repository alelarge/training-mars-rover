import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class MarsRoverClassTest {
    @Test
    fun `create position at 0 0`() {
        val position = (Position(0, 0))
        assertThat(position.x).isEqualTo(0)
        assertThat(position.y).isEqualTo(0)
    }
}