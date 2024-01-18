package com.example.tehonogii_web.repository;

import com.example.tehonogii_web.entity.Eveniment;
import com.example.tehonogii_web.entity.Forum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
@Repository
public interface EvenimentRepository extends JpaRepository<Eveniment, Integer> {
    @Query(value= "select * from eveniment order by data desc", nativeQuery = true)
    public List<Eveniment> getAllEvents();
    @Modifying
    @Query(value = "insert into eveniment(evenimentId,adminId,titlu,continut,data,photoURL) " +
            "values(:evenimentId,:adminId,:titlu,:continut,:data,:photoURL) on duplicate key " +
            "update evenimentId=:evenimentId,adminId=:adminId,titlu=:titlu," +
            "continut=:continut,data=:data,photoURL=:photoURL",nativeQuery = true)
    public void postEveniment(@Param("evenimentId") Integer evenimentId, @Param("adminId") Integer adminId,@Param("titlu") String titlu, @Param("continut") String continut,
                              @Param("data") Date data, @Param("photoURL") String photoURL);
    @Modifying
    @Query(value="delete from eveniment where evenimentId=:evenimentId",nativeQuery = true)
    public void deleteEveniment(@Param("evenimentId") Integer evenimentId);
    @Query(value="select max(evenimentId) from eveniment", nativeQuery = true)
    public Integer getMaxId();

}
