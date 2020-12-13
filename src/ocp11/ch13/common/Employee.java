package ocp11.ch13.common;

import javax.validation.constraint.*;

public class Employee {
    
    @NotNull;
    private int id;
    
    @NotEmpty
    @Size(min =5, max = 10)
    private String name;
    
    @Max(600)
    @Min(-5)
    private String Address;
    
    @Email
    private String email;

    public Employee() {
    }

    public Employee(int id, String name, String Address, String email) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }            

}
