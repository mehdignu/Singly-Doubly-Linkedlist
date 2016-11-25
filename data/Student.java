package data;

public class Student {
	private String prename;
	private String surname;
	private int mn;
	private int gender;
	
	public Student(String prename, String surname, int mn, int gender) {
		super();
		this.prename = prename;
		this.surname = surname;
		this.mn = mn;
		this.gender = gender;
	}
	
	public String getPrename() {
		return prename;
	}
	public void setPrename(String prename) {
		this.prename = prename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getMn() {
		return mn;
	}
	public void setMn(int mn) {
		this.mn = mn;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [prename=" + prename + ", surname=" + surname + ", mn=" + mn + ", gender=" + gender + "]";
	}

}
