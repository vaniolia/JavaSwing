import database.Database;
import java.sql.SQLException;

public class Main {
    static void main(String[] args) {

        Gui g = new Gui();
        g.createView();

        try {
            Database.connect();
            System.out.println("SQLite funktioniert!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}