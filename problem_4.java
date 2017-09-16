
public class problem_4 {
	public static void main(String[] args) {
		Time t = new Time(21,4,1);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		
		Time t2 = new Time(6, 24, 33);
		t.add(t2);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
	
	}
}
