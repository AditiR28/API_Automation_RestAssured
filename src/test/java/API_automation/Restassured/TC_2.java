package API_automation.Restassured;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC_2 {

	public static void main(String[] args) {
		 Response res =
			       given()
			       .contentType(ContentType.JSON)
			       .when()
			       .get("http://localhost:3000/Javastudents"); // all get query
			    System.out.println("Status code is");
			    System.out.println(res.statusCode());
			    System.out.println("Response Status Code");
			    System.out.println(res.asString());
			    Response res1 =
					       given()
					       .contentType(ContentType.JSON)
					       .when()
					       .get("http://localhost:3000/Javastudents/105"); //path parameter
					    System.out.println("Status code is");
					    System.out.println(res1.statusCode());
					    System.out.println("Response Status Code");
					    System.out.println(res1.asString());
					    Response res2 =
							       given()
							       .contentType(ContentType.JSON)
							       .when()
							       .get("http://localhost:3000/Javastudents?first name =ABCCC&id=bb210"); // query parameter
							    System.out.println("Status code is");
							    System.out.println(res2.statusCode());
							    System.out.println("Response Status Code");
							    System.out.println(res2.asString());

	}

}
