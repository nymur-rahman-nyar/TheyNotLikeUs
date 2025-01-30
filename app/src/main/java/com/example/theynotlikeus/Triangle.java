package com.example.theynotlikeus;


import android.graphics.drawable.shapes.Shape;

public abstract class Triangle extends Shape {
    int x = 10;
    int y = 10;
    int z = 10;
    String color = "blue";
    public int sum(int a,int b,int c){
        return a+b+c;
    };
}
