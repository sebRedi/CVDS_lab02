package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory implements ShapeFactoryMethod{

    public static Shape create(RegularShapeType type){
        switch (type){
            case Triangle:
                return new Triangle();
            case Hexagon:
                return new Hexagon();
            case Pentagon:
                return new Pentagon();
            case Quadrilateral:
                return new Quadrilateral();
            default:
                throw new IllegalArgumentException("Desconocido el tipo de Figura " + type);
        }
    }
}

