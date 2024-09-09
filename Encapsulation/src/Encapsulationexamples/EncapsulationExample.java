package Encapsulationexamples;

public class EncapsulationExample {

	public static void main(String[] args)
	{
		
	// [1]	Doctor d=new Doctor("babu",10);
		
		Doctor d = new Doctor();
		System.out.println(d.suggestMedicine("Head_ache"));
	}
}

class Doctor
{
	String name;
	int exp;
// [1]	public Doctor(String name,int exp)
//	{
//		this.name=name;
//		this.exp=exp;
//	}
	
	// [or]
	public Doctor() //[2]
	{
		name = "babu";
		exp = 6;
	}
	public String suggestMedicine(String disease)
	{
		if (disease == "fever")
		{
		return "paracetamol";
		}
		else {	
		return "other medicine";
		}
	}
}
