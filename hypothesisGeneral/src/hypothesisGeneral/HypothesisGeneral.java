package hypothesisGeneral;

public class HypothesisGeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] example = {"a","b","?","d", "e"}; //can be changed to whatever example you want
		String[] hypothesis = {"a", "c", "b", "d","?"}; //has to be same length as example
		for (int x = 0; x < hypothesis.length; x++) { //for every attribute in the hypothesis
			if (!hypothesis[x].equals("?") && !hypothesis[x].equals(example[x])) { //if the attribute isn't ? and if it doesn't match the example
				hypothesis[x] = "?"; //generalise it
			}
		}
		System.out.print("General hypothesis: "); //print new hypothesis
		for (int x = 0; x < hypothesis.length; x++) {
			System.out.print(hypothesis[x] + " ");
		}
	}

}
