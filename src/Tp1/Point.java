package Tp1;

public class Point<T> {
	private String nom;
	private T abs;
	private T ord;
	public Point(T abs, T ord,String ord2) {
		this.nom=ord2;
		this.abs = abs;
		this.ord = ord;
	}
	public T getAbs() {
		return abs;
	}
	
	public void setAbs(T abs) {
		this.abs = abs;
	}
	public T getOrd() {
		return ord;
	}
	public void setOrd(T ord) {
		this.ord = ord;
	}
	@Override
	public String toString() {
		return "Point [abs=" + abs + ", ord=" + ord + "Nom :"+ nom +"]";
	}
	


}
