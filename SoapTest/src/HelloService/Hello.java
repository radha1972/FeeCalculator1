package HelloService;

import javax.jws.WebService;
import javax.jws.WebMethod;
@WebService
public class Hello {
    private String message = new String("Hello, ");

    public  Hello() {}

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}