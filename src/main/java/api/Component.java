package api;

import java.util.HashMap;

public class Component {
    private String baseUrl;
    private String endPoint;
    private HashMap<String,String> headers;
    private Object requestBody;


    public Component(String baseUrl, String endPoint, HashMap<String, String> headers, Object requestBody) {
        this.baseUrl = baseUrl;
        this.endPoint = endPoint;
        this.headers = headers;
        this.requestBody = requestBody;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public HashMap<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    public  Object getRequestBody() {
        return this.requestBody;
    }

    public void setRequestBody(Object requestBody) {
        this.requestBody = requestBody;
    }

}
