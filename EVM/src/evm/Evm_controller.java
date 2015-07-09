package evm;

public class Evm_controller {
	   private String constituency  ;  
	   Candidates allCand  ; 
	   
	       
	        controll_Unit  c = new controll_Unit();
	        Ballot_Unit b = new Ballot_Unit()  ; 
	      
	      

			public void check(int input) {
				if(input == 1  ){
					b.switchState();
					b.display_pannel() ;
				}
			}


			public void store_cand(Candidates all) {
				
				allCand  = all ; 
			     
			}
			
			
			public void Display(){
				 
				for (Candidate element : allCand.getAll()) {
				    System.out.println("Candidate: " + element.getName());
				}
				
			}
			
	         

}
