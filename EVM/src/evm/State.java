package evm;

public abstract class State {

	
    protected String stateName;
	
	public abstract void switchState(Ballot_Unit context);
	
	public String getStateName()
	{
		return stateName;
	}
}
