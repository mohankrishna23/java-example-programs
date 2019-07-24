
public class DotNet {
	
	public String name;
	public int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		System.out.println("hello");
		
		DotNet value = new DotNet();
		 
	value.setName("Mohan");
	value.setId(77);
	System.out.println(value.getName());
	System.out.println(value.getId());
	}

}
