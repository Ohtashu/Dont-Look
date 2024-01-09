package marriage;

import java.util.*;

public class Admin extends Birth_Storage{
    
    Scanner scn = new Scanner(System.in);
    private int Navi = 1, News;
    private static String CodeC, change, PURP, NEWSS;
    private Map <String, String> AdminS = new HashMap();
    private Map AdminQ = new HashMap();
    private char Ans;
    Map  <String, String> BAdmin_Store = new HashMap();
    Map  <String, String> MAdmin_Store = new HashMap();
    Map  <String, String> DAdmin_Store = new HashMap();
    Queue<String> QA = new LinkedList();
    Queue<String> QAA = new LinkedList<>();
    //Marriage Part

    static MarriageStorage marriageStorage = new MarriageStorage();
    private Map <String, String> AdminM = new HashMap();
    private int NaviM = 1;
    
    
    public void AdminW(){
        HQuestion();
        AdminQ.putAll(ques);
        
        
        while(!BS.isEmpty()){
                       
                       AdminS.put( Navi + "B" ,BS.poll());
                       Navi++;
                     } 
        while(!marriageStorage.MS.isEmpty()){
                       
                       AdminM.put( Navi + "B" ,marriageStorage.MS.poll());
                       NaviM++;
                     } 
                
        System.out.print("\t\t\t\t\t\t\t\t\t\tAdmin Certificates"
                        + "\n\t\t\t\t\t\t\t\t\t[B] Birth"
                        + "\n\t\t\t\t\t\t\t\t\t[M] Marriage"
                        + "\n\t\t\t\t\t\t\t\t\t[D] Death"
                        + "\n"
                        + "\n\t\t\t\t\tEnter purpose Letter: ");
                        
                        marriageStorage.printingForm();
        PURP = scn.next().toUpperCase();
     
        if(PURP.equals("B") || PURP.equals("D" ) || PURP.equals("M")){
        System.out.print("Government Agencies"
                + "\n[A] Add Feature"
                + "\n[E] Edit"
                + "\n[D] Delete"
                + "\n[V] View: ");
        
                Ans = scn.next().toUpperCase().charAt(0);

        switch(Ans){
            case 'A':
                
                break;
            case 'E':
                
                if(PURP.equalsIgnoreCase("B")){
                    Birth();
                }else if(PURP.equalsIgnoreCase("D")){
                    Death();
                }else if(PURP.equalsIgnoreCase("M")){
                    Marriage();
                }
               break;
            case 'D':
                
                if(PURP.equalsIgnoreCase("B")){
                    Birth();
                    
                }else if(PURP.equalsIgnoreCase("D")){
                    Death();
                }else if(PURP.equalsIgnoreCase("M")){
                    Marriage();
                }
                
                break;
            case 'V':
                
                for(Map.Entry<String, String> eh : AdminS.entrySet()){
                    
                    System.out.println(eh.getKey() + "-" + eh.getValue());
                }
                System.out.print("Enter the code of the Certificate: ");
                String VCode = scn.next().toUpperCase();
                
                if(BStore.containsValue(AdminS.get(VCode))){
                setName(AdminS.get(VCode));
                System.out.println("Processing the Certificate....");
                
                System.out.println(getName());
                PrintCopy();
                
                }else{
                    System.out.println("Invalid Codes!!!");
                }
                    
                break;
                
            default:
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\t\t\tInvalid Input!!!");
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
     
        }
                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                System.out.print("\t\t\t\t\t\t\t\t\t\tDo you wish to continue?"
                                   + "\n\t\t\t\t\t\t\t\t\t[1] New Transaction"
                                   + "\n\t\t\t\t\t\t\t\t\t[2] Exit Program");
                            News = scn.nextInt(); 
        
        }else {
            
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\t\t\tInvalid Input!!!");
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            
            }
        
    }
    public void BDisplay(){
        
    
     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tChild Information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println(" ");
                   System.out.println("\t\t\t\t1A. Child First Name: " + BAdmin_Store.get("1A" + getName()));
                   System.out.println("\t\t\t\t2A. Child Middle Name (Enter NA if does'nt have one): " + BAdmin_Store.get("2A" + getName()));
                   System.out.println("\t\t\t\t3A. Child Last Name: " + BAdmin_Store.get("3A" + getName()));
                   System.out.println("\t\t\t\t4A. Child Suffix (NA if not have): " + BAdmin_Store.get("4A" + getName()));
                   System.out.println("\t\t\t\t5A. Child Age: " + BAdmin_Store.get("5A" + getName()));
                   System.out.println("\t\t\t\t6A. Child Birthday(MM/DD/YYYY): " + BAdmin_Store.get("6A" + getName()));
                   System.out.println("\t\t\t\t7A. Child Sex(f/m): " + BAdmin_Store.get("7A" + getName()));
                   System.out.println("\t\t\t\t8A. Child Place of Bitht(Province): " + BAdmin_Store.get("8A" + getName()));
                   System.out.println("\t\t\t\t9A. Child Place of Birth (City/Municipality): " + BAdmin_Store.get("9A" + getName()));
                   System.out.println("\t\t\t\t10A. Child Place of Birth(Hospital/Clinic/Institution): " + BAdmin_Store.get("10A" + getName()));
                   System.out.println("\t\t\t\t11A. Type of Birth(Single/Twin/Triplet/etc.): " + BAdmin_Store.get("11A" + getName()));   
                   System.out.println("\t\t\t\t12A. if multiple birth, child was (first/second/third/fourth/etc.): " + BAdmin_Store.get("12A" + getName()));
                   System.out.println("\t\t\t\t13A. Child Weight At Birth: " + BAdmin_Store.get("13A" + getName()));
                   
                   //Mothers Info
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tMother information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1M. Mother First Name: " + BAdmin_Store.get("1M" + getName()));                
                   System.out.println("\t\t\t\t2M. Mother Middle Name: " + BAdmin_Store.get("2M" + getName()));
                   System.out.println("\t\t\t\t3M. Mother Last Name: " + BAdmin_Store.get("3M" + getName()));
                   System.out.println("\t\t\t\t4M. Mother Citizenship: " + BAdmin_Store.get("4M" + getName()));
                   System.out.println("\t\t\t\t5M. Mother Religion: " + BAdmin_Store.get("5M" + getName()));
                   System.out.println("\t\t\t\t6M. Mother Occupation: " + BAdmin_Store.get("6M" + getName()));
                   System.out.println("\t\t\t\t7M. Mother Age at time of this birth: " + BAdmin_Store.get("7M" + getName()));
                   System.out.println("\t\t\t\t8M. Residence(House Number/Steet, Barangay): " + BAdmin_Store.get("8M" + getName()));
                   System.out.println("\t\t\t\t9M. Residence Munipality: " + BAdmin_Store.get("9M" + getName()));
                   System.out.println("\t\t\t\t10M. Province: " + BAdmin_Store.get("10M" + getName()));
                  
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tFather information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1F. Father First Name: " + BAdmin_Store.get("1F" + getName()));                  
                   System.out.println("\t\t\t\t2F. Father Middle Name: " + BAdmin_Store.get("2F" + getName()));
                   System.out.println("\t\t\t\t3F. Father Last Name: " + BAdmin_Store.get("3F" + getName()));
                   System.out.println("\t\t\t\t4F. Father Citizenship: " + BAdmin_Store.get("4F" + getName()));
                   System.out.println("\t\t\t\t5F. Father Religion: " + BAdmin_Store.get("5F" + getName()));
                   System.out.println("\t\t\t\t6F. Father Occupation: " + BAdmin_Store.get("6F" + getName()));
                   System.out.println("\t\t\t\t7F. Father Age at time of this birth: " + BAdmin_Store.get("7F" + getName()));
                   System.out.println("\t\t\t\t8F. Residence(House Number/Steet, Barangay): " + BAdmin_Store.get("8F" +getName()));
                   System.out.println("\t\t\t\t9F. Residence Munipality: " + BAdmin_Store.get("9F" + getName()));
                   System.out.println("\t\t\t\t10F. Province: " + BAdmin_Store.get("10F" + getName()));   
                   
    }   
    public void Birth(){
        
        switch(Ans){
            
            case 'E':
                if(!AdminS.isEmpty()){
                 for(Map.Entry<String, String> eh : AdminS.entrySet()){
                    
                    System.out.println(eh.getKey() + ". " + eh.getValue());
                }
                
                    System.out.print("the code of the Certificate: ");
                    String Code = scn.next().toUpperCase();
                    if(AdminS.containsKey(Code)){
                    do{   
                    System.out.print("Do you wish you to edit this Data?"
                                + "\n[Y] Yes"
                                + "\n[N] No: ");
                        char YoN = scn.next().toUpperCase().charAt(0);
                        if(YoN == 'Y'){
                        System.out.println("\t\t\t\t\tCustomer: " + AdminS.get(Code));
                        setName(AdminS.get(Code));
                        BDisplay();
                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                        System.out.print("\t\t\t\t\tEnter the Code Value of that question example(1A)"
                                + "\n\t\t\t\t\tif more than 1 each number and value should be seprate by space: ");
                       
                        scn.nextLine();
                        CodeC = scn.nextLine().toUpperCase();
                        
                        String[] lies = CodeC.split(" ");
                        
                        for(String a : lies){
                           if(AdminQ.containsKey(a)){
                            QA.add(a);
                            QAA.add(a);
                        //}
                        //while(!QA.isEmpty()){
                            
                        System.out.print(AdminQ.get(QAA.poll()) + " ");
                        change = scn.nextLine();
                        
                      
                    
                       
                    switch(QA.poll()){
                        case "1A":
                           BAdmin_Store.replace("1A" + getName(), change);
                            break;
                        case "2A":
                           BAdmin_Store.replace("2A" + getName(), change);
                            break;
                        case "3A":
                            BAdmin_Store.replace("3A" + getName(), change);
                            break;
                        case "4A":
                           BAdmin_Store.replace("4A" + getName(), change);
                            break;
                        case "5A":
                            BAdmin_Store.replace("5A" + getName(), change);
                            break;
                        case "6A":
                            BAdmin_Store.replace("6A" + getName(), change);
                            break;
                        case "7A":
                            BAdmin_Store.replace("7A" + getName(), change);
                            break;
                        case "8A":
                            BAdmin_Store.replace("8A" + getName(), change);
                            break;
                        case "9A":
                            BAdmin_Store.replace("9A" + getName(), change);
                            break;
                        case "10A":
                            BAdmin_Store.replace("10A" + getName(), change);
                            break;
                        case "11A":
                            BAdmin_Store.replace("11A" + getName(), change);
                            break;
                        case "12A":
                            BAdmin_Store.replace("12A" + getName(), change);
                            break;
                        case "13":
                            BAdmin_Store.replace("13A" + getName(), change);
                            break;
                        case "1M":
                            BAdmin_Store.replace("1M" + getName(), change);
                            break;
                        case "2M":
                            BAdmin_Store.replace("2M" + getName(), change);
                            break;
                        case "3M":
                            BAdmin_Store.replace("3M" + getName(), change);
                            break;
                        case "4M":
                            BAdmin_Store.replace("4M" + getName(), change);
                            break;
                        case "5M":
                            BAdmin_Store.replace("5M" + getName(), change);
                            break;
                        case "6M":
                            BAdmin_Store.replace("6M" + getName(), change);
                            break;
                        case "7M":
                            BAdmin_Store.replace("7M" + getName(), change);
                            break;
                        case "8M":
                            BAdmin_Store.replace("8M" + getName(), change);
                            break;
                        case "9M":
                            BAdmin_Store.replace("9M" + getName(), change);
                            break;
                        case "10M":
                            BAdmin_Store.replace("10M" + getName(), change);
                            break;
                            case "1F":
                            BAdmin_Store.replace("1F" + getName(), change);
                            break;
                        case "2F":
                            BAdmin_Store.replace("2F" + getName(), change);
                            break;
                        case "3F":
                            BAdmin_Store.replace("3F" + getName(), change);
                            break;
                        case "4F":
                            BAdmin_Store.replace("4F" + getName(), change);
                            break;
                        case "5F":
                            BAdmin_Store.replace("5F" + getName(), change);
                            break;
                        case "6F":
                            BAdmin_Store.replace("6F" + getName(), change);
                            break;
                        case "7F":
                            BAdmin_Store.replace("7F" + getName(), change);
                            break;
                        case "8F":
                            BAdmin_Store.replace("8F" + getName(), change);
                            break;
                        case "9F":
                            BAdmin_Store.replace("9F" + getName(), change);
                            break;
                        case "10F":
                            BAdmin_Store.replace("10F" + getName(), change);
                            break;
                                }
                        }
                   }
                    BDisplay();
                        }else{
                            break;
                        }
                    }while(true);
                    }
                }else{
                    
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\t\t\tNo DATA YET!!!!");
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                    
                }
                break;
            case 'D':
                if(!AdminS.isEmpty()){
                   Admin_Delete AD = new Admin_Delete();
                for(Map.Entry<String, String> eh : AdminS.entrySet()){
                    
                    System.out.println(eh.getKey() + ". " + eh.getValue());
                }
                System.out.print("Enter the code of the Certificate: ");
                String DCode = scn.next().toUpperCase();
                
               if(AdminS.containsKey(DCode)){
                    
                    System.out.print("This Certificate is about get Deleted!"
                            + "\n[C] Continue"
                            + "\n[N] No: ");
                    
                    char DorN = scn.next().toUpperCase().charAt(0);
                    
                    switch(DorN){
                        case 'C':
                            AD.setDNAME(AdminS.get(DCode));
                            AD.AdminDSS.putAll(BAdmin_Store);
                            BAdmin_Store.clear();
                            
                            System.out.println("The Certificate is being deleted....");
                            AD.AdminDS();
                            BAdmin_Store.putAll(AD.AdminDSS);
                            AdminS.remove(DCode);
                            AD.AdminDSS.clear();
                         
                            
                        case 'N':
                            
                            break;
                        default:
                            
                            System.out.println("Invalid Answer");
                            break;
                    }
                break;
               }
                }else {
                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\t\t\tNO DATA YET!!!");
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                }
            case 'V':
            do{
                if(AdminS.isEmpty()){
                    
                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\t\t\tNO DATA YET!!!");
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            
        }else{
                    
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\t\t\tVIEW DATA!!!");
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            for(Map.Entry<String, String> eh : AdminS.entrySet()){
                    
                    System.out.println(eh.getKey() + ". " + eh.getValue());
                }
                    System.out.print("Enter the code of the DATA: ");
                    String VCode = scn.next().toUpperCase();
                    
                    if(AdminS.containsKey(VCode)){
                        setName(AdminS.get(VCode));
                        BDisplay();
                        
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\t\t\tVIEW AGAIN(Y/N)? ");
                     NEWSS = scn.next().toUpperCase();
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     
                     
                        
                    }else{
                        
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\t\t\tINVALID INPUT!!!");
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                    }
        }
                    }while(NEWSS.equalsIgnoreCase("A"));
                break;
                
            case 'A':
                
                break;
        }       
        
    }
    public void Marriage(){
        // Inside the MarriageStorage class

       switch(Ans){
            
            case 'E':
                if(!AdminM.isEmpty()){
                 for(Map.Entry<String, String> eh : AdminM.entrySet()){
                    
                    System.out.println(eh.getKey() + ". " + eh.getValue());
                }
                
                    System.out.print("the code of the Certificate: ");
                    String Code = scn.next().toUpperCase();
                    if(AdminM.containsKey(Code)){
                    do{   
                    System.out.print("Do you wish you to edit this Data?"
                                + "\n[Y] Yes"
                                + "\n[N] No: ");
                        char YoN = scn.next().toUpperCase().charAt(0);
                        if(YoN == 'Y'){
                        System.out.println("\t\t\t\t\tCustomer: " + AdminM.get(Code));
                        setName(AdminM.get(Code));
                        MDisplay();
                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                        System.out.print("\t\t\t\t\tEnter the Code Value of that question example(1A)"
                                + "\n\t\t\t\t\tif more than 1 each number and value should be seprate by space: ");
                       
                        scn.nextLine();
                        CodeC = scn.nextLine().toUpperCase();
                        
                        String[] lies = CodeC.split(" ");
                        
                        for(String a : lies){
                           if(AdminQ.containsKey(a)){
                            QA.add(a);
                            QAA.add(a);
                        //}
                        //while(!QA.isEmpty()){
                            
                        System.out.print(AdminQ.get(QAA.poll()) + " ");
                        change = scn.nextLine();
                        
                      
                    
                       
                    switch(QA.poll()){
                        case "1A":
                           MAdmin_Store.replace("1A" + getName(), change);
                            break;
                        case "2A":
                           MAdmin_Store.replace("2A" + getName(), change);
                            break;
                        case "3A":
                            MAdmin_Store.replace("3A" + getName(), change);
                            break;
                        case "4A":
                           MAdmin_Store.replace("4A" + getName(), change);
                            break;
                        case "5A":
                            MAdmin_Store.replace("5A" + getName(), change);
                            break;
                        case "6A":
                            MAdmin_Store.replace("6A" + getName(), change);
                            break;
                        case "7A":
                            MAdmin_Store.replace("7A" + getName(), change);
                            break;
                        case "8A":
                            MAdmin_Store.replace("8A" + getName(), change);
                            break;
                        case "9A":
                            MAdmin_Store.replace("9A" + getName(), change);
                            break;
                        case "10A":
                            MAdmin_Store.replace("10A" + getName(), change);
                            break;
                        case "11A":
                            MAdmin_Store.replace("11A" + getName(), change);
                            break;
                        case "12A":
                            MAdmin_Store.replace("12A" + getName(), change);
                            break;
                        case "13":
                           MAdmin_Store.replace("13A" + getName(), change);
                            break;
                        case "1M":
                            MAdmin_Store.replace("1M" + getName(), change);
                            break;
                        case "2M":
                            MAdmin_Store.replace("2M" + getName(), change);
                            break;
                        case "3M":
                            MAdmin_Store.replace("3M" + getName(), change);
                            break;
                        case "4M":
                            MAdmin_Store.replace("4M" + getName(), change);
                            break;
                        case "5M":
                            MAdmin_Store.replace("5M" + getName(), change);
                            break;
                        case "6M":
                            MAdmin_Store.replace("6M" + getName(), change);
                            break;
                        case "7M":
                            MAdmin_Store.replace("7M" + getName(), change);
                            break;
                        case "8M":
                            MAdmin_Store.replace("8M" + getName(), change);
                            break;
                        case "9M":
                            MAdmin_Store.replace("9M" + getName(), change);
                            break;
                        case "10M":
                            MAdmin_Store.replace("10M" + getName(), change);
                            break;
                            case "1F":
                            MAdmin_Store.replace("1F" + getName(), change);
                            break;
                        case "2F":
                            MAdmin_Store.replace("2F" + getName(), change);
                            break;
                        case "3F":
                            MAdmin_Store.replace("3F" + getName(), change);
                            break;
                        case "4F":
                            MAdmin_Store.replace("4F" + getName(), change);
                            break;
                        case "5F":
                            MAdmin_Store.replace("5F" + getName(), change);
                            break;
                        case "6F":
                            MAdmin_Store.replace("6F" + getName(), change);
                            break;
                        case "7F":
                            MAdmin_Store.replace("7F" + getName(), change);
                            break;
                        case "8F":
                            MAdmin_Store.replace("8F" + getName(), change);
                            break;
                        case "9F":
                            MAdmin_Store.replace("9F" + getName(), change);
                            break;
                        case "10F":
                            MAdmin_Store.replace("10F" + getName(), change);
                            break;
                                }
                        }
                   }
                    MDisplay();
                        }else{
                            break;
                        }
                    }while(true);
                    }
                }else{
                    
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\t\t\tNo DATA YET!!!!");
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                    
                }
                break;
            case 'D':
                if(!AdminM.isEmpty()){
                   Admin_Delete AD = new Admin_Delete();
                for(Map.Entry<String, String> eh : AdminM.entrySet()){
                    
                    System.out.println(eh.getKey() + ". " + eh.getValue());
                }
                System.out.print("Enter the code of the Certificate: ");
                String DCode = scn.next().toUpperCase();
                
               if(AdminM.containsKey(DCode)){
                    
                    System.out.print("This Certificate is about get Deleted!"
                            + "\n[C] Continue"
                            + "\n[N] No: ");
                    
                    char DorN = scn.next().toUpperCase().charAt(0);
                    
                    switch(DorN){
                        case 'C':
                            AD.setDNAME(AdminS.get(DCode));
                            AD.AdminDSS.putAll(MAdmin_Store);
                            MAdmin_Store.clear();
                            
                            System.out.println("The Certificate is being deleted....");
                            AD.AdminDS();
                            BAdmin_Store.putAll(AD.AdminDSS);
                            AdminM.remove(DCode);
                            AD.AdminDSS.clear();
                         
                            
                        case 'N':
                            
                            break;
                        default:
                            
                            System.out.println("Invalid Answer");
                            break;
                    }
                break;
               }
                }else {
                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\t\t\tNO DATA YET!!!");
                     System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                }
            case 'V':
                
                break;
                
            case 'A':
                
                break;
        }    
        

    }
    public void Death(){
        
    }
    

