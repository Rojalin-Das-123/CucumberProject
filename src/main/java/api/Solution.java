package api;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.java.eo.Do;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import netscape.javascript.JSObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Solution {
    private static RequestSpecification request ;

    @DataProvider(name="data-pro",parallel = true)
    public static Object[][] data() throws IOException {

     int row=ReadExcel.rowCount("src/main/java/api/excel/file.xlsx","file");
     int col=ReadExcel.colCount("src/main/java/api/excel/file.xlsx","file",row-1);
     Object[][] obj = new Object[row-1][col];
     for(int i=1;i<row;i++){
       for(int j=0;j<col;j++){
           obj[i-1][j]=ReadExcel.cell("src/main/java/api/excel/file.xlsx","file",i,j);
       }
     }
        return obj;
    }

    @Test(dataProvider = "data-pro",enabled = true)
    public static void post(Double name, Double job,Double salary){
        RestAssured.baseURI="https://reqres.in";
        request= RestAssured.given();
        JsonObject object = new JsonObject();
        object.add("name",name);
        object.add("jon",job);
        request.body(object.toString());
        Response response = request.post("/api/users");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().toString());
    }

    @Test(enabled = false)
    public static void delete(){
        RestAssured.baseURI="https://reqres.in";
        request= RestAssured.given();
        Response response=request.delete("/api/users/2");
        System.out.println(response.getStatusCode());

    }

    @Test(enabled = false)
    public static void patch(){
        RestAssured.baseURI="https://reqres.in";
        request= RestAssured.given();
        request.contentType("application/json");
        JsonObject object = new JsonObject();
        object.add("name","Rojalin");
        object.add("jon","SDET");
        request.body(object.toString());

        Response response= request.patch("/api/users/2");
        System.out.println( response.getStatusCode());


    }
    

}
