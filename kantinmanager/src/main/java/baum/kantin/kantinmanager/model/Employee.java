package baum.kantin.kantinmanager.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String roomNumber;
    private String email;
    private String password;
    private Long isEmailVarified;
    private Long phoneNumber;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee(String name, String roomNumber, String email, Long phoneNumber, String employeeCode, String password, Long isEmailVarified) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.employeeCode = employeeCode;
        this.password = password;
        this.isEmailVarified = isEmailVarified;
    }
    public Employee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
