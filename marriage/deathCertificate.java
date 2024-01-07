package marriage;

import java.util.Scanner;

public class DeathCertificate {
	private String firstName;
	private String middleName;
	private String lastName;
	private String sex;
	private String dateOfDeath;
	private String dateOfBirth;
	private int ageAtDeath;
	private String placeOfDeath;
	private String civilStatus;
	private String religion;
	private String citizenship;
	private String occupation;
	private String residence;
	private String fatherName;
	private String motherName;
	private int ageOfMother;
	private String lengthOfPreg;
	private String typeOfbirth;
	private String multiBirth;
	private String causeOfDeath;
	private String causeD;
	private String maternalCondition;
	private String cause;
	private String deathExternal;
	private String DExternal;
	private String autopsy;
	private int attendant;
	private String duration;
	private String mdelivery;
	
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
	public void setageAtDeath(int age) {
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
	public void setageOfMother(int AgeMother) {
		this.ageOfMother = AgeMother;
	}
	public void setmdelivery(String methodDelivery) {
		this.setmdelivery(methodDelivery);
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
	public int getageAtDeath() {
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
	public int getageOfmother() {
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
	public int getattendant() {
		return attendant;
	}
	public String getduration() {
		return duration;
	}
	
	//Question
	public void question() {
		Scanner scn = new Scanner (System.in);
		
		 System.out.print("1a. First Name: ");
	       firstName = scn.nextLine();

	        System.out.print("1b. Middle Name: ");
	         middleName = scn.nextLine();

	        System.out.print("1c. Last Name: ");
	         lastName = scn.nextLine();

	        System.out.print("2.Sex (M/F): ");
	         sex = scn.nextLine();

	        System.out.print("3. Date of Death (DD/MM/YYYY): ");
	       dateOfDeath = scn.nextLine();

	        System.out.print("4. Date of Birth (DD/MM/YYYY): ");
	        dateOfBirth = scn.nextLine();

	        System.out.print("5. Age at the time of death: ");
	        int ageAtDeath = scn.nextInt();
	        scn.nextLine(); 
	        
	        System.out.print("6. Place of Death: ");
	        placeOfDeath = scn.nextLine();

	        System.out.print("7. Civil Status: ");
	        civilStatus = scn.nextLine();

	        System.out.print("8. Religion: ");
	         religion = scn.nextLine();

	        System.out.print("9. Citizenship: ");
	         citizenship = scn.nextLine();

	        System.out.print("10. Occupation: ");
	        occupation = scn.nextLine();

	        System.out.print("11. Residence: ");
	        residence = scn.nextLine();

	        System.out.print("12. Name of Father (First, Middle, Last): ");
	         fatherName = scn.nextLine();

	        System.out.print("13. Name of Mother (First, Middle, Last): ");
	         motherName = scn.nextLine();
	        
	     //Medical Certificate
           System.out.println("-------------------------------------------------------------------------------------\n");
           System.out.println("MEDICAL CERTIFICATE\n");
           System.out.println("-------------------------------------------------------------------------------------\n");
           System.out.println("If the deceased is ages 0-7 years days fill out number 14-19a. If not, leave blank.\n");
           System.out.println("-------------------------------------------------------------------------------------");


	        System.out.print("14. Age of Mother: ");
	        ageOfMother = scn.nextInt();
           
	        System.out.print("15. Method of delivery(Normal spontaneus vertex, if others, specify): ");
	        mdelivery = scn.next();
          

	        System.out.print("16. Length of pregnancy(In completed weeks):");
	         lengthOfPreg = scn.next();
           
           System.out.print("17. Type of birth (Single, Twin, Triplet, etc.): ");
           typeOfbirth = scn.nextLine();
           scn.nextLine();
           System.out.print("18a. If multiple birth child was(first, Second, Third, Others): ");
           multiBirth = scn.nextLine();
           System.out.print("19a. Cause of Death: ");
           causeOfDeath = scn.nextLine();
           System.out.println("-------------------------------------------------------------------------------------\n");
           System.out.println("If the deceased is ages 15-49 years days fill out number 19-19c. If not, leave blank.\n");
           System.out.println("-------------------------------------------------------------------------------------");
           
           System.out.print("19b. Cause of Death: ");
           causeD = scn.nextLine();
           
        //Maternal Condition
           System.out.print("19c. Maternal Condition:");
           System.out.println("\n[a] Pregnant, not labour");
           System.out.println("[b] Pregnat, in labour");
           System.out.println("[c] Less than 42 days after delivery");
           System.out.println("[d] 42 days t0 1 year after delivery");
           System.out.println("[e] None of the choices:");
           maternalCondition = scn.nextLine();  
           System.out.print("19d. Death by External causes:\n");
       	   System.out.println("[a] Manner of death(Homicide, Suicide, Accident, Legal Intervention, others) ");
       	   System.out.println("[b] Place of Occurance of External Cause(e.g. home, farm, factory, street, sea, others)");
       	   DExternal = scn.next().toUpperCase();
       	switch(DExternal) {
   		case"A":
   			System.out.print("[a] Manner of death(Homicide, Suicide, Accident, Legal Intervention, etc.): ");
   			scn.next();
   			break;
   		case"B":
       		System.out.print("[b] Place of Occurance of External Cause(e.g. home, farm, factory, street, sea, etc.): ");
   			scn.next();
   			break;
       	}
           System.out.println("-------------------------------------------------------------------------------------");
         //option
           if (maternalCondition.equalsIgnoreCase("a")) {
           	 System.out.println("[a]Pregnant, not labour");
           }else if
           (maternalCondition.equalsIgnoreCase("b")) {
           	System.out.println("[b] Pregnat, in labour");
           }else if
           (maternalCondition.equalsIgnoreCase("c")) {
           	 System.out.println("[c] Less than 42 days after delivery");
           }else if
           (maternalCondition.equalsIgnoreCase("d")) {
               System.out.println("[d] 42 days t0 1 year after delivery");

           }else if
           (maternalCondition.equalsIgnoreCase("e")) {
               System.out.print("[e] None of the choices:");
               scn.nextLine();
           }
           System.out.print("19e. Cause of Death: ");
           cause = scn.next();
        //DeathExternal Option
           System.out.print("19f. Death by external causes:\n");
   		System.out.println("[a] Manner of death(Homicide, Suicide, Accident, Legal Intervention, others) ");
   		System.out.println("[b] Place of Occurance of External Cause(e.g. home, farm, factory, street, sea, others)");
   		  deathExternal = scn.next().toUpperCase();  
            
   		switch(deathExternal) {
   		case"A":
   			System.out.print("[a] Manner of death(Homicide, Suicide, Accident, Legal Intervention, etc.): ");
   			scn.next();
   			break;
   		case"B":
       		System.out.print("[b] Place of Occurance of External Cause(e.g. home, farm, factory, street, sea, etc.): ");
   			scn.next();
   			break;
   		}
           System.out.println("-------------------------------------------------------------------------------------\n");

           System.out.print("20.Autopsy(Y/N): ");
   		 autopsy = scn.next();
   	//attendant option
   		System.out.println("21a. Attendant: ");
			System.out.println("[1] Private Physician");
			System.out.println("[2] Public Health Officer");
			System.out.println("[3] Hospital Authority");
			System.out.println("[4] None");
			System.out.println("[5] Others(Specify): ");
   		 attendant = scn.nextInt();
   		
   		switch(attendant) {
   		case 1:
   			System.out.println("1. Private Physician");
   			break;
   		case 2:
   			System.out.println("2. Public Health Officer");
   			break;
   		case 3:
   			System.out.println("3. Hospital Authority");
   			break;
   		case 4:
   			System.out.println("4. None");
   			break;
   		case 5:
   			System.out.println("5. Others(Specify): ");
   			scn.next();
   			break;
   		}
   		System.out.println("21b. If attendant press [Y] the state duration(MM/DD/YY), else [N] ");
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
	//Display
	public void display() {
		 System.out.println("1a. First Name: " + firstName);
	     System.out.println("1b. Middle Name: "  +middleName);
	     System.out.println("1c. Last Name: "  + lastName);
	     System.out.println("2.Sex (M/F): " + sex);
	     System.out.println("3. Date of Death (DD/MM/YYYY): " + dateOfDeath);
		 System.out.println("4. Date of Birth (DD/MM/YYYY): " + dateOfBirth);
		 System.out.println("5. Age at the time of death: " + ageAtDeath);
		 System.out.println("6. Place of Death: " + placeOfDeath);
		 System.out.println("7. Civil Status: " + civilStatus);
		 System.out.println("8. Religion: " + religion);
		 System.out.println("9. Citizenship: " + citizenship);
		 System.out.println("10. Occupation: " + occupation);
		 System.out.println("11. Residence: " + residence);
		 System.out.println("12. Name of Father (First, Middle, Last): " + fatherName);
		 System.out.println("13. Name of Mother (First, Middle, Last): " + motherName );
		 System.out.println("14. Age of Mother: " + ageOfMother);
		 System.out.println("15. Method of delivery(Normal spontaneus vertex, if others, specify): " + mdelivery);
		 System.out.println("16. Length of pregnancy(In completed weeks):" + lengthOfPreg);
		 System.out.println("17. Type of birth (Single, Twin, Triplet, etc.): " + typeOfbirth);
		 System.out.println("18. If multiple birth child was(first, Second, Third, Others):" + multiBirth);
		 System.out.println("19a. Cause of Death: " + causeOfDeath);
		 System.out.println("19b. Cause of Death: " + causeD);
         System.out.println("19c. Maternal Condition:" + maternalCondition);
         System.out.println("19d. Death by External causes:" + DExternal);
         System.out.println("19e. Cause of Death: " + cause);
		 System.out.println("21a. Attendant: " + attendant);
		 System.out.println("21b. If attendant press [Y] the state duration(MM/DD/YY), else [N] " + duration);
			
	}
	
}
