import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        Triangle t1=new Triangle();
    }
}
class Point{
    protected double x;
    protected double y;

}
class Triangle extends Point{
    Point p1=new Point();
    Point p2=new Point();
    Point p3=new Point();
    Scanner s = new Scanner(System.in);
    Triangle(){
    p1.x = s.nextDouble();
    p1.y = s.nextDouble();
     p2.x = s.nextDouble();
     p2.y = s.nextDouble();
    p3.x = s.nextDouble();
    p3.y = s.nextDouble();
        this.isTri();
}

    public void isTri(){
        System.out.println("* p1*\n* p2*\n* p3*\n");
    double a = Math.sqrt( (p1.x-p2.x)*(p1.x-p2.x)+ (p1.y-p2.y)*(p1.y-p2.y) );
    double b = Math.sqrt( (p3.x-p2.x)*(p3.x-p2.x)+ (p3.y-p2.y)*(p3.y-p2.y) );
    double c = Math.sqrt( (p1.x-p3.x)*(p1.x-p3.x)+ (p1.y-p3.y)*(p1.y-p3.y) );
        if(a+b>c && a+c>b && b+c>a && a-b<c && a-c<b && b-c<a){
            double Perimeter = a + b + c;
            double p = (a+b+c)/(2.0);
            double Area = Math.sqrt(Math.abs(p*(p-a)*(p-b)*(p-c)));
            System.out.printf("Perimeter=%f*Area=%f*",Perimeter,Area);
        }
        else{
            System.out.println("Can't form a triangle!");
        }

    }
}


