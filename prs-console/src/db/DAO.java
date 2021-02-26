package db;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//p.479
public interface DAO<T> {
	T getById(int id);
	List<T> getAll();
	boolean Add(T t);
	boolean update(T t);
	boolean delete(T t);
	

}

