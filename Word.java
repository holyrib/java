
public class Word {
	int num;
	public Word(int num){
		this.num = num;
	}
	String[] digits= {"", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	String[] digits11 = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	String hun100 = "hundered";
	String thou1000 = "thousand";
	public String toWords() {
		int len = String.valueOf(num).length();
		int digit = 0;
		int digit2;
		String word = "";
		if (len > 3 && len < 6) {
			digit = num/1000;
			num = num - num/1000 *1000;
			len = 3;
			if(digit < 20) {
				word = digits[digit];
			}
			else {		
				digit2 = digit%10;
				digit = digit/10;
				word = digits11[digit] + " " + digits[digit2];
			}
			word = word + " " + thou1000;
		}
		if(len == 3){
			len = 2;
			if(num > 100) {
				digit = num/100;
				word = word + " " + digits[digit] + " " +  hun100;
				num = num - num/100 * 100;

				
			}
			
		}
		if(len == 2) {
			if(num < 20) {
				digit = num/10;

				word = word + " " + digits[digit];
			}
			
			else {
				if(digit > 0) {
					digit2 = num%10;
					digit = num/10;
					word = word + " " + digits11[digit] + " " + digits[digit2];
				}
				else {
					digit = num/10;
					digit2 = num%10;
					word = word + " " + digits11[digit] + " " + digits[digit2];
				}
			}
	
				
		}
		return word;
			
		
	}
}