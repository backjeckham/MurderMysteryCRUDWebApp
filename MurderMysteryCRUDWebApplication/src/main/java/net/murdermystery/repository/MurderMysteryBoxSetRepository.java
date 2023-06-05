package net.murdermystery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.murdermystery.model.MurderMysteryBoxSet;

/**
 * This interface extends the JpaRepository interface for the MurderMysteryBoxSet entity.
 * It provides the basic CRUD operations and query methods for the entity.
 *
 */
@Repository
public interface MurderMysteryBoxSetRepository extends JpaRepository<MurderMysteryBoxSet, Long> {
	
	

}
