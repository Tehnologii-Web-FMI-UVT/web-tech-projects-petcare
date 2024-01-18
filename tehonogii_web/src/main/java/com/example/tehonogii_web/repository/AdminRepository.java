package com.example.tehonogii_web.repository;

import com.example.tehonogii_web.entity.ContAdmin;
import com.example.tehonogii_web.entity.ContUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdminRepository extends JpaRepository<ContAdmin, Integer> {
    @Query(value = "select * from contadmin", nativeQuery = true)
    public List<ContAdmin> getAdmins();
    @Query(value = "select * from contadmin where adminId = :adminId", nativeQuery = true)
    public ContAdmin getAdminbyId(@Param("adminId") int adminId);
    @Modifying
    @Query(value = "insert into contadmin (adminId,nume, prenume, email, parola, photoURL, nrTel) values" +
            "(:adminId,:nume, :prenume, :email, :parola, :photoURL, :nrTel) on duplicate Key update " +
            "adminId=:adminId, nume=:nume, prenume=:prenume, email=:email, " +
            "parola=:parola, photoURL=:photoURL,nrTel=:nrTel", nativeQuery = true)
    public void insertAdmin(@Param("adminId") int adminId,@Param("nume") String nume,@Param("prenume") String prenume,
                           @Param("email") String email, @Param("parola") String parola,@Param("photoURL") String photoURL,
                           @Param("nrTel") String nrTel);
    @Query(value = "select email from contadmin where email=:email1",nativeQuery = true)
    public String getEmail(@Param("email1") String email1);
    @Query(value="select max(adminId) from contadmin", nativeQuery = true)
    public Integer getMaxId();

}
