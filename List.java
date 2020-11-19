package praktikum03;
import java.util.LinkedList;

public class List {
	public static void main(String[] args) {
		
	System.out.println("= = = = = ISI DOMPET = = = = =\n");
	
	LinkedList<String> dompet = new LinkedList<String>();
	dompet.add("Rp. 10.000,00");
	dompet.add("Rp. 5.000,00");
	dompet.add("Rp. 20.000,00");
	dompet.add("Rp. 50.000,00");
	System.out.println("Banyaknya uang	: ada " +dompet.size() +" lembar");
	System.out.println("Isi dompet	:" +dompet);

	System.out.println("\nAmbil uang di ATM.");
	System.out.println("Penarikan sejumlah : Rp. 300.000,00");
	dompet.add("Rp. 100.000,00");
	dompet.add("Rp. 100.000,00");
	dompet.add("Rp. 100.000,00");
	System.out.println("Isi dompet	:" +dompet);
	
	System.out.println("\nBeli tas.");
	System.out.println("Harga tas	: Rp. 285.000,00");
	System.out.println("Bayar pas	: Rp. 285.000,00");
	dompet.remove(6);
	dompet.remove(5);
	dompet.remove(3);
	dompet.remove(2);
	dompet.remove(1);
	dompet.remove(0);
	System.out.println("\nBanyaknya uang	: sisa " +dompet.size() +" lembar");
	System.out.println("Isi dompet	:" +dompet);
	}
}
