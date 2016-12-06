package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utility.Connectionn;

public class Login {
	
	        public  boolean validate(String name, String pass) {        
	        boolean status = false;
	        PreparedStatement pstmt=null;
	    	Connection con=null;
	    	ResultSet rs=null;
	    	try{
	         con=Connectionn.createConnection();
			 pstmt=  con.prepareStatement("select * from login_info where name=? and pass=?");
	            pstmt.setString(1, name);
	            pstmt.setString(2, pass);
	            rs = pstmt.executeQuery();
	            status = rs.next();

	        } catch (Exception e) {
	            System.out.println(e);
	        } finally {
	          try {
	        	  if (con != null) 
		                  con.close();
	                
	            if (pstmt != null) 
	                      pstmt.close();
            
	            if (rs != null)              
                        rs.close();
              		
			} catch (Exception e2) {
				e2.printStackTrace();
			}
	      }
	           	        
	        return status;
	    }
	}

