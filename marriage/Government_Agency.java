
package marriage;

import java.util.*;
public class Government_Agency{

    static Birth B = new Birth();
    static Birth_Storage BStore = new Birth_Storage();
    static Map ques = new HashMap();
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
    public static void main(String[] args) throws Exception {
        Questions();
        BStore.PrintCopy();
        do{
        
        System.out.println();
        System.out.print("\t\t\t\t\t\t---------------------------------------------------------------------------------------------"
                + "\n\t\t\t\t\t\t\tGovernment Agency"
                + "\n\t\t\t\t\t\t\t[1] Registration "
                + "\n\t\t\t\t\t\t\t[2] Print Copy"
                + "\n"
                + "\nEnter designated number: ");
        
        int Purp = scn.nextInt();
        System.out.println("---------------------------------------------------------------------------------------------");
        
        switch(Purp){
            //Case 1 Start of registration 
            case 1:
                
                System.out.print("\t\t\t\t\tEnter Registration Certificate"
                        + "\n\t\t\t\t\t[1] Birth"
                        + "\n\t\t\t\t\t[2] Marriage"
                        + "\n\t\t\t\t\t[3] Death"
                        + "\n"
                        + "\n\t\t\t\t\tEnter purpose number: ");
                int ResPurp = scn.nextInt();
                
                
                if(ResPurp == 1){
                   
                   B.Question();
                   B.Display();
                                    
                   do{
                       
                   System.out.println("\t\t\t\t\t---------------------------------------------------------------------------------------------");
                   System.out.print("\t\t\t\t\tCheck your answers(if theres any mistake press 2 to edit)"
                            + "\n\t\t\t\t\t[1] Continue"
                            + "\n\t\t\t\t\t[2] Edit: ");
                   CoE = scn.nextInt();
                    
                   
                   if(CoE == 2){
                       
                       
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
                  
                        }
                        for(int i = 0; i < T8; T8--){
                        
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
                    
                     
                     BStore.setName(B.getFname());
                     BStore.BStore();
                     BStore.PrintCopy();
                     BStore.BS.add(B.getFname());
                     PrintCopy();
                }else if(ResPurp == 2){
                    Scanner scanner = new Scanner(System.in);

        // Wife's Information
        System.out.println("WIFE'S INFORMATION");
        MarriageCertificate wifeCertificate = inputMarriageCertificateInformation(scanner, "Wife");

        // Husband's Information
        System.out.println("\nHUSBAND'S INFORMATION");
        MarriageCertificate husbandCertificate = inputMarriageCertificateInformation(scanner, "Husband");

        // Display the information
        displayMarriageCertificates(wifeCertificate, husbandCertificate);

        // Edit specific line
        editSpecificLine(scanner, wifeCertificate, husbandCertificate);

        // Display the updated information
        displayMarriageCertificates(wifeCertificate, husbandCertificate);
        //MarriagePrintedForm();
        scanner.close();

                }
                else if(ResPurp == 3){

                }
                
            
                System.out.print("\t\t\t\t\tDo you wish to continue?"
                                   + "\n\t\t\t\t\t[1] New Transaction"
                                   + "\n\t\t\t\t\t[2] Exit Program");
                New = scn.nextInt(); 
                
                break;
                
                
                
                //Case two for Printing Copy of Existing file
            case 2:
                System.out.print("\t\t\t\t\tFirst Name of the Certificate: ");
                scn.nextLine();
                Fname = scn.nextLine();
                
                if(BStore.BS.contains(Fname)){
                    
                    BStore.setName(Fname);
                    System.out.println("\t\t\t\t\tExisting File: " + BStore.getName());
                    PrintCopy();
                    
                }else{
                    System.out.println("\t\t\t\t\tNone existing Certificate!");
                }
                
                
                System.out.print("\t\t\t\t\tDo you wish to continue?"
                                   + "\n\t\t\t\t\t[1] New Transaction"
                                   + "\n\t\t\t\t\t[2] Exit Program");
                            New = scn.nextInt(); 
                       
                break;
            }
        }while(New == 1);
        
    }
    
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

    }
    private static MarriageCertificate inputMarriageCertificateInformation(Scanner scanner, String personType) {
        MarriageCertificate certificate = new MarriageCertificate();

        System.out.print(personType + " First Name: ");
        certificate.setWifeName(scanner.nextLine());

        System.out.print(personType + " Middle Name: ");
        certificate.setWifeMiddle(scanner.nextLine());

        System.out.print(personType + " Last Name: ");
        certificate.setWifeLast(scanner.nextLine());

        System.out.print(personType + " Date of Birth (MM/DD/YYYY): ");
        certificate.setWifeDateOfBirth(scanner.nextLine());

        System.out.print(personType + " Age: ");
        certificate.setWifeAge(scanner.nextLine());
        //scanner.nextLine(); // Consume the newline character

        System.out.print(personType + " Place of Birth (City, Province): ");
        certificate.setWifePlaceOfBirth(scanner.nextLine());

        System.out.print(personType + " Sex(f/m): ");
        certificate.setWifeSex(scanner.nextLine());

        System.out.print(personType + " Citizenship: ");
        certificate.setWifeCitezenship(scanner.nextLine());

        System.out.print(personType + " Residence (Province): ");
        certificate.setWifeProvince(scanner.nextLine());

        System.out.print(personType + " Residence (City/Municipality): ");
        certificate.setWifeCity(scanner.nextLine());

        System.out.print(personType + " Residence (Barangay): ");
        certificate.setWifeBarangay(scanner.nextLine());

        System.out.print(personType + " Residence (House Number/Street): ");
        certificate.setWifeStreet(scanner.nextLine());

        System.out.print(personType + " Religion: ");
        certificate.setWifeReligion(scanner.nextLine());

        System.out.print(personType + " Civil status: ");
        certificate.setWifeStatus(scanner.nextLine());

        System.out.print(personType + " Full name of Father: ");
        certificate.setWifeFather(scanner.nextLine());

        System.out.print(personType + " Citizenship of Father: ");
        certificate.setWifeFatherCitizen(scanner.nextLine());

        System.out.print(personType + " Full name of Mother: ");
        certificate.setWifeMother(scanner.nextLine());

        System.out.print(personType + " Citizenship of Mother: ");
        certificate.setWifeMotherCitizen(scanner.nextLine());

        return certificate;
    }

    private static void displayMarriageCertificates(MarriageCertificate wifeCertificate, MarriageCertificate husbandCertificate) {
        System.out.println("\nWIFE'S INFORMATION");
        displayCertificateInformation(wifeCertificate);

        System.out.println("\nHUSBAND'S INFORMATION");
        displayCertificateInformation(husbandCertificate);
    }

    private static void displayCertificateInformation(MarriageCertificate certificate) {
        System.out.println("1a. First Name: " + certificate.getWifeFirst());
        System.out.println("1b. Middle Name: " + certificate.getWifeMiddle());
        System.out.println("1c. Last Name: " + certificate.getWifeLast());
        System.out.println("2. Date of Birth (MM/DD/YYYY): " + certificate.getWifeDateOfBirth());
        System.out.println("3. Age: " + certificate.getWifeAge());
        System.out.println("4. Place of Birth (City, Province): " + certificate.getWifePlaceOfBirth());
        System.out.println("5. Sex(f/m): " + certificate.getWifeSex());
        System.out.println("6. Citizenship: " + certificate.getWifeCitzen());
        System.out.println("7d. Residence (Province): " + certificate.getWifeProvince());
        System.out.println("7c. Residence (City/Municipality): " + certificate.getWifeCity());
        System.out.println("7b. Residence (Barangay): " + certificate.getWifeBarangay());
        System.out.println("7a. Residence (House Number/Street): " + certificate.getWifeStreet());
        System.out.println("8. Religion: " + certificate.getWifeReligion());
        System.out.println("9. Civil status: " + certificate.getWifeStatus());
        System.out.println("10. Full name of Father: " + certificate.getWifeFather());
        System.out.println("11. Citizenship of Father: " + certificate.getWifeFatherCitizen());
        System.out.println("12. Full name of Mother: " + certificate.getWifeMother());
        System.out.println("13. Citizenship of Mother: " + certificate.getWifeMotherCitizen());
    }

    private static void editSpecificLine(Scanner scanner, MarriageCertificate wifeCertificate, MarriageCertificate husbandCertificate) {
        System.out.print("\nEnter 'W' to edit wife's information, 'H' to edit husband's information, or 'N' for no edits: ");
        char choice = scanner.nextLine().toUpperCase().charAt(0);

        switch (choice) {
            case 'W':
                editCertificateInformation(scanner, wifeCertificate);
                break;
            case 'H':
                editCertificateInformation(scanner, husbandCertificate);
                break;
            default:
                System.out.println("No edits performed.");
        }
    }

    private static void editCertificateInformation(Scanner scanner, MarriageCertificate certificate) {
        System.out.print("Enter the line number you want to edit: ");
        String lineNumber = scanner.nextLine();
        //scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the new value: ");
        String newValue = scanner.nextLine();

        switch (lineNumber) {
            case "1a":
                certificate.setWifeName(newValue);
                break;
            case "1b":
                certificate.setWifeMiddle(newValue);
                break;
            case "1c":
                certificate.setWifeLast(newValue);
                break;
            case "2":
                certificate.setWifeDateOfBirth(newValue);
            case "3": 
                certificate.setWifeAge(newValue);
                break;
            case "4": 
                certificate.setWifePlaceOfBirth(newValue);
                break;
            case "5": 
                certificate.setWifeSex(newValue);
                break;
            case "6": 
                certificate.setWifeCitezenship(newValue);
                break;
            case "7d": 
                certificate.setWifeProvince(newValue);
                break;
            case "7c":
                certificate.setWifeCity(newValue);
                break;
            case "7b":
                certificate.setWifeBarangay(newValue);
                break;
            case "7a": 
                certificate.setWifeStreet(newValue);
                break;
            case "8": 
                certificate.setWifeReligion(newValue);
                break;
            case "9":
                 certificate.setWifeStatus(newValue);
                 break;
            case "10":
                 certificate.setWifeFather(newValue);
                 break;
            case "11": 
                 certificate.setWifeFatherCitizen(newValue);
                 break;
            case "12":
                 certificate.setWifeMother(newValue);
                 break;
            case "13": 
                 certificate.setWifeMotherCitizen(newValue);

            // Add cases for other lines as needed
            default:
                System.out.println("Invalid line number.");
        }
    }
    public static void PrintCopy() throws Exception{
                    System.out.print("Do you wish to get the copy of the Certificate?"
                               + "\n[1] Yes"
                               + "\n[2] No: ");
                       int YorN = scn.nextInt();
                       if(YorN == 1){
                           BStore.PrintCopy();
                           System.out.print("What kind of Method you want to choose"
                                   + "\n[1] Pick Up"
                                   + "\n[2] Delivery: ");
                           Navi = scn.nextInt();
                            
                           
                           if(Navi == 1){
                                System.out.println("-----------------------------------------------------");
                                System.out.print("Full Name of Reciever: ");
                                scn.nextLine();
                                Fname = scn.nextLine();
                                
                                System.out.print("Contact Number: +63");
                                Cont = scn.nextInt();
                                do{
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Please Check Pick up Information");
                                System.out.println("");
                                System.out.println("Name: " + Fname);
                                System.out.println("Contact Numebr: " + Cont);
                                System.out.println("");
                                System.out.println("Please be informed that the Payment fee for one(1) copy"
                                        + "\nof PSA Certificate is Php 155");
                                System.out.println(" ");
                                System.out.println("\t\t\t\t\t-----------------------------------------------------");
                                System.out.print("Make sure your detail is correct. Proceed(Y/N): ");
                                PE = scn.next().toUpperCase().charAt(0);
                                
                               if(PE == 'N'){
                                   
                                    System.out.println("Enter the Part you want to edit(N(Name)/C(Contact)/B(Both): ");
                                    NoC = scn.next().toUpperCase().charAt(0);
                                    
                                    if(NoC == 'N'){
                                        
                                        System.out.print("Full Name of Reciever: ");
                                        scn.nextLine();
                                        Fname = scn.nextLine();
                                
                             
                                    }else if(NoC == 'C'){
                                        
                                        System.out.print("Contact Number: +63");
                                        Cont = scn.nextInt();  
                                    }else if(NoC == 'B'){
                                        System.out.print("Full Name of Reciever: ");
                                        scn.nextLine();
                                        Fname = scn.nextLine();
                                
                                        System.out.print("Contact Number: +63");
                                        Cont = scn.nextInt();
                                        
                                        }
                                    }
                                }while(PE == 'N');
                               
                                if(PE == 'Y'){
                                
                                    System.out.print("How Many Copies: ");
                                    Copy = scn.nextDouble();
                                    Price = 155 *Copy;
                                    
                                    System.out.println("Total: " + Price);
                                    System.out.print("Enter Amount paying: ");
                                    Amount = scn.nextDouble();
                                    change = Amount - Price;
                                    
                                    Reciept();
                                    
                                    
                                }
                                
                                
                                //Start of Delivery Method
                            }else if(Navi == 2){
                                
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("\t\t\t\tReciever Information");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.print("Full Name: ");
                            scn.nextLine();
                            Fname = scn.nextLine();
                            System.out.print("Contact Number");
                            Cont = scn.nextInt();
                            System.out.print("Address: ");
                            Addresses = scn.nextLine();
                            
                            do{
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("\t\t\t\tReciever Information");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("Full Name: "  + Fname);
                            System.out.println("Contact Number: +63" + Cont);
                            System.out.println("Address: " + Addresses);
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("Check Your Answer, Proceed(Y/N):  ");
                            PE = scn.next().toUpperCase().charAt(0);
                            
                            if(PE == 'N'){
                                    System.out.println("Enter the Part you want to edit(N(Name)/C(Contact)/A(Addresses)/B(Both): ");
                                    NoC = scn.next().toUpperCase().charAt(0);
                                    
                                    if(NoC == 'N'){
                                        
                                        System.out.println("--------------------------------------------------------------------");
                                        System.out.print("Full Name: ");
                                        Fname = scn.nextLine();   
                                        System.out.println("--------------------------------------------------------------------");
                                        
                                    }else if(NoC == 'C'){
                                        
                                        System.out.println("--------------------------------------------------------------------");
                                        System.out.print("Contact Number");
                                        Cont = scn.nextInt();
                                        System.out.println("--------------------------------------------------------------------");
                                        
                                    }else if(NoC == 'A'){
                                        
                                        System.out.print("Address: ");
                                        Addresses = scn.nextLine();
                                        
                                    }else if(NoC == 'B'){
                                    
                                        System.out.println("--------------------------------------------------------------------");
                                        System.out.print("Full Name: ");
                                        Fname = scn.nextLine(); 
                                        System.out.print("Contact Number");
                                        Cont = scn.nextInt();
                                        System.out.print("Address: ");
                                        Addresses = scn.nextLine();
                                        System.out.println("--------------------------------------------------------------------");
                                    
                                        }
                                    }
                            }while(PE == 'N');
                            
                            
                            if(PE == 'Y'){
                                
                                   
                                    System.out.print("How Many Copies: ");
                                    Copy = scn.nextDouble();
                                    Price = 155 *Copy;
                                    
                                    System.out.println("Total: " + Price);
                                    System.out.println("Enter Amount paying: ");
                                    Amount = scn.nextDouble();
                                    change = Amount - Price;
                                    
                                    System.out.println("------------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tPrinting Reciept");
                                    System.out.println("------------------------------------------------------------------");
                                    Reciept();
                                                     
                }                               
            } 
        }  
    } 
    
    public static void Reciept() throws Exception{
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.println("\t\tPrinting of receipt, Please wait a moment........");
                                    System.out.println("-----------------------------------------------------------");
                                    
                                    System.out.println("\t\t\t\t\t==================================================");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t|           Republic of the Philippines          |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t|         PHILIPPINE STATISTICS AUTHORITY        |");
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t|               OFFICIAL RECEIPT                 |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t|                                         Amount |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t| "+  Fname + "                              |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t| COPY ISSUANCE - PSA CERTIFICATE                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t| Unit cost: 155        Qty:"+ Copy +"                     |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    if(Navi == 2){

                                    System.out.println("\t\t\t\t\t| Delivery Fee:                               "+ 50 +" |");
                                    }
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| TOTAL                                      " + Price + " |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| AMOUNT TENDERED                              "+ Amount +" |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| CHANGE                                       "+ change +" |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|         INCLUDES DOCUMENTARY STAMP TAX OF      |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                    PHP30.00/COPY               |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| Collecting officer:                            |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|    Date - Time:                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t==================================================");
    }
}
