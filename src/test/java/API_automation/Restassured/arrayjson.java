package API_automation.Restassured;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;

public class arrayjson {

	public static void main(String[] args) {
		
    JSONObject inner1  = new JSONObject();
    
    inner1.put("ward no", "testing");
    inner1.put("house no", "123");
    inner1.put("type", "primary address");
    inner1.put("landmark","XYZ");
    
    JSONObject inner2  = new JSONObject();

    inner2.put("ward no", "testing");
    inner2.put("house no", "123");
    inner2.put("type", "Secondary address");
    inner2.put("landmark","XYZ");
    
    JSONArray array = new JSONArray();
    
    array.put(0,inner1);
    array.put(1,inner2);
    
    JSONObject outer = new JSONObject();
    
    outer.put("firstname", "aditiii");
    outer.put("lastname", "rajputtttt");
     outer.put("id","hjjhsd");
	outer.put("Designation","ABCD"); 
	outer.put("Address",array);
	
	Response res =
			given()	
			.contentType(ContentType.JSON)
			.body(outer.toString())
			.when()
			.post("http://localhost:3000/APIstudents");
			System.out.println("Status code is");
			System.out.println(res.statusCode());
			


	}

}
