package com.example.tehonogii_web.repository;

import com.example.tehonogii_web.entity.Anunt;
import com.example.tehonogii_web.entity.ContUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface AnuntRepository extends JpaRepository<Anunt, Integer>{
    @Query(value = "select * from anunt", nativeQuery = true)
    public List<Anunt> getAnunturi();
    @Query(value = "select * from anunt where anuntId = :anuntId", nativeQuery = true)
    public  Anunt getAnuntById(@Param("anuntId") int anuntId);
    @Modifying
    @Query(value ="delete from anunt where anuntId = :anuntId", nativeQuery = true)
    public void deleteAnunt(@Param("anuntId") Integer anuntId);
    @Modifying
    @Query(value = "insert into anunt(anuntId,userId,titlu,continut,data,photoURL,locatie,categorie) "+
            " values(:anuntId,:userId,:titlu,:continut,:data,:photoURL,:locatie,:categorie)" +
            " on duplicate key update anuntId=:anuntId,userId=userId,titlu=:titlu," +
            "continut=:continut,data=:data,photoURL=:photoURL,locatie=:locatie,categorie=:categorie",nativeQuery = true)
    public void postAnunt(@Param("anuntId") Integer anuntId,@Param("userId") Integer userId,
                          @Param("titlu") String titlu, @Param("continut") String continut,
                          @Param("data") Date data, @Param("photoURL") String photoURL,
                          @Param("locatie") String locatie, @Param("categorie") String categorie);
    @Query(value="select max(anuntId) from anunt", nativeQuery = true)
    public Integer getMaxId();


}
