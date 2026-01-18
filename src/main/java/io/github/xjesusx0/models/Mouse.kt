package io.github.xjesusx0.models

class Mouse (var current: Node) {
    val visitedNodes = mutableSetOf<Node>()
}