
package marriage;

import java.util.*;
public class Birth {
    //Mother
    private static String MFname;
    private static String MMname;
    private static String MLname;
    private static String Mocc;
    private static int Mage;
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
    private static int Fage;
    private static String FCiten;
    private static String FReligion;
    private static String Fprovi;
    private static String FCity;
    private static String FHos;
    
    // child info
    private static String Fname;//
    private static String Lname;//
    private static String Mname;//
    private static int Age;//
    private static String BP;//
    private static String suff;//
    private static String BG;//
    private static String BD;//
    private static char gen;//
    private static String City;//
    private static String Provi;
    private static String Hos;//
    private static String TB;//
    private static String TBP;//
    private static int weigh;
    
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
    public void setAge(int Age){
        this.Age = Age;
    }
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
    public void setgen(char gen){
        this.gen = gen;
    }
    public void setCity(String City){
        this.City = City;
    }
    public void setTBP(String TBP){
        this.TBP = TBP;
    }
    public void setweigh(int weigh){
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
    public int getAge(){
        return this.Age;
    }
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
    public char getgen(){
        return this.gen;
    }
    public String getCity(){
        return this.City;
    }
    public String getTBP(){
        return this.TBP;
    }
    public int getweigh(){
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
    public void setMage(int Mage){
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
    public int getMage(){
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
    public void setFage(int Fage){
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
    public int getFage(){
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
        
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tChild Information");
                   System.out.println("----------------------------------------------------------");
                   
                   System.out.println("\t\tBirth Resgistration");
                   System.out.print("1A. Child First Name: ");
                   Fname = scn.nextLine();
                   setFname(Fname);
                   
                   System.out.print("2A. Child Middle Name (Enter NA if does'nt have one): ");
                   Mname = scn.next();
                   setMname(Mname);
                   
                   System.out.print("3A. Child Last Name: ");
                   Lname = scn.next();
                   setLname(Lname);
                   
                   System.out.print("4A. Child Suffix (NA if not have): ");
                   suff = scn.next();
                   setSuff(suff);
                   
                   System.out.print("5A. Child Age: ");
                   Age = scn.nextInt();
                   setAge(Age);
                   
                   System.out.print("6A. Child Birthday(MM/DD/YYYY): ");
                   BD = scn.next();
                   setBD(BD);
                   
                   System.out.print("7A. Child Sex(f/m): ");
                   gen = scn.next().toUpperCase().charAt(0);
                   setgen(gen);
                   
                   System.out.print("8A. Child Place of Bitht(Province): ");
                   Provi = scn.next();
                   setprovi(Provi);
                   
                   System.out.print("9A. Child Place of Birth (City/Municipality): " );
                   City = scn.next();
                   setCity(City);
                   
                   System.out.print("10A. Child Place of Birth(Hospital/Clinic/Institution): ");
                   scn.nextLine();
                   Hos = scn.nextLine();
                   setHos(Hos);
                   
                   System.out.print("11A. Type of Birth(Single/Twin/Triplet/etc.): ");
                   TB = scn.next();
                   setTB(TB);
                   
                   if(!TB.equalsIgnoreCase("Single")){
                       
                   System.out.print("12A. if multiple birth, child was (first/second/third/fourth/etc.): ");
                   TBP = scn.next();
                   setTBP(TBP);
                   
                   }
                   
                   System.out.print("13A. Child Weight At Birth: ");
                   weigh = scn.nextInt(); 
                   setweigh(weigh);
                   
                   //Mothers Info
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tMother information");
                   System.out.println("----------------------------------------------------------");
                    
                   System.out.print("1M. Mother First Name: ");
                   scn.nextLine();
                   MFname = scn.nextLine();
                   setMFname(MFname);
                   
                                     
                   System.out.print("2M. Mother Middle Name: ");
                   MMname = scn.nextLine(); 
                   setMMname(MMname);
                   
                   System.out.print("3M. Mother Last Name: ");
                   MLname = scn.nextLine();
                   setMLname(MLname);
                   
                   System.out.print("4M. Mother Citizenship: ");
                   MCiten = scn.next();
                   setMCite(MCiten);
                   
                   System.out.print("5M. Mother Religion: ");
                   MReligion = scn.next();
                   setMReligion(MReligion);
                   
                   System.out.print("6M. Mother Occupation: ");
                   scn.nextLine();
                   Mocc = scn.nextLine(); 
                   setMoc(Mocc);
                   
                   
                   System.out.print("7M. Mother Age at time of this birth: ");
                   Mage = scn.nextInt();
                   setMage(Mage);
                   
                   System.out.print("8M. Residence(House Number/Steet, Barangay): ");
                   scn.nextLine();
                   MHos = scn.nextLine();
                   setMHos(MHos);
                   
                   System.out.print("9M. Residence Munipality: ");
                   MCity = scn.nextLine();
                   setMCity(MCity);
                   
                   System.out.print("10M. Province: ");
                   Mprovi = scn.nextLine();
                   setMprovi(Mprovi);
                  
                  // Father Info
                  
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tFather information");
                   System.out.println("----------------------------------------------------------");
                    
                   System.out.print("1F. Father First Name: ");
                   FFname = scn.nextLine();
                   setFFname(FFname);
                   
                   System.out.print("2F. Father Middle Name: ");
                   FMname = scn.nextLine(); 
                   setFMname(FMname);
                   
                   System.out.print("3F. Father Last Name: ");
                   FLname = scn.nextLine();
                   setFLname(FLname);

                   System.out.print("4F. Father Citizenship: ");
                   FCiten = scn.next();
                   setFCite(FCiten);
                   
                   System.out.print("5F. Father Religion: ");
                   FReligion = scn.next();
                   setFReligion(FReligion);
                   
                   System.out.print("6F. Father Occupation: ");
                   scn.nextLine();
                   Focc = scn.nextLine();
                   setFocc(Focc);
                                      
                   System.out.print("7F. Father Age at time of this birth: ");
                   Fage = scn.nextInt();
                   setFage(Fage);
                   
                   System.out.print("8F. Residence(House Number/Steet, Barangay): ");
                   scn.nextLine();
                   FHos = scn.nextLine();
                   setFHos(FHos);
                   
                   System.out.print("9F. Residence Munipality: ");
                   FCity = scn.nextLine();
                   setFCity(FCity);
                   
                   System.out.print("10F. Province: ");
                   Fprovi = scn.nextLine();
                   setFprovi(Fprovi);
    }
    public static void Display(){
         System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tChild Information");
                   System.out.println("----------------------------------------------------------");
                   
                   System.out.println("\t\tBirth Resgistration");
                   System.out.println("1A. Child First Name: " +Fname);
                   System.out.println("2A. Child Middle Name (Enter NA if does'nt have one): " + Mname);
                   System.out.println("3A. Child Last Name: " + Lname);
                   System.out.println("4A. Child Suffix (NA if not have): " + suff);
                   System.out.println("5A. Child Age: " + Age);
                   System.out.println("6A. Child Birthday(MM/DD/YYYY): " + BD);
                   System.out.println("7A. Child Sex(f/m): " + gen);
                   System.out.println("8A. Child Place of Bitht(Province): " + Provi);
                   System.out.println("9A. Child Place of Birth (City/Municipality): " + City );
                   System.out.println("10A. Child Place of Birth(Hospital/Clinic/Institution): " + Hos);
                   System.out.println("11A. Type of Birth(Single/Twin/Triplet/etc.): " + TB);
                   if(!TB.equalsIgnoreCase("Single")){    
                   System.out.println("12A. if multiple birth, child was (first/second/third/fourth/etc.): " + TBP);
                   }
                   System.out.println("13A. Child Weight At Birth: " + weigh);
                   
                   //Mothers Info
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tMother information");
                   System.out.println("----------------------------------------------------------");
                   System.out.println("1M. Mother First Name: " + MFname);                
                   System.out.println("2M. Mother Middle Name: " + MMname);
                   System.out.println("3M. Mother Last Name: " + MLname);
                   System.out.println("4M. Mother Citizenship: " + MCiten);
                   System.out.println("5M. Mother Religion: " + MReligion);
                   System.out.println("6M. Mother Occupation: " + Mocc);
                   System.out.println("7M. Mother Age at time of this birth: " + Mage);
                   System.out.println("8M. Residence(House Number/Steet, Barangay): " + MHos);
                   System.out.println("9M. Residence Munipality: " + MCity);
                   System.out.println("10M. Province: " + Mprovi);
                  
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tFather information");
                   System.out.println("----------------------------------------------------------");                
                   System.out.println("1F. Father First Name: " + FFname);                  
                   System.out.println("2F. Father Middle Name: " + FMname);
                   System.out.println("3F. Father Last Name: " + FLname);
                   System.out.println("4F. Father Citizenship: " + FCiten);
                   System.out.println("5F. Father Religion: " + FReligion);
                   System.out.println("6F. Father Occupation: " + Focc);
                   System.out.println("7F. Father Age at time of this birth: " + Fage);
                   System.out.println("8F. Residence(House Number/Steet, Barangay): " + FHos);
                   System.out.println("9F. Residence Munipality: " + FCity);
                   System.out.println("10F. Province: " + Fprovi);
                   
                   
             
    }
}  
    
    
