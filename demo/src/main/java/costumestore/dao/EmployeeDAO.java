package costumestore.dao;

import costumestore.models.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO implements Dao<Employee> {
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=costume-store;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String PASS = "123456";

    public EmployeeDAO() {
        System.out.println("EmployeeDAO initialized.");
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public Employee SelectByCondition(Employee emp) {
        String query = "SELECT * FROM tblEmployee WHERE username = ? AND password = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setString(1, emp.getUsername());
            pstmt.setString(2, emp.getPassword());
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Employee employee = new Employee(
                        rs.getString("name"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("phone"),
                        rs.getString("position")
                    );
                    employee.setId(rs.getInt("id"));
                    return employee;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
