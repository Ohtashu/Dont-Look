
package marriage;


import java.util.*;

public class Admin_Delete extends Admin{
    
    LinkedHashMap <String, Object>AdminDS = new LinkedHashMap();
    LinkedHashMap <String, Object>Name = new LinkedHashMap();
    private int DS = 1;
    
    
    public void AdminDS(){
        
        AdminDS.put("1A" + getName() , BStore.remove("1A" + getName()));
        AdminDS.put("2A" + getName(), BStore.remove("2A" + getName()));
        AdminDS.put("3A" + getName(), BStore.remove("3A" + getName()));
        AdminDS.put("4A" + getName(), BStore.remove("4A" + getName()));
        AdminDS.put("5A" + getName(), BStore.remove("5A" + getName()));
        AdminDS.put("6A" + getName(), BStore.remove("6A" + getName()));
        AdminDS.put("7A" + getName(), BStore.remove("7A" + getName()));
        AdminDS.put("8A" + getName(), BStore.remove("8A" + getName()));
        AdminDS.put("9A" + getName(), BStore.remove("9A" + getName()));
        AdminDS.put("10A" + getName(), BStore.remove("10A" + getName()));
        AdminDS.put("11A" + getName(), BStore.remove("11A" + getName()));
        AdminDS.put("12A" + getName(), BStore.remove("12A" + getName()));
        AdminDS.put("13A" + getName(), BStore.remove("13A" + getName()));
        
        AdminDS.put("1M" + getName(), BStore.remove("1M" + getName()));
        AdminDS.put("2M" + getName(), BStore.remove("2M" + getName()));
        AdminDS.put("3M" + getName(), BStore.remove("3M" + getName()));
        AdminDS.put("4M" + getName(), BStore.remove("4M" + getName()));
        AdminDS.put("5M" + getName(), BStore.remove("5M" + getName()));
        AdminDS.put("6M" + getName(), BStore.remove("6M" + getName()));
        AdminDS.put("7M" + getName(), BStore.remove("7M" + getName()));
        AdminDS.put("8M" + getName(), BStore.remove("8M" + getName()));
        AdminDS.put("9M" + getName(), BStore.remove("9M" + getName()));
        AdminDS.put("10M" + getName(), BStore.remove("10M" + getName()));
        
        AdminDS.put("1F" + getName(), BStore.remove("1F" + getName()));
        AdminDS.put("2F" + getName(), BStore.remove("2F" + getName()));
        AdminDS.put("3F" + getName(), BStore.remove("3F" + getName()));
        AdminDS.put("4F" + getName(), BStore.remove("4F" + getName()));
        AdminDS.put("5F" + getName(), BStore.remove("5F" + getName()));
        AdminDS.put("6F" + getName(), BStore.remove("6F" + getName()));
        AdminDS.put("7F" + getName(), BStore.remove("7F" + getName()));
        AdminDS.put("8F" + getName(), BStore.remove("8F" + getName()));
        AdminDS.put("9F" + getName(), BStore.remove("9F" + getName()));
        AdminDS.put("10F" + getName(), BStore.remove("10F" + getName()));
   
        Name.put(DS +"B" ,BStore.get("1A" + getName()) + " " + BStore.get("2A" + getName()) + " " + BStore.get("3A" + getName()));
        
        DS++;
    }
    
    public void ClearningData(Scanner scanner){
      
        System.out.println("Do you want to Remove Data inside: ");
        char choice = scanner.nextLine().toUpperCase().charAt(0);
        if(choice == 'Y'){
            
            System.out.print("Enter the full name of the file");
            String name = scanner.nextLine().toUpperCase();
            
            
            if(BStore.containsValue(name)){
                System.out.println("Deleting files");
                setName(name);
                AdminDS();
                
            }else{
                System.out.println("None existing file!!");
            }
        
        
        
    }
        else if(choice == 'N'){
            System.out.println("okay");
  
        }
    }
}