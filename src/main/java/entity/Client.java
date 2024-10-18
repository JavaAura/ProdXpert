package entity;

import enums.UserRole;

import java.time.LocalDate;

public class Client extends User {
    private String phone;
    public Client(String firstName, String secondName, String email, String password) {
        super(firstName, secondName, email, password, UserRole.CLIENT);
    }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}