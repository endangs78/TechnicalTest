/**
 * 
 */
package test_perbankan;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Endangdut
 *
 */
public class Elaborate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // deklarasi variabel
        int transaction=0;
        Scanner keyboard = new Scanner(System.in);
        transaction = keyboard.nextInt();
        Date date = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("mm");  
        String strDate = formatter.format(date);  
        
        //jawaban no 1. 
        System.out.println("Java");

        if(strDate=="05") {
        	if(transaction<=100) {
        		System.out.println("failed transactions between now and (now-5 minutes) by telegram automatically");
        	}
        }

	}
}
