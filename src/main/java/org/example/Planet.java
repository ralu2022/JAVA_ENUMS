package org.example;

public enum Planet {
    MERCURY(3.303,2.4397), VENUS(4.869,6.0518);

    private final double mass;
    private final double radius;
    public static final double G = 6.6730;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    double weight(double m) {
        return m * surfaceGravity();
    }
}




