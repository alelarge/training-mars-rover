enum class Direction {
    NORTH
}
class MarsRover(var position: Position, val direction: Direction= Direction.NORTH) {
    fun execute(commands: String) {
        for (command in commands) when (command) {
            'F' -> {
                 position = when (direction) {
                    Direction.NORTH -> position.copy(y = position.y + 1)
                }
            }
        }
    }
}