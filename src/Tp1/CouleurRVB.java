package Tp1;

public class CouleurRVB extends Point<Double> {
private int  Rouge;
private int  Vert;
private int bleu;


public CouleurRVB(int rouge, int vert, int bleu,Double abs, Double ord,String nom) {
	super(abs,ord,nom);
	Rouge = rouge;
	Vert = vert;
	this.bleu = bleu;
}

public int getRouge() {
	return Rouge;
}

public void setRouge(int rouge) {
	Rouge = rouge;
}


public int getVert() {
	return Vert;
}



public void setVert(int vert) {
	Vert = vert;
}



public int getBleu() {
	return bleu;
}



public void setBleu(int bleu) {
	this.bleu = bleu;
}



@Override
public String toString() {
	return "CouleurRVB [Rouge=" + Rouge + ", Vert=" + Vert + ", bleu=" + bleu + "]";
}

}
