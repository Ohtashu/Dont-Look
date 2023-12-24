package marriage;
import java.util.Scanner;

public class MarriageCertificateProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wife's Information
        System.out.println("WIFE'S INFORMATION");
        MarriageCertificate wifeCertificate = inputMarriageCertificateInformation(scanner, "Wife");

        // Husband's Information
        System.out.println("\nHUSBAND'S INFORMATION");
        MarriageCertificate husbandCertificate = inputMarriageCertificateInformation(scanner, "Husband");

        // Display the information
        displayMarriageCertificates(wifeCertificate, husbandCertificate);

        // Edit specific line
        editSpecificLine(scanner, wifeCertificate, husbandCertificate);

        // Display the updated information
        displayMarriageCertificates(wifeCertificate, husbandCertificate);

        scanner.close();
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
        certificate.setWifeAge(scanner.nextInt());
        scanner.nextLine(); // Consume the newline character

        System.out.print(personType + " Place of Birth (City, Province): ");
        certificate.setWifePlaceOfBirth(scanner.nextLine());

        System.out.print(personType + " Sex(f/m): ");
        certificate.setWifeSex(scanner.nextLine().charAt(0));

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
        int lineNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the new value: ");
        String newValue = scanner.nextLine();

        switch (lineNumber) {
            case 1:
                certificate.setWifeName(newValue);
                break;
            case 2:
                certificate.setWifeMiddle(newValue);
                break;
            case 3:
                certificate.setWifeLast(newValue);
                break;
            // Add cases for other lines as needed
            default:
                System.out.println("Invalid line number.");
        }
    }
}
