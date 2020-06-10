package Maain;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
	
	public static void main(String[] args) {
		int numpeople, gap, newgap, counter;
	       ArrayList<Integer> list = new ArrayList<Integer>();
	       Scanner in = new Scanner(System.in);

	       System.out.println("Coloque a quantidade de pessoas: ");
	       numpeople = in.nextInt();
	       in.nextLine();

	       System.out.println("Coloque a quantidade de pulos : ");
	       gap = in.nextInt();

	       for (int count=1; count <= numpeople; count++)
	       {
	         list.add(new Integer(count));
	       }
	       
	       counter = gap - 1;
	       newgap = gap;


	       while (!(list.isEmpty()))
	       {
	          System.out.println("Morreu : " + list.remove(counter));
	          numpeople = numpeople - 1;
	          if (numpeople > 0){
	             counter = (counter + gap - 1) % numpeople;
	             }
	          if(numpeople == 1){
	        	  System.out.println("Sobriviveu: " + list.remove(counter));
	          }
	       }
	}
}
