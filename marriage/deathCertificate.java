package marriage;

import java.util.Scanner;

public class deathCertificate{
	private static String firstName;
	private static String middleName;
	private static String lastName;
	private static String sex;
	private static String dateOfDeath;
	private static String dateOfBirth;
	private static String ageAtDeath;
	private static String placeOfDeath;
	private static String civilStatus;
	private static String religion;
	private static String citizenship;
	private static String occupation;
	private static String residence;
	private static String fatherName;
	private static String motherName;
	private static String ageOfMother;
	private static String lengthOfPreg;
	private static String typeOfbirth;
	private static String multiBirth;
	private static String causeOfDeath;
	private static String causeD;
	private static String maternalCondition;
	private static String cause;
	private static String deathExternal;
	private static String DExternal;
	private static String autopsy;
	private static String attendant;
	private static String duration;
	private static String mdelivery;
	private boolean ok = false;
	//Setter
	public void setfirstName(String First) {
		this.firstName = First;
	}
	public void setmiddleName(String Middle ) {
		this.middleName = Middle;
	}
	public void setlastName(String Last) {
	this.lastName = Last;
	}
	public void setsex(String Sex) {
		this.sex = Sex;
	}
	public void setdateOfDeath(String Death) {
		this.dateOfDeath = Death;
	}
	public void setdateOfBirth(String Birth) {
		this.dateOfBirth = Birth;
	}
	public void setageAtDeath(String age) {
		this.ageAtDeath = age;
	}
	public void setplaceOfDeath(String place) {
		this.placeOfDeath = place;
	}
	public void setcivilStatus(String civStatus) {
		this.civilStatus = civStatus;
	}
	public void setreligion(String religion ) {
		this.religion = religion;
	}
	public void setcitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public void setoccupation(String occup) {
		this.occupation = occup;
	}
	public void setresidence(String res) {
		this.residence = res;
	}
	public void setfatherName(String fathername) {
		this.fatherName = fathername;
	}
	public void setmotherName(String mothername) {
		this.motherName = mothername;
	}
	public void setageOfMother(String AgeMother) {
		this.ageOfMother = AgeMother;
	}
	public void setmdelivery(String methodDelivery) {
		this.mdelivery = methodDelivery;
	}
	public void setlengthOfpreg(String Length) {
		this.lengthOfPreg = Length;
	}
	public void settypeOfbirth(String Type) {
		this.typeOfbirth = Type;
	}
	public void setmultiBirth(String MultiBirth) {
		this.multiBirth = MultiBirth;
	}
	public void setcauseOfdeath(String CauseDeath) {
		this.causeOfDeath = CauseDeath;
	}
	public void setcauseD(String CauseDeath) {
		this.causeD = CauseDeath;
	}
	public void setmaternalCondition(String maternalCon) {
		this.maternalCondition = maternalCon;
	}
	public void setDExternal(String DExternal) {
		this.DExternal = DExternal;
	}
	public void setcause(String CauseD) {
		this.cause = CauseD;
	}
	public void setdeathExternal(String DeathEx) {
		this.deathExternal = DeathEx;
	}
	public void setautopsy(String Autopsy) {
		this.autopsy = autopsy;
	}
	public void setattendant(String Attendant) {
		this.attendant = attendant;
	}
	public void setduration (String Duration) {
		this.duration = Duration;
	}

	
	//Getter
	public String getfirstName() {
		return firstName;
	}
	public String getmiddleName() {
		return middleName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getsex() {
		return sex;
	}
	public String getdateOfDeath() {
		return dateOfDeath;
	}
	public String getdateOfBirth() {
		return dateOfBirth;
	}
	public String getageAtDeath() {
		return ageAtDeath;
	}
	public String getplaceOfDeath() {
		return placeOfDeath;
	}
	public String getcivilStatus() {
		return civilStatus;
	}
	public String getreligion() {
		return religion;
	}
	public String getcitizenship() {
		return citizenship;
	}
	public String getoccupation() {
		return occupation;
	}
	public String getresidence() {
		return residence;
	}
	public String getfatherName() {
		return fatherName;
	}
	public String getmotherName() {
		return motherName;
	}
	public String getageOfmother() {
		return ageOfMother;
	}
	public String getmdelivery() {
		return mdelivery;
	}
	public String getlengthOfPreg() {
		return lengthOfPreg;
	}

	public String gettypeOfbirth() {
		return typeOfbirth;
	}
	public String getmultiBirth() {
		return multiBirth;
	}
		public String getcauseOfDeath() {
		return causeOfDeath;
	}
	public String getcauseD() {
		return causeD;
	}
	public String getmaternalCondition() {
		return maternalCondition;
	}
	public String getDExternal() {
		return DExternal;
	}
	public String getcause() {
		return cause;
	}
	public String getdeathExternal() {
		return deathExternal;
	}
	public String getautopsy() {
		return autopsy;
	}
	public String getattendant() {
		return attendant;
	}
	public String getduration() {
		return duration;
	}
	
	//Question
	public void question() {
		Scanner scn = new Scanner (System.in);
		
		 System.out.print("\n\t\t\t\t\t1a. First Name: ");
	       firstName = scn.nextLine();

	        System.out.print("\t\t\t\t\t1b. Middle Name: ");
	         middleName = scn.nextLine();

	        System.out.print("\t\t\t\t\t1c. Last Name: ");
	         lastName = scn.nextLine();
                 do{
	        System.out.print("\t\t\t\t\t2.Sex (M/F): ");
	         sex = scn.nextLine();
                    if(sex.equalsIgnoreCase("f") ||  sex.equalsIgnoreCase("m")){
                        break;
                    }
					else{
						System.out.println("\t\t\t\t\tInvalid Input!");
					}
                 }while(true);

			boolean deathCorrection = true;
            while(deathCorrection){
	        System.out.print("\t\t\t\t\t3. Date of Death (DD/MM/YYYY): ");
	        dateOfDeath = scn.nextLine();
		      if(!dateOfDeath.matches("\\d{2}/\\d{2}/\\d{4}")) {
				System.out.println("\t\t\t\t\tInvalid Input!");
			   deathCorrection = true;
		       }
			   else{
				deathCorrection = false;
			   }
			}
	        boolean birthCorrection = true;
            while(birthCorrection){
	        System.out.print("\t\t\t\t\t4. Date of Birth (DD/MM/YYYY): ");
	        dateOfBirth = scn.nextLine();
		      if(!dateOfBirth.matches("\\d{2}/\\d{2}/\\d{4}")) {
				System.out.println("\t\t\t\t\tInvalid Input!");
			   birthCorrection = true;
		       }
			  else{
				birthCorrection = false;
			   }
			}
			boolean ageDeath = true;
			 while(ageDeath){
				System.out.print("\t\t\t\t\t5. Age at the time of death: ");
				ageAtDeath = scn.nextLine(); 
		      if(!ageAtDeath.matches("[0-9]|[0-9]{2}")) {
				System.out.println("\t\t\t\t\tInvalid Input!");
			   ageDeath = true;
		       }
			   else{
				ageDeath= false;
			   }
			}
			
	       
	        
	        System.out.print("\t\t\t\t\t6. Place of Death: ");
	        placeOfDeath = scn.nextLine();

	        System.out.print("\t\t\t\t\t7. Civil Status: ");
	        civilStatus = scn.nextLine();

	        System.out.print("\t\t\t\t\t8. Religion: ");
	         religion = scn.nextLine();

	        System.out.print("\t\t\t\t\t9. Citizenship: ");
	         citizenship = scn.nextLine();

	        System.out.print("\t\t\t\t\t10. Occupation: ");
	        occupation = scn.nextLine();

	        System.out.print("\t\t\t\t\t11. Residence: ");
	        residence = scn.nextLine();

	        System.out.print("\t\t\t\t\t12. Name of Father (First, Middle, Last): ");
	         fatherName = scn.nextLine();

	        System.out.print("\t\t\t\t\t13. Name of Mother (First, Middle, Last): ");
	         motherName = scn.nextLine();
	        
	     //Medical Certificate
        System.out.println("\n\t\t\t------------------------------------------------------------------------------------------------------------------------");
           System.out.println("\n\t\t\t\t\t\t\t\t\tMEDICAL CERTIFICATE");
        System.out.println("\n\t\t\t------------------------------------------------------------------------------------------------------------------------");
           System.out.println("\n\t\t\t\t\t\tIf the deceased is ages 0-7 days fill out number 14-19a. If not, leave blank.");
        System.out.println("\n\t\t\t------------------------------------------------------------------------------------------------------------------------");
            if(ageAtDeath.matches("[0-7]Days")){

	        System.out.print("\t\t\t\t\t14. Age of Mother: ");
	        ageOfMother = scn.next();
           
	        System.out.print("\t\t\t\t\t15. Method of delivery(Normal spontaneus vertex, if others, specify): ");
	        mdelivery = scn.next();
          

	        System.out.print("\t\t\t\t\t16. Length of pregnancy(In completed weeks):");
	         lengthOfPreg = scn.next();
           
           System.out.print("\t\t\t\t\t17. Type of birth (Single, Twin, Triplet, others.): ");
           typeOfbirth = scn.nextLine();
           scn.nextLine();
           System.out.print("\t\t\t\t\t18a. If multiple birth child was(first, Second, Third, Others): ");
           multiBirth = scn.nextLine();
           System.out.print("\t\t\t\t\t19a. Cause of Death: ");
           causeOfDeath = scn.nextLine();
            }else{
            System.out.println("\t\t\t\t\t14. Age of Mother: ");
            System.out.println("\t\t\t\t\t15. Method of delivery(Normal spontaneus vertex, if others, specify): ");
            System.out.println("\t\t\t\t\t16. Length of pregnancy(In completed weeks):");
            System.out.println("\t\t\t\t\t17. Type of birth (Single, Twin, Triplet, others.): ");
                }

                 System.out.print("\n\t\t\t------------------------------------------------------------------------------------------------------------------------\n");
           System.out.println("\n\t\t\t\t\tIf the deceased is female aged 15-49 years days fill out number 19-19c. If not, leave blank.");
                 System.out.print("\n\t\t\t------------------------------------------------------------------------------------------------------------------------\n");
          if(ageAtDeath.matches("[2-4][0-9]|[1-4][5-9]" ) && sex.equalsIgnoreCase("f")) {
              ok = true;
           System.out.print("\t\t\t\t\t19b. Cause of Death: ");
           causeD = scn.nextLine();
           
        //Maternal Condition
           System.out.println("\t\t\t\t\t19c. Maternal Condition: ");
           System.out.println("\t\t\t\t\t[a] Pregnant, not labour");
           System.out.println("\t\t\t\t\t[b] Pregnat, in labour");
           System.out.println("\t\t\t\t\t[c] Less than 42 days after delivery");
           System.out.println("\t\t\t\t\t[d] 42 days t0 1 year after delivery");
           System.out.println("\t\t\t\t\t[e] None of the choices:");
           maternalCondition = scn.nextLine();  
           if(maternalCondition.equalsIgnoreCase("a")){
               maternalCondition = "\t\t\t\t\tPregnat, not labour";
               System.out.println("\t\t\t\t\tPregnat, not labour");
           }else if(maternalCondition.equalsIgnoreCase("b")){
            maternalCondition = "\t\t\t\t\tPregnat, in labour";
               System.out.println("\t\t\t\t\tPregnat, in labour");
            
        }else if(maternalCondition.equalsIgnoreCase("c")){
            maternalCondition = "\t\t\t\t\tLess than 42 days after delivery";
               System.out.println("\t\t\t\t\tLess than 42 days after delivery");
        }else if (maternalCondition.equalsIgnoreCase("d")){
            maternalCondition = "\t\t\t\t\t42 days t0 1 year after delivery";
               System.out.println("\t\t\t\t\t42 days t0 1 year after delivery");
        }else if (maternalCondition.equalsIgnoreCase("e")){
            maternalCondition = scn.nextLine();
        }else{
               System.out.println("\t\t\t\t\tInvalid input! ");
        }  
           System.out.print("\t\t\t\t\t19d. Death by External causes: ");
       	   System.out.println("\t\t\t\t\t[a] Manner of death(Homicide, Suicide, Accident, Legal Intervention, others) ");
       	   System.out.println("\t\t\t\t\t[b] Place of Occurance of External Cause(e.g. home, farm, factory, street, sea, others)");
           
           
       	   DExternal = scn.next().toUpperCase();
       	switch(DExternal) {
   		case"A":
   			System.out.print("\t\t\t\t\t[a] Manner of death(Homicide, Suicide, Accident, Legal Intervention, others.): ");
   			scn.next();
   			break;
   		case"B":
       		System.out.print("\t\t\t\t\t[b] Place of Occurance of External Cause(e.g. home, farm, factory, street, sea, oothers.): ");
   			scn.next();
   			break;
                
          }
    }else{
              
            System.out.println("\t\t\t\t\t19b. Cause of Death: ");
            System.out.println("\t\t\t\t\t19c. Maternal Condition:");
            System.out.println("\t\t\t\t\t[a] Pregnant, not labour");
            System.out.println("\t\t\t\t\t[b] Pregnat, in labour");
            System.out.println("\t\t\t\t\t[c] Less than 42 days after delivery");
            System.out.println("\t\t\t\t\t[d] 42 days t0 1 year after delivery");
            System.out.println("\t\t\t\t\t[e] None of the choices:");
                 System.out.print("\n\t\t\t------------------------------------------------------------------------------------------------------------------------\n");
            System.out.print("\t\t\t\t\t19d. Death by External causes:\n");
            System.out.println("\t\t\t\t\t[a] Manner of death(Homicide, Suicide, Accident, Legal Intervention, others) ");
            System.out.println("\t\t\t\t\t[b] Place of Occurance of External Cause(e.g. home, farm, factory, street, sea, others)");
          }
                 System.out.print("\n\t\t\t------------------------------------------------------------------------------------------------------------------------\n");
           System.out.println("\n\t\t\t\t\tIf the deceased ages 8 days and over fill out 19d -19e. If not, leave it blank.");
                 System.out.print("\n\t\t\t------------------------------------------------------------------------------------------------------------------------\n");
            if(ok == false && Integer.parseInt(ageAtDeath) > 8){
           System.out.print("\t\t\t\t\t19e. Cause of Death: ");
           cause = scn.next();
 //DeathExternal Option
           System.out.print("\t\t\t\t\t19f. Death by external causes: ");
   		System.out.println("\t\t\t\t\t[a] Manner of death(Homicide, Suicide, Accident, Legal Intervention, others) ");
   		System.out.println("\t\t\t\t\t[b] Place of Occurance of External Cause(e.g. home, farm, factory, street, sea, others)");
   		  deathExternal = scn.next().toUpperCase();  
            
   		switch(deathExternal) {
   		case"A":
   			System.out.print("\t\t\t\t\t[a] Manner of death(Homicide, Suicide, Accident, Legal Intervention, others.): ");
   			scn.next();
   			break;
   		case"B":
       		System.out.print("\t\t\t\t\t[b] Place of Occurance of External Cause(e.g. home, farm, factory, street, sea, others.): ");
   			scn.next();
   			break;
   		}
            }else{
                
                System.out.print("\t\t\t\t\t19e. Cause of Death: ");
                System.out.print("\t\t\t\t\t19f. Death by external causes:\n");
   		System.out.println("\t\t\t\t\t[a] Manner of death(Homicide, Suicide, Accident, Legal Intervention, others) ");
   		System.out.println("\t\t\t\t\t[b] Place of Occurance of External Cause(e.g. home, farm, factory, street, sea, others)");
            }
            

           System.out.print("\t\t\t\t\t20.Autopsy(Y/N): ");
   		 autopsy = scn.next();
   	//attendant option
   		System.out.println("\t\t\t\t\t21a. Attendant: ");
			System.out.println("\t\t\t\t\t[1] Private Physician");
			System.out.println("\t\t\t\t\t[2] Public Health Officer");
			System.out.println("\t\t\t\t\t[3] Hospital Authority");
			System.out.println("\t\t\t\t\t[4] None");
			System.out.println("\t\t\t\t\t[5] Others(Specify): ");
   		 attendant = scn.next();
   		
   		switch(attendant) {
                    case "1":
   			System.out.println("\t\t\t\t\t1. Private Physician");
   			break;
   		case "2":
   			System.out.println("\t\t\t\t\t2. Public Health Officer");
   			break;
   		case "3":
   			System.out.println("\t\t\t\t\t3. Hospital Authority");
   			break;
   		case "4":
   			System.out.println("\t\t\t\t\t4. None");
   			break;
   		case "5":
   			System.out.println("\t\t\t\t\t5. Others(Specify): ");
   			scn.next();
   			break;
   		}
   		System.out.println("\t\t\t\t\t21b. If attendant press [Y] the state duration(MM/DD/YY), else [N] ");
   		duration = scn.next();
   		if (duration.equalsIgnoreCase("Y")) {
     			System.out.print("From: ");
  			 scn.nextLine();
  			 scn.next();
   			System.out.print("To: ");
   			scn.next();
   		}else if (duration.equalsIgnoreCase("N")) {
   			System.out.println("No");
   			
   		}
            
 
	}
	//Display for Death
	public void display() {
		 System.out.println("\t\t\t\t\t1a. First Name: " + firstName);
	         System.out.println("\t\t\t\t\t1b. Middle Name: "  +middleName);
	         System.out.println("\t\t\t\t\t1c. Last Name: "  + lastName);
	         System.out.println("\t\t\t\t\t2.Sex (M/F): " + sex);
	         System.out.println("\t\t\t\t\t3. Date of Death (DD/MM/YYYY): " + dateOfDeath);
		 System.out.println("\t\t\t\t\t4. Date of Birth (DD/MM/YYYY): " + dateOfBirth);
		 System.out.println("\t\t\t\t\t5. Age at the time of death: " + ageAtDeath);
		 System.out.println("\t\t\t\t\t6. Place of Death: " + placeOfDeath);
		 System.out.println("\t\t\t\t\t7. Civil Status: " + civilStatus);
		 System.out.println("\t\t\t\t\t8. Religion: " + religion);
		 System.out.println("\t\t\t\t\t9. Citizenship: " + citizenship);
		 System.out.println("\t\t\t\t\t10. Occupation: " + occupation);
		 System.out.println("\t\t\t\t\t11. Residence: " + residence);
		 System.out.println("\t\t\t\t\t12. Name of Father (First, Middle, Last): " + fatherName);
		 System.out.println("\t\t\t\t\t13. Name of Mother (First, Middle, Last): " + motherName );
		 System.out.println("\t\t\t\t\t14. Age of Mother: " + ageOfMother);
		 System.out.println("\t\t\t\t\t15. Method of delivery(Normal spontaneus vertex, if others, specify): " + mdelivery);
		 System.out.println("\t\t\t\t\t16. Length of pregnancy(In completed weeks):" + lengthOfPreg);
		 System.out.println("\t\t\t\t\t17. Type of birth (Single, Twin, Triplet, etc.): " + typeOfbirth);
		 System.out.println("\t\t\t\t\t18. If multiple birth child was(first, Second, Third, Others):" + multiBirth);
		 System.out.println("\t\t\t\t\t19a. Cause of Death: " + causeOfDeath);
		 System.out.println("\t\t\t\t\t19b. Cause of Death: " + causeD);
                 System.out.println("\t\t\t\t\t19c. Maternal Condition:" + maternalCondition);
                 System.out.println("\t\t\t\t\t19d. Death by External causes:" + DExternal);
                 System.out.println("\t\t\t\t\t19e. Cause of Death: " + cause);
		 System.out.println("\t\t\t\t\t21a. Attendant: " + attendant);
		 System.out.println("\t\t\t\t\t21b. If attendant press [Y] the state duration(MM/DD/YY), else [N] " + duration);
			
	}
	
}