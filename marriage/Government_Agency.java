
package marriage;

import java.util.*;
import java.io.IOException;

public class Government_Agency{

    static Birth B = new Birth();
    static Birth_Storage BStore = new Birth_Storage();
    static Map ques = new HashMap();
    static Admin a = new Admin();
    static String[] Nume;
    static Queue <String> NumE = new LinkedList();
    static Queue <String> NumEE = new LinkedList();
    static Queue <String> NumEEE = new LinkedList();
    static String[][] T1 = new String[2][100];
    static char PE, NoC;
    static int Cont;
    static double change, Copy, Price, Amount, T8, CoE, Navi, New = 1;
    static String TBP, Fname, Addresses;
    static Scanner scn = new Scanner(System.in);
    
    
    public static void main(String[] args) throws Exception, IOException {
        B.HQuestion();
        ques.putAll(B.ques);
        
             
        do{
        
        System.out.println();
        System.out.print("\t\t\t------------------------------------------------------------------------------------------------------------------------"
                + "\n\t\t\t\t\t\t\t\t\t\tGovernment Agency"
                + "\n\t\t\t\t\t\t\t\t\t\t[1] Registration "
                + "\n\t\t\t\t\t\t\t\t\t\t[2] Print Copy"
                + "\n"
                + "\n\t\t\t\t\tEnter designated number: ");
        
        int Purp = scn.nextInt();
        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        
        switch(Purp){
            //Case 1 Start of registration 
            case 1:
                
                System.out.print("\t\t\t\t\t\t\t\t\t\tRegistration Certificate"
                        + "\n\t\t\t\t\t\t\t\t\t\t[1] Birth"
                        + "\n\t\t\t\t\t\t\t\t\t\t[2] Marriage"
                        + "\n\t\t\t\t\t\t\t\t\t\t[3] Death"
                        + "\n"
                        + "\n\t\t\t\t\tEnter purpose number: ");
                int ResPurp = scn.nextInt();
                
                
                if(ResPurp == 1){
                   
                    
                   B.Question();
                   B.Display();
                   
                   do{
                       
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.print("\t\t\t\tCheck your answers(if theres any mistake press 2 to edit)"
                            + "\n\t\t\t\t[1] Continue"
                            + "\n\t\t\t\t[2] Edit: ");
                   CoE = scn.nextInt();
                    
                   
                   if(CoE == 2){
                       
                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                        System.out.print("\t\t\t\t\tEnter the Code Value of that question example(1A)"
                                + "\n\t\t\t\t\tif more than 1 each number and value should be seprate by space: ");
                        scn.nextLine();
                        String edit = scn.nextLine().toUpperCase();
                        
                        Nume = edit.split(" ");
                        
                        for(String a: Nume){
                            NumE.add(a);
                            NumEE.add(a);
                            NumEEE.add(a);
                            T8++;
                  
                        //}
                        //for(int i = 0; i < T8; T8--){
                        
                        System.out.print("\t\t\t\t\t" + NumEEE.poll()+ " " +ques.get(NumE.poll()));
                        String change = scn.nextLine();
                       
                    switch(NumEE.poll()){
                        case "1A":
                            B.setFname(change);
                            break;
                        case "2A":
                            B.setMname(change);
                            break;
                        case "3A":
                            B.setLname(change);
                            break;
                        case "4A":
                            B.setSuff(change);
                            break;
                        case "5A":
                            B.setAge(Integer.parseInt(change));
                            break;
                        case "6A":
                            B.setBD(change);
                            break;
                        case "7A":
                            B.setgen(change.charAt(0));
                            break;
                        case "8A":
                            B.setprovi(change);
                            break;
                        case "9A":
                            B.setCity(change);
                            break;
                        case "10A":
                            B.setHos(change);
                            break;
                        case "11A":
                            B.setTB(change);
                            break;
                        case "12A":
                            B.setTBP(change);
                            break;
                        case "13":
                            B.setweigh(Integer.parseInt(change));
                            break;
                        case "1M":
                            B.setMFname(change);
                            break;
                        case "2M":
                            B.setMMname(change);
                            break;
                        case "3M":
                            B.setMLname(change);
                            break;
                        case "4M":
                            B.setMCite(change);
                            break;
                        case "5M":
                            B.setMReligion(change);
                            break;
                        case "6M":
                            B.setMoc(change);
                            break;
                        case "7M":
                            B.setMage(Integer.parseInt(change));
                            break;
                        case "8M":
                            B.setMHos(change);
                            break;
                        case "9M":
                            B.setMCity(change);
                            break;
                        case "10M":
                            B.setMprovi(change);
                            break;
                            case "1F":
                            B.setFFname(change);
                            break;
                        case "2F":
                            B.setFMname(change);
                            break;
                        case "3F":
                            B.setFLname(change);
                            break;
                        case "4F":
                            B.setFCite(change);
                            break;
                        case "5F":
                            B.setFReligion(change);
                            break;
                        case "6F":
                            B.setFocc(change);
                            break;
                        case "7F":
                            B.setFage(Integer.parseInt(change));
                            break;
                        case "8F":
                            B.setFHos(change);
                            break;
                        case "9F":
                            B.setFCity(change);
                            break;
                        case "10F":
                            B.setFprovi(change);
                            break;
                        default: 
                            System.out.println("Invalid Code Value");
                    
                                }       
                            }
                        
                        B.Display();  
                        }
                   
                     
                   
                    }while(CoE == 2);
                    
                     
                     BStore.setName( B.getFname() + " " + B.getMname() + " " + B.getLname());
                     BStore.BStore();
                     BStore.PrintCopy();
                     PrintCopy();

                     
                    
                }
                else if(ResPurp == 2){
                    Scanner scanner = new Scanner(System.in);
                    
                   process(); 
                }
                
                System.out.print("\t\t\t\t\t\t\t\t\tDo you wish to continue?"
                                   + "\n\t\t\t\t\t\t\t\t\t[1] New Transaction"
                                   + "\n\t\t\t\t\t \t\t\t\t[2] Exit Program");
                New = scn.nextInt(); 
                
                break;
                
                
                
                //Case two for Printing Copy of Existing file
            case 2:
               
               // a.AdminW();
                System.out.print("\t\t\t\t\tFirst Name of the Certificate: ");
                scn.nextLine();
                Fname = scn.nextLine().toUpperCase();
                BStore.setName(Fname);
                BStore.Reader();
      

                //if(BStore.BStore.containsValue(Fname)){
                    
                    
                    System.out.println("\t\t\t\t\t\t\t\t\t\tExisting File: " + BStore.getName());
                    PrintCopy();
                    
               // }else{
                    System.out.println("\t\t\t\t\t\t\t\t\tNone existing Certificate!");
                //}
                
                
                System.out.print("\t\t\t\t\t\t\t\t\t\tDo you wish to continue?"
                                   + "\n\t\t\t\t\t\t\t\t\t[1] New Transaction"
                                   + "\n\t\t\t\t\t\t\t\t\t[2] Exit Program");
                            New = scn.nextInt(); 
                       
                break;
            }
        }while(New == 1);
        
    }
    /*
    public static void Questions(){
        
        ques.put("1A", "Child First Name:");
        ques.put("2A", "Child Middle Name (Enter NA if does'nt have one):");
        ques.put("3A" , "Child Last Name:");
        ques.put("4A", "Child Suffix (NA if not have): ");
        ques.put("5A" , "Child Age: ");
        ques.put("6A" , "Child Birthday(MM/DD/YYYY): ");
        ques.put("7A", "Child Sex(f/m): ");
        ques.put("8A", "Child Place of Birth(Province): ");
        ques.put("9A", "Child Place of Birth(City/Municipality): ");
        ques.put("10A","Child Place of Birth(Hospital/Clinic/Institution):");
        ques.put("11A","Child Type of Birth(Single/Twin/Triplet/etc): ");
        ques.put("12A","Child If multiple birth, child was(first/second/third/fourth/etc.): ");
        ques.put("13A","Child Weight at Birth: ");
        
        ques.put("1M","Mother First name: ");
        ques.put("2M","Mother Middle name: ");
        ques.put("3M","Mother Last name: ");
        ques.put("4M","Mother Citizenship: ");
        ques.put("5M","Mother Religion: ");
        ques.put("6M","Mother Occupation: ");
        ques.put("7M","Mother Age at time of this birth: ");
        ques.put("8M","Mother Residence(House Number/Street, Barangay): ");
        ques.put("9M","Mother Residence Municipality: ");
        ques.put("10M","Mother Province: ");

        ques.put("1F","Father First name: ");
        ques.put("2F","Father Middle name: ");
        ques.put("3F","Father Last name: ");
        ques.put("4F","Father Citizenship: ");
        ques.put("5F","Father Religion: ");
        ques.put("6F","Father Occupation: ");
        ques.put("7F","Father Age at time of this birth: ");
        ques.put("8F","Father Residence(House Number/Street, Barangay): ");
        ques.put("9F","Father Residence Municipality: ");
        ques.put("10F","Father Province: ");

    } */
    //Marriage Method
    static void process(){
		  
        Scanner scanner = new Scanner(System.in);
         MarriageCertificate certificate = new MarriageCertificate();
        
        certificate.inputMarriageCertificate();
        certificate.displayCertificateInformation();

        //condition to edit
    
        System.out.print("\tDo you want to edit? [Y] Yes or [N] No: ");
        String user_input = scanner.nextLine();
        
        if(user_input.equals("Y")|| user_input.equals("y")){
            certificate.editCertificateInformation();
            certificate.displayCertificateInformation();
        }
    

         //System Repeats
        boolean System_repeater = true;
        while(System_repeater){
           
           System.out.println("\tDo you want to Continue to Edit?");
           System.out.print("\t[Y] Yes or [N] No: ");
           String decision = scanner.nextLine();
           if (decision.equals("Y")|| decision.equals("y")){
               System_repeater = true;
               certificate.editCertificateInformation();
           }
           else if(decision.equals("N") || decision.equals("n")){
                   System_repeater = false;
           }
           else{
            System_repeater = true;
           }
        } 
           certificate.displayCertificateInformation();
           //certificate.printerlol();
        
   } 

