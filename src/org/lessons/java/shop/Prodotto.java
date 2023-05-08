package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {
private Random codice;
private String nome;
private String descrizione;
private double prezzo;
private int iva;
public Prodotto(String nome, String descrizione, double prezzo, int iva){
	this.codice=new Random();
	this.nome=nome;
	this.descrizione=descrizione;
	this.prezzo=prezzo;
	this.iva=iva;
}
public Random getCodice() {
	return codice;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome=nome;
}

public String getDescrizione() {
	return descrizione;
}
public void setDescrizione(String descrizione) {
	this.descrizione=descrizione;
}

public double getPrezzo() {
	return prezzo;
}
public double getPrezzoConIVA() {
    double prezzoIVA = prezzo + (prezzo * iva / 100);
    return prezzoIVA;
}
public void setPrezzo(double prezzo) {
	this.prezzo=prezzo;
}

public int getIva() {
	return iva;
}
public void setIva(int iva) {
	this.iva=iva;
}






public String toString() {
    double prezzoConIVA = getPrezzoConIVA();
    return "Prodotto [codice=" + codice.nextInt(100) + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo=" + prezzo + ", iva=" + iva + ", prezzo con iva=" + prezzoConIVA + "]";
}


}
