package api;

public class BaseTest {

    protected static APIService apiServices;
    protected static Component apiComponent;
    protected static final String GET = "GET";
    protected static final String POST = "POST";
    protected static final String PUT = "PUT";
    protected static final String PATCH = "PATCH";
    protected static final String DELETE = "DELETE";

    public BaseTest() {
    }
    static {
        apiServices = new APIService();
        apiComponent = new Component();
    }
}
