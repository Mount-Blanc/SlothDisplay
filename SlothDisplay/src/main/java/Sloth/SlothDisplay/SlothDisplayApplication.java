package Sloth.SlothDisplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;

@SpringBootApplication
@RestController
public class SlothDisplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlothDisplayApplication.class, args);
	}

	@GetMapping("/")
	public String sayHello() {
		return "Type sloth or sloth<number> to see sloth image!";
	}	@GetMapping(value = "/{imageName}", produces = MediaType.IMAGE_JPEG_VALUE)
	public Resource getImage(@PathVariable String imageName) {
		return new ClassPathResource("static/" + imageName + ".jpg");
	}

}
