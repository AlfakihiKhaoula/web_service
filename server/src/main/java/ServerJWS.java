import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:7070/" ,new BanqueService());
        System.out.println("Web Service déployé sur http://0.0.0.0:7070/");
    }
}
