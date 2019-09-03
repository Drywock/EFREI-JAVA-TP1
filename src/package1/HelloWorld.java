package package1;

public class HelloWorld {
	private String msg = "Hellp World !";
	
	public static void main(String[] args){
			HelloWorld a = new HelloWorld();
			a.display();
		  
		}

	public void display() {
		System.out.print(msg);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HelloWorld other = (HelloWorld) obj;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HelloWorld []";
	}
}
