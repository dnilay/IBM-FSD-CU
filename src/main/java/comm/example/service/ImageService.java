package comm.example.service;

import comm.example.model.Image;

import java.util.Optional;

public interface ImageService {
    public Iterable<Image> getAllImages();
    public Optional<Image> getImageById(int imageId);
    public Image createImage(Image image);

}
