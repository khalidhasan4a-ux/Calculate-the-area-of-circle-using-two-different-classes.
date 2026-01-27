public class CircleRadInConstructor2 {

    private double radius;

    public CircleRadInConstructor2() {
        radius = 0;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }

    public double getRadius() {
        return this.radius;
    }

    public double computeArea() {
        return radius * radius * Math.PI;
    }
}
