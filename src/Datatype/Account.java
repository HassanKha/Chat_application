package Datatype;
import java.util.ArrayList;

public class Account {
	private String Name;
	private String UserName;
	private String PassWord;
	private static ArrayList<String> Contacts;

	 public Account(String Name,String UserName,String PassWord, ArrayList<String> C){
		this.Name=Name;
		this.UserName=UserName;
		this.PassWord=PassWord;
		this.Contacts=C;
	}
public void printacc() {
	for (String a : Contacts) {
		System.out.println(a);
	}
}
	public void setName(String N) {
		this.Name=N;
	}
	public void setUserName(String N) {
		this.UserName=N;
	}
	public void setPassWord(String N) {
		this.PassWord=N;
	}
	public void setContacts(ArrayList<String> C) {
		this.Contacts=C;
	}

	public String GetName() {
		return this.Name;
	}
	public String GetUserName() {
		return this.UserName;
	}
	public String GetPassWord() {
		return this.PassWord;
	}
	public ArrayList<String> getContacts() {
		return this.Contacts;
	}

	public void PushContact(String C) {
		this.Contacts.add(C);
	}
	public void RemoveContact(String C) {
		this.Contacts.remove(C);
	}
	public boolean isinmycontact(String s) {
		for (String user : this.Contacts) {
			System.out.println(user + " dd " + s);
			if(s.equals(user)) {
				System.out.println("here");
				return true;
			}
		}
		System.out.println("out");
		return false;
	}

}