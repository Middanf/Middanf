package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import entidad.Empleado;
import entidad.User;
import utils.MysqlDBConexion;

public class ModelUser {
	
	public List<User> listar() {
		User u = null;
		List<User> data = new ArrayList<User>();
		Connection cn= null;
		ResultSet rs = null;
		PreparedStatement pstm = null;
		
		try {
			
			cn = MysqlDBConexion.getConexion();
			String sql = "select user_id, name_user, lastname, login,´password´, email, cellphone  from ´user´";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				u = new User();
				u.setUser_id(rs.getInt(1));
				u.setName_user(rs.getString(2));
				u.setLastname(rs.getString(3));
				u.setLogin(rs.getString(4));
				u.setPassword(rs.getString(5));
				u.setEmail(rs.getString(6));
				u.setCellphone(rs.getInt(7));
				data.add(u);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		finally{
			try {
				if(rs!=null)rs.close();
				if(pstm!=null)pstm.close();
				if(cn!=null)cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return data;
		
	}
	
	public int registrarUser(User u) {
			
			int estado = 1;
			Connection cn = null;
			PreparedStatement pstm = null;
			
			try {
				
				cn = MysqlDBConexion.getConexion();
				String sql = "insert into ´user´ values (null, ?, ?, ?, ?, ?, ?, ?, ?)";
				pstm = cn.prepareStatement(sql);
				pstm.setString(1, u.getName_user());
				pstm.setString(2, u.getLastname());
				pstm.setString(3, u.getLogin());
				pstm.setString(4, u.getPassword());
				pstm.setString(5, u.getEmail());
				pstm.setInt(6, u.getCellphone());
				pstm.setString(7, u.getCreated_at());
				pstm.setString(8, u.getUpdate_at());
				
				estado = pstm.executeUpdate();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			finally{
				try {
					if(pstm!=null)pstm.close();
					if(cn!=null)cn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			return estado;
		}
	
	
	
	
	//Login
	
	public User iniciarSesion(String log,String pas){
		
		User obj = null;
		Connection cn=null;
		ResultSet rs=null;
		PreparedStatement pstm=null;
		
		try {
			
			String sql = "select * from ´user´ where login=? and ´password´=?";
			
			cn = MysqlDBConexion.getConexion();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, log);
			pstm.setString(2, pas);
			rs=pstm.executeQuery();
			
			if(rs.next()) {
				obj = new User();
				obj.setUser_id(rs.getInt(1));
				obj.setName_user(rs.getString(2));
				obj.setLogin(rs.getString(3));
				obj.setLogin(rs.getString(3));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstm!=null)pstm.close();
				if(cn!=null)cn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return obj;
		
	}


}
