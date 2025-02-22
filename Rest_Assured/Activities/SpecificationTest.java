package examples;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecificationTest {
 
//Declare request specification
RequestSpecification requestSpec;
ResponseSpecification responseSpec;
int petId = 0;

@BeforeClass
public void setUp() {
 // Create request specification
	  requestSpec = new RequestSpecBuilder()
     .setContentType(ContentType.JSON)
     .setBaseUri("https://petstore.swagger.io/v2/pet")
     .addHeader("Content-Type", "application/json")
     .build();
 
	  // Create response specification
	  responseSpec = new ResponseSpecBuilder()
			.expectStatusCode(200)
			.expectContentType("application/json")
		//	.expectBody("status", equalTo("alive"))
			.expectResponseTime(lessThanOrEqualTo(4000L))
			.build();
  
}
@Test(priority = 1)
public void addNewPet() {
	Map<String, Object> reqBody = new HashMap<>();
	reqBody.put("id", 77991);
	reqBody.put("name", "Pluto");
	reqBody.put("status", "alive");

	Response response = given()
		.spec(requestSpec)	
		.body(reqBody) // Add request body
		.when().post(); // Send POST request
	petId = response.then().extract().path("id");
	// Assertion
	response.then().spec(responseSpec).body("name", equalTo("Pluto"));
	
}

@Test(priority = 2)
public void getPetInfo() {
	given().spec(requestSpec).pathParam("petId",petId).
	when().get("/{petId}").
	then().spec(responseSpec).body("status", equalTo("alive"));

	}

@Test(priority = 3)
public void deletePet() {
	given().spec(requestSpec).pathParam("petId",petId).
	when().delete("/{petId}").
		then().spec(responseSpec).body("status", equalTo("alive"));

}
} 