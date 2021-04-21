package test1;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;

public class testOnCourse {
	@Test
	public void get()
	{
	
		baseURI="http://localhost:8080/";
		given().get("/courses").
		then().statusCode(200).log().all();
		
	}
//	
	//this is coomntedme fur running put
	
	@Test
public void post()
	{
		JSONObject request=new JSONObject();
	
		
		request.put("title", "city");
		
		request.put("description", "Shekhar");
		
		baseURI="http://localhost:8080/";
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).
		 body(request.toJSONString()).
		 when()
		 .post("/courses").
		 then().
		 statusCode(200).log().all();
		
	}
		

	
	
	@Test
	public void put()
	{
		JSONObject request=new JSONObject();
		
		request.put("id", 1);	
		request.put("title", "Amerrica in the part");	
		request.put("description", "Fiction");
		
	
		baseURI="http://localhost:8080/";
		
		 given().contentType(ContentType.JSON).accept(ContentType.JSON).
		 body(request.toJSONString()).
		 when()
		 .put("/courses").
		 then().
		 statusCode(200).log().all();
	
	}
	
//	@Test
//	public void patch()
//	{
//		JSONObject request=new JSONObject();
//		
//		
//		request.put("lastName","Kumar");
//		 request.put("subjectId",2);
//		 
//		 baseURI="http://localhost:3000/";
//		 
//		 given().contentType(ContentType.JSON).accept(ContentType.JSON).
//		 body(request.toJSONString()).
//		 when()
//		 .patch("/users/3").
//		 then().
//		 statusCode(200).log().all();
//	
//	}
//	
	@Test
	public void delete()
	{
	
		baseURI="http://localhost:8080/";
		
		 when()
		 .delete("/courses/2").
		 then().
		 statusCode(200).log().all();
	
	}
	

}
