package GroupID.ArtifactID;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITesting {
	
	
	RequestSpecification base = (RequestSpecification) RestAssured.given().get("https://reqres.in/api/users/");
	
	@BeforeTest
	public void prerequisites()
	{
	
	String basicURI = "https://reqres.in/api/users/";
	RestAssured.baseURI = basicURI;
//	RequestSpecification httpRequest = RestAssured.given();
	
	
//	JSONObject updateData = new JSONObject();
	
		
	}
	
	@Test
	public void getUserDetailsTest()
	{
		
		Response response = base.request(Method.GET,"2");
		int statusCode = response.getStatusCode();
		
		System.out.println("Status code is "+statusCode);
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
	}
}
