package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Qualification;

public interface QualificationRepository extends JpaRepository<Qualification, Long>  {

	@Query("select q from Qualification q where q.user.userId=:userId")
	List<Qualification> findByUserId(int userId);

}
