package io.github.xjesusx0;

import io.github.xjesusx0.models.Node;

public class Main {
    static void main() {

        Node start = new Node("Start");
        Node left = new Node("Left");
        Node right = new Node("Right");
        Node finalNode = new Node(true, "Final");

        start.connect(left, right);
        left.connect(finalNode);
        right.connect(finalNode);
    }
}
