package jp.co.scsk.kyushu.jdbcSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSample {

	public static void main(String[] args) throws SQLException {
		String conUrl = "jdbc:sqlserver://localhost:1433;"
			  + "database=java_learning;"
			  + "user=java_learning;"
			  + "password=java_learning;"
              + "encrypt=true;"
              + "trustServerCertificate=true;";
		Connection con = DriverManager.getConnection(conUrl);

		String sql = "select * from nmrm_car_model";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
		    System.out.println(rs.getString("car_model_id") + ":" + rs.getString("car_model_name"));
		}

		rs.close();
		stmt.close();
	}

}
