package model.dao.impl;

import model.dao.SellerDao;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {

    Connection conn = null;
    PreparedStatement st = null;

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
