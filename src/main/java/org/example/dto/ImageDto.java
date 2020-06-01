package org.example.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ImageDto {
    private String imageID;
    private String imageUrl;
    private boolean isActive;
}
