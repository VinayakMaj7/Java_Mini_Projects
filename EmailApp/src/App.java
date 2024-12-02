import java.util.Scanner;

public class App {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailcap = 100;
    private int passwordLength = 10;
    private String email;
    private String companysuffix = "abc.com";
    private String alterEmail;

    // receive first and last name
    public App(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email Created: " + this.firstname + " " + this.lastname);
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        this.password = setPassword(passwordLength);
        System.out.println("Your password is: "+this.password);
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companysuffix;
        System.out.println("Your Generated Email is: " + email);
    }

    // get department from user
    private String setDepartment() {
        System.out.println("Worker Name: "+ firstname+"."+ "\nDepartment Code: \n1 for Sales.\n2 for Development.\n3 for Accounting.\n0 for None.\nSelect the department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "DEV";
        } else if (depChoice == 3) {
            return "Accnt";
        } else {
            return "";
        }
    }

    // generate a random string of password
    private String setPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // Set Mail Box capacity
    public void setMailboxCap(int cap){
        this.mailcap= cap;
    }
    // Set alternate email
    public void setaltmail(String Altmail){
        this.alterEmail = Altmail;
    }
    // Change password
    public void changePass(String password){
        this.password = password;
    }
    public int getMailboxcap(){ return mailcap; }
    public String getaltmail(){ return alterEmail; }
    public String getchangePass(){ return password; }

    public String showInfo(){
        return "Display Name: " + firstname + " "+lastname+
                "\nCompany Email: "+ email+
                "\nMail Box Capacity: "+mailcap;
    }
}