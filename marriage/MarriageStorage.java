/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marriage;
import java.util.*;
/**
 *
 * @author flore
 */
public class MarriageStorage extends MarriageCertificate {
private HashMap <String, String> Marriage_Storage = new HashMap <String, String>();

String SMName;
String getSMName(){
    return SMName;
} 
void setSMName(String SMName){
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
 Marriage_Storage.put("7d" + getSMName(),getWifeStreet());
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


}



}