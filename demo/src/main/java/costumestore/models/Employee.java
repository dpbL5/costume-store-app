package costumestore.models;

public class Employee {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String position;

    public Employee(String name, String username, String password, String phone, String position) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.position = position;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }
}
