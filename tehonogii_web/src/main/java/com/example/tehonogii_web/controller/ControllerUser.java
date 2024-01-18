package com.example.tehonogii_web.controller;
import com.example.tehonogii_web.entity.*;
import com.example.tehonogii_web.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:3000")
public class ControllerUser {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    @Transactional
    public Object getAllUsers() {
        List<ContUser> conturi = userRepository.getUsers();
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
    @GetMapping("/users/{id}")
    @Transactional
    public Object GetAllUsers(@PathVariable("id") Integer id){
        ContUser cont= userRepository.getUserbyId(id);
        try {
            if (cont.getNume() == null) {
                throw new NoSuchElementException("Nu-i element");
            }
            else{
                return cont;
            }
        }catch(Exception e){
            return new ResponseEntity<>(new Eroare(), HttpStatus.NOT_FOUND);
        }
    }//mere
    @PostMapping("/users")
    @Transactional
    public Object createUser(@RequestBody ContUser newUser){
        System.out.println(newUser.getUserId()+newUser.getEmail());
        try{
            if(userRepository.getEmail(newUser.getEmail())!= null){
                throw new EmailException("Email already used");
            }
            else{
                userRepository.insertUser(userRepository.getMaxId()+1, newUser.getNume(), newUser.getPrenume(), newUser.getEmail(), newUser.getParola(), newUser.getPhotoURL(), newUser.getNrTel());
                return new ResponseEntity<>(new ReturnMessage("HTTP status will be CREATED"), HttpStatus.CREATED);
            }
        }catch (EmailException e){

            return new ResponseEntity<>(new Eroare("Email already used"),HttpStatus.NOT_ACCEPTABLE);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(new Eroare(),HttpStatus.NOT_ACCEPTABLE);
        }
    }//verifica daca exista id ul

}
