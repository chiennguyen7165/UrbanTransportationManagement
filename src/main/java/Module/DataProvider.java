package Module;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataProvider {
    public void ConnectDatabase(){
        String url = "jdbc:postgresql://localhost:5432/transport";
        String user = "postgres";
        String password = "postgres";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT VERSION()")) {
            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(DataProvider.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

}
