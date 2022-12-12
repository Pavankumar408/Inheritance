package multilevel2;

public class tester {
	public static void main(String[]args) {
		animal animal=new animal();
		animal.hunting();
		animal.havefourlegs();
		animal.walking();
		System.out.println("-----------------------");
		lion lion=new lion();
		lion.name="a1 lion";
		lion.color="yellow";
		lion.weight=125;
		lion.hunting();
		lion.havefourlegs();
		lion.walking();
		lion.liondetails();
		System.out.println("------------------------------");
		dog dog =new dog();
		dog.name="lab";
		dog.color="brown";
		dog.weight=55;
		dog.havefourlegs();
		dog.walking();
		dog.barking();
		dog.dogdetails();
		
	}

}
