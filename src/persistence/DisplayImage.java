package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utility.Connectionn;

public class DisplayImage {
	public  String displayImage(int id) {  
		int ids=0;
		String imgpath=null;
       // boolean status = false;
        PreparedStatement pstmt=null;
    	Connection con=null;
    	ResultSet rs=null;
    	try{
         con=Connectionn.createConnection();
		 pstmt=  con.prepareStatement("select * from Student_Image where id=?");
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if( rs.next())
            {
                ids=rs.getInt("id");
            	imgpath=rs.getString("image");
            }

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
           	        
        return imgpath;
    }

}
