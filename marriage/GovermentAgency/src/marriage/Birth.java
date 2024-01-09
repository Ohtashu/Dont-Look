
package marriage;

import java.util.*;

public class Birth extends Exception {
    
    
    public static Map ques = new HashMap();
    //Mother
    private static String MFname;
    private static String MMname;
    private static String MLname;
    private static String Mocc;
    private static String Mage;
    private static String MCiten;
    private static String MReligion;
    private static String Mprovi;
    private static String MCity;
    private static String MHos;
    
    //Father
    private static String FFname;
    private static String FMname;
    private static String FLname;
    private static String Focc;
    private static String Fage;
    private static String FCiten;
    private static String FReligion;
    private static String Fprovi;
    private static String FCity;
    private static String FHos;
    
    // child info
    private static String Fname;//
    private static String Lname;//
    private static String Mname;//
    //private static int Age;//
    private static String BP;//
    private static String suff;//
    private static String BG;//
    private static String BD;//
    private static String gen;//
    private static String City;//
    private static String Provi;
    private static String Hos;//
    private static String TB;//
    private static String TBP;//
    private static String weigh;
    
    //child setter & getter
    //setter
    public void setFname(String Fname){
        this.Fname = Fname;
    }
    public void setLname(String Lname){
        this.Lname = Lname;
    }
    public void setMname(String Mname){
        this.Mname = Mname;
    }
    //public void setAge(int Age){
     //   this.Age = Age;
    //}
    public void setBP(String BP){
        this.BP = BP;
    }
    public void setHos(String Hos){
        this.Hos = Hos;
    }
     public void setBG(String BG){
        this.BG = BG;
    }
     public void setSuff(String suff){
        this.suff = suff;
    }
    public void setBD(String BD){
        this.BD = BD;
    } 
    public void setgen(String gen){
        this.gen = gen;
    }
    public void setCity(String City){
        this.City = City;
    }
    public void setTBP(String TBP){
        this.TBP = TBP;
    }
    public void setweigh(String weigh){
        this.weigh = weigh;
    }
    public void setprovi(String provi){
        this.Provi = provi;
    }
    public void setTB(String TB){
        this.TB = TB;
    }
    
    
    
     //getter
    public String getFname(){
        return this.Fname;
    }
    public String getLname(){
        return this.Lname;
    }
     public String getMname(){
        return this.Mname;
    }
    //public int getAge(){
    //    return this.Age;
    //}
     public String getBP(){
        return this.BP;
    }
    public String getHos(){
        return this.Hos;
    }
    public String getBG(){
        return this.BG;
    }
    public String getsuff(){
        return this.suff;
    }
    public String getBD(){
        return this.BD;
    }
    public String getgen(){
        return this.gen;
    }
    public String getCity(){
        return this.City;
    }
    public String getTBP(){
        return this.TBP;
    }
    public String getweigh(){
        return this.weigh;
    }
     public String getprovi(){
        return this.Provi;
    }
     public String getTB(){
        return this.TB;
    }
     
     //Mother info
     //setter
    public void setMFname(String MFname){
         this.MFname = MFname;
     }
    public void setMLname(String MLname){
         this.MLname = MLname;
     }
    public void setMMname(String MMname){
         this.MMname = MMname;
     }
    public void setMCite(String Citen){
        this.MCiten = Citen;
    }
    public void setMReligion(String Religion){
         this.MReligion = Religion;
     }
    public void setMoc(String Mocc){
         this.Mocc = Mocc;
     }
    public void setMage(String Mage){
        this.Mage = Mage;
    }
    public void setMCity(String MCity){
        this.MCity = MCity;
    }
    public void setMprovi(String Mprovi){
        this.Mprovi = Mprovi;
    }
    public void setMHos(String MHos){
        this.MHos = MHos;
    }
    
    //getter
    public String getMFname(){
         return this.MFname;
     }
    public String getMLname(){
         return this.MLname;
     }
    public String getMMname(){
         return this.MMname;
     }
    public String getMCite(){
        return this.MCiten;
    }
    public String getReligion(){
         return this.MReligion;
     }
    public String getMocc(){
         return this.Mocc;
     }
    public String getMage(){
        return this.Mage;
    }
    public String getMCity(){
        return this.MCity;
    }
    public String getMprovi(){
        return this.Mprovi;
    }
    public String getMHos(){
        return this.MHos;
    }
    
    //Father info
     //setter
    public void setFFname(String FFname){
         this.FFname = FFname;
     }
    public void setFLname(String FLname){
         this.FLname = FLname;
     }
    public void setFMname(String FMname){
         this.FMname = FMname;
     }
    public void setFCite(String FCiten){
        this.FCiten = FCiten;
    }
    public void setFReligion(String FReligion){
         this.FReligion = FReligion;
     }
    public void setFocc(String Focc){
         this.Focc = Focc;
     }
    public void setFage(String Fage){
        this.Fage = Fage;
    }
    public void setFCity(String FCity){
        this.FCity = FCity;
    }
    public void setFprovi(String Fprovi){
        this.Fprovi = Fprovi;
    }
    public void setFHos(String FHos){
        this.FHos = FHos;
    }
    
