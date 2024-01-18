package com.example.tehonogii_web.repository;
import com.example.tehonogii_web.entity.Anunt;
import com.example.tehonogii_web.entity.ComentariuAnunt;
import com.example.tehonogii_web.entity.ContUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.sql.Date;
import java.util.List;
public interface ComentariuAnuntRepository extends JpaRepository<ComentariuAnunt, Integer>{
    @Query(value = "select * from comentariuanunt", nativeQuery = true)
    public List<ComentariuAnunt> getComentarii();
    @Query(value = "select * from comentariuanunt where commId=:commId",nativeQuery = true)
    public ComentariuAnunt getComentariuById(@Param("commId") int commId);

    @Modifying
    @Query(value="insert into comentariuanunt(commId,userId,anuntId,parentCommId" +
            ", titlu,continut,data) values(:commId,:userId,:anuntId,:parentCommId," +
            ":titlu,:continut,:data) on duplicate key update " +
            "commId=:commId,userId=userId,anuntId=:anuntId," +
            "parentCommId=:parentCommId,titlu=:titlu,continut=:continut," +
            "data=:data",nativeQuery = true)
    public void postComm(@Param("commId") Integer commId,@Param("userId") Integer userId,@Param("anuntId") Integer anuntId,@Param("parentCommId") Integer parentCommId,
                         @Param("titlu") String titlu, @Param("continut") String continut,
                         @Param("data") Date data);
   @Query(value="select * from comentariuanunt where anuntId=:anuntId", nativeQuery = true)
    public List<ComentariuAnunt> getCommAnunt(@Param("anuntId") Integer anuntId);
   @Modifying
    @Query(value="delete from comentariuanunt where commId=:commId", nativeQuery = true)
    public void deleteComm(@Param("commId") Integer commId);
    @Query(value="select max(commId) from comentariuanunt", nativeQuery = true)
    public Integer getMaxId();



}
