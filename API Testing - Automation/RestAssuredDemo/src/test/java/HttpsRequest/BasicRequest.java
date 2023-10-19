package HttpsRequest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


/*
given()
-Content type, header, cookies, Add Authorization etc
when()
-get,post,put,delete
then()
-Validation of status code,response validation
*/
/*
 * Get user - 
 * https://reqres.in/api/users/2
 * Post USer -
 * https://reqres.in/api/users
 * Put User -
 * https://reqres.in/api/users/2
 * Delete User - 
 * https://reqres.in/api/users/2
 */

public class BasicRequest {
	@Test
	void getUser() 
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
	}

}
