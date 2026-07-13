
package day22.discussion;



public class User {
    

    String name;
    String email;
    String password;
    String userRole;
    
    

    
    
    public User(String name, String email, String password, String userRole) {
        
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
    }
    
    public String getRoleInfo (){
        return "User: " + name + ", User Role: " + userRole;
    }
    
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setUserRole(String userRole) {
//        this.userRole = userRole;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getUserRole() {
//        return userRole;
//    }
    
    
    
    
    
}
