/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marriage;
import java.util.*;
import java.util.zip.CRC32;
/**
 *
 * @author flore
 */
public class MarriageStorage extends MarriageCertificate {
private HashMap <String, String> Marriage_Storage = new HashMap <String, String>();
MarriageCertificate certificate = new MarriageCertificate();
String SMName;

public String getSMName(){
    return SMName;
} 
public void setSMName(String SMName){
    this.SMName = SMName;
}
public void SMarriageinfo(){
Marriage_Storage.put("1a" + getSMName(), getWifeFirst());
Marriage_Storage.put("1b" + getSMName(), getWifeMiddle());
Marriage_Storage.put("1c" + getSMName(), getWifeLast());
Marriage_Storage.put("2" + getSMName(), getWifeDateOfBirth());
Marriage_Storage.put("3" + getSMName(), getWifeAge()); 
Marriage_Storage.put("4" + getSMName(), getWifePlaceOfBirth());
Marriage_Storage.put("5" + getSMName(),  getWifeSex());
Marriage_Storage.put("6" + getSMName(), getWifeCitzen());
Marriage_Storage.put("7a" + getSMName(), getWifeProvince());
Marriage_Storage.put("7b" + getSMName(),  getWifeCity());
Marriage_Storage.put("7c" + getSMName(), getWifeBarangay());
Marriage_Storage.put("7d" + getSMName(), getWifeStreet());
Marriage_Storage.put("8" + getSMName(),  getWifeReligion());
Marriage_Storage.put("9" + getSMName(), getWifeStatus());
Marriage_Storage.put("10" + getSMName(),getWifeFather());
Marriage_Storage.put("11" + getSMName(),  getWifeFatherCitizen());
Marriage_Storage.put("12" + getSMName(), getWifeMother());
Marriage_Storage.put("13" + getSMName(),getWifeMotherCitizen());

//HUSBAND
Marriage_Storage.put("14a" + getSMName(), getHusbandFirst());
Marriage_Storage.put("14b" + getSMName(), getHusbandMiddle());
Marriage_Storage.put("14c" + getSMName(), getHusbandLast());
Marriage_Storage.put("15" + getSMName(), getHusbandDateOfBirth());
Marriage_Storage.put("16" + getSMName(), getHusbandAge());
Marriage_Storage.put("17" + getSMName(), getHusbandPlaceOfBirth());
Marriage_Storage.put("18" + getSMName(), getHusbandSex());
Marriage_Storage.put("19" + getSMName(), getHusbandCitizen());
Marriage_Storage.put("20a" + getSMName(),  getHusbandProvince());
Marriage_Storage.put("20b" + getSMName(),  getHusbandCity());
Marriage_Storage.put("20c" + getSMName(), getHusbandBarangay());
Marriage_Storage.put("20d" + getSMName(), getHusbandStreet());
Marriage_Storage.put("21" + getSMName(), getHusbandReligion());
Marriage_Storage.put("22" + getSMName(), getHusbandStatus());
Marriage_Storage.put("23" + getSMName(),  getHusbandFather());
Marriage_Storage.put("24" + getSMName(),   getHusbandFatherCitizen());
Marriage_Storage.put("25" + getSMName(), getHusbandMother());
Marriage_Storage.put("26" + getSMName(), getHusbandMotherCitizen());
Marriage_Storage.put("27" + getSMName(),      getPlaceMarriage());
Marriage_Storage.put("28" + getSMName(), getDateMarriage());

}

public void printingForm(){
		        System.out.println("\t\t\t\t\t=======================================================================================================================");
		        System.out.println("\t\t\t\t\t\t\t\t                       Republic of the Philippines");
                        System.out.println("\t\t\t\t\t\t\t                            OFFICE OF THE CIVIL REGISTRAR GENERAL");
                        System.out.println("\t\t\t\t\t\t\t\t                         CERTIFICATE OF MARRIAGE");
		        System.out.println("\t\t\t\t\t=======================================================================================================================");	 
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.println("\t\t\t\t\t|WIFE\t\t\t\t\t|HUSBAND");
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("\t\t\t\t\tName of Contracting Parties\t\t|(1a) %-14s|(1b) %-14s|(14a) %-14s|(14b) %-14s\n\t\t\t\t\t|(1c) %-34s|(14c) %-14s\n", 
		        					Marriage_Storage.get("1a" + getSMName()), Marriage_Storage.get("14a" + getSMName()), Marriage_Storage.get("1b" + getSMName()), Marriage_Storage.get("14b" + getSMName()),Marriage_Storage.get("1c" + getSMName()),Marriage_Storage.get("14c" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("\t\t\t\t\tDate of Birth/Age\t\t\t|(2) %-15s|(3) %-15s|(15) %-15s|(16) %-15s\n",Marriage_Storage.get("15" + getSMName()),Marriage_Storage.get("2" + getSMName()),Marriage_Storage.get("16" + getSMName()), Marriage_Storage.get("3" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("\t\t\t\t\tPlace of Birth\t\t\t\t|(4) %-35s|(17) %-15s\n", Marriage_Storage.get("17" + getSMName()),Marriage_Storage.get("4" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("\t\t\t\t\tSex (Male/Female)\t\t\t|(5) %-30s\t|(18) %-10s\n", Marriage_Storage.get("18" + getSMName()), Marriage_Storage.get("5" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("\t\t\t\t\tCitizenship\t\t\t\t|(6) %-30s\t|(19) %-20s\n",Marriage_Storage.get("19" + getSMName()),Marriage_Storage.get("6" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("\t\t\t\t\tResidence\t\t\t\t|(7a) %-14s|(7a) %-14s|(20a) %-14s|(20b) %-14s\n\t\t\t\t\t|(7c) %-14s|(7d) %-14s|(20c) %-14s|(20d) %-14s\n",
		        		Marriage_Storage.get("7a" + getSMName()), Marriage_Storage.get("20a" + getSMName()),Marriage_Storage.get("7b" + getSMName()),
		        		Marriage_Storage.get("20b" + getSMName()),Marriage_Storage.get("7c" + getSMName()),Marriage_Storage.get("7d" + getSMName()),Marriage_Storage.get("20c" + getSMName()),Marriage_Storage.get("20d" + getSMName()));	   
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("\t\t\t\t\tReligion\t\t\t\t|(8) %-35s|(21) %-20s\n",Marriage_Storage.get("8" + getSMName()), Marriage_Storage.get("21" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("\t\t\t\t\tCivil Status\t\t\t\t|(9) %-35s|(22) %-15s\n",Marriage_Storage.get("9" + getSMName()),Marriage_Storage.get("22" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("\t\t\t\t\tName of Father\t\t\t\t|(10) %-34s|(23) %-15s\n", Marriage_Storage.get("10" + getSMName()), Marriage_Storage.get("23" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("\t\t\t\t\tCitizenship\t\t\t\t|(11) %-34s|(24) %-15s\n", Marriage_Storage.get("11" + getSMName()),Marriage_Storage.get("24" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
				System.out.printf("\t\t\t\t\tName of Mother\t\t\t\t|(12) %-34s|(25) %-15s\n", Marriage_Storage.get("12" + getSMName()),Marriage_Storage.get("25" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
				System.out.printf("\t\t\t\t\tCitizenship\t\t\t\t|(13) %-34s|(26) %-15s\n", Marriage_Storage.get("13" + getSMName()),Marriage_Storage.get("26" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
		        System.out.println("\t\t\t\t\tPlace of Marriage: "+ Marriage_Storage.get("27" + getSMName()));
		        System.out.println("\t\t\t\t\tDate Of Marriage: "+ Marriage_Storage.get("28" + getSMName()));
		        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	}



}