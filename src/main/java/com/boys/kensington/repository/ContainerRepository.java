package com.boys.kensington.repository;

import com.boys.kensington.model.AbstractContainer;
import com.boys.kensington.model.AbstractLiquid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ContainerRepository extends JpaRepository<AbstractContainer, UUID> {
}