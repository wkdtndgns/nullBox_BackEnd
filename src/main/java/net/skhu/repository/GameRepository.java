package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import net.skhu.domain.game;

public interface GameRepository extends JpaRepository<game, Integer> {

	List<game> findAll();
}