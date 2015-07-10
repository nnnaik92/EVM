package evm;

public class Ballot_Unit {
	State  s ;
	Button  b1 ; 
	
	
	public Ballot_Unit(){
		 s = new Non_votingState() ;
		ButtonFactory fac = new ButtonFactory();
		
	       b1 =  fac.getShape("cand");
 
	   }


	
	
	public State getState()
	{
		return s;
	}
	
	
	
	public void setState(State s)
	{
		this.s = s;
	}
	
	public void switchState()
	{
		s.switchState(this);
	}






	public void display_pannel() {
		// TODO Auto-generated method stub
		
	}
	
	
   public void  voting(String buttonName){
            b1.setButtonname(buttonName);
	   
    
	}

   
   public  String Selected_Button(){
	
	   
	   return null;
	   
	   
   }




public void addresult(Candidates allCand) {
	// TODO Auto-generated method stub
	
	
	for (Candidate element : allCand.getAll())
	{
		
		
		
		if( b1.getButtonname().equals(element.getSymbol())  ){
		    	element.vote(); 
		    	
			 System.out.println("voted for Candidate: " + element.getName());
		}
	
}





}
}





