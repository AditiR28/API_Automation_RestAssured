package API_automation.Restassured;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.JSONObject;
// before hitting the request we need to prepare body data
// simple  using org.json library

public class First_TC {

	public static void main(String[] args) {
		JSONObject js = new JSONObject();
		js.put("first_name", "ABCCd");
		js.put("lastname", "xfgggss");
		js.put("id", "bb211");
		js.put("designation","abc");
		js.put("company","mkk");
		
   Response  res =
		   (Response) given()
          .contentType(ContentType.JSON)
          .body(js.toString())
        .when()
         .post("http://localhost:3000/Javastudents");
         System.out.println(res.statusCode());
       
		
	}

	

}
