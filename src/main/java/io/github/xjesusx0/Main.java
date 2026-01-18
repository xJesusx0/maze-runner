package io.github.xjesusx0;

import io.github.xjesusx0.models.Node;

public class Main {
    static void main() {

        Node start = new Node("Start");
        Node first = new Node("First");
        Node second = new Node("Second");
        Node finalNode = new Node(true, "Final");

        start.setNext(first);
        first.setNext(second);
        second.setNext(finalNode);

        Node current = start;
        while (true) {
            IO.println(current);

            if(current.getIsFinal()){
                IO.println("You are already final!");
                return;
            }

            current = current.getNext();
        }

    }
}
