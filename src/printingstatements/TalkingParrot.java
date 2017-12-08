package printingstatements;

public class TalkingParrot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Are we in trouble:  " + checkIfWeAreInTrouble(true, 6));
	}

	static boolean checkIfWeAreInTrouble(boolean isTalking, int hour) {

		if (isTalking && hour < 7 || hour > 20) {
			return true;
		} else {
			return false;
		}

	}
	}
