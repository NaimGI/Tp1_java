package Tp1;

public class PointColor�NG extends Point<Integer>{
	
	private String Couleur;
	public PointColor�NG(Integer abs, Integer ord,String Couleur ,String nom) {
		super(abs, ord,nom);
		this.Couleur=Couleur;
		// TODO Auto-generated constructor stub
	}
	public String getCouleur() {
		return Couleur;
	}
	public void setCouleur(String couleur) {
		Couleur = couleur;
	}
	@Override
	public String toString() {
		return "PointColor�NG [Couleur=" + Couleur +" ,Point "+ super.toString()+ "]";
		
	}
	
	

}
