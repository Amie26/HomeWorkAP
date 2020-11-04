package answer19cylinder;

import java.lang.Math.*;
public class Cylinder extends Circle{

      private double height;


    public Cylinder(double radius, double height) {
        super(radius);
        if (height<0){
            height = 0;
        }
        this.height = height;

    }
    public double getHeight (){
        return height;

    }
    public double getVolume (){
        double volume = (getArea()* height);
        return volume;
    }
}