    public static void PrintCopy() throws Exception{
                    System.out.print("\t\t\t\tDo you wish to get the copy of the Certificate?"
                               + "\n\t\t\t\t\t\t[1] Yes"
                               + "\n\t\t\t\t\t\t[2] No: ");
                       int YorN = scn.nextInt();
                       if(YorN == 1){
                           BStore.PrintCopy();
                           System.out.print("\t\t\t\tWhat kind of Method you want to choose"
                                   + "\n\t\t\t\t\t\t[1] Pick Up"
                                   + "\n\t\t\t\t\t\t[2] Delivery: ");
                           Navi = scn.nextInt();
                            
                           
                           if(Navi == 1){
                               
                                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                System.out.print("\t\t\t\tFull Name of Reciever: ");
                                scn.nextLine();
                                Fname = scn.nextLine();
                                 
                                System.out.print("\t\t\t\tContact Number: +63");
                                Cont = scn.nextInt();
                                
                                do{
                                    
                                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("\t\t\t\tPlease Check Pick up Information");
                                System.out.println("");
                                System.out.println("\t\t\t\tName: " + Fname);
                                System.out.println("\t\t\t\tContact Numebr: " + Cont);
                                System.out.println("");
                                System.out.println("\t\t\t\tPlease be informed that the Payment fee for one(1) copy"
                                        + "\n\t\t\t\tof PSA Certificate is Php 155");
                                System.out.println(" ");
                                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                System.out.print("\t\t\t\tMake sure your detail is correct. Proceed(Y/N): ");
                                PE = scn.next().toUpperCase().charAt(0);
                                
                               if(PE == 'N'){
                                   
                                    System.out.print("\t\t\t\tEnter the Part you want to edit(N(Name)/C(Contact)/B(Both): ");
                                    NoC = scn.next().toUpperCase().charAt(0);
                                    
                                    if(NoC == 'N'){
                                        
                                        System.out.print("\t\t\t\tFull Name of Reciever: ");
                                        scn.nextLine();
                                        Fname = scn.nextLine();
                                
                             
                                    }else if(NoC == 'C'){
                                        
                                        System.out.print("\t\t\t\tContact Number: +63");
                                        Cont = scn.nextInt();  
                                    }else if(NoC == 'B'){
                                        System.out.print("\t\t\t\tFull Name of Reciever: ");
                                        scn.nextLine();
                                        Fname = scn.nextLine();
                                
                                        System.out.print("\t\t\t\tContact Number: +63");
                                        Cont = scn.nextInt();
                                        
                                        }
                                    }
                                }while(PE == 'N');
                               
                                if(PE == 'Y'){
                                
                                    System.out.print("\t\t\t\tHow Many Copies: ");
                                    Copy = scn.nextDouble();
                                    Price = 155 *Copy;
                                    
                                    System.out.println("\t\t\t\tTotal: " + Price);
                                    System.out.print("\t\t\t\tEnter Amount paying: ");
                                    Amount = scn.nextDouble();
                                    change = Amount - Price;
                                    
                                    Reciept();
                                    
                                    
                                }
                                
                                
                                //Start of Delivery Method
                            }else if(Navi == 2){
                                
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("\t\t\t\tReciever Information");
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.print("\t\t\t\tFull Name: ");
                            scn.nextLine();
                            Fname = scn.nextLine();
                            System.out.print("\t\t\t\tContact Number");
                            Cont = scn.nextInt();
                            System.out.print("\t\t\t\tAddress: ");
                            Addresses = scn.nextLine();
                            
                            do{
                                
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("\t\t\t\tReciever Information");
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("\t\t\t\tFull Name: "  + Fname);
                            System.out.println("\t\t\t\tContact Number: +63" + Cont);
                            System.out.println("\t\t\t\tAddress: " + Addresses);
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.print("\t\t\t\tCheck Your Answer, Proceed(Y/N):  ");
                            PE = scn.next().toUpperCase().charAt(0);
                            
                            if(PE == 'N'){
                                    System.out.print("\t\t\t\tEnter the Part you want to edit(N(Name)/C(Contact)/A(Addresses)/B(Both): ");
                                    NoC = scn.next().toUpperCase().charAt(0);
                                    
                                    if(NoC == 'N'){
                                        
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("\t\t\t\tFull Name: ");
                                        Fname = scn.nextLine();   
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        
                                    }else if(NoC == 'C'){
                                        
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("\t\t\t\tContact Number");
                                        Cont = scn.nextInt();
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        
                                    }else if(NoC == 'A'){
                                        
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("\t\t\t\tAddress: ");
                                        Addresses = scn.nextLine();
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");

                                        
                                    }else if(NoC == 'B'){
                                    
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("\t\t\t\tFull Name: ");
                                        Fname = scn.nextLine(); 
                                        System.out.print("\t\t\t\tContact Number");
                                        Cont = scn.nextInt();
                                        System.out.print("\t\t\t\tAddress: ");
                                        Addresses = scn.nextLine();
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                    
                                        }
                                    }
                            }while(PE == 'N');
                            
                            
                            if(PE == 'Y'){
                                
                                   
                                    System.out.print("\t\t\t\tHow Many Copies: ");
                                    Copy = scn.nextDouble();
                                    Price = 155 *Copy;
                                    
                                    System.out.println("\t\t\t\tTotal: " + Price);
                                    System.out.println("\t\t\t\tEnter Amount paying: ");
                                    Amount = scn.nextDouble();
                                    change = Amount - Price;
                                    
                                    Reciept();
                                                     
                }                               
            } 
        }  
    } 
    
