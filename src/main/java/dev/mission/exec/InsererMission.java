package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
@Profile("insert")
public class InsererMission implements Runnable {
	private MissionRepository missionRepository;

	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		Mission mission1 = new Mission();
		Mission mission2 = new Mission();
		Mission mission3 = new Mission();
		Mission mission4 = new Mission();
		Mission mission5 = new Mission();
		Mission mission6 = new Mission();

		// Ajout mission 1
		mission1.setLibelle("Mission 1");
		mission1.setTauxJournalier(new BigDecimal("100.90"));
		mission1.setDateDebut(LocalDate.of(2019, 1, 1));
		mission1.setDateFin(LocalDate.of(2019, 3, 4));
		this.missionRepository.save(mission1);

		// Ajout mission 2
		mission2.setLibelle("Mission 2");
		mission2.setTauxJournalier(new BigDecimal("24.50"));
		mission2.setDateDebut(LocalDate.of(2019, 7, 8));
		mission2.setDateFin(LocalDate.of(2019, 9, 9));
		this.missionRepository.save(mission2);

		// Ajout mission 3
		mission3.setLibelle("Mission 3");
		mission3.setTauxJournalier(new BigDecimal("500.20"));
		mission3.setDateDebut(LocalDate.of(2019, 2, 2));
		mission3.setDateFin(LocalDate.of(2019, 11, 10));
		this.missionRepository.save(mission3);

		// Ajout mission 4
		mission4.setLibelle("Mission 4");
		mission4.setTauxJournalier(new BigDecimal("311.20"));
		mission4.setDateDebut(LocalDate.of(2020, 1, 8));
		mission4.setDateFin(LocalDate.of(2020, 4, 2));
		this.missionRepository.save(mission4);

		// Ajout mission 5
		mission5.setLibelle("Mission 5");
		mission5.setTauxJournalier(new BigDecimal("787.20"));
		mission5.setDateDebut(LocalDate.of(2020, 8, 20));
		mission5.setDateFin(LocalDate.of(2020, 12, 12));
		this.missionRepository.save(mission5);

		// Ajout mission 6
		mission6.setLibelle("Mission 6");
		mission6.setTauxJournalier(new BigDecimal("7864.20"));
		mission6.setDateDebut(LocalDate.of(2020, 8, 20));
		mission6.setDateFin(LocalDate.of(2021, 02, 01));
		this.missionRepository.save(mission6);
	}
}