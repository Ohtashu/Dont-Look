
package marriage;

import java.util.*;
public class Government_Agency{
    
    static deathCertificate dc = new deathCertificate();
	static int ContinueOrEdit;
    
    
    
    //Sepatator
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
                    ques();
                    Scanner scn = new Scanner (System.in);
                    //printcopy();
                    //Continue Or Edit
                        dc.question();
                        dc.display();
                        
                         do{
                             
                            System.out.println("----------------------------------------------------------------------------------------------------");
                            System.out.print("Check your answers(if theres any mistake press 2 to edit)"
                                      + "\n[1] Continue"
                                      + "\n[2] Edit: ");
                             
                              ContinueOrEdit = scn.nextInt();
                             
                             
                             if(ContinueOrEdit == 2){
                          
                           System.out.print("Enter the Code Value of that question example(1a)"
                                          + "\nif more than 1 each number and value should be seprate by space: ");
                                  scn.nextLine();
                                  String edit = scn.nextLine().toLowerCase();
                                  
                                  Nume = edit.split(" ");
                                  
                                  for(String a: Nume){
                                      NumE.add(a);
                                      NumEE.add(a);
                                      NumEEE.add(a);
                            
                                  }
                                  for(int i = 0; i < NumE.size(); i++){
                                      
                                  
                                  System.out.print(NumEEE.poll()+ " " +ques.get(NumE.poll()));
                                  String change = scn.nextLine();
                                  switch(NumEE.poll()) {
                                  case "1A":
                                      dc.setfirstName(change);
                                      break;
                                  case"1b":
                                      dc.setmiddleName(change);
                                      break;
                                  case"1c":
                                      dc.setlastName(change);
                                      break;
                                  case"2":
                                      dc.setsex(change);
                                      break;
                                  case"3":
                                      dc.setdateOfDeath(change);
                                      break;
                                  case"4":
                                      dc.setdateOfBirth(change);
                                      break;
                                  case"5":
                                      dc.setageAtDeath(Integer.parseInt(change));
                                      break;
                                  case"6":
                                      dc.setplaceOfDeath(change);
                                      break;
                                  case"7":
                                      dc.setcivilStatus(change);
                                      break;
                                  case"8":
                                      dc.setreligion(change);
                                      break;
                                  case"9": 
                                      dc.setcitizenship(change);
                                      break;
                                  case"10":
                                      dc.setoccupation(change);
                                      break;
                                  case"11":
                                      dc.setresidence(change);
                                      break;
                                  case"12":
                                      dc.setfatherName(change);
                                      break;
                                  case"13":
                                      dc.setmotherName(change);
                                      break;
                                  case "14":
                                      dc.setageOfMother(Integer.parseInt(change));
                                      break;
                                  case"15":
                                      dc.setmdelivery(change);
                                      break;
                                  case"16":
                                      dc.setlengthOfpreg(change);
                                      break;
                                  case"17":
                                      dc.settypeOfbirth(change);
                                      break;
                                  case"18":
                                      dc.setmultiBirth(change);
                                      break;
                                  case"19a":
                                      dc.setcauseOfdeath(change);
                                      break;
                                  case"19b":
                                      dc.setcauseD(change);
                                      break;
                                  case"19c":
                                      dc.setmaternalCondition(change);
                                      break;
                                  case"19d":
                                      dc.setDExternal(change);
                                      break;
                                  case"19e":
                                      dc.setcause(change);
                                  case"19f":
                                      dc.setdeathExternal(change);
                                      break;
                                  case"20":
                                      dc.setautopsy(change);
                                      break;
                                  case"21":
                                      dc.setattendant(change);
                                      break;
                                      }
                                  }     
                                  dc.display();
                                      }         
                             
                              }while(ContinueOrEdit == 2);
                           printcopy();

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
    public static void printcopy() {
		System.out.println("====================================================================================================");
		System.out.println("\t\t\t\t\tRepublic of the Philippines\n\t\t\t\tOFFICE OF THE CIVIL REGISTRAR GENERAL\n\t\t\t\t\tCERTIFICATE OF DEATH");
	    System.out.println("====================================================================================================");
	    System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("1. Name\t\t  (First)\t    (Middle)\t    (last)\t    |2. SEX (Male/Female)");
	
		System.out.printf("\t\t   %-18s%-16s%-15s|   %-16s", dc.getfirstName(),dc.getmiddleName(), dc.getlastName(), dc.getsex());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("3. DATE OF DEATH\t\t    |4. DATE OF BIRTH\t\t    |5. AGE AT THE TIME OF DEATH");
	    System.out.printf("   %-33s|   %-28s|   %-26s", dc.getdateOfDeath(), dc.getdateOfBirth(), dc.getageAtDeath());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("6. PLACE OF DEATH\t\t\t\t\t\t    |7. CIVIL STATUS" );
        System.out.printf("\t\t\t%-44s|   %-20s",dc.getplaceOfDeath(),dc.getcivilStatus());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("8. RELIGION/RELIGIOUS SECT\t    |9.CITIZENSHIP\t\t    |10. RESIDENCE");
	    System.out.printf("   %-33s|  %-29s|    %-19s",dc.getreligion(), dc.getcitizenship(),dc.getresidence());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("11. OCCUPATION\t\t\t    |12. NAME OF FATHER\t\t    |13. MAIDEN NAME OF MOTHER");
	    System.out.printf("    %-32s|%-31s|%-28s",dc.getoccupation(),dc.getfatherName(), dc.getmotherName());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t     MEDICAL CERTIFICATE");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("FOR CHILDREN AGE 0 TO 7 DAYS");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.print("14. AGE OF MOTHER: ");
	    System.out.println(dc.getageOfmother());
	    System.out.print("15. METHOD OF DELIVERY: ");
	    System.out.println(dc.getmdelivery());
	    System.out.print("16. LENGTH OF PREGNANCY WEEKS: ");
	    System.out.println(dc.getlengthOfPreg());
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.print("17. TYPE OF BIRTH: ");
	    System.out.println(dc.gettypeOfbirth());
	    System.out.print("18. IF MULTIPLE BIRTH CHILD WAS: ");
	    System.out.println(dc.getmultiBirth());
	    System.out.print("19a. CAUSE OF DEATH: ");
	    System.out.println(dc.getcauseOfDeath());
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("IF THE DECEASED IS FEMALE AGED 15-49 YEARS OLD ");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.print("19b. CAUSE OF DEATH: ");
	    System.out.println(dc.getcauseD());
	    System.out.print("19c. MATERNAL CONDITION: ");
	    System.out.println(dc.getmaternalCondition());
	    System.out.println("a. MANNER OF DEATH: ");
		System.out.println("b. PLACE OF OCCURANCE:");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("IF THE DECEASED IS AGED  8 DAYS AND OVER ");
        System.out.println("----------------------------------------------------------------------------------------------------\n");
	    System.out.print("19e. CAUSE OF DEATH: " );
	    System.out.println(dc.getcause()+"\t\t\t\t");
	    System.out.println("19f. DEATH BY EXTERNAL CAUSES: \t\t\t\t|20. AUTOPSY");
	    System.out.println("a. MANNER OF DEATH: \t\t\t\t\t|    "+ dc.getautopsy());
	    System.out.println("b. PLACE OF OCCURANCE: \t\t\t\t\t|");
	    System.out.println(dc.getdeathExternal());
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("21a. ATTENDANT \t\t\t\t\t\t|21b. IF ATTENDANT, STATE DURATION(MM/DD/YYYY)");
	    System.out.printf("     %-51s|     %-30s ", dc.getattendant(),dc.getduration());
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("22. CERTIFICATION OF DEATH\n[] I hereby certify that the foregoing particulars are correct as near as same can be"
	    					+ "\nassertained ascertained and i futher certify that I [] have not attended the deceased"
	    					+ "\nand that death to occured at __________am/pm on the date of death specified above. ");
	    System.out.println("Signature _______________\t\t|REVIEWED BY ");
	    System.out.println("Name in Print _______________\t\t|	__________________________________");
	    System.out.println("Title or Position ________________\t|  Signature Over Printed Name of Health Officer");
	    System.out.println("Adresses ________________\t\t	   ________________________");
	    System.out.println("_________________Date__________\t\t|		     Date");
        System.out.println("----------------------------------------------------------------------------------------------------\n");
	    System.out.println("23. CORPSE DISPOSAL\t\t\t|24a. BURIAL/CREMATION PERMIT\t|24b. TRANSFER PERMIT");
	    System.out.println("\t\t\t\t\t|Number ___________\t\t|Number __________");
	    System.out.println("\t\t\t\t\t|Date Issued __________\t\t|Date Issued ___________");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("25. NAME AND ADRESS OF CEMETERY OR CREMATORY");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("26. CERTIFICATION OF INFORMANT\t\t\t|"
	    					+ "\nI hereby certify that all information\t\t|"
	    					+ "\nsupplied are true and correct to my\t\t|27. PREPARED BY"
	    					+ "\nown knowledge\t\t\t\t\t|Signature ____________");
	    System.out.println("Signature __________\t\t\t\t|Name in Print __________");
	    System.out.println("Name in Print __________\t\t\t|Address ___________");
	    System.out.println("Address __________\t\t\t\t|Date __________");
	    System.out.println("Date __________");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("28. RECEIVED BY\t\t\t\t\t|29. REGISTERED AT THE OFFICE OF THE CIVIL REGISTRAR");
	    System.out.println("Signature __________\t\t\t\t|Signature __________");
	    System.out.println("Name in Print __________\t\t\t|Name in Print __________");
	    System.out.println("Address __________\t\t\t\t|Address ___________");
	    System.out.println("Date __________\t\t\t\t\t|Date __________");
	
	}
	
