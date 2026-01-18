package io.github.xjesusx0;

import io.github.xjesusx0.models.Maze;
import io.github.xjesusx0.models.Mouse;
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

        Mouse mouse = new Mouse(start);
        Maze maze = new Maze(start);

        while (true){
            Node current = mouse.getCurrent();

            System.out.printf("El raton esta actualmente en: %s%n", current.getName());
            if(current.getIsFinal()){
                break;
            }

            if(current.getNeighbors().isEmpty()){
                System.out.println("El nodo actual no tiene mas vecinos, saliendo");
                break;
            }

            maze.step(mouse);
        }
    }
}
