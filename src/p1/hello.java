package p1;

import com.opensymphony.xwork2.ActionSupport;

public class hello extends ActionSupport {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String execute() throws Exception {

		return "success";
	}
}
