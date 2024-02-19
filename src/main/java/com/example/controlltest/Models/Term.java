package com.example.controlltest.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Term {

    private Long id;
    private String englishTerm;
    private String russianTerm;
    private String estonianTerm;
    private String definition;
}

