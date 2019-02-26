import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Swapi_Get {
    @Test

    public void testResponseCode() {

        Response resp = RestAssured.get("https://swapi.co/api/people");
        int code = resp.getStatusCode();

        System.out.println("status code is " + code);

        Assert.assertEquals(code, 200);
    }
}
