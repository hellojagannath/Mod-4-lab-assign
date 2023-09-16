import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		try {
			ResultSet rs = null;
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/myShop", "root", "Nnandilal19862021@");
			
			Statement st = conn.createStatement();
			rs = st.executeQuery("select * from Product");
			
			while(rs.next()) {

				String name = rs.getString("name");
                double cost = rs.getDouble("cost");
				
				
				System.out.println(name + cost);
				
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
	}

}
}
