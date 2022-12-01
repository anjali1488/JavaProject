package TestPackage;

public class Rectangle extends Shape //inherits from shape
{
    /*private double length;
    private double breadth;

    public void setValues(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength()
    {
        return length;
    }

    public double getBreadth()
    {
        return breadth;
    }

    public double findArea()
    {
        return (length * breadth);
    }

    public double findPerimeter()
    {
        return 2 * (length * breadth);
    }*/

    public double findArea()
    {
        return getLength() * getBreadth();
    }

    public double findPerimeter()
    {
        return 2 * ((getLength() + getBreadth()));
    }


}
