package com.boys.kensington.repository;

import com.boys.kensington.model.Boy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface BoyRepository extends JpaRepository<Boy, UUID> {
}
