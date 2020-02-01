package br.com.alura.maven.servlet;


public class Company {
	
	private static Integer id = 0;
	private String name;
	
	public Company(String name) {
		super();
		Company.id += 1;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		Company.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
