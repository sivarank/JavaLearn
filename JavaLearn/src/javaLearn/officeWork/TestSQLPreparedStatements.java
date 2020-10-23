package javaLearn.officeWork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.ds.PGPoolingDataSource;

public class TestSQLPreparedStatements {

	public static void main(String[] args) throws SQLException {
		PGPoolingDataSource  source  = new PGPoolingDataSource();
		source .setDatabaseName("5974");
	    source.setDataSourceName("A Data Source");
	    source.setServerName("localhost");
	    source.setDatabaseName("5974");
	    source.setUser("postgres");
	    source.setPassword("Password~1");
	    source.setMaxConnections(10);

	    try (Connection conn = source.getConnection()) {
	      try (Statement stmt = conn.createStatement()) {
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS products (name VARCHAR(40), price INT)");
	      }

	      try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO products VALUES (?, ?)")) {
	        stmt.setString(1, "bike");
	        stmt.setInt(2, 10900);
	        stmt.executeUpdate();
	        stmt.setString(1, "shoes");
	        stmt.setInt(2, 7400);
	        stmt.executeUpdate();
	        stmt.setString(1, "phone");
	        stmt.setInt(2, 29500);
	        stmt.executeUpdate();
	      }

	      try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM products WHERE name = ?")) {
	        stmt.setString(1, "shoes");
	        ResultSet rs = stmt.executeQuery();
	        rs.next();
	        System.out.println(rs.getInt(2));
	      }
	    }
	}

}
