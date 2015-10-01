
public class TestDailyMessageWithEnums {

	public static void main(String[] args) {

		DailyMessageWithEnums dmwe = new DailyMessageWithEnums();
		String result = dmwe.getMessage(DayOfWeek.SUNDAY);
 		System.out.println("Message is " + result);
		
		DayOfWeek input = DayOfWeek.valueOf(args[0].toUpperCase());
		String second  = dmwe.getMessage(input);
		System.out.println("From input " + second);
	}

}
