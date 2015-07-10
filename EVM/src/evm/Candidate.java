package evm;

public class Candidate {
	private String  symbol ; 
	private String  Name ;
	private  int count  ; 
	
	
	
	
	public Candidate(String symbol, String name) {
		this.count = 0 ; 
		this.symbol = symbol;
		this.Name = name;
	}


	public String getSymbol() {
		return symbol;
	}
	
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getName() {
		return Name;
	}
	
	
	public void setName(String name) {
		Name = name;
	}
	
	
	
	public void vote(){
		count++;
		
	}


	public int getcount() {
		// TODO Auto-generated method stub
		return count;
	}
	
	

}
