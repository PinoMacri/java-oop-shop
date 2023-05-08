package jana60.bank;

public class Conto {
	private int numero;
	private String nome;
	private double saldo=0;
	
	public Conto (int numero, String nome, double saldo) {
		this.numero=numero;
		this.setNome(nome);
		this.saldo=saldo;
	}

	public double getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void versa(double importo) {
	    saldo += importo;
	}
	
	public void preleva(double importo) {
		 if(importo > saldo) {
		    	importo = saldo;
		    }
	    saldo = saldo - importo;
	   
	}
	

	public String toString() {

	    return "Proprietario: " + nome + " Numero Conto: " + numero + " Saldo: " + saldo + " " ;
	}
}
