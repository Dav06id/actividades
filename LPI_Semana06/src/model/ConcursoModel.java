    package model;


    import java.sql.Connection;

    import java.sql.PreparedStatement;

    import java.sql.ResultSet;

    import java.util.ArrayList;

    import java.util.List;

    import java.util.logging.Logger;


    import entidad.Concurso;

    import util.MySqlDBConexion;


    public class ConcursoModel {


    	private static Logger log = Logger.getLogger(ConcursoModel.class.getName());

    	public List<Concurso> listaConcursoPorPremio(double pi, double pf){

    		ArrayList<Concurso> salida = new ArrayList<Concurso>();

    		Connection conn = null;

    		PreparedStatement psmt = null;

    		ResultSet rs = null;

    		try {

    			//1 Se crea la conexion

    			conn = MySqlDBConexion.getConexion();

    			

    			//2 Se prepara el SQL

    			String sql = "SELECT * FROM concurso where premio between ? and ?";

    			psmt = conn.prepareStatement(sql);

    			psmt.setDouble(1, pi);

    			psmt.setDouble(2, pf);

    			

    			log.info(">>> " + psmt);

    			

    			//3 Se ejecuta el SQL en la base de datos

    			rs = psmt.executeQuery();

    			Concurso obj = null;

    			while(rs.next()) {

    				obj = new Concurso();

    				obj.setIdConcurso(rs.getInt(1));

    				obj.setNombre(rs.getString(2));

    				obj.setPremio(rs.getDouble(3));

    				obj.setPrecio(rs.getDouble(4));

    				salida.add(obj);

    			}

    		} catch (Exception e) {

    			e.printStackTrace();

    		} finally {

    			try {

    				if (rs != null) rs.close();

    				if (psmt != null) psmt.close();

    				if (conn != null) conn.close();

    			} catch (Exception e2) {}

    		}

    		return salida;

    	}

    }



