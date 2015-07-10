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
				    System.out.println("Candidate: " + element.getName() + "\nsymbol =>" +element.getSymbol()  );
				}
				
			}
			
			public void result(){
				for (Candidate element : allCand.getAll()) {
				    System.out.println("Candidate: " + element.getName() + "\n total votes =>" +element.getcount()  );
				}
				
			}
			
			public void votefor(String buttonName){
				    System.out.println(buttonName);
					b.voting(buttonName);
					b.addresult(allCand);
					b.switchState();
				   
				}
				
				
				
				
				
				
			
			

	         

}
