package Encapsulationexamples;

public class Test {

	public static void main(String[] args) {
	Person p=new Person();
	long m=p.getaadhar();
	System.out.println("old data: "+m);
	String e=p.getpan();
	System.out.println("old data: "+e);

	p.setaadhar(215487255444L);
	System.out.println("new data: "+p.getaadhar());	
	p.setpan("ABCD123");
	System.out.println("new data: "+p.getpan());
	}

}
class Person
{
	private long aadhar=217519584766L;
	private String pan="AABDJ221457";
	public long getaadhar()
	{
		return aadhar;
	}
	public void setaadhar(long aadhar)
	{
		
	this.aadhar=aadhar;
	}
	public String getpan()
	{
		return pan;
	}
	public void setpan(String pan)
	{
		this.pan=pan;
	}
	
}
