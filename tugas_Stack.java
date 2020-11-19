package praktikum3;

import java.util.*;

public class tugas_Stack {	
	public static void main(String[] args) {
		
		
		Stack<String> candy = new Stack<String>();

		candy.push("melon candy");
		candy.push("strawberry candy");
		candy.push("orange candy");
		candy.push("grape candy");
		candy.push("pear candy");
		candy.push("milk candy");
		candy.push("ginger candy");
		candy.push("chocolate candy");
		candy.push("banana candy");
		candy.push("apple candy");
	
		
		System.out.println("=========== MACAM PERMEN YANG BERADA DALAM TOPLES (urut dari permen bawah ke permen atas) ===========");
		System.out.println(candy);
		System.out.println(" ");
		System.out.println("Permen paling atas: "+ candy.peek());
		System.out.println("Permen melon berada pada urutan ke- " +candy.search("melon candy"));
		System.out.println("Banyak jenis permen ditoples sebelum ambil: " +candy.size());
		System.out.println(" ");
		System.out.println("Nisa mengambil 2 permen yang paling atas ");
        Object object=candy.peek();
        object = candy.pop();
        object = candy.pop();
        System.out.println("Permen paling atas: "+ candy.peek());
        System.out.println("Banyak jenis permen ditoples setelah ambil: " +candy.size());
	
		
	}
}
