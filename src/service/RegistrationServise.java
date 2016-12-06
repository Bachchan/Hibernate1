package service;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Student;
import persistence.DisplayImage;
import persistence.Registration;
import persistence.Search;

public class RegistrationServise {
	Registration reg = new Registration();
	public int saveStudentRegistration(Student student)
	{
		return reg.saveStudentRegistration(student);
		
	}
	public ArrayList<Student> showData() throws SQLException, Exception
	{
		return reg.getStudentData();
	}
	
	public ArrayList<Student> displaySearch(String name) throws SQLException,Exception
	{
		Search search=new Search();
		return search.search(name);
		
	}
	public ArrayList<Student> displaySearch() throws SQLException,Exception
	{
		Search search=new Search();
		return search.search();
		
	}
	public String serviceImage(int id)
	{
		DisplayImage img=new DisplayImage();
		return img.displayImage(id);
		
	}
}
