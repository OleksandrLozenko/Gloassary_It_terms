package com.example.controlltest.Services;

import com.example.controlltest.Models.Term;
import com.example.controlltest.Repository.TermRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TermService {

    @Autowired
    private TermRepository termRepository;

    public List<Term> getAllTerms() {
        return termRepository.findAll();
    }

    public Term getTermById(Long id) {
        Optional<Term> term = termRepository.findById(id);
        return term.orElse(null);
    }

    public Term createTerm(Term term) {
        return termRepository.save(term);
    }

    public Term updateTerm(Long id, Term termDetails) {
        Term term = getTermById(id);
        if (term != null) {
            term.setEnglishTerm(termDetails.getEnglishTerm());
            term.setRussianTerm(termDetails.getRussianTerm());
            term.setEstonianTerm(termDetails.getEstonianTerm());
            term.setDefinition(termDetails.getDefinition());
            return termRepository.save(term);
        }
        return null;
    }

    public void deleteTerm(Long id) {
        termRepository.deleteById(id);
    }
}

