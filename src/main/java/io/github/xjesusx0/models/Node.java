package io.github.xjesusx0.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Data
public class Node {
    @ToString.Exclude
    private Node next;
    private Boolean isFinal;
    private String name;

    public Node() {
        this.isFinal = false;
        this.name = "";
    }

    public Node(Node next) {
        this.next = next;
        this.isFinal = false;
        this.name = "";
    }

    public Node(String name) {
        this.isFinal = false;
        this.name = name;
    }

    public Node(boolean isFinal) {
        this.isFinal = isFinal;
        this.name = "";
    }

    public Node(boolean isFinal, String name) {
        this.isFinal = isFinal;
        this.name = name;
    }
}
