class Circle{
    private double radius=1.0;
    private String color ="red";
    
    Circle(double r){
        radius = r;
    }
    Circle(double r, String c){
        radius = r;
        color = c;
    }
    
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle C1 = new Circle(10.2);
        Circle C2 = new Circle(9.6, "yellow");
        System.out.println("Radius and area of first circle: " + C1.getRadius() + ", " + C1.getArea());
        System.out.println("Radius and area of second circle: " + C2.getRadius() + ", " + C2.getArea());
    }
}

