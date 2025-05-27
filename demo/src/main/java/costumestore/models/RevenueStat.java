package costumestore.models;
import java.io.Serializable;

public class RevenueStat implements Serializable {
    private Long totalRevenue;

    public Long getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Long totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}
