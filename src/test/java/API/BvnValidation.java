package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BvnValidation {
    String baseURL = RestAssured.baseURI = "https://adjutor.lendsqr.com/v2/verification/bvn/:bvn";
    String token = "Bearer ee07e954-e2e4-4ec5-8686-f69498496ad0";

    @Test
    public void InitializingBVN(){
        RequestSpecification request = given().
                header("Content-Type","application/json").
                header("Authorization",token).
                body("{\n" +
                        "    \"status\": \"error\",\n" +
                        "    \"message\": \"Forbidden\"\n" +
                        "}");
        Response response = request.when().post("/verification/bvn/:bvn");
        //ass
        response.then().assertThat().statusCode(201);
        response.prettyPrint();
    }
}
