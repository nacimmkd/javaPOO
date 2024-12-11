
public class Main {

	public static void main(String[] args) {
		Restaurant r = new Restaurant();
		
		r.addTable("vert", 5);
		r.addTable("rouge", 5);
		r.addTable("rouge", 10);
		r.addTable("rouge", 3);
		
		System.out.println(r.toString());

	}

}
