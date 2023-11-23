package sandipchitale.server1sslbundle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ServersslbundleApplication {

	@Profile("server1")
	@RestController
	public static class Server1IndexController {

	    @GetMapping("/")
	    public String index() {
	        return "This is Server1";
	    }
	}

	@Profile("server2")
	@RestController
	public static class Server2IndexController {

	    @GetMapping("/")
	    public String index() {
	        return "This is Server2";
	    }
	}


	public static void main(String[] args) {
		SpringApplication.run(ServersslbundleApplication.class, args);
	}

}
