public class DateTest
{
	public static void main(String[] args) {
		Date D = new Date(12, 1, 2091);
		System.out.println("Month: " + D.getMonth());
		System.out.println("Changing year to 2077");
		D.setYear(2077);
		D.displayDate();
	}
}
