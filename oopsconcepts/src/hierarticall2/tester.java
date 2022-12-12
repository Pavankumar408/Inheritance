package hierarticall2;

public class tester {
	public static void main(String[]args) {
		laptop laptop=new laptop();
		laptop.playinggames();
		laptop.watchingmovies();
		laptop.differentoperations();
		System.out.println("------------------------------");
		hp hp=new hp();
			hp.name="hp";
		hp.model="neo";
		hp.cost=80000;
		hp.isprovidedcamera=true;
		hp.hpdetails();
		hp.differentoperations();
		hp.playinggames();
		hp.processor();
		System.out.println("-------------------------");
		sony sony=new sony();
		sony.name="sony";
		sony.model="sony 8";
		sony.cost=120000;
		sony.isprovidedcamera=true;
		sony.sonydetails();
		sony.camera();
		sony.playinggames();
		sony.differentoperations();
		System.out.println("----------------------------------");
		dell dell=new dell();
		dell.name="dell";
		dell.model="dell x10";
		dell.cost=75000;
		dell.isprovidedcamera=true;
		dell.delldetails();
		dell.playinggames();
		dell.performance();
		dell.watchingmovies();
		
		
		
	}

}
