package JavaOopsPrograms;

//
/*this Class is Similar to EnumS*/

//class Car
//{
//	static final Car LAMBORGINI=new Car();
//	static final Car BMW=new Car();
//	static final Car MERCEDESBENZ=new Car();
//	static final Car ROLLSROYCE=new Car();
//}

enum Companys
{
	LAMBORGINI(30_000_000),BMW(10_000_000),MERCEDESBENZ(80_00_000),ROLLSROYCE(70_000_000);
	
	int price;
	
	Companys()
		{
			price=80_00_000;
		}
	Companys(int paisa)
		{
			price=paisa;
		}

		public int getPrice()
		{
			return price;
		}
}

public class EnumsExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Companys c[]=Companys.values();
		
		for(Companys car: c)
		{
			System.out.println(car+"\t"+car.getPrice());
		}
		}
}
