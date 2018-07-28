package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.domain.question;;

public interface QuestionRepository extends JpaRepository<question, Integer> {

}