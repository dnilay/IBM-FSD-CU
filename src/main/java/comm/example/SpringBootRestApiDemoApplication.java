package comm.example;

import comm.example.dao.ImageRepository;
import comm.example.model.Image;
import comm.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApiDemoApplication implements CommandLineRunner {
private ImageRepository imageRepository;

@Autowired
    public SpringBootRestApiDemoApplication(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        imageRepository.save(new Image(1,"http://demourl1",true));
        imageRepository.save(new Image(2,"http://demourl2",true));
        imageRepository.save(new Image(3,"http://demourl3",false));
        imageRepository.save(new Image(4,"http://demourl4",true));
        imageRepository.save(new Image(5,"http://demourl5",false));
        imageRepository.save(new Image(6,"http://demourl6",true));

    }
}
