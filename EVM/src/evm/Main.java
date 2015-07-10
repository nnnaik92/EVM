package evm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input ; 
		String ButtonName ; // ex tiger
		
	
		Scanner s = new Scanner(System.in);
		Evm_controller e = new Evm_controller() ; 
		
		Candidate c1 = new Candidate("lion" , "modi");
		Candidate c2 = new Candidate("tiger" , "rahul");
		
		Candidates all = new Candidates() ; 
		all.add(c1);
		all.add(c2)  ;
		
		e.store_cand(all);
		
		
		while(true){
		
		System.out.println("Press button");
		System.out.println("1:ballot");
		System.out.println("2:result");
	
		input  = s.nextInt() ; 
	    e.check(input) ;
		if( input == 1 ){
			e.Display();
			
	       ButtonName	= s.next() ;		
			e.votefor(ButtonName);	
			
		}
		else if ( input == 2 ){
			e.result();
			
		}
		else{
			
			System.out.println("Evm teminated");
			return ;
		}
		
		}

	}

}
