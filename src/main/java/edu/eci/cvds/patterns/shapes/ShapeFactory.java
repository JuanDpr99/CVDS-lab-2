package edu.eci.cvds.patterns.shapes;
//import edu.eci.cvds.patterns.shapes.concrete;

public class ShapeFactory
{
    public static void main(String[] args)
    {
    }

    public void create(RegularShapeType _type)
    {
        //shape shapes;
        switch(_type) {
            case Triangle:
                //shapes = new Triangle();
                break;
            case Quadrilateral:
                System.out.println("Seleccionaste la opción 2");
                break;
            case Pentagon:
                System.out.println("Seleccionaste la opción 3");
                break;
            case Hexagon:
                System.out.println("Seleccionaste la opción 3");
                break;
            default:
                System.out.println("Opción no válida");
        }
        //return shapes;
    }
}
