import java.sql.DriverManager;

public class FornameExample {
    public static void main(String[] args) throws Exception {
        Class.forName("Pqr"); // only loads the class

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        Pqr obj = new Pqr();
    }
}

class Pqr {
    static {
        System.out.println("In static block - class loaded.");
    }

    {
        System.out.println("In instance block - instance created");
    }
}