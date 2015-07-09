package evm;

import java.util.ArrayList;
import java.util.List;

public class Candidates {
	 private List<Candidate> C;
	 public Candidates(){
		 C = new ArrayList<Candidate>(); 
	 }
	 
	 public void add(Candidate e) {
	      C.add(e);
	   }
	
	 
	   public List<Candidate> getAll(){
		   
		   return C ;
	   }

}
