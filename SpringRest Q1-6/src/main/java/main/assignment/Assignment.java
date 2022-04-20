package main.assignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignment {

	@RequestMapping("/Q1")
	public String HW() {
		return "Hello World";
	}

	@RequestMapping("/Q2/validate/{username}/{password}")
	public String validate(@PathVariable String username,@PathVariable String password) {
		if(username.equals("Anirudh")&&password.equals("Anirudh"))return "Valid" ;else return "invalid" ;
	}
	
	@RequestMapping("/Q3/{Zipcode}")
	public ZipCode Q3(@PathVariable int Zipcode)   {
		ZipCode zip = new ZipCode(521215,"Andhra Pradesh","Vissanapeta","India");
		if(Zipcode==zip.getID())return zip ; else return null ; 
	}
	
	@RequestMapping("/Q4/{CardNo}")
	public String Q4(@PathVariable String cardnum)   {return GetCardStatus(cardnum);}
    public String GetCardStatus( String cardnum){
        String  ans="Not valid";
        if(cardnum.matches("(?:2014|2149)[0-9]{11}"))
        	ans="Valid + enRoute";
        else if(cardnum.matches("((?:3528|3589|35[0-9]{3})[0-9]{11,14})"))
            ans="Valid + JCB";
        else if(cardnum.matches("(4[0-9]{12}(?:[0-9]{3}){0,2}$)"))
            ans="Valid + Visa";
        else if(cardnum.matches("^(5[1-5][0-9]{14}|2(22[1-9][0-9]{12}|2[3-9][0-9]{13}|[3-6][0-9]{14}|7[0-1][0-9]{13}|720[0-9]{12}))"))
            ans="Valid + MasterCard";
       return ans;
    }
}
