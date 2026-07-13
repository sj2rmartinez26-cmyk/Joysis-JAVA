package day21.activity;

public class UserAccount {
    private String firstName;
    private String middleName; 
    private String lastName;
    private String address;
    private String email;
    private String password;

    public UserAccount() {}

    public UserAccount(String firstName, String middleName, String lastName, String address, String email, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        setEmail(email);       
        setPassword(password); 
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) return false;

        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');
        int dotIndex = email.lastIndexOf('.');

        return atIndex > 0 
            && atIndex == lastAtIndex 
            && dotIndex > atIndex + 1 
            && dotIndex < email.length() - 1;
    }

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        
        boolean hasUpper = false, hasLower = false, hasDigit = false;
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            
            if (hasUpper && hasLower && hasDigit) return true;
        }
        return false;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }

    public String getPassword() { return password; }
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Invalid password criteria.");
        }
    }

    public String getFullName() {
        if (middleName == null || middleName.trim().isEmpty()) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }
}