/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: (Give a brief description for each Class)
 * Due: 02/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Inshaal Chaudhury
*/

public class Patient 
{
	// Fields
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String emerName;
	private String emerPhone;
	
	// no arg constructor
	public Patient()
	{
	}
	
	// Other constructors
	public Patient(String first, String middle, String last)
	{
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	
	public Patient(String first1, String middle1, String last1, 
			String street, String city1, String state1, String zip, String emName, String emPhone)
	{
		firstName = first1;
		middleName = middle1;
		lastName = last1;
		streetAddress = street;
		city = city1;
		state = state1;
		zipCode = zip;
		emerName = emName;
		emerPhone = emPhone;
	}
	
	// Accessor for all attributes
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getMiddleName()
	{
		return middleName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getStreet()
	{
		return streetAddress;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public String getZip()
	{
		return zipCode;
	}
	
	public String getEmName()
	{
		return emerName;
	}
	
	public String getEmPhone()
	{
		return emerPhone;
	}
	
	// Mutator for all attributes
	public void setFirstName(String first1)
	{
		firstName = first1;
	}
	
	public void setMiddleName(String middle1)
	{
		middleName = middle1;
	}
	
	public void setLastName(String last1)
	{
		lastName = last1;
	}
	
	public void setStreet(String street)
	{
		streetAddress = street;
	}
	
	public void setCity(String city1)
	{
		city = city1;
	}
	
	public void setState(String state1)
	{
		state = state1;
	}
	
	public void setZipCode(String zip)
	{
		zipCode = zip;
	}
	
	public void setEmName(String emName)
	{
		emerName = emName;
	}
	
	public void setEmPhone(String emPhone)
	{
		emerPhone = emPhone;
	}
	
	// Method 1 - Full Name
	public String buildFullName()
	{
		return firstName + " " + middleName + " " + lastName;
	}
	
	// Method 2 - Full Address
	public String buildAddress()
	{
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}
	
	// Method 3 - Full Emergency Contact
	public String buildEmergencyContact()
	{
		return emerName + " " + emerPhone;
	}
	
	// Method - toString
	public String toString()
	{
		String fullName = buildFullName();
		String address = buildAddress();
		String emergencyContact = buildEmergencyContact();
		
		return "Patient info:\n" +
				"  Name: " + fullName + "\n" +
				"  Address: " + address + "\n" + 
				"  Emergency Contact: " + emergencyContact + "\n";
	}
