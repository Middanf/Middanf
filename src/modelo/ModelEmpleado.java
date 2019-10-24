package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entidad.Empleado;
import utils.MysqlDBConexion;

public class ModelEmpleado {

	public Empleado iniciarSesion(String log,String pas){
	
		Empleado obj = null;
		Connection cn=null;
		ResultSet rs=null;
		PreparedStatement pstm=null;
		
		try {
			
			String sql = "select * from tb_empleado where login_emp=? and clave_emp=?";
			
			cn = MysqlDBConexion.getConexion();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1,  log);
			pstm.setString(2, pas);
			rs=pstm.executeQuery();
			
			if(rs.next()) {
				obj = new Empleado();
				obj.setCodigo(rs.getInt(1));
				obj.setNombre(rs.getString(2));
				obj.setApelliedos(rs.getString(3));
				obj.setLogin(rs.getString(4));
				obj.setLogin(rs.getString(4));
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
