package Tp1;

public class CercleAvecRestriction <T2 extends Point>{
	private int rayon;
	T2 center;
	public CercleAvecRestriction(int rayon, T2 center) {
		super();
		this.rayon = rayon;
		this.center = center;
	}
	public int getRayon() {
		return rayon;
	}
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	public T2 getCenter() {
		return center;
	}
	public void setCenter(T2 center) {
		this.center = center;
	}
	@Override
	public String toString() {
		return "CercleAvecRestriction [rayon=" + rayon + ", center=" + center + "]";
	}

}
