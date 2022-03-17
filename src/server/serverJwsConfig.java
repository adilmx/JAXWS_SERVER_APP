package server;

import ws.AccountService;

import javax.xml.ws.Endpoint;

public class serverJwsConfig {
    public static void main(String[] args) {
        String url = "http://localhost:8080/";
        Endpoint.publish(url ,new AccountService());
        System.out.println("JAXWS SERVER STARTED ON : "+url);
    }
}
