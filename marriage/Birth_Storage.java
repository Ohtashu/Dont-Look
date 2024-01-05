
package marriage;
import java.util.*;
public class Birth_Storage extends Birth{
  
    public HashMap <String ,Object>BStore  = new HashMap();
    Queue BS = new LinkedList();
    private String Name;
    
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
   
    public void BStore(){
        
        BStore.put("1A" + Name, getFname());
        BStore.put("2A" + Name, getMname());
        BStore.put("3A" + Name, getLname());
        BStore.put("4A" + Name, getsuff());
        //BStore.put("5A" + Name, getAge());
        BStore.put("6A" + Name, getBD());
        BStore.put("5A" + Name, getgen());
        BStore.put("8A" + Name, getprovi());
        BStore.put("9A" + Name, getCity());
        BStore.put("10A" + Name, getHos());
        BStore.put("11A" + Name, getTB());
        BStore.put("12A" + Name, getTBP());
        BStore.put("13A" + Name, getweigh());
        
        BStore.put("1M" + Name, getMFname());
        BStore.put("2M" + Name, getMMname());
        BStore.put("3M" + Name, getMLname());
        BStore.put("4M" + Name, getMCite());
        BStore.put("5M" + Name, getReligion());
        BStore.put("6M" + Name, getMocc());
        BStore.put("7M" + Name, getMage());
        BStore.put("8M" + Name, getMHos());
        BStore.put("9M" + Name, getMCity());
        BStore.put("10M" + Name, getMprovi());
        
        BStore.put("1F" + Name, getFFname());
        BStore.put("2F" + Name, getFMname());
        BStore.put("3F" + Name, getFLname());
        BStore.put("4F" + Name, getFCiten());
        BStore.put("5F" + Name, getFReligion());
        BStore.put("6F" + Name, getFocc());
        BStore.put("7F" + Name, getFage());
        BStore.put("8F" + Name, getFHos());
        BStore.put("9F" + Name, getFCity());
        BStore.put("10F" + Name, getFprovi());
    }
    public void PrintCopy(){
        
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println(" ");
System.out.println("\t\t\t\t\t\t\t\tRepublic of the Philippines"
        + "\n\t\t\t\t\t\t\t   Office of The Civil Registrar General"
        + "\n\t\t\t\t\t\t\t\tCertificate of Live Birth");
System.out.println(" ");
System.out.println("\t\t\t************************************************************************************************************************");
System.out.printf("\t\t\t\tNAME\t\t\t| First Name:\t\t\t      | Middle Name:\t\t\t    | Last Name:\n");
System.out.printf("\t\t\t\t\t\t        | %-30s     | %-30s     | %-30s \n", BStore.get("1A" + Name), BStore.get("2A" + Name), BStore.get("3A" + Name));
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\t| SEX\t\t\t| Date of Birth:(MM/DD/YYYY)");
System.out.printf("\t\t\t\t| %-20s  | %-25s \n", BStore.get("5A"), BStore.get("6A" + Name));
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\tPlace of Birth\t\t| Name of Hospital/Clinic/Institution\t| City/Municipality\t| Province");
System.out.printf("\t\t\t\t\t\t\t| %-20s                  | %-20s  | %-20s \n", BStore.get("7A" + Name), BStore.get("8A" + Name), BStore.get("9A" + Name));
System.out.println("\t\t\t\t| Type of Birth\t\t| If Multiple Birth, Child was");
System.out.printf("\t\t\t\t| %-20s  | %-20s \n", BStore.get("10A" + Name), BStore.get("11A" + Name));
System.out.println("\t\t\t\t| Birth Order\t\t| Weight At Birth");
System.out.printf("\t\t\t\t| %-20s  | %-20s \n", BStore.get("12A" + Name), BStore.get("13A" + Name));
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\t\t\t\t\tMother Information");
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\tMaiden Name     |First Name:      |Middle Name:       |Last Name:");
System.out.printf("\t        | %-15s | %-15s   | %-15s \n", BStore.get("1M" + Name), BStore.get("2M" + Name), BStore.get("3M" + Name));
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\t| Citizenship        | Religion");
System.out.printf("\t\t\t\t| %-13s      | %-13s \n", BStore.get("4M" + Name), BStore.get("5M" + Name));
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\t| Occupation       | Age at the time of this birth");
System.out.printf("\t\t\t\t| %-14s   | %-20s \n", BStore.get("6M" + Name), BStore.get("7M" + Name));
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\tResidence     | (House No.,Street,Barangay)    | (City/Municipality)   | (Province)");
System.out.printf("\t\t\t\t              | %-20s           | %-20s  | %-20s \n", BStore.get("8M" + Name), BStore.get("9M" + Name), BStore.get("10M" + Name));
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\t\t\t\t\t\tFather Information");
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\tFather's Name\t\t\t| First Name: \t\t\t| Middel Name: \t\t\t| Last Name:");
System.out.printf("\t\t\t\t                                | %-20s          | %-20s          | %-20s \n", BStore.get("1F" + Name), BStore.get("2F" + Name), BStore.get("3F" + Name));
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\t| Citizenship\t\t\t\t\t| Religion");
System.out.printf("\t\t\t\t| %-20s\t\t\t\t| %-20s \n", BStore.get("4F" + Name), BStore.get("5F" + Name));
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\t| Occupation\t\t\t\t\t| Age at the time of this birth");
System.out.printf("\t\t\t\t| %-20s\t\t\t\t| %-20s \n", BStore.get("6F" + Name), BStore.get("7F" + Name));
System.out.println("\t\t\t************************************************************************************************************************");
System.out.println("\t\t\t\tResidence     | (House No.,Street,Barangay)    | (City/Municipality)   | (Province)");
System.out.printf("\t\t\t\t              | %-20s           | %-20s  | %-20s \n", BStore.get("8F" + Name), BStore.get("9F" + Name), BStore.get("10F" + Name));
System.out.println("\t\t\t************************************************************************************************************************");

    }
}
