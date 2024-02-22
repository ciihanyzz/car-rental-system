package com.hikmetsuicmez.repository;

import com.hikmetsuicmez.entity.Car;
import com.hikmetsuicmez.entity.CarPackage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarPackageRepository extends JpaRepository<CarPackage,Long> {
    Optional<CarPackage> findByPackageName(String name);
}
