package TestPackage;

public class Square extends Shape //inherits shape class
{
    //Variable for side of the square
    //public double side;

    //private double side; //encapsulation- this variable cant be directly accessed

    //create constructor
    /*
    public Square(double side)
    {
        this.side = side;
    }


    public double sqArea()
        {
            //Calculate square area
            return side * side;
        }

    public double squarePerimeter()
    {
        //Calculate square perimeter
        return 4 * side;
    }*/

    public double findArea()
    {
        return getLength()*getBreadth();
    }

    public double findPerimeter()
    {
        return 2 * (getLength() + getBreadth());
    }


    //Getter- Setter concept
   /* public void setSide(double side)
    {
        //LHS  = variable in the above method
        //RHS = variable from Demo class
        //this keyword will specify the variable which used
        this.side = side;
    }

    //Getter- Setter concept
    public double getSide()
    {
        //LHS  = variable in the above method
        //RHS = variable from Demo class
        return side;
    }*/





}

   /* variable when declared:
    public - anywhere if this package is imported
    default - within package
    private - inside the method*/


