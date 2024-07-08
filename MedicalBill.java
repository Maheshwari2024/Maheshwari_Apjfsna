package Corejava.javapractise;

public class MedicalBill {
    
    // Fields representing medical charges
    int apolodis = 50;
    int doctorCnsltFee = 200;
    
    // Static method to greet the patient
    public static void Greet() {
        System.out.println("Welcome to Apollo Pharmacy");
    }
    
    // Static method to display patient details
    public static void patientDetials() {
        String patientrName = "Maheshwari";
        System.out.println("PATIENT DETAILS");
        System.out.println("patientrName : " + patientrName);
        int patientAge = 21;
        System.out.println("patientAge : " + patientAge);
        String patientAdrs = "Dilshuknagar";
        System.out.println("patientAdrs : " + patientAdrs);
        String patientIllness = "Suffering from cold and Fever";
        System.out.println("patientIllness : " + patientIllness);
    }
    
    // Method to calculate the total bill after applying a discount
    public int patientTotalBill(int Bill) {
        System.out.println("DOCTOR PRESCRIBED MEDICINE");
        String coldMed = "Montek, Cipla";
        System.out.println("Medicine for cold : " + coldMed);
        String coughMed = "Alkof DX";
        System.out.println("Medicine for cough : " + coughMed);
        String feverMed = "Dolo 650";
        System.out.println("Medicine for fever : " + feverMed);
        
        // Adding doctor's consultation fee to the bill
        Bill = doctorCnsltFee + Bill;
        System.out.println("Total Bill before discount : " + Bill);
        
        // Calculating the discount and applying it to the bill
        int dis = (int) (0.5 * Bill);
        Bill -= dis;
        System.out.println("Total Bill after discount : " + Bill);
        
        return Bill;
    }
    
    // Method to determine the type of payment
    public int payment(boolean UseOnlinePayment) {
        System.out.println("TYPE OF PAYMENT");
        if (UseOnlinePayment) {
            System.out.print("Online Payment");
            return 1;
        } else {
            System.out.println("Used Apollo Points");
            return 0;
        }
    }
    
    public static void main(String[] args) {
        // Greeting the patient
        Greet();
        
        // Displaying patient details
        patientDetials();
        
        // Creating an instance of MedicalBill
        MedicalBill mb = new MedicalBill();
        
        // Calculating the total bill
        mb.patientTotalBill(600);
        
        // Determining the type of payment
        mb.payment(false);
    }
}
