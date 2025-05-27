package costumestore.models;

import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable{
    private Integer id;
    private LocalDate rentDate;
    private Integer totalPrice;
    private RentalForm rentalForm;
    private Employee employee;
    
    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }
    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public RentalForm getRentalForm() {
        return rentalForm;
    }

    public void setRentalForm(RentalForm rentalForm) {
        this.rentalForm = rentalForm;
    }
}
