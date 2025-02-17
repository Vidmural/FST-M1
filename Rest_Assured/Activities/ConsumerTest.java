package liveProject;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
	//Set the headers
	Map<String, String> headers = new HashMap<>();
	//create the contract(Pact)
	@Pact(consumer = "UserConsumer", provider = "UserProvider")
	public RequestResponsePact createPact(PactDslWithProvider builder) {
		//Set the headers
		headers.put("Content-Type", "application/json");
		//request and response body
		DslPart reqResBody = new PactDslJsonBody().
				numberType("id", 1608).
				stringType("firstName", "Vidya").
				stringType("lastName", "Muralidhar").
				stringType("email", "vidm@in.com");
		//create the pact
		
		return builder.given("POST Request").
				uponReceiving("A request to create a user")
				.method("POST")
				.path("/api/users")
				.headers(headers)
				.body(reqResBody)	
				.willRespondWith()
				.status(201)
				.body(reqResBody)	
				.toPact();
	}

	
	//Consumer test with mockProvider
	@Test
	@PactTestFor(providerName = "UserProvider", port = "8282")
	public void postRequestTest() {
		//create the request body
		Map<String, Object> reqBody = new HashMap<>();
		
		reqBody.put("id", 1608);
		reqBody.put("firstName", "Vidya");
		reqBody.put("lastName", "Muralidhar");
		reqBody.put("email", "vidm@in.com");
		
		//Send request, get response and add assertions
		given().baseUri("http://localhost:8282/api/users").headers(headers).body(reqBody).log().all()
		.when().post()
		.then().statusCode(201).body("firstName",equalTo("Vidya")).log().all();
		
		
	}
	
}
