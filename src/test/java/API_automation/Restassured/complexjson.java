package API_automation.Restassured;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class complexjson {

	public static void main(String[] args) {
		JSONObject inner = new JSONObject();
		inner.put("House No", "125");
		inner.put("ward no", "12");
		inner.put("Landmark", "xyz");
		JSONObject outer  = new JSONObject();
		outer.put("Firstname", "Aditiddii");
		outer.put("lastname", "Rajpuuttt");
		outer.put("id","123456ee66");
		outer.put("Designation","ABCCC");
		outer.put("Address", inner);
		
		Response res =
		given()	
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.when()
		.post("http://localhost:3000/Javastudents");
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		
		
	}

}