    //getter
    public String getFFname(){
         return this.FFname;
     }
    public String getFLname(){
         return this.FLname;
     }
    public String getFMname(){
         return this.FMname;
     }
    public String getFCiten(){
        return this.FCiten;
    }
    public String getFReligion(){
         return this.FReligion;
     }
    public String getFocc(){
         return this.Focc;
     }
    public String getFage(){
        return this.Fage;
    }
    public String getFCity(){
        return this.FCity;
    }
    public String getFprovi(){
        return this.Fprovi;
    }
    public String getFHos(){
        return this.FHos;
    }
    
    
    public void Question(){
        
                   Scanner scn = new Scanner(System.in);
        
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tChild information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t\t\t\t\t\t\tBirth Resgistration");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");

                   System.out.print("\t\t\t\t1A. Child First Name: ");
                   Fname = scn.nextLine().toUpperCase();
                   setFname(Fname);
                   
                   System.out.print("\t\t\t\t2A. Child Middle Name (Enter NA if does'nt have one): ");
                   Mname = scn.next();
                   setMname(Mname);
                   
                   System.out.print("\t\t\t\t3A. Child Last Name: ");
                   Lname = scn.next().toUpperCase();
                   setLname(Lname);
                   
                   System.out.print("\t\t\t\t4A. Child Suffix (NA if not have): ");
                   suff = scn.next().toUpperCase();
                   setSuff(suff);
                   
                   //System.out.print("\t\t\t\t5A. Child Age: ");
                   //Age = scn.nextInt();
                   //setAge(Age);
                   
                   System.out.print("\t\t\t\t6A. Child Birthday(MM/DD/YYYY): ");
                   BD = scn.next();
                   setBD(BD);
                   
                   System.out.print("\t\t\t\t7A. Child Sex(f/m): ");
                   gen = scn.next().toUpperCase();
                   setgen(gen);
                   
                   System.out.print("\t\t\t\t8A. Child Place of Bitht(Province): ");
                   Provi = scn.next().toUpperCase();
                   setprovi(Provi);
                   
                   System.out.print("\t\t\t\t9A. Child Place of Birth (City/Municipality): " );
                   City = scn.next().toUpperCase();
                   setCity(City);
                   
                   System.out.print("\t\t\t\t10A. Child Place of Birth(Hospital/Clinic/Institution): ");
                   scn.nextLine();
                   Hos = scn.nextLine().toUpperCase();
                   setHos(Hos);
                   
                   System.out.print("\t\t\t\t11A. Type of Birth(Single/Twin/Triplet/etc.): ");
                   TB = scn.next().toUpperCase();
                   setTB(TB);
                   
                   if(!TB.equalsIgnoreCase("Single")){
                       
                   System.out.print("\t\t\t\t12A. if multiple birth, child was (first/second/third/fourth/etc.): ");
                   TBP = scn.next().toUpperCase();
                   setTBP(TBP);
                   
                   }
                   
                   System.out.print("\t\t\t\t13A. Child Weight At Birth: ");
                   weigh = scn.next(); 
                   setweigh(weigh);
                   
                   //Mothers Info
                  System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tMother information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.print("\t\t\t\t1M. Mother First Name: ");
                   scn.nextLine();
                   MFname = scn.nextLine().toUpperCase();
                   setMFname(MFname);
                   
                                     
                   System.out.print("\t\t\t\t2M. Mother Middle Name: ");
                   MMname = scn.nextLine().toUpperCase(); 
                   setMMname(MMname);
                   
                   System.out.print("\t\t\t\t3M. Mother Last Name: ");
                   MLname = scn.nextLine().toUpperCase();
                   setMLname(MLname);
                   
                   System.out.print("\t\t\t\t4M. Mother Citizenship: ");
                   MCiten = scn.next().toUpperCase();
                   setMCite(MCiten);
                   
                   System.out.print("\t\t\t\t5M. Mother Religion: ");
                   scn.nextLine();
                   MReligion = scn.nextLine().toUpperCase();
                   setMReligion(MReligion);
                   
                   System.out.print("\t\t\t\t6M. Mother Occupation: ");
                   Mocc = scn.nextLine().toUpperCase(); 
                   setMoc(Mocc);
                   
                   
                   System.out.print("\t\t\t\t7M. Mother Age at time of this birth: ");
                   Mage = scn.next();
                   setMage(Mage);
                   
                   System.out.print("\t\t\t\t8M. Residence(House Number/Steet, Barangay): ");
                   scn.nextLine();
                   MHos = scn.nextLine().toUpperCase();
                   setMHos(MHos);
                   
                   System.out.print("\t\t\t\t9M. Residence Munipality: ");
                   MCity = scn.nextLine().toUpperCase();
                   setMCity(MCity);
                   
                   System.out.print("\t\t\t\t10M. Province: ");
                   Mprovi = scn.nextLine().toUpperCase();
                   setMprovi(Mprovi);
                  
                  // Father Info
                  
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tFather Information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.print("\t\t\t\t1F. Father First Name: ");
                   FFname = scn.nextLine().toUpperCase();
                   setFFname(FFname);
                   
