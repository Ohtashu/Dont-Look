
package marriage;
import java.util.*;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Birth_Storage extends Birth {
  
    public LinkedHashMap <String , Object>BStore  = new LinkedHashMap();
    public static Queue <String> BS = new LinkedList();
    private String Name;
    private static String line;
    private static String linesss;

    private int Navi;

    private Queue <String> Value_Store = new LinkedList();
    private Queue <String> Key_Store = new LinkedList();
    public LinkedHashMap <String, Object> BBStore = new LinkedHashMap();
    
    
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
   public String getFileName(){
       return Name;
   }
    public void BStore(){
        
        
        BStore.put("1A" + getName() , getFname());
        BStore.put("2A" + getName() , getMname());
        BStore.put("3A" + getName() , getLname());
        BStore.put("4A" + getName() ,  getsuff());
        //BStore.put("5A" + Name, getAge());
        BStore.put("6A" + getName() , getBD());
        BStore.put("5A" + getName() , getgen());
        BStore.put("8A" + getName() , getprovi());
        BStore.put("9A" + getName(), getCity());
        BStore.put("10A" + getName(), getHos());
        BStore.put("11A" + getName(), getTB());
        BStore.put("12A" + getName(), getTBP());
        BStore.put("13A" + getName(), getweigh());
        
        BStore.put("1M" + getName(), getMFname());
        BStore.put("2M" + getName(), getMMname());
        BStore.put("3M" + getName(), getMLname());
        BStore.put("4M" + getName(), getMCite());
        BStore.put("5M" + getName(), getReligion());
        BStore.put("6M" + getName(), getMocc());
        BStore.put("7M" + getName(), getMage());
        BStore.put("8M" + getName(), getMHos());
        BStore.put("9M" + getName(), getMCity());
        BStore.put("10M" + getName(), getMprovi());
        
        BStore.put("1F" + getName(), getFFname());
        BStore.put("2F" + getName(), getFMname());
        BStore.put("3F" + getName(), getFLname());
        BStore.put("4F" + getName(), getFCiten());
        BStore.put("5F" + getName(), getFReligion());
        BStore.put("6F" + getName(), getFocc());
        BStore.put("7F" + getName(), getFage());
        BStore.put("8F" + getName(), getFHos());
        BStore.put("9F" + getName(), getFCity());
        BStore.put("10F" + getName(), getFprovi());
        
       
        BS.add(BStore.get("1A" + getName()) + " " + BStore.get("2A" + getName()) + " " + BStore.get("3A" + getName()) + " " + BStore.get("6A" + getName()));
    }
   
    
    public void Writer() throws IOException{
       
        BufferedWriter Key_writer = new BufferedWriter(new FileWriter("C:\\Users\\Josie\\Desktop\\jessie's school work\\2nd year\\1st sem\\Midterm\\OOP\\Government_Agency\\Key_Store_Data\\" + getFileName() + ".txt"));
        BufferedWriter Value_writer = new BufferedWriter(new FileWriter("C:\\Users\\Josie\\Desktop\\jessie's school work\\2nd year\\1st sem\\Midterm\\OOP\\Government_Agency\\Value_Store_Data\\" + getFileName() + ".txt"));
        try{
        for(Map.Entry<String, Object> entry : BStore.entrySet()){
            Value_writer.write("\n" + entry.getValue());
        }
        Value_writer.close();
        
        } catch(IOException ex){
            ex.printStackTrace();
        } catch(NullPointerException e){
            e.printStackTrace();
        }
         try{
        for(Map.Entry<String, Object> entry : BStore.entrySet()){
            Key_writer.write("\n" + entry.getKey());
        }
        Key_writer.close();
        
        } catch(IOException ex){
            ex.printStackTrace();
        } catch(NullPointerException e){
            e.printStackTrace();
        }

        
    }
    public void Reader() throws IOException{
        
        BufferedReader Value_reader = new BufferedReader(new FileReader("C:\\Users\\Josie\\Desktop\\jessie's school work\\2nd year\\1st sem\\Midterm\\OOP\\Government_Agency\\Value_Store_Data\\" + getName() + ".txt"));
        BufferedReader Key_reader = new BufferedReader(new FileReader("C:\\Users\\Josie\\Desktop\\jessie's school work\\2nd year\\1st sem\\Midterm\\OOP\\Government_Agency\\Key_Store_Data\\" + getName() + ".txt"));

        try{
        while((line = Value_reader.readLine()) != null){
            Value_Store.add(line);
        }
        Value_reader.close();
        } catch(IOException ex){
            ex.printStackTrace();
        } catch(NullPointerException e){
            e.printStackTrace();
        }
        try{
        while((line = Key_reader.readLine()) != null){
            Key_Store.add(line);
        }
        Key_reader.close();
        } catch(IOException ex){
            ex.printStackTrace();
        } catch(NullPointerException e){
            e.printStackTrace();
        }
        
        while(!Key_Store.isEmpty() && !Value_Store.isEmpty()){
            BStore.put(Key_Store.poll(), Value_Store.poll());
        }
    }
    
    public void tryyy(){
                

    }
     public void PrintCopy(){
        
System.out.println("\t\t\t========================================================================================================================");
System.out.println(" ");
System.out.println("\t\t\t\t\t\t\t\t\tRepublic of the Philippines"
        + "\n\t\t\t\t\t\t\t\t   Office of The Civil Registrar General"
        + "\n\t\t\t\t\t\t\t\t\tCertificate of Live Birth");
System.out.println(" ");
System.out.println("\t\t\t========================================================================================================================");
System.out.printf("\t\t\t\tNAME\t\t\t| First Name:\t\t\t      | Middle Name:\t\t\t    | Last Name:\n");
System.out.printf("\t\t\t\t\t\t        | %-30s     | %-30s     | %-30s \n", BStore.get("1A" + getName()), BStore.get("2A" + getName()), BStore.get("3A" + getName()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| SEX\t\t\t| Date of Birth:(MM/DD/YYYY)");
System.out.printf("\t\t\t\t| %-20s  | %-20s \n", BStore.get("5A" + getName()), BStore.get("6A" + getName()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\tPlace of Birth\t\t | Name of Hospital/Clinic/Institution\t| City/Municipality\t| Province");
System.out.printf("\t\t\t\t\t\t\t | %-20s                  | %-20s  | %-20s \n", BStore.get("7A" + getName()), BStore.get("8A" + getName()), BStore.get("9A" + getName()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Type of Birth\t\t | If Multiple Birth, Child was");
System.out.printf("\t\t\t\t| %-20s  | %-20s \n", BStore.get("10A" + getName()), BStore.get("11A" + getName()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Birth Order\t\t | Weight At Birth");
System.out.printf("\t\t\t\t| %-20s| %-20s \n", BStore.get("12A" + getName()), BStore.get("13A" + getName()));
System.out.println("\t\t\t========================================================================================================================");
System.out.println("\t\t\tMaiden Name     |First Name:      |Middle Name:       |Last Name:");
System.out.printf("\t\t\t\t        | %-15s | %-15s   | %-15s \n", BStore.get("1M" + getName()), BStore.get("2M" + getName()), BStore.get("3M" + getName()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Citizenship        | Religion");
System.out.printf("\t\t\t\t| %-13s      | %-13s \n", BStore.get("4M" + getName()), BStore.get("5M" + getName()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Occupation       | Age at the time of this birth");
System.out.printf("\t\t\t\t| %-14s   | %-20s \n", BStore.get("6M" + getName()), BStore.get("7M" + getName()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\tResidence     | (House No.,Street,Barangay)    | (City/Municipality)   | (Province)");
System.out.printf("\t\t\t\t              | %-20s           | %-20s  | %-20s \n", BStore.get("8M" + getName()), BStore.get("9M" + getName()), BStore.get("10M" + getName()));
System.out.println("\t\t\t========================================================================================================================");
System.out.println("\t\t\t\tFather's Name\t\t\t| First Name: \t\t\t| Middel Name: \t\t\t| Last Name:");
System.out.printf("\t\t\t\t                                | %-20s          | %-20s          | %-20s \n", BStore.get("1F" + getName()), BStore.get("2F" + getName()), BStore.get("3F" + getName()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Citizenship\t\t\t\t\t| Religion");
System.out.printf("\t\t\t\t| %-20s\t\t\t\t| %-20s \n", BStore.get("4F" + getName()), BStore.get("5F" + getName()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Occupation\t\t\t\t\t| Age at the time of this birth");
System.out.printf("\t\t\t\t| %-20s\t\t\t\t| %-20s \n", BStore.get("6F" + getName()), BStore.get("7F" + getName()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\tResidence     | (House No.,Street,Barangay)    | (City/Municipality)   | (Province)");
System.out.printf("\t\t\t\t              | %-20s           | %-20s  | %-20s \n", BStore.get("8F" + getName()), BStore.get("9F" + getName()), BStore.get("10F" + getName()));
System.out.println("\t\t\t========================================================================================================================");

    }
}
    

