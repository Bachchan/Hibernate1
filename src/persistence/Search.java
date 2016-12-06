package persistence;

//import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Student;
import utility.Connectionn;

public class Search {
	
	 public  ArrayList<Student> search(String name) throws SQLException, Exception
	 {        
		 ArrayList<Student> studentDetails = new ArrayList<Student>();
        PreparedStatement pstmt=null;
    	Connection con=null;
    	ResultSet rs=null;
    	
    	try{       
		 con=Connectionn.createConnection();
		 pstmt=  con.prepareStatement("select * from Student_info where SNF=? or SMN=?");
         pstmt.setString(1, name);
         pstmt.setString(2, name);
       
         rs = pstmt.executeQuery();
            
           while (rs.next()) {
        	    Student st = new Student();
				st.setSID(rs.getInt("sid"));
				st.setsFirstName(rs.getString("snf"));
				st.setsMiddleName(rs.getString("smn"));
				st.setsLastName(rs.getString("sln"));
				
				
				studentDetails.add(st);
					
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
    	return studentDetails;
           	        
        
      }

	 public  ArrayList<Student> search() throws SQLException, Exception
	 {        
		 ArrayList<Student> studentDetails = new ArrayList<Student>();
        PreparedStatement pstmt=null;
    	Connection con=null;
    	ResultSet rs=null;
    	
    	try{       
		 con=Connectionn.createConnection();
		 pstmt=  con.prepareStatement("select * from Student_info");
         rs = pstmt.executeQuery();
                while (rs.next()) {
        	    Student st = new Student();
				st.setSID(rs.getInt("sid"));
				st.setsFirstName(rs.getString("snf"));
				st.setsMiddleName(rs.getString("smn"));
				st.setsLastName(rs.getString("sln"));
				studentDetails.add(st);
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
    	return studentDetails;
           	        
        
      }
	
}


