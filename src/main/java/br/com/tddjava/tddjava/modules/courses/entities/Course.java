package br.com.tddjava.tddjava.modules.courses.entities;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "courses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String description;

    private String name;

    private Integer workload;
}
