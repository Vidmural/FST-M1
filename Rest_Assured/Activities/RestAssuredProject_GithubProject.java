package liveProject;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class RestAssuredProject_GithubProject {


	String sshKey = "ssh";
	int sshKeyId =0;
	
	//Request Specification
	RequestSpecification requestSpec = new RequestSpecBuilder().
			setBaseUri("https://api.github.com/user/keys").
			addHeader("Authorization", "token ").
			addHeader("Content-Type", "application/json").
			build();
	
	//Response Specification
	ResponseSpecification responseSpec = new ResponseSpecBuilder().
		//	expectResponseTime(LessThan(4000L)).
			expectBody("key", equalTo(sshKey)).
			expectBody("title", equalTo("TestAPIKey")).
			build();
	
	@Test (priority = 1)
	public void postRequestTest() {
		//path: https://api.github.com/user/keys
		//Request body
		
		Map<String, String> reqBody = new HashMap<>();
		reqBody.put("title", "TestAPIKey");
		reqBody.put("key", sshKey);
		
		//Generate response
		Response response = given().spec(requestSpec).body(reqBody).when().post();
		
		//Extract the id
		sshKeyId = response.then().extract().path("id");
		
		//Assertions
		response.then().statusCode(201).spec(responseSpec);
		
	}
	
	@Test (priority = 2)
	public void getRequestTest() {
		//path: https://api.github.com/user/keys/{keyId}
		//Generate response and assert
		
		given().spec(requestSpec).pathParam("keyId",sshKeyId).
		when().get("/{keyId}").
		then().statusCode(200).spec(responseSpec);
		
			
	}
	
	@Test (priority = 3)
	public void deleteRequestTest() {
		//path: https://api.github.com/user/keys/{keyId}
		//Generate response and assert
		
		given().spec(requestSpec).pathParam("keyId",sshKeyId).
		when().delete("/{keyId}").
		then().statusCode(204);
		//then().statusCode(204).time(LessThan(3000L));
	}
	
	
}
