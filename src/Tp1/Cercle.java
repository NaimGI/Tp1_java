package Tp1;

public class Cercle<T> {
private int rayon;
Point Center;
public Cercle(int rayon, Point center) {
	super();
	this.rayon = rayon;
	Center = center;
}
public int getRayon() {
	return rayon;
}
public void setRayon(int rayon) {
	this.rayon = rayon;
}
public Point getCenter() {
	return Center;
}
public void setCenter(Point center) {
	Center = center;
}
@Override
public String toString() {
	return "Cercle [rayon=" + rayon + ", Center=" + Center + "]";
}

}
