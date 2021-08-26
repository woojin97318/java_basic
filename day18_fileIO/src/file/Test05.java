package file;

import java.io.Serializable;

public class Test05 implements Serializable{
	private String name;
	
	public void print() {
		System.out.println("name : " + name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
