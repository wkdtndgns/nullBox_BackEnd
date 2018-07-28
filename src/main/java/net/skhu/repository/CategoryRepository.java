package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.domain.category;

public interface CategoryRepository extends JpaRepository<category, Integer> {

}