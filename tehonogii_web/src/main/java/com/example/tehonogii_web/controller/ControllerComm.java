package com.example.tehonogii_web.controller;

import com.example.tehonogii_web.entity.ComentariuAnunt;
import com.example.tehonogii_web.entity.Eroare;
import com.example.tehonogii_web.entity.JsonFormat;
import com.example.tehonogii_web.entity.ReturnMessage;
import com.example.tehonogii_web.repository.ComentariuAnuntRepository;
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
public class ControllerComm {
    @Autowired
    private ComentariuAnuntRepository comentariuAnuntRepository;
    @GetMapping("/comm/{id}")
    @Transactional
    public Object getAnuntComm(@PathVariable("id") Integer id){
        List<ComentariuAnunt> list=comentariuAnuntRepository.getCommAnunt(id);
        try {
            if (list.isEmpty()) {
                throw new NoSuchElementException("Nu-i element");
            }
            else{
                List<Object> li = new ArrayList();
                li.addAll(list);
                com.example.tehonogii_web.entity.JsonFormat x = new JsonFormat(li);
                return x;
            }
        }catch (Exception e ){
            return new ResponseEntity<>(new Eroare(), HttpStatus.NOT_FOUND);
        }
    }//mere
    @DeleteMapping("/comm/{id}")
    @Transactional
    public Object deleteComm(@PathVariable("Id")Integer id){
        try{
            comentariuAnuntRepository.deleteComm(id);
            return new ResponseEntity<>(new ReturnMessage("HTTP status will be deleted"), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(new Eroare(), HttpStatus.NOT_FOUND);
        }
    }//mere
    @PostMapping("/comm/")
    @Transactional
    public Object postComm(@RequestBody ComentariuAnunt comm){
        try{
            comentariuAnuntRepository.postComm(comentariuAnuntRepository.getMaxId()+1,comm.getUserId(),comm.getAnuntId(), comm.getParentCommId(), comm.getTitlu(),comm.getContinut(),comm.getData());
            return new ResponseEntity<>(new ReturnMessage("HTTP status will be CREATED"), HttpStatus.CREATED);
        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(new Eroare(), HttpStatus.NOT_FOUND);
        }
    }//mere
}
