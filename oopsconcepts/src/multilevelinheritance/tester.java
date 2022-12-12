package multilevelinheritance;

public class tester {
	public static void main(String[]args) {
		student student=new student();
		student.bestingames();
		student.disipline();
		student.rankedstudent();
		student.completedug();
		student.completedpg();
		System.out.println("-------------------------");
		pavan pavan=new pavan();
		pavan.name="pavan kumar";
		pavan.age=22;
		pavan.regno="12873hegh";
		pavan.school="cambridge";
		pavan.location="hosur";
		pavan.pavandetails();
		pavan.desigination();
		pavan.rankedstudent();
		pavan.completedug();
		System.out.println("-------------------------------");
		karthi karti=new karthi();
		karti.name="karthik raj";
		karti.age=25;
		karti.regno="45473bdj";
		karti.school="svs school";
		karti.location="attible";
		karti.karthidetails();
		pavan.pavandetails();
		karti.desigination();
		
		
	}

}
