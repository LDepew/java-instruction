package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.User;

public class UserDB implements DAO<User> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String userName = "prs_user" ;
		String password = "sesame" ;
		Connection conn = DriverManager.getConnection(dbURL, userName, password);
		return conn;
	}

	@Override
	public User getById(int id) {
		User u = null;
		String sql = "select * from user where id = ?";
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				u = getUserFromResultSet(rs);
			}
			conn.close();
		}
		 catch (SQLException e) {
				System.err.println("Error getting user by id.");
				e.printStackTrace();
			}

		return u;
	}

	@Override
	public List<User> getAll() {
		List<User> user = new ArrayList<>();
		String sql = "select * from user";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				User u = getUserFromResultSet(rs);
				user.add(u);
			}
		} catch (SQLException e) {
			System.err.println("Error gettin all users.");
			e.printStackTrace();
		}
		return user;
	}
	
	private User getUserFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String userName = rs.getString(2);
		String password = rs.getString(3);
		String firstName = rs.getString(4);
		String lastName = rs.getString(5);
		String phoneNumber = rs.getString(6);
		String email = rs.getString(7);
		boolean isReviewer = rs.getBoolean(8);
		boolean isAdmin = rs.getBoolean(9);
		User u = new User(id, userName, password, firstName, lastName,
							phoneNumber, email, isReviewer, isAdmin);
		return u;
	}

	@Override
	public boolean add(User u) {
		boolean success = false;
		String sql = "insert into user (id, userName, password, firstName, lastName,"
				+ "phoneNumber, email, isReviewer, isAdmin) " +
					 "values (?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstName());
			ps.setString(4, u.getLastName());
			ps.setString(5, u.getPhoneNumber());
			ps.setString(6, u.getEmail());
			ps.setBoolean(7, u.isReviewer());
			ps.setBoolean(8, u.isAdmin());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.err.println("Error adding user.");
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User u) {
		boolean success = false;
		String sql = "delete from user where id = ?";
		try (Connection conn = getConnection();
				 PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, u.getId());
				ps.executeUpdate();
				success = true;
			} catch (SQLException e) {
				System.err.println("Error deleting user.");
				e.printStackTrace();
			}
		return false;
	}

}
