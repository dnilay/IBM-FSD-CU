package comm.example.service;

import comm.example.dao.ImageRepository;
import comm.example.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}
