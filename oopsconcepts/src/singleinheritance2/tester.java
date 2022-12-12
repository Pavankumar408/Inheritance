package singleinheritance2;

public class tester {
	public static void main(String[]args) {
		car car=new car();
		car.name="hyundai";
		car.model="i20";
		car.cost=700000;
		car.capacity=4;
		car.isprovidedairbag=true;
		System.out.println(car.name);
		System.out.println(car.model);
		System.out.println(car.cost);
		System.out.println(car.capacity);
		System.out.println(car.isprovidedairbag);
	    car.travel();
	    car.carrylaugauges();
	    System.out.println("------------------");
	    tata tata=new tata();
	    tata.name="tata";
	    tata.model="punch";
	    tata.cost=800000;
	    tata.capacity=5;
	    tata.isprovidedairbag=true;
	    tata.safety();
	    tata.tatadetails();
	}

}
