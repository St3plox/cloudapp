package ru.tvey.cloudserverapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor(force = true)
@Table(name = "files")
public class FileStorage {

    @Column(name = "file_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "content")
    private byte[] content;


    @Column(name = "name")
    @NonNull
    private String name;


}
