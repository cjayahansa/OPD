package com.opd.opd.Repo;

import com.opd.opd.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserData, Integer> {

    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM UserData p WHERE p.nic_no = :nicNo")
    boolean existsByNicNo(long nicNo);
    @Query("SELECT p FROM UserData p WHERE p.nic_no = :nicNo")
    UserData findByNicNo(long nicNo);

}
