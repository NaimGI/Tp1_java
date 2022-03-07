package Tp1;

public class PointColoréNG extends Point<Integer>{
	
	private String Couleur;
	public PointColoréNG(Integer abs, Integer ord,String Couleur ,String nom) {
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
		return "PointColoréNG [Couleur=" + Couleur +" ,Point "+ super.toString()+ "]";
		
	}
	
	

}
