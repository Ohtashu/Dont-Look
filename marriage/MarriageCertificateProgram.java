package marriage;
import java.util.Scanner;

public class MarriageCertificateProgram {
    
        


    private static void MarriagePrintedForm(){
        System.out.println("\t________________________________________________________________________________________________________________________________________________________________");
        System.out.println("\tMunicipal Form No. 97 (Form No. 13)                                            (to be accomplished in quadruplicate)        |            REMARKS/ANNOTATION           ");
        System.out.println("\t(Revised January 1993)                                                                                                      |                                         ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tRepublic of the Philippines                 |                                         ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t   OFFICE OF THE CIVIL REGISTRAR GENERAL            |                                                ");
        System.out.println("\t________________________________________________________________________________________________________________________________________________________________");
    }       

    private static MarriageCertificate inputMarriageCertificateInformation(Scanner scanner, String personType) {
        MarriageCertificate certificate = new MarriageCertificate();

        System.out.print(personType + " First Name: ");
        certificate.setWifeName(scanner.nextLine());

        System.out.print(personType + " Middle Name: ");
        certificate.setWifeMiddle(scanner.nextLine());

        System.out.print(personType + " Last Name: ");
        certificate.setWifeLast(scanner.nextLine());

        System.out.print(personType + " Date of Birth (MM/DD/YYYY): ");
        certificate.setWifeDateOfBirth(scanner.nextLine());

        System.out.print(personType + " Age: ");
        certificate.setWifeAge(scanner.nextLine());
        //scanner.nextLine(); // Consume the newline character

        System.out.print(personType + " Place of Birth (City, Province): ");
        certificate.setWifePlaceOfBirth(scanner.nextLine());

        System.out.print(personType + " Sex(f/m): ");
        certificate.setWifeSex(scanner.nextLine());

        System.out.print(personType + " Citizenship: ");
        certificate.setWifeCitezenship(scanner.nextLine());

        System.out.print(personType + " Residence (Province): ");
        certificate.setWifeProvince(scanner.nextLine());

        System.out.print(personType + " Residence (City/Municipality): ");
        certificate.setWifeCity(scanner.nextLine());

        System.out.print(personType + " Residence (Barangay): ");
        certificate.setWifeBarangay(scanner.nextLine());

        System.out.print(personType + " Residence (House Number/Street): ");
        certificate.setWifeStreet(scanner.nextLine());

        System.out.print(personType + " Religion: ");
        certificate.setWifeReligion(scanner.nextLine());

        System.out.print(personType + " Civil status: ");
        certificate.setWifeStatus(scanner.nextLine());

        System.out.print(personType + " Full name of Father: ");
        certificate.setWifeFather(scanner.nextLine());

        System.out.print(personType + " Citizenship of Father: ");
        certificate.setWifeFatherCitizen(scanner.nextLine());

        System.out.print(personType + " Full name of Mother: ");
        certificate.setWifeMother(scanner.nextLine());

        System.out.print(personType + " Citizenship of Mother: ");
        certificate.setWifeMotherCitizen(scanner.nextLine());

        return certificate;
    }

    private static void displayMarriageCertificates(MarriageCertificate wifeCertificate, MarriageCertificate husbandCertificate) {
        System.out.println("\nWIFE'S INFORMATION");
        displayCertificateInformation(wifeCertificate);

        System.out.println("\nHUSBAND'S INFORMATION");
        displayCertificateInformation(husbandCertificate);
    }

    private static void displayCertificateInformation(MarriageCertificate certificate) {
        System.out.println("1a. First Name: " + certificate.getWifeFirst());
        System.out.println("1b. Middle Name: " + certificate.getWifeMiddle());
        System.out.println("1c. Last Name: " + certificate.getWifeLast());
        System.out.println("2. Date of Birth (MM/DD/YYYY): " + certificate.getWifeDateOfBirth());
        System.out.println("3. Age: " + certificate.getWifeAge());
        System.out.println("4. Place of Birth (City, Province): " + certificate.getWifePlaceOfBirth());
        System.out.println("5. Sex(f/m): " + certificate.getWifeSex());
        System.out.println("6. Citizenship: " + certificate.getWifeCitzen());
        System.out.println("7d. Residence (Province): " + certificate.getWifeProvince());
        System.out.println("7c. Residence (City/Municipality): " + certificate.getWifeCity());
        System.out.println("7b. Residence (Barangay): " + certificate.getWifeBarangay());
        System.out.println("7a. Residence (House Number/Street): " + certificate.getWifeStreet());
        System.out.println("8. Religion: " + certificate.getWifeReligion());
        System.out.println("9. Civil status: " + certificate.getWifeStatus());
        System.out.println("10. Full name of Father: " + certificate.getWifeFather());
        System.out.println("11. Citizenship of Father: " + certificate.getWifeFatherCitizen());
        System.out.println("12. Full name of Mother: " + certificate.getWifeMother());
        System.out.println("13. Citizenship of Mother: " + certificate.getWifeMotherCitizen());
    }

    private static void editSpecificLine(Scanner scanner, MarriageCertificate wifeCertificate, MarriageCertificate husbandCertificate) {
        System.out.print("\nEnter 'W' to edit wife's information, 'H' to edit husband's information, or 'N' for no edits: ");
        char choice = scanner.nextLine().toUpperCase().charAt(0);

        switch (choice) {
            case 'W':
                editCertificateInformation(scanner, wifeCertificate);
                break;
            case 'H':
                editCertificateInformation(scanner, husbandCertificate);
                break;
            default:
                System.out.println("No edits performed.");
        }
    }

    private static void editCertificateInformation(Scanner scanner, MarriageCertificate certificate) {
        System.out.print("Enter the line number you want to edit: ");
        String lineNumber = scanner.nextLine();
        //scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the new value: ");
        String newValue = scanner.nextLine();

        switch (lineNumber) {
            case "1a":
                certificate.setWifeName(newValue);
                break;
            case "1b":
                certificate.setWifeMiddle(newValue);
                break;
            case "1c":
                certificate.setWifeLast(newValue);
                break;
            case "2":
                certificate.setWifeDateOfBirth(newValue);
            case "3": 
                certificate.setWifeAge(newValue);
                break;
            case "4": 
                certificate.setWifePlaceOfBirth(newValue);
                break;
            case "5": 
                certificate.setWifeSex(newValue);
                break;
            case "6": 
                certificate.setWifeCitezenship(newValue);
                break;
            case "7d": 
                certificate.setWifeProvince(newValue);
                break;
            case "7c":
                certificate.setWifeCity(newValue);
                break;
            case "7b":
                certificate.setWifeBarangay(newValue);
                break;
            case "7a": 
                certificate.setWifeStreet(newValue);
                break;
            case "8": 
                certificate.setWifeReligion(newValue);
                break;
            case "9":
                 certificate.setWifeStatus(newValue);
                 break;
            case "10":
                 certificate.setWifeFather(newValue);
                 break;
            case "11": 
                 certificate.setWifeFatherCitizen(newValue);
                 break;
            case "12":
                 certificate.setWifeMother(newValue);
                 break;
            case "13": 
                 certificate.setWifeMotherCitizen(newValue);

            // Add cases for other lines as needed
            default:
                System.out.println("Invalid line number.");
        }
    }
}
