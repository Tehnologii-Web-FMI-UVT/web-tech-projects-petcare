package com.example.tehonogii_web.controller;

import com.example.tehonogii_web.entity.*;
import com.example.tehonogii_web.repository.AdminRepository;
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
public class ControllerAdmin {
    @Autowired
    private AdminRepository adminRepository;
    @GetMapping("/admins")
    @Transactional
    public Object getAllUsers() {
        List<ContAdmin> conturi = adminRepository.getAdmins();
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
    @PostMapping("/admins")
    @Transactional
    public Object createUser(@RequestBody ContAdmin newUser){
        //System.out.println(newUser.getUserId()+newUser.getEmail());
        try{
            if(adminRepository.getEmail(newUser.getEmail())!= null){
                throw new EmailException("Email already used");
            }
            else{
                adminRepository.insertAdmin(adminRepository.getMaxId()+1, newUser.getNume(), newUser.getPrenume(), newUser.getEmail(), newUser.getParola(), newUser.getPhotoURL(), newUser.getNrTel());
                return new ResponseEntity<>(new ReturnMessage("HTTP status will be CREATED"), HttpStatus.CREATED);
            }
        }catch (EmailException e){

            return new ResponseEntity<>(new Eroare("Email already used"),HttpStatus.NOT_ACCEPTABLE);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(new Eroare(),HttpStatus.NOT_ACCEPTABLE);
        }
    }//mere
}
