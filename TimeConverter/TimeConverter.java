package TimeConverter;

public class TimeConverter {
	public static void main(String[] args) {
		double Hour=convertToHours(90);
		System.out.println(Hour);
		
	}
	public static double convertToHours(int minutes) 
	{
		
		return  minutes/60.0;
	}

	
	
}




