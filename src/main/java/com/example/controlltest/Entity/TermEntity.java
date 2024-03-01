package com.example.controlltest.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "terms")
public class TermEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "english_term", nullable = false)
    private String englishTerm;

    @Column(name = "russian_term", nullable = false)
    private String russianTerm;

    @Column(name = "estonian_term", nullable = false)
    private String estonianTerm;

    @Column(name = "definition", nullable = false)
    private String definition;

    public TermEntity(String englishTerm, String russianTerm, String estonianTerm, String definition) {
        this.englishTerm = englishTerm;
        this.russianTerm = russianTerm;
        this.estonianTerm = estonianTerm;
        this.definition = definition;
    }

}