    //Marriage Processs
    public void MDisplay(){
         System.out.println("\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\tWIFE'S INFORMATION");
        System.out.println("\t1a. First Name: " + MAdmin_Store.get("1a" + marriageStorage.getSMName()));
        System.out.println("\t1b. Middle Name: " + MAdmin_Store.get("1b" + marriageStorage.getSMName()));
        System.out.println("\t1c. Last Name: " + MAdmin_Store.get("1c" + marriageStorage.getSMName()));
        System.out.println("\t2. Date of Birth (MM/DD/YYYY): " + MAdmin_Store.get("2" + marriageStorage.getSMName()));
        System.out.println("\t3. Age: " + MAdmin_Store.get("3" + marriageStorage.getSMName()));
        System.out.println("\t4. Place of Birth (City, Province): " + MAdmin_Store.get("4" + marriageStorage.getSMName()));
        System.out.println("\t5. Sex(f/m): " + MAdmin_Store.get("5" + marriageStorage.getSMName()));
        System.out.println("\t6. Citizenship: " + MAdmin_Store.get("6" + marriageStorage.getSMName()));
        System.out.println("\t7a. Residence (Province): " + MAdmin_Store.get("7a" + marriageStorage.getSMName()));
        System.out.println("\t7b. Residence (City/Municipality): " + MAdmin_Store.get("7b" + marriageStorage.getSMName()));
        System.out.println("\t7c. Residence (Barangay): " + MAdmin_Store.get("7c" + marriageStorage.getSMName()));
        System.out.println("\t7d. Residence (House Number/Street): " + MAdmin_Store.get("7d" + marriageStorage.getSMName()));
        System.out.println("\t8. Religion: " + MAdmin_Store.get("8" + marriageStorage.getSMName()));
        System.out.println("\t9. Civil status: " + MAdmin_Store.get("9" + marriageStorage.getSMName()));
        System.out.println("\t10. Full name of Father: " + MAdmin_Store.get("10" + marriageStorage.getSMName()));
        System.out.println("\t11. Citizenship of Father: " + MAdmin_Store.get("11" + marriageStorage.getSMName()));
        System.out.println("\t12. Full name of Mother: " + MAdmin_Store.get("12" + marriageStorage.getSMName()));
        System.out.println("\t13. Citizenship of Mother: " + MAdmin_Store.get("13" + marriageStorage.getSMName()));
        System.out.println("\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\tHUSBAND'S INFORMATION");
        System.out.println("\t14a. First Name: " + getHusbandFirst());
        System.out.println("\t14b. Middle Name: " + getHusbandMiddle());
        System.out.println("\t14c. Last Name: " + getHusbandLast());
        System.out.println("\t15. Date of Birth (MM/DD/YYYY): " + getHusbandDateOfBirth());
        System.out.println("\t16. Age: " + getHusbandAge());
        System.out.println("\t17. Place of Birth (City, Province): " + getHusbandPlaceOfBirth());
        System.out.println("\t18. Sex(f/m): " + getHusbandSex());
        System.out.println("\t19. Citizenship: " + getHusbandCitizen());
        System.out.println("\t20a. Residence (Province): " + getHusbandProvince());
        System.out.println("\t20b. Residence (City/Municipality): " + getHusbandCity());
        System.out.println("\t20c. Residence (Baranggay): " + getHusbandBarangay());
        System.out.println("\t20d. Residence (House Number/Street): " + getHusbandStreet());
        System.out.println("\t21. Religion: " + getHusbandReligion());
        System.out.println("\t22. Civil status: " + getHusbandStatus());
        System.out.println("\t23. Full name of Father: " + getHusbandFather());
        System.out.println("\t24. Citizenship of Father: " + getHusbandFatherCitizen());
        System.out.println("\t25. Full name of Mother: " + getHusbandMother());
        System.out.println("\t26. Citizenship of Mother: " + getHusbandMotherCitizen());
            System.out.println("\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\tPlace of Marriage" + getPlaceMarriage());
        System.out.println("\tDate of Marriage" + getDateMarriage());
        System.out.println("\tThis is to certify that I " + getWifeFirst()+" "+getWifeMiddle()+" "+getWifeLast() +" and "+ getHusbandFirst()+" "+getHusbandMiddle()+" "+getHusbandLast()
                            +",\nboth of legal age, of our own free will and accord,"
                            + "\nthe presence of the person solemmizing this marriage and of the witness named below,"
                            + "\ntake each other as husband and wife.");
    }
    public void Death(){
        
    }




}