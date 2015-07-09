package evm;

public class ButtonFactory {

	public Button getShape(String ButtonType){
	      if(ButtonType == null){
	         return null;
	      }		
	      if(ButtonType.equalsIgnoreCase("cand")){
	         return new  Candidate_Button();
	         
	      } else if(ButtonType.equalsIgnoreCase("ballot")){
	         return new Ballot_button();
	         
	      }
	      
	      return null;
	   }
	
}
