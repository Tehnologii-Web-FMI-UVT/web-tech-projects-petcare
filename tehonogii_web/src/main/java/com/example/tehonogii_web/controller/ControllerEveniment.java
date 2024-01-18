package com.example.tehonogii_web.controller;

import com.example.tehonogii_web.entity.*;
import com.example.tehonogii_web.repository.EvenimentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:3000")
public class ControllerEveniment {
    @Autowired
    private EvenimentRepository evenimentRepository;

    @GetMapping("/eveniment")
    @Transactional
    public Object getAllUsers() {
        List<Eveniment> conturi = evenimentRepository.getAllEvents();
        try {
            if (conturi.isEmpty()) {
                throw new NoSuchElementException("Nu-i element");
            } else {
                List<Object> l = new ArrayList();
                l.addAll(conturi);
                com.example.tehonogii_web.entity.JsonFormat x = new JsonFormat(l);
                return x;
            }
        } catch (Exception e) {
            return new ResponseEntity<>(new Eroare(), HttpStatus.NOT_FOUND);
        }
    }//mere
    @PostMapping("/eveniment")
    @Transactional
    public Object createUser(@RequestBody Eveniment ev){
        //System.out.println(newUser.getUserId()+newUser.getEmail());
        try {
            evenimentRepository.postEveniment(evenimentRepository.getMaxId()+1,ev.getAdminId(),ev.getTitlu(),ev.getContinut(),
                    ev.getData(),ev.getPhotoURL());
            return new ResponseEntity<>(new ReturnMessage("HTTP status will be CREATED"), HttpStatus.CREATED);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(new Eroare(),HttpStatus.NOT_ACCEPTABLE);
        }
    }//mere
}
