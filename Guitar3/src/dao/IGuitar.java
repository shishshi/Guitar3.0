package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import sqliteDao.GuitarImpl;
import util.DBUtil;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;
import util.DBUtil;
import model.*;

public interface IGuitar {
	public  Inventory inventory() ;
	public List<Guitar> getAllGuitars();
	public void addGuitar(int id, double price,GuitarSpec spec);
	public void deleteGuitar(int id);
}
