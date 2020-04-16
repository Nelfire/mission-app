package dev.mission.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dev.mission.entite.Mission;

/**
 * @author 20-100
 *
 */
public interface MissionRepository extends JpaRepository<Mission, Integer> {

	/**
	 * Lister les prochaines missions
	 */
	@Query("select m from Mission m where m.dateDebut > :date")
	List<Mission> listerLesMissions(@Param("date") LocalDate date);

	/**
	 * Lister les prochaines missions filtrées par taux journalier
	 */
	@Query("select m from Mission m where m.dateDebut > :date AND m.tauxJournalier >= :taux")
	List<Mission> listerProchainesMissionsParTJM(@Param("date") LocalDate date, @Param("taux") BigDecimal taux);
}
