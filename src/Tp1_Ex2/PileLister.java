package Tp1_Ex2;

public class PileLister implements Pile {
	
	private Noeud sommet;
	public PileLister(){ sommet = null; }
	public boolean estVide(){ return (sommet == null); } 
	public Object dernier(){ return sommet.info; } 
	public void empiler(Object o){ Noeud n = new Noeud();
	n.info = o; n.suivant = sommet; sommet = n; } 
	public void depiler(){ 
		sommet = sommet.suivant; 
		} 
}
class TestPile{ public static void main(String[]args)
{ PileLister p = new PileLister(); 
for(int i = 0 ; i < 10 ; i++)
	p.empiler(new Integer(i)); while(!p.estVide()){
		System.out.println((Integer) p.dernier()); p.depiler(); }  
}
} 


