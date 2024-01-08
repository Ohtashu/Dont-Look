package marriage;

import java.util.*;
public class StorageDeath extends DeathCertificate {

//STORAGE
	public LinkedHashMap <String ,Object> deathStorage  = new LinkedHashMap();
        Queue Dstorage= new LinkedList();

	private String Info;
//SET AND GETTER NG STORAGE
	public void setInfo(String Information) {
		this.Info = Information;
	}
	public String getInfo() {
		return Info;
	}
	public void Info() {
         
		deathStorage.put("1a" + getInfo(), getfirstName());
		deathStorage.put("1b"  + getInfo(), getmiddleName());
		deathStorage.put("1c" + getInfo(), getlastName());
		deathStorage.put("2" + getInfo(), getsex());
		deathStorage.put("3" + getInfo(),getdateOfDeath());
		deathStorage.put("4" + getInfo(), getdateOfBirth());
		deathStorage.put("5"  + getInfo(), getageAtDeath());
		deathStorage.put("6" + getInfo(), getplaceOfDeath());
		deathStorage.put("7" + getInfo(), getcivilStatus());
		deathStorage.put("8" + getInfo(), getreligion());
		deathStorage.put("9" + getInfo(), getcitizenship());
		deathStorage.put("10" + getInfo(), getoccupation());
		deathStorage.put("11" + getInfo(), getresidence());
		deathStorage.put("12" + getInfo(), getfatherName());
		deathStorage.put("13" + getInfo(), getmotherName());
		deathStorage.put("14" + getInfo(), getageOfmother());
		deathStorage.put("15" + getInfo(), getmdelivery());
		deathStorage.put("16" + getInfo(), getlengthOfPreg());
		deathStorage.put("17" + getInfo(), gettypeOfbirth());
		deathStorage.put("18" + getInfo(), getmultiBirth());
		deathStorage.put("19a" + getInfo(), getcauseOfDeath());
		deathStorage.put("19b" + getInfo(), getcauseD());
		deathStorage.put("19c" + getInfo(), getmaternalCondition());
		deathStorage.put("19d" + getInfo(), getDExternal());
		deathStorage.put("19e" + getInfo(), getcause());
		deathStorage.put("19f" + getInfo(), getdeathExternal());
		deathStorage.put("20"  + getInfo(), getautopsy());
		deathStorage.put("21a" + getInfo(), getattendant());
		deathStorage.put("21b" + getInfo(), getduration());
                
                Dstorage.add( getfirstName()+ " " + getmiddleName()+ " " + getlastName());
	}
	 //Death Part
	 public void printcopy() {
		System.out.println("====================================================================================================");
		System.out.println("\t\t\t\t\tRepublic of the Philippines\n\t\t\t\tOFFICE OF THE CIVIL REGISTRAR GENERAL\n\t\t\t\t\tCERTIFICATE OF DEATH");
	    System.out.println("====================================================================================================");
	    System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("1. Name\t\t  (First)\t    (Middle)\t    (last)\t    |2. SEX (Male/Female)");
	
		System.out.printf("\t\t   %-18s%-16s%-15s|   %-16s", deathStorage.get("1a" + getInfo()),deathStorage.get("1b" + getInfo()), deathStorage.get("1c" + getInfo()), deathStorage.get("2" +getInfo()));
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("3. DATE OF DEATH\t\t    |4. DATE OF BIRTH\t\t    |5. AGE AT THE TIME OF DEATH");
	    System.out.printf("   %-33s|   %-28s|   %-26s", deathStorage.get("3" + getInfo() ), deathStorage.get("4" + getInfo() ), deathStorage.get("5" + getInfo() ));
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("6. PLACE OF DEATH\t\t\t\t\t\t    |7. CIVIL STATUS" );
        System.out.printf("\t\t\t%-44s|   %-20s",deathStorage.get("6" + getInfo()),deathStorage.get("7" + getInfo() ));
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("8. RELIGION/RELIGIOUS SECT\t    |9.CITIZENSHIP\t\t    |10. RESIDENCE");
	    System.out.printf("   %-33s|  %-29s|    %-19s",deathStorage.get("8" + getInfo() ), deathStorage.get("9" + getInfo() ),deathStorage.get("10" + getInfo() ));
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("11. OCCUPATION\t\t\t    |12. NAME OF FATHER\t\t    |13. MAIDEN NAME OF MOTHER");
	    System.out.printf("    %-32s|%-31s|%-28s",deathStorage.get("11" + getInfo() ),deathStorage.get("12" + getInfo() ), deathStorage.get("13" + getInfo() ));
        System.out.println("\n----------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t     MEDICAL CERTIFICATE");
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("FOR CHILDREN AGE 0 TO 7 DAYS");
        System.out.println("----------------------------------------------------------------------------------------------------");
	   if(deathStorage.get("14" + getInfo()) != null){
            System.out.print("14. AGE OF MOTHER: ");
	    System.out.println(deathStorage.get("14" + getInfo()));
	    System.out.print("15. METHOD OF DELIVERY: ");
	    System.out.println(deathStorage.get("15" + getInfo() ));
	    System.out.print("16. LENGTH OF PREGNANCY WEEKS: ");
	    System.out.println(deathStorage.get("16" + getInfo() ));
           }else{
               System.out.println("14. AGE OF MOTHER: ");
               System.out.println("15. METHOD OF DELIVERY: ");
               System.out.println("16. LENGTH OF PREGNANCY WEEKS: ");
           }
        System.out.println("----------------------------------------------------------------------------------------------------");
            if(deathStorage.get("17" + getInfo()) != null){
	    System.out.print("17. TYPE OF BIRTH: ");
	    System.out.println(deathStorage.get("17" + getInfo()));
	    System.out.print("18. IF MULTIPLE BIRTH CHILD WAS: ");
	    System.out.println(deathStorage.get("18" + getInfo() ));
	    System.out.print("19a. CAUSE OF DEATH: ");
	    System.out.println(deathStorage.get("19a" + getInfo() ));
        }else{
            System.out.print("17. TYPE OF BIRTH: ");
	    System.out.print("18. IF MULTIPLE BIRTH CHILD WAS: ");
	    System.out.print("19a. CAUSE OF DEATH: ");

            }
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("IF THE DECEASED IS FEMALE AGED 15-49 YEARS OLD ");
        System.out.println("----------------------------------------------------------------------------------------------------");
        if(deathStorage.get("19b" + getInfo()) != null){
	    System.out.print("19b. CAUSE OF DEATH: ");
	    System.out.println(deathStorage.get("19b" + getInfo() ));
	    System.out.print("19c. MATERNAL CONDITION: ");
	    System.out.println(deathStorage.get("19c" + getInfo() ));
	    System.out.println("a. MANNER OF DEATH: ");
            System.out.println("b. PLACE OF OCCURANCE:");
        }else{
            System.out.print("19b. CAUSE OF DEATH: ");
	    System.out.print("19c. MATERNAL CONDITION: ");
            System.out.println("a. MANNER OF DEATH: ");
            System.out.println("b. PLACE OF OCCURANCE:");
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("IF THE DECEASED IS AGED  8 DAYS AND OVER ");
        System.out.println("----------------------------------------------------------------------------------------------------");
        if(deathStorage.get("19e" + getInfo()) != null){
	    System.out.print("19e. CAUSE OF DEATH: " );
	    System.out.println(deathStorage.get("19e" + getInfo() )+"\t\t\t\t|");
	    System.out.println("19f. DEATH BY EXTERNAL CAUSES: \t\t\t\t|20. AUTOPSY");
	    System.out.println("a. MANNER OF DEATH: \t\t\t\t\t|    "+ deathStorage.get("20" + getInfo()));
	    System.out.println("b. PLACE OF OCCURANCE: \t\t\t\t\t|");
	    System.out.println(deathStorage.get("19f" + getInfo() ));
        }else{
            System.out.print("19e. CAUSE OF DEATH: \t\t\t\t| " );
            System.out.println("19f. DEATH BY EXTERNAL CAUSES: \t\t\t\t|20. AUTOPSY");
            System.out.println("a. MANNER OF DEATH: \t\t\t\t\t| " + deathStorage.get("20" + getInfo()));
            System.out.println("b. PLACE OF OCCURANCE: \t\t\t\t\t| ");
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
	    System.out.println("21a. ATTENDANT \t\t\t\t\t\t|21b. IF ATTENDANT, STATE DURATION(MM/DD/YYYY)");
	    System.out.printf("     %-51s|     %-30s ", deathStorage.get("21a" + getInfo() ),deathStorage.get("21b" + getInfo() ));
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("22. CERTIFICATION OF DEATH\n[] I hereby certify that the foregoing particulars are correct as near as same can be"
	    					+ "\nassertained ascertained and i futher certify that I [] have not attended the deceased"
	    					+ "\nand that death to occured at __________am/pm on the date of death specified above. ");
	    System.out.println("Signature _______________\t\t|REVIEWED BY ");
	    System.out.println("Name in Print _______________\t\t|	__________________________________");
	    System.out.println("Title or Position ________________\t|  Signature Over Printed Name of Health Officer");
	    System.out.println("Adresses ________________\t\t	   ________________________");
	    System.out.println("_________________Date__________\t\t|		     Date");
        System.out.println("----------------------------------------------------------------------------------------------------");
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
         public void forEach(){
             
             for(Map.Entry<String, Object> eh : deathStorage.entrySet()){
                 
                 System.out.println(eh.getKey() + eh.getValue());
             }
         }
         
	
}
