package db;

import java.util.List;

import business.Movie;

//p.479
public interface DAO<T> {
	T getById(int id);
	List<T> getAll();
	boolean Add(T t);
	boolean update(T t);
	boolean delete(T t);
	boolean add(Movie newMovie);
	

}
