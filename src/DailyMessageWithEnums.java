public class DailyMessageWithEnums {

	String getMessage(DayOfWeek day) {
		String info = "impossible!";
		switch (day) {
			case MONDAY:
			case WEDNESDAY:
			case FRIDAY:
				info = "Study Day!";
				break;
			case TUESDAY:
			case THURSDAY:
				info = "Gym Day!";
				break;
			case SATURDAY:
			case SUNDAY:
				info = "Weekend!";
				break;
		}
		return info;
	}

}
