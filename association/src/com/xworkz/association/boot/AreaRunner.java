package com.xworkz.association.boot;

import com.xworkz.association.thing.Area;
import com.xworkz.association.thing.City;
import com.xworkz.association.thing.Company;
import com.xworkz.association.thing.CompanyType;
import com.xworkz.association.thing.Country;
import com.xworkz.association.thing.Mall;
import com.xworkz.association.thing.MallFamousFor;
import com.xworkz.association.thing.Security;
import com.xworkz.association.thing.State;

public class AreaRunner {

	public static void main(String[] args) {
	Area area=new Area("Rajajinagar",455444444,454);
	
	City city=new City();
	city.setcity("bagalkot", "bagalkot", "india");
	city.setArea(area);
	
	
	
	State state=new State();
	state.setState("karnataka", " Basavraj bommai", "kannada");
	state.setCity(city);
	
	
	Country country=new Country();
	country.setCountry("india", "murmu", "centralGovernment");
	country.setState(state);
	country.display();
	
	System.out.println("==============================");
	
	Company company = new Company();
	company.setcompany("TCS", "Ratan Tata", 1920, "Delhi", CompanyType.software);
	
	Security security=new Security();
	security.setsecurity("uniformDept", 125, 46);
	security.setcompany(company);
	
	
	Mall mall = new Mall();
	mall.setmall("Orion",true, 3, MallFamousFor.brandedCloths);
	mall.setsecurity(security);
	
	mall.display();
	
	
	
	
	
	
	}

}
