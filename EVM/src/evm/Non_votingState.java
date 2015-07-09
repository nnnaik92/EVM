package evm;

public class Non_votingState extends State {

	@Override
	public void switchState(Ballot_Unit context) {
		votingState o = new votingState();
		context.setState(o);
		System.out.println("State is " + o.getStateName());

	}
	
	public Non_votingState()
	{
		stateName = "On";
	}

	

}
