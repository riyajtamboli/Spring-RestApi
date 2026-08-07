package com.rt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.entity.SmartLocker;

@Repository
public interface SmartLockerRepository extends JpaRepository<SmartLocker, Long> {

}
