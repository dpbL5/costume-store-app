package costumestore.models;

public class RentalForm {
    private Integer id;
    private Integer totalDeposit;
    private Customer customer;
    private RentedCostume rentedCostume[];
    public Integer getId() {
        return id;
    }
    public Integer getTotalDeposit() {
        return totalDeposit;
    }
    public void setTotalDeposit(Integer totalDeposit) {
        this.totalDeposit = totalDeposit;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public RentedCostume[] getRentedCostume() {
        return rentedCostume;
    }
    public void setRentedCostume(RentedCostume[] rentedCostume) {
        this.rentedCostume = rentedCostume;
    } 
}
