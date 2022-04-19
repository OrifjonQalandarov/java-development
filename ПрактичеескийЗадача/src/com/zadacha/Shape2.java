package com.zadacha;

import java.util.ArrayList;

public class Shape2 {
    abstract class Shape {
        public abstract double getVolume();
    }

    abstract class SolidOfRevolution extends Shape {
        protected double radius;

        public SolidOfRevolution(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
    }

    class Ball extends SolidOfRevolution {
        @Override
        public double getVolume() {
            return Math.PI * Math.pow(radius, 3) * 4 / 3;
        }

        public Ball(double radius) {
            super(radius);
        }
    }

    class Cylinder extends com.zadacha.SolidOfRevolution {
        private double height;
        private double radius;
        public Cylinder(double radius, double height) {
            super(radius);
            this.height = height;
        }
        @Override
        public double getVolume() {
            return Math.PI * radius * radius * height;
        }

    }
    class Pyramid extends Shape {
        private double height;
        private double s;
        public Pyramid(double height, double s) {
            this.height = height;
            this.s = s;
        }
        @Override
        public double getVolume() {
            return height * s * 4 / 3;
        }
    }
    class Box extends Shape {
        private ArrayList<Shape> shapes = new ArrayList<>();
        private double available;
        private double volume;
        public Box(double available) {
            this.available = available;
            this.volume = available;
        }
        public boolean add(Shape shape) {
            if (available >= shape.getVolume()) {
                shapes.add(shape);
                available -= shape.getVolume();
                return true;
            } else {
                return false;
            }
        }
        @Override
        public double getVolume() {
            return volume;
        }
    }
}


