package io.github.xjesusx0.models;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class Node {
    @ToString.Exclude
    private final List<Node> neighbors;

    @Setter
    private Boolean isFinal;

    @Setter
    private String name;

    public Node() {
        this.isFinal = false;
        this.name = "";
        this.neighbors = new ArrayList<>();
    }

    public Node(Node... nodes) {
        this.neighbors = new ArrayList<>(List.of(nodes));
        this.isFinal = false;
        this.name = "";
    }

    public Node(String name) {
        this.isFinal = false;
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    public Node(boolean isFinal) {
        this.isFinal = isFinal;
        this.name = "";
        this.neighbors = new ArrayList<>();
    }

    public Node(boolean isFinal, String name) {
        this.isFinal = isFinal;
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    public void connect(Node node) {
        this.neighbors.add(node);
    }

    public void connect(Node... nodes) {
        this.neighbors.addAll(List.of(nodes));
    }
}
