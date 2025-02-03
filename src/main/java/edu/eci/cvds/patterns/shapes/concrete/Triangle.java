package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Triangle implements Shape {
    private final int EDGES = 3;
    @Override
    public int getNumberOfEdges() {
        return EDGES;
    }
}