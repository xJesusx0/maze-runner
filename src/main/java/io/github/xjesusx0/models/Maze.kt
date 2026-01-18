package io.github.xjesusx0.models

class Maze (var start: Node){

    fun step(mouse: Mouse) {
        mouse.visitedNodes.add(mouse.current)

        val options = mouse.current.neighbors
            .filter { node -> !mouse.visitedNodes.contains(node) }

        if(options.isNotEmpty()) {
            mouse.current = options.random()
        }
    }

}