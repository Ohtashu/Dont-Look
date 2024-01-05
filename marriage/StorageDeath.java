package marriage;
import java.util.*;
public class StorageDeath extends deathCertificate {
	static deathCertificate dc = new deathCertificate();
//STORAGE
	public HashMap <String ,Object>deathStorage  = new HashMap();
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
		deathStorage.put("1a" + Info, getfirstName());
		deathStorage.put("1b"  + Info, getmiddleName());
		deathStorage.put("1c" + Info, getlastName());
		deathStorage.put("2" + Info, getsex());
		deathStorage.put("3" + Info,getdateOfDeath());
		deathStorage.put("4" + Info, getdateOfBirth());
		deathStorage.put("5" + Info, getageAtDeath());
		deathStorage.put("6" + Info, getplaceOfDeath());
		deathStorage.put("7" + Info, getcivilStatus());
		deathStorage.put("8" + Info, getreligion());
		deathStorage.put("9" + Info, getcitizenship());
		deathStorage.put("10" + Info, getoccupation());
		deathStorage.put("11" + Info, getresidence());
		deathStorage.put("12" + Info, getfatherName());
		deathStorage.put("13" + Info, getmotherName());
		deathStorage.put("14" + Info, getageOfmother());
		deathStorage.put("15" + Info, getmdelivery());
		deathStorage.put("16" + Info, getlengthOfPreg());
		deathStorage.put("17" + Info, gettypeOfbirth());
		deathStorage.put("18" + Info, getmultiBirth());
		deathStorage.put("19a" + Info, getcauseOfDeath());
		deathStorage.put("19b" + Info, getcauseD());
		deathStorage.put("19c" + Info, getmaternalCondition());
		deathStorage.put("19d" + Info, getDExternal());
		deathStorage.put("19e" + Info, getcause());
		deathStorage.put("19f" + Info, getdeathExternal());
		deathStorage.put("20"  + Info, getautopsy());
		deathStorage.put("21a" + Info, getattendant());
		deathStorage.put("21b" + Info, getduration());
	}
	
}
