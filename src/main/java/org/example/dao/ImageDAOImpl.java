package org.example.dao;

import org.example.dto.ImageDto;
import org.example.entity.Image;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("imageDAO")
public class ImageDAOImpl implements ImageDAO{
    private SessionFactory sessionFactory;
    private Session session;

    @Autowired
    public ImageDAOImpl(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;
    }

    @Override
    public ImageDto createImage(ImageDto imageDto) {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Image image=mapper.map(imageDto,Image.class);
        session=sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(image);
        session.getTransaction().commit();
        imageDto=mapper.map(image,ImageDto.class);
        return imageDto;
    }


}
