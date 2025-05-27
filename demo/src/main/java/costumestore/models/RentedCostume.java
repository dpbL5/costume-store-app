package costumestore.models;

import java.time.LocalDate;

public class RentedCostume {
    private Integer id;
    private Integer quantity;
    private LocalDate returnDate;
    private Costume costume;
    public Integer getId() {
        return id;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
    public Costume getCostume() {
        return costume;
    }
    public void setCostume(Costume costume) {
        this.costume = costume;
    }
}