    public static void Reciept() throws Exception{
                                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\t\t\t\tPrinting of receipt, Please wait a moment........");
                                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                    
                                    System.out.println("\t\t\t\t\t\t\t\t==================================================");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|           Republic of the Philippines          |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|         PHILIPPINE STATISTICS AUTHORITY        |");
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|               OFFICIAL RECEIPT                 |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                         Amount |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(500);
                                    System.out.printf("\t\t\t\t\t\t\t\t| %-47s|\n", Fname);
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| COPY ISSUANCE - PSA CERTIFICATE                |");
                                    Thread.sleep(500);
                                    System.out.printf("\t\t\t\t\t\t\t\t| Unit cost: 155        Qty: %-20s|\n" , Copy);
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    if(Navi == 2){

                                    System.out.println("\t\t\t\t\t\t\t\t| Delivery Fee:                               "+ 50 +" |");
                                    }
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500); 
                                    System.out.printf("\t\t\t\t\t\t\t\t| TOTAL                                  %-3s |\n", Price );
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.printf("\t\t\t\t\t\t\t\t| AMOUNT TENDERED:                       %-3s |\n",Amount);
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.printf("\t\t\t\t\t\t\t\t| CHANGE                                 %-3s |\n" , change);
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|       INCLUDES DOCUMENTARY STAMP TAX OF        |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                 PHP30.00/COPY                  |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| Collecting officer:                            |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| Date - Time:                                   |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t==================================================");
    }
    
}
