package basicJava;
class Mobile{
	String brand;
	String price;
	static String distributor;
	
	public Mobile() {
		brand = "Samsung";
		price = "$1000";
	}

	static
	{
		distributor = "TopTech";
	}
	
}

public class StaticDemo {
	public static void main(String[] args) 
	{
		Mobile obj2=new Mobile();
		obj2.brand="Nokia";
		System.out.println("Name "+obj2.brand + " Price "+obj2.price+" Distributor "+ Mobile.distributor);
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price="$1500";
		System.out.println("Name "+obj1.brand + " Price "+obj1.price+" Distributor "+ Mobile.distributor);
	
	}
}
