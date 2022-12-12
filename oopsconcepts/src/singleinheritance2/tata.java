package singleinheritance2;

public class tata extends car {
	public void tatadetails() {
		System.out.println(name);
		System.out.println(model);
		System.out.println(cost);
		System.out.println(capacity);
		System.out.println(isprovidedairbag);
		this.carrylaugauges();
		this.travel();
		}
	public void safety() {
		System.out.println("tata provides five star safty");
		
	}

}
