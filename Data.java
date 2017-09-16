import java.util.Scanner;

public class Data {
	static Scanner input = new Scanner(System.in);
	
	private static int num;
	private static double average;
	private static double max;
	
	public Data() {
		
	}
	
	public void setMax(double max) {
		this.max = max;
	}
	public String getMax() {		
		return "Maximum = " + this.max;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public String getAverage() {
		return "Average = " + this.average;
	}

//	public static void Analyzer(double maxx, double avr, int len) {
//		avr = avr/len;
//		System.out.println("Average = " + avr);
//		System.out.println("Maximum = " + maxx);
//
//	}
//	
	public static void addValue() {
		String entry = "";
		int i = 0;
		while (true) {	
			System.out.println("Enter a number (Q to quit)");		 
			entry = input.next();
			if(entry.equals("Q") || entry.equals("q")) {
//				Data.Analyzer(max, average, i);
				average = average/i;
				break;
			}

			i ++;
			num = Integer.parseInt(entry);
			if (num > max) {
				max = num;
				average += num;
			
			}
		}
	}
	
	
}

