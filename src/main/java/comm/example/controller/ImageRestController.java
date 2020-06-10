package comm.example.controller;

import comm.example.model.Image;
import comm.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ImageRestController {
    private ImageService imageService;

    @Autowired
    public ImageRestController(ImageService imageService) {
        this.imageService = imageService;
    }
    @GetMapping(value = {"/images"})
    public ResponseEntity<Iterable<Image>> getAllImages()
    {
       return ResponseEntity.status(HttpStatus.OK).body(imageService.getAllImages());
    }
    @GetMapping("/images/{imageId}")
    public ResponseEntity<Optional<Image>> getImageById(@PathVariable("imageId") int imageId)
    {
        return  ResponseEntity.status(HttpStatus.OK).body(imageService.getImageById(imageId));
    }
}