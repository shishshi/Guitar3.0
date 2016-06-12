package mysqlDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil1;
import dao.IGuitar;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;

public class GuitarImpl implements IGuitar {
    @Override
	public  Inventory inventory()  
	{
		Inventory inventory = new Inventory();
		DBUtil1 db=new DBUtil1();
		Connection connection =DBUtil1.getConnection();
		PreparedStatement pstat;
		ResultSet rs;
		try {
			pstat = connection.prepareStatement("select * from guitar");
			rs = pstat.executeQuery();
			while (rs.next()) {
				GuitarSpec guitarspec = new GuitarSpec(null, null, null, null);
				guitarspec.setBuilder(rs.getString("builder"));
				guitarspec.setModel(rs.getString("model"));
				guitarspec.setType(rs.getString("type"));
				guitarspec.setWood(rs.getString("wood"));
							
				inventory.addGuitar(rs.getInt("id"), rs.getDouble("price"), guitarspec);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inventory;
	}
	
    @Override
	public List<Guitar> getAllGuitars(){
		Connection Conn = DBUtil1.getConnection();
		String sql = "select * from guitar";
		List<Guitar> inventory = new ArrayList<Guitar>();
		try {
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				GuitarSpec guitarspec = new GuitarSpec(null, null, null, null);
				guitarspec.setBuilder(rs.getString("builder"));
				guitarspec.setModel(rs.getString("model"));
				guitarspec.setType(rs.getString("type"));
				guitarspec.setWood(rs.getString("wood"));
				Guitar guitar=new Guitar(rs.getInt("id"), rs.getDouble("price"), guitarspec);			
				inventory.add(guitar);			
			}			
			rs.close();
			pstmt.close();
			Conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch(Exception e){
		    e.printStackTrace();	
		}finally{
			try{
		         if(Conn!=null)
		        	 Conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return inventory;
	}
    
    @Override
    public void addGuitar(int id, double price,GuitarSpec spec) {
    	Inventory inventory = new Inventory();
		DBUtil1 db=new DBUtil1();
		Connection connection =DBUtil1.getConnection();
		PreparedStatement pstat;
		ResultSet rs;
		try {
			pstat = connection.prepareStatement("insert into guitar(id,builder,model,type,Wood,price) values(?,?,?,?,?,?)");
			pstat.setInt(1, id);
			pstat.setString(2, spec.getBuilder());
			pstat.setString(3, spec.getModel());
			pstat.setString(4, spec.getType());
			pstat.setString(5, spec.getWood());
			pstat.setDouble(6, price);
			System.out.println(pstat.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
    @Override
    public void deleteGuitar(int id) {
		Inventory inventory = new Inventory();
		DBUtil1 db=new DBUtil1();
		Connection connection =DBUtil1.getConnection();
		PreparedStatement pstat;
		ResultSet rs;
		try {
			pstat = connection.prepareStatement("delete from guitar where id=?");
			pstat.setInt(1, id);
			System.out.println(pstat.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	

}
