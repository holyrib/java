
public class StarTriangle {
	int width;
	String block = "[*]";
	
	public StarTriangle(int width) {
		this.width = width;
	}
	
	public String toString() {
		String star = "";
		for(int i = 0; i < width; i++) {
			for(int j = 0; j <= i; j++) {
				star = star + "[*]";
			}		
			star = star + "\n";
		}
		return star;
	}
}
