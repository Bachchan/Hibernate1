package model;

import java.io.InputStream;

public class Student {
	int SID;
	String sFirstName;
	String sLastName;
	String sMiddleName;
	InputStream image;
	public InputStream getImage() {
		return image;
	}
	public void setImage(InputStream image) {
		this.image = image;
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	
	public String getsFirstName() {
		return sFirstName;
	}
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}
	public String getsLastName() {
		return sLastName;
	}
	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}
	public String getsMiddleName() {
		return sMiddleName;
	}
	public void setsMiddleName(String sMiddleName) {
		this.sMiddleName = sMiddleName;
	}

}
