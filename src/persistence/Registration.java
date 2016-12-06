package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Student;
import utility.Connectionn;

public class Registration {
	PreparedStatement pstmt=null;
	Statement stmt=null;
	Connection con=null;
	ResultSet rs=null;
	
	public Registration(){
	con = Connectionn.createConnection();
	}
	
	
	public int saveStudentRegistration(Student student)
	{	int studentId=0;
		String query="INSERT INTO student_Info(SID,SNF,SMN,SLN) VALUES(?,?,?,?);";
		try{
		pstmt=con.prepareStatement(query);
		studentId=getId();
		pstmt.setInt(1, studentId+1);
		pstmt.setString(2, student.getsFirstName());
		pstmt.setString(3, student.getsMiddleName());
		pstmt.setString(4, student.getsLastName());
        int count=pstmt.executeUpdate();
		System.out.println("Reg Successfull");
		assert count>=1:false;
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				if (con!=null)
				{
				  con.close();	
				}
				if (pstmt!=null) {
					pstmt.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return studentId;
			
	}

	public int getId()throws SQLException, Exception
	{
		
		Connection con=Connectionn.createConnection();
		String queryGet = "select max(SID) as SID from student_Info;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(queryGet);
		while (rs.next()) {
			return rs.getInt(1);
		}
		return 0;
		
	}
	
	
	public ArrayList<Student> getStudentData()throws SQLException, Exception
	{
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		try {
			
			Connection con=Connectionn.createConnection();
			String queryGet1 = "select sid,snf,smn,sln from student_Info";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(queryGet1);
			
			
			while(rs.next()) {
				Student st = new Student();
				st.setSID(rs.getInt("sid"));
				st.setsFirstName(rs.getString("snf"));
				st.setsMiddleName(rs.getString("smn"));
				st.setsLastName(rs.getString("sln"));
				
				studentList.add(st);
					
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				if (con!=null)
				{
				  con.close();	
				}
				if (pstmt!=null) {
					pstmt.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return studentList;
	}
}
