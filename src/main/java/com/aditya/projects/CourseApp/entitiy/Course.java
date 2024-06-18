package com.aditya.projects.CourseApp.entitiy;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Primary;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

}
