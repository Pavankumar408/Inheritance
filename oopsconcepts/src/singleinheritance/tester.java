package singleinheritance;

public class tester {
	public static void main(String[]args) {
		mobile mobi=new mobile();
		mobi.name="oppo";
		mobi.color="blue";
		mobi.cost=20000;
		mobi.camera=3;
		mobi.isprovidedfacelock=false;
		mobi.playingames();
		mobi.calling();
		System.out.println(mobi.name);
		System.out.println(mobi.color);
		System.out.println(mobi.cost);
		System.out.println(mobi.camera);
		System.out.println(mobi.isprovidedfacelock);
		System.out.println("------------------------");
		vivo vi=new vivo();
		vi.name="vivo";
		vi.color="red";
		vi.cost=18000;
		vi.camera=4;
		vi.isprovidedfacelock=true;
		vi.playingames();
		vi.calling();
		vi.atttactive();
		vi.performance();
		vi.displaymobiledetails();
		
	}

}
