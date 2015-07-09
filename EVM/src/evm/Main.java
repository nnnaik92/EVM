package evm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input ; 
		Scanner s = new Scanner(System.in);
		Evm_controller e = new Evm_controller() ; 
		
		Candidate c1 = new Candidate("lion" , "modi");
		Candidate c2 = new Candidate("tiger" , "rahul");
		
		Candidates all = new Candidates() ; 
		all.add(c1);
		all.add(c2)  ;
		
		e.store_cand(all);
		
		
		e.Display();
		
		System.out.println("Press button");
		System.out.println("1:ballot");
		
		input  = s.nextInt() ; 
		e.check(input) ;
		

	}

}