	public static void ques() {
		ques.put("1a", "First Name: ");
		ques.put("1b", "Middle Name: ");
		ques.put("1c", "Last Name: ");
		ques.put("2", "Sex (M/F): ");
		ques.put("3", " Date of Death (DD/MM/YYYY): ");
		ques.put("4", " Date of Birth (DD/MM/YYYY): ");
		ques.put("5", " Age at the time of death: ");
		ques.put("6", " Place of Death: ");
		ques.put("7", " Civil Status: ");
		ques.put("8", " Religion: ");
		ques.put("9"," Citizenship: ");
		ques.put("10", " Occupation: ");
		ques.put("11", " Residence: ");
		ques.put("12", " Name of Father (First, Middle, Last): ");
		ques.put("13", " Name of Mother (First, Middle, Last): ");
		ques.put("14", " Age of Mother: ");
		ques.put("15", " Method of delivery(Normal spontaneus vertex, if others, specify): ");
		ques.put("16", " Length of pregnancy(In completed weeks):");
		ques.put("17", " Type of birth (Single, Twin, Triplet, etc.): ");
		ques.put("18", " If multiple birth child was(first, Second, Third, Others):");
		ques.put("19a", " Cause of Death: ");
		ques.put("19b", " Cause of Death: ");
		ques.put("19c", " Maternal Condition:");
		ques.put("19e", " Cause of Death: ");
		ques.put("21a", " Attendant: ");
		ques.put("21b", " If attendant press [Y] the state duration(MM/DD/YY), else [N] ");
		
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
