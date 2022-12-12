package hierarticallinheritance;

public class tester {
	public static void main(String[]args) {
		ipl ipl=new ipl();
		ipl.overs();
		ipl.powerplay();
		ipl.noofmatches();
		ipl.sponsername();
		rcb rcb=new rcb();
		rcb.nameofcaptain="virat";
		rcb.playernumber=8;
		rcb.jersycolor="red";
		rcb.noofteams=10;
		rcb.matchlocation="bangalore";
		System.out.println(rcb.nameofcaptain);
		System.out.println(rcb.playernumber);
		System.out.println(rcb.jersycolor);
		System.out.println(rcb.noofteams);
		rcb.detailsofrcb();
		System.out.println("________________________________");
		mi mi=new mi();
		mi.nameofcaptain="rohit";
		mi.playernumber=6;
		mi.jersycolor="blue";
		mi.noofteams=10;
		mi.matchlocation="mumbai";
		System.out.println(mi.nameofcaptain);	
		System.out.println(mi.playernumber);
		System.out.println(mi.jersycolor);
		System.out.println(mi.noofteams);
		System.out.println(mi.matchlocation);
		mi.detailsofmi();
		System.out.println("------------------------------------");
		csk csk=new csk();
		csk.nameofcaptain="dhoni";
		csk.playernumber=18;
		csk.jersycolor="yellow";
		csk.noofteams=10;
		csk.matchlocation="chennai";
		System.out.println(csk.nameofcaptain);
		System.out.println(csk.playernumber);
		System.out.println(csk.jersycolor);
		System.out.println(csk.noofteams);
		System.out.println(csk.matchlocation);
		csk.detailsofcsk();
		
		}
			
		
	}


