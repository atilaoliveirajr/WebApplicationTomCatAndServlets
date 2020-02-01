package br.com.alura.maven.servlet;

import java.util.ArrayList;
import java.util.List;

public class DataBankSimulator {
	
	private static List<Company> datBankSimulatorlist = new ArrayList<Company>();
	
	static {
		Company company = new Company("Alura");
		Company company2 = new Company("Caelum");
		
		datBankSimulatorlist.add(company);
		datBankSimulatorlist.add(company2);	
	}
	
	public void add(Company company) {
		DataBankSimulator.datBankSimulatorlist.add(company);
	}
	
	public List<Company> getCompany(){
		return DataBankSimulator.datBankSimulatorlist;
	}
}
