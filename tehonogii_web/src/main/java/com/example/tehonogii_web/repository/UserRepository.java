package com.example.tehonogii_web.repository;

import com.example.tehonogii_web.entity.ContUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<ContUser, Integer>{
    @Query(value = "select * from contuser", nativeQuery = true)
    public List<ContUser> getUsers();
    @Query(value = "select * from contuser where userId = :userId", nativeQuery = true)
    public ContUser getUserbyId(@Param("userId") int userId);
    @Modifying
    @Query(value = "insert into contuser (userId,nume, prenume, email, parola, photoURL, nrTel) values" +
            "(:userId,:nume, :prenume, :email, :parola, :photoURL, :nrTel) on duplicate Key update " +
            "userId=:userId, nume=:nume, prenume=:prenume, email=:email, " +
            "parola=:parola, photoURL=:photoURL,nrTel=:nrTel", nativeQuery = true)
    public void insertUser(@Param("userId") int userId,@Param("nume") String nume,@Param("prenume") String prenume,
                           @Param("email") String email, @Param("parola") String parola,@Param("photoURL") String photoURL,
                           @Param("nrTel") String nrTel);
    @Query(value = "select email from contuser where email=:email1",nativeQuery = true)
    public String getEmail(@Param("email1") String email1);
    @Query(value="select max(userId) from contuser", nativeQuery = true)
    public Integer getMaxId();


}
