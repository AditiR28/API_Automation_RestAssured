package API_automation.Restassured;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import static io.restassured.RestAssured.*;

public class Fourth_TC {

	public static void main(String[] args) throws FileNotFoundException {
     File f = new File("filepath");// connection
     FileInputStream fi = new FileInputStream(f);//stream object
     JSONTokener js = new JSONTokener(fi); //tokener object
     JSONObject j = new JSONObject(js); //jsob object object
     String data =j.toString();
     System.out.println("Enter a value");
     Scanner sc = new Scanner(System.in);
     Integer id = sc.nextInt();
     System.out.println("Enter a first name");
     String firstname = sc.next();
     data=data.replaceAll(Pattern.quote("{{"+" id "+"}}"),id.toString()); // dynamic valuee
     data=data.replaceAll(Pattern.quote("{{"+" firstname "+"}}"),id.toString());
     System.out.println(data);

     Response res =
 			given()	
 			.contentType(ContentType.JSON)
 			.body(j.toString())
 			.when()
 			.post("http://localhost:3000/JavaStudents");
     System.out.println(res.statusCode());
	}

}
