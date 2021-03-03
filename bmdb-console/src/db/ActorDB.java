package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Actor;
import business.Movie;

public class ActorDB implements DAOUploadable<Actor> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useSSL=false";
		String userName = "bmdb_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, userName, password);
		return conn;
	}

	@Override
	public Actor getById(int id) {
		Actor a = null;
		String sql = "select * from actor where id = ?";
		try {
			Connection conn = getConnection();
			//p. 685 - prepared statements
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				a = getActorFromResultSet(rs);
			}
			conn.close();
		}
		 catch (SQLException e) {
				System.err.println("Error getting actor by id.");
				e.printStackTrace();
			}
		return a;
	}

	@Override
	public List<Actor> getAll() {
		List<Actor> actor = new ArrayList<>();
		String sql = "select * from actor";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery()) {
			// p.681 - processing result set
			while (rs.next()) {
				Actor a = getActorFromResultSet(rs);
				actor.add(a);
			}
		} catch (SQLException e) {
			System.err.println("Error gettin all actors.");
			e.printStackTrace();
		}
		return actor;
	}
	
	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String firstName = rs.getString(2);
		String lastName = rs.getString(3);
		String gender = rs.getString(4);
		String birthDate = rs.getString(5);
		Actor a = new Actor(id, firstName, lastName, gender, birthDate);
		return a;
	}

	@Override
	public boolean Add(Actor a) {
		boolean success = false;
		String sql = "insert into actor (id, firstName, lastName, gender, birthDate) " +
					 "values (?, ?, ?, ?)";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1,  a.getId());
			ps.setString(2, a.getFirstName());
			ps.setString(3, a.getLastName());
			ps.setString(4, a.getGender());
			ps.setString(5, a.getBirthDate());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.err.println("Error adding actor.");
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(Actor t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Actor a) {
		boolean success = false;
		// p. 691
		String sql = "delete from actor where id = ?";
		try (Connection conn = getConnection();
				 PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, a.getId());
				ps.executeUpdate();
				success = true;
			} catch (SQLException e) {
				System.err.println("Error deleting actor.");
				e.printStackTrace();
			}
		return success;
	}

	@Override
	public boolean add(Movie newMovie) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upload() {
		// TODO Auto-generated method stub
		return false;
	}

}
