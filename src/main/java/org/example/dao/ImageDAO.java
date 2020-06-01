package org.example.dao;

import org.example.dto.ImageDto;
import org.example.entity.Image;

public interface ImageDAO {
    public ImageDto createImage(ImageDto imageDto);
}