                   System.out.print("\t\t\t\t2F. Father Middle Name: ");
                   FMname = scn.nextLine(); 
                   setFMname(FMname);
                   
                   System.out.print("\t\t\t\t3F. Father Last Name: ");
                   FLname = scn.nextLine().toUpperCase();
                   setFLname(FLname);

                   System.out.print("\t\t\t\t4F. Father Citizenship: ");
                   FCiten = scn.next().toUpperCase();
                   setFCite(FCiten);
                   
                   System.out.print("\t\t\t\t5F. Father Religion: ");
                   scn.nextLine();
                   FReligion = scn.nextLine().toUpperCase();
                   setFReligion(FReligion);
                   
                   System.out.print("\t\t\t\t6F. Father Occupation: ");
                   Focc = scn.nextLine().toUpperCase();
                   setFocc(Focc);
                                      
                   System.out.print("\t\t\t\t7F. Father Age at time of this birth: ");
                   Fage = scn.next();
                   setFage(Fage);
                   
                   System.out.print("\t\t\t\t8F. Residence(House Number/Steet, Barangay): ");
                   scn.nextLine();
                   FHos = scn.nextLine().toUpperCase();
                   setFHos(FHos);
                   
                   System.out.print("\t\t\t\t9F. Residence Munipality: ");
                   FCity = scn.nextLine().toUpperCase();
                   setFCity(FCity);
                   
                   System.out.print("\t\t\t\t10F. Province: ");
                   Fprovi = scn.nextLine().toUpperCase();
                   setFprovi(Fprovi);
                   
                
                   
    }
    public static void Display(){
        
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tChild Information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println(" ");
                   System.out.println("\t\t\t\t1A. Child First Name: " +Fname);
                   System.out.println("\t\t\t\t2A. Child Middle Name (Enter NA if does'nt have one): " + Mname);
                   System.out.println("\t\t\t\t3A. Child Last Name: " + Lname);
                   System.out.println("\t\t\t\t4A. Child Suffix (NA if not have): " + suff);
                   //System.out.println("\t\t\t\t5A. Child Age: " + Age);
                   System.out.println("\t\t\t\t6A. Child Birthday(MM/DD/YYYY): " + BD);
                   System.out.println("\t\t\t\t7A. Child Sex(f/m): " + gen);
                   System.out.println("\t\t\t\t8A. Child Place of Bitht(Province): " + Provi);
                   System.out.println("\t\t\t\t9A. Child Place of Birth (City/Municipality): " + City );
                   System.out.println("\t\t\t\t10A. Child Place of Birth(Hospital/Clinic/Institution): " + Hos);
                   System.out.println("\t\t\t\t11A. Type of Birth(Single/Twin/Triplet/etc.): " + TB);
                   if(!TB.equalsIgnoreCase("Single")){    
                   System.out.println("\t\t\t\t12A. if multiple birth, child was (first/second/third/fourth/etc.): " + TBP);
                   }
                   System.out.println("\t\t\t\t13A. Child Weight At Birth: " + weigh);
                   
                   //Mothers Info
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tMother information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1M. Mother First Name: " + MFname);                
                   System.out.println("\t\t\t\t2M. Mother Middle Name: " + MMname);
                   System.out.println("\t\t\t\t3M. Mother Last Name: " + MLname);
                   System.out.println("\t\t\t\t4M. Mother Citizenship: " + MCiten);
                   System.out.println("\t\t\t\t5M. Mother Religion: " + MReligion);
                   System.out.println("\t\t\t\t6M. Mother Occupation: " + Mocc);
                   System.out.println("\t\t\t\t7M. Mother Age at time of this birth: " + Mage);
                   System.out.println("\t\t\t\t8M. Residence(House Number/Steet, Barangay): " + MHos);
                   System.out.println("\t\t\t\t9M. Residence Munipality: " + MCity);
                   System.out.println("\t\t\t\t10M. Province: " + Mprovi);
                  
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tFather information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1F. Father First Name: " + FFname);                  
                   System.out.println("\t\t\t\t2F. Father Middle Name: " + FMname);
                   System.out.println("\t\t\t\t3F. Father Last Name: " + FLname);
                   System.out.println("\t\t\t\t4F. Father Citizenship: " + FCiten);
                   System.out.println("\t\t\t\t5F. Father Religion: " + FReligion);
                   System.out.println("\t\t\t\t6F. Father Occupation: " + Focc);
                   System.out.println("\t\t\t\t7F. Father Age at time of this birth: " + Fage);
                   System.out.println("\t\t\t\t8F. Residence(House Number/Steet, Barangay): " + FHos);
                   System.out.println("\t\t\t\t9F. Residence Munipality: " + FCity);
                   System.out.println("\t\t\t\t10F. Province: " + Fprovi);               
             
    }
    public void HQuestion(){
        ques.put("1A", "Child First Name:");
        ques.put("2A", "Child Middle Name (Enter NA if does'nt have one):");
        ques.put("3A" , "Child Last Name:");
        ques.put("4A", "Child Suffix (NA if not have): ");
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
}  
    
    