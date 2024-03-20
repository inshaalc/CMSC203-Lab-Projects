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

public class Procedure 
{
	// Fields
	private String nameProcedure;
	private String dateProcedure;
	private String namePract;
	private double charges;
	
	// No arg constructor
	public Procedure()
	{
	}
	
	// Parametricized Constructors
	public Procedure(String procedure1, String date1)
	{
		nameProcedure = procedure1;
		dateProcedure = date1;
	}
	
	public Procedure(String procedure1_, String date1_, String namePract1, double charges1)
	{
		nameProcedure = procedure1_;
		dateProcedure = date1_;
		namePract = namePract1;
		charges = charges1;
	}
	
	// Accessors
	public String getProcedureName()
	{
		return nameProcedure;
	}
	
	public String getDate()
	{
		return dateProcedure;
	}
	
	public String getNamePract()
	{
		return namePract;
	}
	
	public double getCharges()
	{
		return charges;
	}
	
	// Mutators
	public void setProcedureName(String procedure1_)
	{
		nameProcedure = procedure1_;
	}
	
	public void setDate(String date1_)
	{
		dateProcedure = date1_;
	}
	
	public void setNamePract(String namePract1)
	{
		namePract = namePract1;
	}
	
	public void setCharges(double charges1)
	{
		charges = charges1;
	}
	
	// To-String method
	public String toString()
	{
		return "        Procedure:  " + nameProcedure + "\n"
				+ "        Procedure Date =  " + dateProcedure + "\n"
				+ "        Practitioner =  " + namePract + "\n"
				+ "        Charge =  " + charges + "\n";
	}
}
