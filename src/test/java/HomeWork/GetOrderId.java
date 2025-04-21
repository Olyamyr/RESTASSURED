package HomeWork;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetOlderId {
    @Test
    public void getOlderId() {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Content-type", "application/json")
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/user/");
        response.then()
                .log()
                .all()
                .statusCode(404);
    }
}