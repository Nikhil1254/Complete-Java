import java.sql.*;

public class Practice {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "Forcedile@123";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement st = con.createStatement();
        ResultSet res = st.executeQuery("select * from employee");

        while (res.next()) {
            int id = res.getInt("id");
            String name = res.getString("name");

            System.out.println(id + "\t" + name);
        }
        // int count = st.executeUpdate("insert into employee(id,name)
        // values(51,'Ritvik')");
        //System.out.println(count);
    }
}