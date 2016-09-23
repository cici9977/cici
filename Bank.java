
class Accou
{
	private double balance;
	private long tel;
	private String name;
	private String address;
	
	public Accou( String n , String a,long t, double bal)
	{
		balance = bal;
		tel = t;
		name = n;
		address = a;
	}
	
public double getbalance()
{
return balance;
}

public double getbalance(double n)
{
return balance += n;
}

public long gettel()
{
return tel;
}

public String getname()
{
return name;
}

public String getaddress()
{
return address;
}

}

public class Bank
{
	

public static void main(String[] args) {

//existing database
	Accou A = new Accou("Apple", "Nanning",1890773, 20.0);
	Accou B = new Accou("Banana","Guilin",1397739,50.0);
	Accou C = new Accou("Candy","Beijing",1360773,100.0);
	Accou D = new Accou("Dasy","Shanghai",1334455, 40.0);
	Accou E = new Accou("Elly","Tianjin",1337777,1000.0);
	Accou F = new Accou("Felix","England",4524564, 500.0);
	Accou G = new Accou("Gina","America",435346, 30.0);
	Accou H = new Accou("Helen","Suzhou",435246,300.0);
	Accou I = new Accou("Ina","Canada",4315235,200.0);
	Accou J = new Accou("Jane","Liuzhou",654734,400.0);
	
//wanting to add or withdrawl, only need to put the amount of money in (),or it just shows the existing amount, for example:
//	System.out.println("Apple's balance: " + A.getbalance(-10));
//  System.out.println("Banana's balance: " + B.getbalance(10));
	
	System.out.println("Apple's balance: " + A.getbalance());
	System.out.println("Banana's balance: " + B.getbalance());
	System.out.println("Candy's balance: " + C.getbalance());
	System.out.println("Dasy's balance: " + D.getbalance());
	System.out.println("Elly's balance: " + E.getbalance());
	System.out.println("Felix's balance: " + F.getbalance());
	System.out.println("Gina's balance: " + G.getbalance());
	System.out.println("Helen's balance: " + H.getbalance());
	System.out.println("Ina's balance: " + I.getbalance());
	System.out.println("Jane's balance: " + J.getbalance());

	
	
}

}