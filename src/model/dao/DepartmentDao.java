package model.dao;

import com.mysql.cj.xdevapi.Client;
import db.DB;
import model.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public interface DepartmentDao {

     void insert(Department obj);
     void update(Department obj);
     void deleteById(Integer id);
     Department findById(Integer id);
     List<Department> findAll();
}
