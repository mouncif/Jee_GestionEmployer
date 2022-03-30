package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoEmployer {
      static Connection cnx = null;
	public static void startConnection() {
				
		try {
		//	Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dbemployer?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			cnx = DriverManager.getConnection(url, "root", "");
			//Statement S = cnx.createStatement();
			//Class.forName("org.postgresql.Driver"); 
			//cnx = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Gestion","postgres", "123");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static int Create(Employer em) {
		int trace = 0;
		try {
			String sql = "insert into employer(name, password, email, country) values(?, ?, ?, ?)";
			PreparedStatement s =  cnx.prepareStatement(sql);
			s.setString(1, em.getName());
			s.setString(2, em.getPassword());
			s.setString(3, em.getEmail());
			s.setString(4, em.getCountry());
			trace =s.executeUpdate();
			cnx.close();
		}catch(Exception e1) {System.out.println(e1);}
		return trace;
	}
	
	public static int update(Employer em) {
		int trace = 0;
		try {
			String sql = "update employer set name=?, password=?, email=?, country=? where id=?";
			PreparedStatement s =  cnx.prepareStatement(sql);
			s.setString(1, em.getName());
			s.setString(2, em.getPassword());
			s.setString(3, em.getEmail());
			s.setString(4, em.getCountry());
			s.setInt(5, em.getId());
			trace =s.executeUpdate();
			cnx.close();
		}catch(Exception e1) {System.out.println(e1);}
		return trace;
	}
	
	
	public static int delete(int id) {
		int trace = 0;
		try {
			String sql = "delete from employer where id=?";
			PreparedStatement s =  cnx.prepareStatement(sql);
			s.setInt(1, id);
			trace =s.executeUpdate();
			cnx.close();
		}catch(Exception e1) {System.out.println(e1);}
		return trace;
	}
	
	public static Employer find(int id) {
		Employer em = new Employer();
		try {
			String sql = "select * from employer where id=?";
			PreparedStatement s =  cnx.prepareStatement(sql);
			s.setInt(1, id);
			ResultSet rs =s.executeQuery();
			em.setId(rs.getInt(1));
			em.setName(rs.getString(2));
			em.setPassword(rs.getString(3));
			em.setEmail(rs.getString(4));
			em.setCountry(rs.getString(5));
			cnx.close();
		}catch(Exception e1) {System.out.println(e1);}
		return em;
	}
	
	public static List<Employer> getAll() {
		List<Employer> lsemp = new ArrayList<Employer>();
		try {
			String sql = "select * from employer";
			PreparedStatement s =  cnx.prepareStatement(sql);
			ResultSet rs =s.executeQuery();
			while(rs.next()) {
				Employer em = new Employer();
			      em.setId(rs.getInt(1));
			      em.setName(rs.getString(2));
			      em.setPassword(rs.getString(3));
			      em.setEmail(rs.getString(4));
			      em.setCountry(rs.getString(5));
			    lsemp.add(em);
			}
			cnx.close();
		}catch(Exception e1) {System.out.println(e1);}
		return lsemp;
	}
	
	
}
