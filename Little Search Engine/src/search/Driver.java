package search;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
	public static void main(String[] args) throws IOException {
		LittleSearchEngine lse = new LittleSearchEngine();
		lse.makeIndex("docs.txt","noisewords.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("--------------------Enter two words-----------------------");
			System.out.print("Enter word 1: ");
			String w1 = br.readLine().trim();
			
			System.out.print("Enter word 2: ");
			String w2 = br.readLine().trim();
			
			System.out.println(" ");
			System.out.println("----------");
			System.out.println("Result = "+lse.top5search(w1, w2));
			System.out.println("----------");
			System.out.println(" ");

//			System.out.print("Enter a word to check: ");
//			String w1 = br.readLine().trim();
//			System.out.println("Result = "+lse.getKeyWord(w1));
					
		}
	}
}