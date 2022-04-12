package sfmc.gateway;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("localdiscovery")
@RestController
public class LocalDiscoveryController {

    @GetMapping("/localdiscovery/hello")
    public String sayHello() {
        return "localdiscovery - HELLO";
    }
}
