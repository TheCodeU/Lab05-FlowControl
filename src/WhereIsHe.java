public class WhereIsHe {

	public static void main(String[] args) {

		String[][] twoDemArray = NamesArray.getNames();
		int firstdem;
		int second;
		myLoop:
		for (firstdem = 0; firstdem < twoDemArray.length; firstdem++) {
			for (second = 0; second < twoDemArray[firstdem].length; second++) {
				if (twoDemArray[firstdem][second].equals("Waldo")) {
					System.out.println("Location of Waldo [" + firstdem 
							+ "] [" + second + "]");
					break myLoop;
				}
//				System.out.println(twoDemArray[firstdem][second]);
			}
		}

	}

}
