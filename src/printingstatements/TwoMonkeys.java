package printingstatements;

public class TwoMonkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isASmilingMonkey = true;
		boolean isBSmilingMonkey = true;

		System.out.println("Are we in trouble:  " + checkIfWeAreInTrouble
				(isASmilingMonkey, isBSmilingMonkey));
	}

	static boolean checkIfWeAreInTrouble(boolean aSmiling, boolean bSmiling) {
		{
			if (aSmiling == bSmiling) {
				return true;
			} else {
				return false;
			}
		}

	}

}
