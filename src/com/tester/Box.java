package com.tester;

public class Box {

    private double height, depth,width;

    public Box(double h , double d, double w)
    {
        this.height = h;
        this.depth  = d;
        this.width = w;
    }

    //over loaded constructor
    public Box(double side)
    {
        this(side,side,side);
    }
    public  void  displaydims()
    {
        System.out.println("Height:" + height + "Width :" + width +"Depth:"+depth  );
    }

    public  void  displayvolume()
    {
        System.out.println("Total Volume:" + calculatevolume() );
    }


    public double calculatevolume()
    {
        return height*depth*width;

    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
