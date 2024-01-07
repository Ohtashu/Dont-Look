/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marriage;
import java.io.*;
import java.util.Scanner;
public class DeathCertificate {
    
    public static final String ANSI_RED = "\u001B[31m";

       public static void main(String[] args) {
 
    Scanner scn = new Scanner (System.in);
    System.out.println("\t\tRepublic of the Philippines\n \t\tPhilippine Statistics Authority\n\t\tRegistration and Certificate System"
            + "\n\t-----------------------------------------------------------------------------------------------------"
            + "\n\t\t[1] Registration: "
            + "\n\t\t[2] Printing of Certificate: "
            + "\n\t-----------------------------------------------------------------------------------------------------");
            int DC = scn.nextInt();
           
            if (DC==1){
                System.out.println("Registration\n");
                System.out.print("1A. First Name: ");
                String Fn = scn.nextLine();
                scn.nextLine();
                System.out.print("1A. Middle Name: ");
                String Mn = scn.nextLine();
                System.out.print("1C. Last Name: ");
                String Ln = scn.nextLine();
                System.out.print("2. Sex(f/m): ");
                char Sex = scn.nextLine().charAt(0);
                if(Sex != 'F' || Sex != 'M'){
                    System.out.println(ANSI_RED + "Invalid");
                }
                System.out.println("3. Date of Death(DD/MM/YYYY: ");
                String DD = scn.nextLine();
                System.out.print("4. Date Birth(DD/MM/YYYY: ");
                String DB = scn.nextLine();
                System.out.print("6. Place of Death(Name of Hospital/clinic/Institution/House no.,st.,Brgy, City/Municipality, Province:  ");
                String PD = scn.nextLine();
                System.out.print("7. Civil Status: ");
                String CS = scn.nextLine();
                System.out.print("8. Religion: ");
                String R = scn.nextLine();
                System.out.print("9. Citizenship: ");
                 String C = scn.nextLine();
                System.out.print("10. Residence(House no., st., Barangay, City/Municipality, Province, Country: ");
                String Res = scn.nextLine();
                System.out.print("11. Occupation: ");
                String O = scn.nextLine();
                System.out.print("12. Name of Father (First, Middle, Last: ");
                String Fname = scn.nextLine();
                System.out.print("13. Name of Mother (First, Middle, Last: ");
                String Mname = scn.nextLine();
                
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.println("\t\tMEDICAL CERTIFICATE");
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.println("\t\tIf the deceased is ages 0-7 years days fill out number 14-19a. If not, leave blank.");
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.print("14. Age of Mother: ");
                int Age = scn.nextInt();
                System.out.print("15. Method of delivery(Normal spontaneus vertex, if others, specify): ");
                String Md = scn.next();
                System.out.print("16. Length of pregnancy(In completed weeks: ");
                String Lp = scn.next();
                System.out.print("17. Type of birth (Single, Twin, Triplet, etc.): ");
                String Tb = scn.next();
                System.out.print("18a. Cause of Death: ");
                String Cd = scn.next();
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.println("\t\tIf the deceased is ages 15-49 years days fill out number 19-19c. If not, leave blank.");
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.print("19b. Cause of Death: ");
                System.out.print("19c. Maternal Condition: ");
                System.out.print("[a]Pregnat, not in labour"
                        + "\n[b]Pregnat, in labour"
                        + "\n[c]Less than 42 days after delivery"
                        + "\n[d]42 days to 1 year after delivery"
                        + "\n[e]None of the choices: ");
                String MaternalCon = scn.next();
                scn.nextLine();
                if (MaternalCon.equalsIgnoreCase("a")){
                    System.out.println("Pregnat, not in labour");
                }
                if(MaternalCon.equalsIgnoreCase("b")){
                    System.out.println("Pregnat, in labour");
                }
                if(MaternalCon.equalsIgnoreCase("c")){
                    System.out.println("Less than 42 days after delivery");
                }
                if(MaternalCon.equalsIgnoreCase("d")){
                    System.out.println("42 days to 1 year after delivery");
                }
                 if(MaternalCon.equalsIgnoreCase("e")){
                    System.out.println("None of the choices: ");
                }
                
                
                System.out.print("19c. Death by external causes: ");
                System.out.print("a. Manner of death(Homicide, Suicide, Accident, Legal Intervention, etc."
                        + "\n b. Place of Occurence of External Cause(e.g. home,farm, factory, street, sea,, etc.");
                 String DeathExternal = scn.next();
               if(DeathExternal.equalsIgnoreCase("a")){
                    System.out.println("Manner of death(Homicide, Suicide, Accident, Legal Intervention, etc. ");
                }
                if(DeathExternal.equalsIgnoreCase("a")){
                    System.out.println("b. Place of Occurence of External Cause(e.g. home,farm, factory, street, sea,, etc. ");
                }
                
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                System.out.println("If the deceased ages 8 days over fill out 19d-19e. If not, leave blank.");
                System.out.println("--------------------------------------------------------------------------------------------------------------");

                

                
                
            }
    
       }
}
