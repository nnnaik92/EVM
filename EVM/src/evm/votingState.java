package evm;

public class votingState extends State {

	public void switchState(Ballot_Unit context) {
		Non_votingState o = new Non_votingState();
		context.setState(o);
		System.out.println("State is " + o.getStateName());

	}
	
	public votingState()
	{
		stateName = "On";
	}

	
}
