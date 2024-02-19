package com.example.controlltest.Controller;

import com.example.controlltest.Models.Term;
import com.example.controlltest.Services.TermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/terms")
public class TermController {

    @Autowired
    private TermService termService;

    @GetMapping("/{id}")
    public ResponseEntity<Term> getTermById(@PathVariable Long id) {
        Term term = termService.getTermById(id);
        return ResponseEntity.ok().body(term);
    }

    @PostMapping
    public ResponseEntity<Term> createTerm(@RequestBody Term term) {
        Term createdTerm = termService.createTerm(term);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTerm);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Term> updateTerm(@PathVariable Long id, @RequestBody Term termDetails) {
        Term updatedTerm = termService.updateTerm(id, termDetails);
        return ResponseEntity.ok().body(updatedTerm);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTerm(@PathVariable Long id) {
        termService.deleteTerm(id);
        return ResponseEntity.ok().build();
    }
}


