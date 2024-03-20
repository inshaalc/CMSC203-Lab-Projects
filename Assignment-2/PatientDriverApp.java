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

public class PatientDriverApp 
{
	
    public void displayPatient() 
    {
        Patient patient = new Patient("Jenny", "Elaine", "Santori", "123 Main Street", "MyTown", "CA", "01234", "Bill Santori", "777-555-1212");
        System.out.println(patient.toString());
    }

    public void displayProcedure() 
    {
        Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr Irvine", 3250.0);
        System.out.println(procedure1.toString());

        Procedure procedure2 = new Procedure("X-Ray", "7/20/2019", "Dr. Jamison", 5500.43);
        System.out.println(procedure2.toString());

        Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);
        System.out.println(procedure3.toString());
    }

    public double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        double totalCharge = procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
        String formattedPrice = String.format("$%,.2f", totalCharge);
        System.out.println("Total Charges: " + formattedPrice);
        return totalCharge;
    }

    public static void main(String[] args) 
    {
    	final String myName = "<Inshaal Chaudhury>";
    	final String myName2 = "Inshaal Chaudhury";
    	final String myDate2 = "02/26/24";
    	final String myDate = "<02/26/24>";
    	final String MCNUM = "M21117800";
        PatientDriverApp app = new PatientDriverApp();
        app.displayPatient();
        app.displayProcedure();
        
        // Creating instances of Procedure
        Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr Irvine", 3250.0);
        Procedure procedure2 = new Procedure("X-Ray", "7/20/2019", "Dr. Jamison", 5500.43);
        Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);

        // Calculating and displaying total charges
        double totalCharges = app.calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("\nStudent Name: " + myName2);
        System.out.println("MC#: " + MCNUM);
        System.out.println("Due Date: " + myDate2);
        System.out.println("\nThe program was developed by a student: " + myName + " " + myDate);
    }
}
