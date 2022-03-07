package Tp1;

public class PointColore<T> extends Point<T> {
	
	private T Couleur;
	public PointColore(T abs, T ord,T Couleur,String nom) {
		super(abs,ord, nom);
		this.Couleur=Couleur;
		// TODO Auto-generated constructor stub
	}
	public T getCouleur() {
		return Couleur;
	}
	public void setCouleur(T couleur) {
		Couleur = couleur;
	}
	@Override
	public String toString() {
		return "PointColore [Couleur=" + Couleur + super.toString()+ "]";
		
	}
	

}
