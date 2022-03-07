package Tp1;

public class Test {

	public static void main(String[] argv) {
		Point<Integer> p1=new Point<Integer>(3,5,"ok");
		Point<Double> p2=new Point<Double>(4.2,8.3,"hello");
		PointColoréNG p4=new PointColoréNG(4,6,"pcng1","test");
		PointColore p5=new PointColore (5,7,"oc1","bbb");
		Cercle<Integer> c1 =new Cercle<Integer>(50,p1);
		CercleAvecRestriction c2=new CercleAvecRestriction(100,p2);
		// Get all the attribute of Point
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());
		// Select all the attribute of circle
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

	
}
