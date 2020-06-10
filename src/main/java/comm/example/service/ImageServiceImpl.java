package comm.example.service;

import comm.example.dao.ImageRepository;
import comm.example.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService {
    private ImageRepository imageRepository;

    @Autowired
    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    @Transactional
    public Iterable<Image> getAllImages() {
        return imageRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Image> getImageById(int imageId) {
        return imageRepository.findById(imageId);
    }

    @Override
    @Transactional
    public Image createImage(Image image) {
        return imageRepository.save(image);
    }
}
