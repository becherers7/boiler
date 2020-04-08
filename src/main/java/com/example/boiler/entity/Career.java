package com.example.boiler.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "careers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Career {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer careerId;
    @Column(name = "career")
    private String career;
    //career references the entity Person property career
    @OneToMany(mappedBy = "career")
    @JsonManagedReference
    private List<Person> personList;
}
