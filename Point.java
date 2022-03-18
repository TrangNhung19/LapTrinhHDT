import java.util.Scanner;

class Point {
	private double x;
	private double y;
	public void nhap() {
		  Scanner sc =new Scanner(System.in);
		  System.out.println("nhap x: ");
		  x=sc.nextDouble();
		  System.out.println("nhap y: ");
		  y=sc.nextDouble();
	}
	public void show() {
		System.out.println("("+x+","+y+")");	
	}
	public void changePoint(double dx,double dy) {
		x=x+dx;
		y=y+dy;
	}
	public double getX() {
	    return x;
	  }

	public void setX(double x1) {
		 x=x1;
	  }

	public double getY() {
	    return y;
	  }

	public void setY(double y1) {
	    y=y1;
	  }
	public boolean check3PointInLine(Point a, Point b, Point c) {
		    return a.getX() * c.getX() == a.getX() * b.getX() && a.getY() * c.getY() == a.getY() * b.getY();
		  }
	public double getDistanceBetween2Point(Point a, Point b) {
	    return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	  }

	  public double getPerimeter(Point a, Point b, Point c) {
	    double ab = getDistanceBetween2Point(a, b);
	    double bc = getDistanceBetween2Point(b, c);
	    double ca = getDistanceBetween2Point(c, a);

	    return ab + bc + ca;
	  }

	  public double getArea(Point a, Point b, Point c) {
	    double ab = getDistanceBetween2Point(a, b);
	    double bc = getDistanceBetween2Point(b, c);
	    double ca = getDistanceBetween2Point(c, a);

	    double perimeter = getPerimeter(a, b, c);
	    return Math.sqrt(
	            perimeter *
	            (perimeter - ab) *
	            (perimeter - bc) *
	            (perimeter - ca)
	            );//heron
	  }

	public static void main(String [] args) {
		Point P=new Point();
		P.nhap();
		P.show();
		
		Point P1=new Point();
		P1.setX(-1+P.getX());
		P1.setY(-1+P.getY());
		P1.show();
		
		boolean P2=P.check3PointInLine(P1, P, P1);
		System.out.println("3 diem thang hang "+P2);
		
		double P3=P.getDistanceBetween2Point(P, P1);
		System.out.println("khoang cach giua 2 diem: "+P3);
		
		double P4=P.getArea(P1, P, P1);
		System.out.println(P4);
		
	}
}
