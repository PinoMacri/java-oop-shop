package jana60.bank;

public class Main {
	public static void main(String[] args) {
		Conto mioConto = new Conto(18, "Carlo Fazio", 0);
		mioConto.versa(100);
		mioConto.preleva(50);
		 System.out.println(mioConto.toString());
	}
}
