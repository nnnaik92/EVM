package evm;

public class Candidate {
	private String  symbol ; 
	private String  Name ;
	
	
	
	
	
	public Candidate(String symbol, String name) {
		
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
	
	
	
	

}
