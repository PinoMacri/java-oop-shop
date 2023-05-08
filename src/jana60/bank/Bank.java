package jana60.bank;
import java.util.Scanner;
import java.util.Random;

public class Bank {
	public static void main(String[] args) {
		Random random = new Random();
		int codice = random.nextInt(1, 1000);
		
		Scanner nome = new Scanner(System.in);
		System.out.println("Scrivi il tuo nome:");
		String name = nome.nextLine();
		
		Conto nuovoConto = new Conto(codice, name, 0);
		
		Scanner operazione = new Scanner(System.in);
		String operation = "Nessuno";
		do {
			System.out.println("Cosa vuoi fare, versare, prelevare o uscire?");
			operation = operazione.nextLine();
			if(operation.equals("versare")) {
				Scanner versamento = new Scanner(System.in);
				System.out.println("Quanto vuoi versare?");
				double vers = versamento.nextInt();
				nuovoConto.versa(vers);
				System.out.println(nuovoConto.toString());
				
			} 
			else if(operation.equals("prelevare")) {
				Scanner prelevare = new Scanner(System.in);
				System.out.println("Quanto vuoi prelevare?");
				double prel = prelevare.nextInt();
				nuovoConto.preleva(prel);
				System.out.println(nuovoConto.toString());
			} 
			else if(operation.equals("uscire")) {
				System.out.println("Ciao");
			}
		} while (!operation.equals("uscire"));
		
		
		
		
		
	}
}
