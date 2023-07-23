package API_automation.Restassured;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.*;


public class pojo {

public static void main(String[] args) {
	
Addressinformation abcd = new Addressinformation();
 abcd.setHousenumber("1234"); // complex json
 abcd.setLandmark("hjk");
 abcd.setWardno("klm");
 
 Designationinformation[] designation = new Designationinformation[1];
	 designation[0]= new Designationinformation(); //array json
	 designation[0].setCategory("abcd");
     designation[0].setDivision("xfg");
     designation[0].setDepartment("hjk");
 
 
 
 basicinfomation abc = new basicinfomation(); //has a relatioship
 abc.setFirstname("AR");
 abc.setLastname("Rajpuutt"); //simple json
 abc.setId("362");
 abc.setAddress(abcd);
 abc.setDesignation(designation);
 
Response res =
			given()
			.contentType(ContentType.JSON)
 .body(abc)
 .when()
 .post("http://localhost:3000/APIBatchStudents");
 System.out.println("Status code is "+res.statusCode());
 System.out.println("response data is ");
 System.out.println(res.asString());
}

}
