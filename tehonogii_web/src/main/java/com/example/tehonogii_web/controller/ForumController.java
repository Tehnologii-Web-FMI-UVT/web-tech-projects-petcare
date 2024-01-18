package com.example.tehonogii_web.controller;

import com.example.tehonogii_web.entity.Eroare;
import com.example.tehonogii_web.entity.Forum;
import com.example.tehonogii_web.entity.JsonFormat;
import com.example.tehonogii_web.entity.ReturnMessage;
import com.example.tehonogii_web.repository.ForumRepository;
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
public class ForumController {
    @Autowired
   private ForumRepository forumRepository;
    @GetMapping("/forum")
    @Transactional
    public Object getForum(){
        List<Forum> postari=new ArrayList<>();
        try {
            postari = forumRepository.getForum();
            if(postari.isEmpty()){
                throw new NoSuchElementException("Nu-i element");
            }
            else{
                List<Object> l = new ArrayList();
                l.addAll(postari);
                com.example.tehonogii_web.entity.JsonFormat x = new JsonFormat(l);
                return x;
            }
        }catch(Exception e){
            return new ResponseEntity<>(new Eroare(), HttpStatus.NOT_FOUND);
        }
    }//mere
    @PostMapping("/forum")
    @Transactional
    public Object postForum(@RequestBody Forum forum){
        try{
            System.out.println(forum.toString());
            forumRepository.postForum(forumRepository.getMaxId()+1,forum.getUserId(),forum.getTitlu(),forum.getContinut(),forum.getData());
            return new ResponseEntity<>(new ReturnMessage("HTTP status will be CREATED"), HttpStatus.CREATED);
        }catch(Exception e){

            return new ResponseEntity<>(new Eroare(), HttpStatus.NOT_FOUND);
        }
    }//mere
}
