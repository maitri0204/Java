// if the question is to write a checked exception, the class should extend Exception and not RuntimException 
class InvalidAgeException extends Exception
{
    	InvalidAgeException(String title)
	{
        	super(title);
    	}
}

class VehicleLicence
{
    	 public static void  applyForLicence(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age must be more than 18 to apply");
		}
        	else
		{
            		System.out.println("Vehicle Licence Generated!");
        	}
	}
    	public static void main(String[] args) 
	{
		try
		{
        		VehicleLicence v = new VehicleLicence();
			v.applyForLicence(14);
    		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}