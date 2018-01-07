package study.java.annotation.userDefined.test2;
public class TestVO {
	
	private String userName;
	private String phone;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "TestVO [userName=" + userName + ", phone=" + phone + "]";
	}
	
	
}
