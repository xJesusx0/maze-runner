package io.github.xjesusx0.models

class Maze (var start: Node){

    fun step(mouse: Mouse) {
        mouse.visitedNodes.add(mouse.current)

        val next = mouse.current.neighbors.firstOrNull {
            node -> !mouse.visitedNodes.contains(node)
        }

        if(next != null) {
            mouse.path.addLast(next)
            mouse.current = next
        } else if (mouse.path.isNotEmpty()) {
            mouse.current = mouse.path.removeLast()
        }
    }

}