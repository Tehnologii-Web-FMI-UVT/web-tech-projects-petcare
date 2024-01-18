package com.example.tehonogii_web.repository;

import com.example.tehonogii_web.entity.ContUser;
import com.example.tehonogii_web.entity.Forum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.sql.Date;
import java.util.List;

@Repository
public interface ForumRepository extends JpaRepository<Forum, Integer> {
    @Query(value="select * from forum order by data desc", nativeQuery = true)
    public List<Forum> getForum();
    @Modifying
    @Query(value="insert into forum(forumId,userId,titlu,continut,data)" +
            " values(:forumId,:userId,:titlu,:continut,:data) on duplicate key " +
            "update forumId=:forumId,userId=:userId,titlu=:titlu,continut=:continut,data=:data",nativeQuery = true)
    public void postForum(@Param("forumId")Integer forumId,@Param("userId") Integer userId,
                          @Param("titlu") String titlu, @Param("continut") String continut,
                          @Param("data") Date data);
    @Query(value="select max(forumId) from forum", nativeQuery = true)
    public Integer getMaxId();

}
