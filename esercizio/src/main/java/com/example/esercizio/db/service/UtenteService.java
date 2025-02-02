package com.example.esercizio.db.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.esercizio.db.entity.Utente;
import com.example.esercizio.db.repository.UtenteRepo;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepo utenteRepo;

    public List<Utente> findAll() {
        return utenteRepo.findAll();
    }

    public void save(Utente utente) {
        utenteRepo.save(utente);
    }

    public void delete(Utente utente) {
        utenteRepo.delete(utente);
    }

    public Utente findById(Long id) {
        return utenteRepo.findById(id).orElse(null);
    }
}
