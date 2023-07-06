package test_perbankan;

import java.util.Scanner;

public class DataAlert {

	public static void main(String[] args) {
		 // deklarasi variabel
        String input, inputn;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextLine();
        inputn = keyboard.nextLine();
        System.out.println("selamat siang rekan bank "+input);
        System.out.println("mohon bantuan untuk sign on pada envi berikut :");
        	System.out.println("envi MP port "+inputn+" terpantau offline");

	}

}
