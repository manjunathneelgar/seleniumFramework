package testScript;


public class Read2 
{

	public static void main(String[] args) throws Throwable 
	{
		ReadKeyValue rd = new ReadKeyValue();
		String value = rd.getPropertyKeyValue("./src\\testData\\commonData.properties", "username");
		System.out.println(value);

	}

}
