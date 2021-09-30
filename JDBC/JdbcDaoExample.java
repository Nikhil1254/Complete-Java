
//DAO - data access object
import java.sql.*;

public class JdbcDaoExample {
    public static void main(String[] args) throws Exception {
        Student.connect();
        System.out.println(Student.getName(4));
        // if (Student.insert(69, "Damodar"))
        // System.out.println("Record inserted sucessfully.");
        // else
        // System.out.println("Unable to insert record.");
        System.out.println(Student.getName(27));

        Student.showAllRecords();
    }
}

class Student {
    static Connection con = null;

    public static void connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Forcedile@123");
    }

    public static String getName(int rn) throws Exception {
        String query = "select name from student where rollno=" + rn;
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        res.next();
        return res.getString("name");
    }

    public static boolean insert(int rn, String name) throws Exception {
        String query = "insert into student values(?,?)";
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, rn);
        st.setString(2, name);
        int n = st.executeUpdate();

        return n > 0;
    }

    public static void showAllRecords() throws Exception{
        String query = "select * from student;";
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        System.out.println("rn\tname");
        while (res.next()) {
            System.out.println(res.getInt("rollno") + " - " + res.getString("name"));
        }
    }
}