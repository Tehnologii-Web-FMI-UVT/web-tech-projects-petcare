package com.example.tehonogii_web.controller;

import com.example.tehonogii_web.entity.Anunt;
import com.example.tehonogii_web.entity.Eroare;
import com.example.tehonogii_web.entity.JsonFormat;
import com.example.tehonogii_web.entity.ReturnMessage;
import com.example.tehonogii_web.repository.AnuntRepository;
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
public class ControllerAnunt {
    @Autowired
    private AnuntRepository anuntRepository;

    @GetMapping("/anunt")
    @Transactional
    public Object getAllAnunturi(){
        List<Anunt> anunturi= anuntRepository.getAnunturi();
        try {
            if (anunturi.isEmpty()) {
                throw new NoSuchElementException("Nu-i element");
            } else {
                List<Object> l = new ArrayList();
                l.addAll(anunturi);
                com.example.tehonogii_web.entity.JsonFormat x = new JsonFormat(l);
                return x;
            }
        } catch (Exception e) {
            return new ResponseEntity<>(new Eroare(), HttpStatus.NOT_FOUND);
        }
    }//mere
    @PostMapping("/anunt")
    @Transactional
    public Object postAnunt(@RequestBody Anunt anunt){
        try{
            anuntRepository.postAnunt(anuntRepository.getMaxId()+1, anunt.getUserId(), anunt.getTitlu(), anunt.getContinut(), anunt.getData(),anunt.getPhotoURL(),anunt.getLocatie(),anunt.getCategorie());
            return new ResponseEntity<>(new ReturnMessage("HTTP status will be CREATED"), HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(new Eroare(),HttpStatus.NOT_ACCEPTABLE);
        }
    }//mere
    @DeleteMapping("/anunt/{id}")
    @Transactional
    public Object deleteAnunt(@PathVariable("id") Integer id){
        try {
            anuntRepository.deleteAnunt(id);
            return new ResponseEntity<>(new ReturnMessage("HTTP status will be OK"), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new Eroare(),HttpStatus.NOT_ACCEPTABLE);
        }
    }//mere
    @PostMapping("/anunt/{start}/{finish}")
    @Transactional
    public Object getPostStartFinish(@PathVariable ("start") Integer start, @PathVariable("finish") Integer finish){
        List<Anunt> anunturi= anuntRepository.getAnunturi();
        List<Anunt> l= new ArrayList<>();
        Integer contor= 1;
        for(Anunt i : anunturi){
            if(contor>=start && contor<=finish){
                l.add(i);
            }
            contor++;
        }
        List<Object> li = new ArrayList();
        li.addAll(l);
        com.example.tehonogii_web.entity.JsonFormat x = new JsonFormat(li);
        return x;

    }//mere

}
