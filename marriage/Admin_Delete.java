
package marriage;


import java.util.*;

public class Admin_Delete extends Admin{
    
    LinkedHashMap <String, Object>AdminDS = new LinkedHashMap();
    LinkedHashMap <String, Object>Name = new LinkedHashMap();
    private int DS = 1;
    
    
    public void AdminDS(){
        
        AdminDS.put("1A" + getName(), BStore.get("1A" + getName()));
        AdminDS.put("2A" + getName(), BStore.get("2A" + getName()));
        AdminDS.put("3A" + getName(), BStore.get("3A" + getName()));
        AdminDS.put("4A" + getName(), BStore.get("4A" + getName()));
        AdminDS.put("5A" + getName(), BStore.get("5A" + getName()));
        AdminDS.put("6A" + getName(), BStore.get("6A" + getName()));
        AdminDS.put("7A" + getName(), BStore.get("7A" + getName()));
        AdminDS.put("8A" + getName(), BStore.get("8A" + getName()));
        AdminDS.put("9A" + getName(), BStore.get("9A" + getName()));
        AdminDS.put("10A" + getName(), BStore.get("10A" + getName()));
        AdminDS.put("11A" + getName(), BStore.get("11A" + getName()));
        AdminDS.put("12A" + getName(), BStore.get("12A" + getName()));
        AdminDS.put("13A" + getName(), BStore.get("13A" + getName()));
        
        AdminDS.put("1M" + getName(), BStore.get("1M" + getName()));
        AdminDS.put("2M" + getName(), BStore.get("2M" + getName()));
        AdminDS.put("3M" + getName(), BStore.get("3M" + getName()));
        AdminDS.put("4M" + getName(), BStore.get("4M" + getName()));
        AdminDS.put("5M" + getName(), BStore.get("5M" + getName()));
        AdminDS.put("6M" + getName(), BStore.get("6M" + getName()));
        AdminDS.put("7M" + getName(), BStore.get("7M" + getName()));
        AdminDS.put("8M" + getName(), BStore.get("8M" + getName()));
        AdminDS.put("9M" + getName(), BStore.get("9M" + getName()));
        AdminDS.put("10M" + getName(), BStore.get("10M" + getName()));
        
        AdminDS.put("1F" + getName(), BStore.get("1F" + getName()));
        AdminDS.put("2F" + getName(), BStore.get("2F" + getName()));
        AdminDS.put("3F" + getName(), BStore.get("3F" + getName()));
        AdminDS.put("4F" + getName(), BStore.get("4F" + getName()));
        AdminDS.put("5F" + getName(), BStore.get("5F" + getName()));
        AdminDS.put("6F" + getName(), BStore.get("6F" + getName()));
        AdminDS.put("7F" + getName(), BStore.get("7F" + getName()));
        AdminDS.put("8F" + getName(), BStore.get("8F" + getName()));
        AdminDS.put("9F" + getName(), BStore.get("9F" + getName()));
        AdminDS.put("10F" + getName(), BStore.get("10F" + getName()));
   
        Name.put(DS +"B" ,BStore.get("1A" + getName()) + " " + BStore.get("2A" + getName()) + " " + BStore.get("3A" + getName()));
        
        DS++;
    }
    
}
