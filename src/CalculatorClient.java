
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double[] myDoubles = {1.3, 3.4, 19, 54};
		double total = calculator.sumNumbers(myDoubles);
		System.out.println("total is -> " + total);

		int[] myValues = { 2,4,6,8,6,4,2,1};
		int count = calculator.countValues(myValues, 4);
		System.out.println("4 shows up " + count + " times.");
		
		int[] exceedsValues = {4,4,4,4,4,4,4,4,4};
		count = calculator.countValues(exceedsValues, 4);
		System.out.println("4 shows up the max of " + count + " times.");
		
	}

}
