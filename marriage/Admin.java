
package marriage;

import java.util.*;

public class Admin extends Birth_Storage{
    
    Scanner scn = new Scanner(System.in);
    private int Navi = 1;
    private Map <String, String> AdminS = new HashMap();
    private Map AdminQ = new HashMap();
    
    public void AdminW(){
        HQuestion();
        AdminQ.putAll(ques);
        while(!BS.isEmpty()){
                       
                       AdminS.put( Navi + "B" ,BS.poll());
                       Navi++;
                     } 
                
        System.out.print("\t\t\t\t\t\t\t\t\t\tAdmin Certificates"
                        + "\n\t\t\t\t\t\t\t\t\t[1] Birth"
                        + "\n\t\t\t\t\t\t\t\t\t[2] Marriage"
                        + "\n\t\t\t\t\t\t\t\t\t[3] Death"
                        + "\n"
                        + "\n\t\t\t\t\tEnter purpose number: ");
        char PURP = scn.next().toUpperCase().charAt(0);
        
        System.out.print("Government Agencies"
                + "\n[A] Add Feature"
                + "\n[E] Edit"
                + "\n[D] Delete"
                + "\n[V] View: ");
        
        char Ans = scn.next().toUpperCase().charAt(0);
        
        switch(Ans){
            case 'A':
                
                break;
            case 'E':
                for(Map.Entry<String, String> eh : AdminS.entrySet()){
                    
                    System.out.println(eh.getKey() + ". " + eh.getValue());
                }
                
                    System.out.print("the code of the Certificate: ");
                    String Code = scn.next().toUpperCase();
                        
                        System.out.println("Customer: " + AdminS.get(Code));
                        setName(AdminS.get(Code));
                        BStore();
                        ADisplay();
                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                        System.out.print("\t\t\t\t\tEnter the Code Value of that question example(1A)"
                                + "\n\t\t\t\t\tif more than 1 each number and value should be seprate by space: ");
                       
                        
                        String CodeC = scn.next().toUpperCase();
                        
                        System.out.print(AdminQ.get(CodeC));
                        scn.nextLine();
                        String change = scn.nextLine();
                        
                        
                    
                       
                    switch(CodeC){
                        case "1A":
                            BStore.replace("1A" + getName(),  change);
                            break;
                        case "2A":
                           BStore.replace("2A" + getName(), change);
                            break;
                        case "3A":
                            BStore.replace("3A" + getName(), change);
                            break;
                        case "4A":
                           BStore.replace("4A" + getName(), change);
                            break;
                        case "5A":
                            BStore.replace("5A" + getName(), change);
                            break;
                        case "6A":
                            BStore.replace("6A" + getName(), change);
                            break;
                        case "7A":
                            BStore.replace("7A" + getName(), change);
                            break;
                        case "8A":
                            BStore.replace("8A" + getName(), change);
                            break;
                        case "9A":
                            BStore.replace("9A" + getName(), change);
                            break;
                        case "10A":
                            BStore.replace("10A" + getName(), change);
                            break;
                        case "11A":
                            BStore.replace("11A" + getName(), change);
                            break;
                        case "12A":
                            BStore.replace("12A" + getName(), change);
                            break;
                        case "13":
                            BStore.replace("13A" + getName(), change);
                            break;
                        case "1M":
                            BStore.replace("1M" + getName(), change);
                            break;
                        case "2M":
                            BStore.replace("2M" + getName(), change);
                            break;
                        case "3M":
                            BStore.replace("3M" + getName(), change);
                            break;
                        case "4M":
                            BStore.replace("4M" + getName(), change);
                            break;
                        case "5M":
                            BStore.replace("5M" + getName(), change);
                            break;
                        case "6M":
                            BStore.replace("6M" + getName(), change);
                            break;
                        case "7M":
                            BStore.replace("7M" + getName(), change);
                            break;
                        case "8M":
                            BStore.replace("8M" + getName(), change);
                            break;
                        case "9M":
                            BStore.replace("9M" + getName(), change);
                            break;
                        case "10M":
                            BStore.replace("10M" + getName(), change);
                            break;
                            case "1F":
                            BStore.replace("1F" + getName(), change);
                            break;
                        case "2F":
                            BStore.replace("2F" + getName(), change);
                            break;
                        case "3F":
                            BStore.replace("3F" + getName(), change);
                            break;
                        case "4F":
                            BStore.replace("4F" + getName(), change);
                            break;
                        case "5F":
                            BStore.replace("5F" + getName(), change);
                            break;
                        case "6F":
                            BStore.replace("6F" + getName(), change);
                            break;
                        case "7F":
                            BStore.replace("7F" + getName(), change);
                            break;
                        case "8F":
                            BStore.replace("8F" + getName(), change);
                            break;
                        case "9F":
                            BStore.replace("9F" + getName(), change);
                            break;
                        case "10F":
                            BStore.replace("10F" + getName(), change);
                            break;
                        default: 
                            System.out.println("Invalid Code Value");
                    
                                }
                    ADisplay();
                
                break;
            case 'D':
                Admin_Delete AD = new Admin_Delete();
                for(Map.Entry<String, String> eh : AdminS.entrySet()){
                    
                    System.out.println(eh.getKey() + ". " + eh.getValue());
                }
                System.out.print("Enter the code of the Certificate: ");
                String DCode = scn.next();
                
                if(AdminS.containsKey(DCode)){
                
                    System.out.print("This Certificate is about get Deleted!"
                            + "\n[C] Continue"
                            + "\n[N] No: ");
                    
                    char DorN = scn.next().toUpperCase().charAt(0);
                    
                    switch(DorN){
                        case 'C':
                            setName(AdminS.get(DCode));
                            System.out.println("The Certificate is being deleted....");
                            AD.AdminDS();
                            
                        case 'N':
                            
                            break;
                        default:
                            
                            System.out.println("Invalid Answer");
                            break;
                    }
            }
                
                
                break;
            case 'V':
                
                for(Map.Entry<String, String> eh : AdminS.entrySet()){
                    
                    System.out.println(eh.getKey() + ". " + eh.getValue());
                }
                System.out.print("Enter the code of the Certificate: ");
                String VCode = scn.next();
                
                System.out.println("Processing the Certificate....");
                setName(AdminS.get(VCode));
                
                PrintCopy();
                
                    
                break;
                
        }
        
    }
    public void ADisplay(){
        
    
     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tChild Information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println(" ");
                   System.out.println("\t\t\t\t1A. Child First Name: " +BStore.get("1A" + getName()));
                   System.out.println("\t\t\t\t2A. Child Middle Name (Enter NA if does'nt have one): " + BStore.get("2A" + getName()));
                   System.out.println("\t\t\t\t3A. Child Last Name: " + BStore.get("3A" + getName()));
                   System.out.println("\t\t\t\t4A. Child Suffix (NA if not have): " + BStore.get("4A" + getName()));
                   System.out.println("\t\t\t\t5A. Child Age: " + BStore.get("5A" + getName()));
                   System.out.println("\t\t\t\t6A. Child Birthday(MM/DD/YYYY): " + BStore.get("6A" + getName()));
                   System.out.println("\t\t\t\t7A. Child Sex(f/m): " + BStore.get("7A" + getName()));
                   System.out.println("\t\t\t\t8A. Child Place of Bitht(Province): " + BStore.get("8A" + getName()));
                   System.out.println("\t\t\t\t9A. Child Place of Birth (City/Municipality): " + BStore.get("9A" + getName()));
                   System.out.println("\t\t\t\t10A. Child Place of Birth(Hospital/Clinic/Institution): " + BStore.get("10A" + getName()));
                   System.out.println("\t\t\t\t11A. Type of Birth(Single/Twin/Triplet/etc.): " + BStore.get("11A" + getName()));   
                   System.out.println("\t\t\t\t12A. if multiple birth, child was (first/second/third/fourth/etc.): " + BStore.get("12A" + getName()));
                   System.out.println("\t\t\t\t13A. Child Weight At Birth: " + BStore.get("13A" + getName()));
                   
                   //Mothers Info
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tMother information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1M. Mother First Name: " + BStore.get("1M" + getName()));                
                   System.out.println("\t\t\t\t2M. Mother Middle Name: " + BStore.get("2M" + getName()));
                   System.out.println("\t\t\t\t3M. Mother Last Name: " + BStore.get("3M" + getName()));
                   System.out.println("\t\t\t\t4M. Mother Citizenship: " + BStore.get("4M" + getName()));
                   System.out.println("\t\t\t\t5M. Mother Religion: " + BStore.get("5M" + getName()));
                   System.out.println("\t\t\t\t6M. Mother Occupation: " + BStore.get("6M" + getName()));
                   System.out.println("\t\t\t\t7M. Mother Age at time of this birth: " + BStore.get("7M" + getName()));
                   System.out.println("\t\t\t\t8M. Residence(House Number/Steet, Barangay): " + BStore.get("8M" + getName()));
                   System.out.println("\t\t\t\t9M. Residence Munipality: " + BStore.get("9M" + getName()));
                   System.out.println("\t\t\t\t10M. Province: " + BStore.get("10M" + getName()));
                  
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tFather information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1F. Father First Name: " + BStore.get("1F" + getName()));                  
                   System.out.println("\t\t\t\t2F. Father Middle Name: " + BStore.get("2F" + getName()));
                   System.out.println("\t\t\t\t3F. Father Last Name: " + BStore.get("3F" + getName()));
                   System.out.println("\t\t\t\t4F. Father Citizenship: " + BStore.get("4F" + getName()));
                   System.out.println("\t\t\t\t5F. Father Religion: " + BStore.get("5F" + getName()));
                   System.out.println("\t\t\t\t6F. Father Occupation: " + BStore.get("6F" + getName()));
                   System.out.println("\t\t\t\t7F. Father Age at time of this birth: " + BStore.get("7F" + getName()));
                   System.out.println("\t\t\t\t8F. Residence(House Number/Steet, Barangay): " + BStore.get("8F" + getName()));
                   System.out.println("\t\t\t\t9F. Residence Munipality: " + BStore.get("9F" + getName()));
                   System.out.println("\t\t\t\t10F. Province: " + BStore.get("10F" + getName()));   
                   
    }
    public void ADD(){
        
    }
    public void EDIT(){
        
    }
    public void DELETE(){
        
    }
    public void VIEW(){
        
    }
}
