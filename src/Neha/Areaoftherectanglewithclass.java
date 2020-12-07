package Neha;

public class Areaoftherectanglewithclass {
	
	double length;
    double breadth;
    double area;
    
    Areaoftherectanglewithclass(){}
    
    Areaoftherectanglewithclass(double len, double breadth){
    	this.length= len;
    	this.breadth =breadth;
     }
    
    public double getLength()
    {
    	return length;
    }
    public double getBreadth()
    {
    	return breadth;
    }
    public void setLength(double len)
    {
    	this.length=len;
    }
    public void setBreadth(double breadth)
    {
    	this.breadth=breadth;
    }
    public double calculateArea()
    {
    	area = length * breadth;
    	return area;
    }
}
