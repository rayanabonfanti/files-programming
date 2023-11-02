package com.uploadanddownload.file.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "image_data")
public class ImageData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id")
    private Long id;

    @Column(name = "id_name")
    private String name;

    @Column(name = "id_type")
    private String type;

    @Lob
    @Column(name = "id_image_data",length = 1000)
    private byte[] imageData;

}
