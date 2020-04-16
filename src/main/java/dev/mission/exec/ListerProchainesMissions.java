package dev.mission.exec;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.MissionAppApplication;
import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
@Profile("listerProchainesMissions")
public class ListerProchainesMissions implements Runnable {
	private static final Logger LOGGER = Logger.getLogger(MissionAppApplication.class.getName());
	private MissionRepository missionRepository;

	public ListerProchainesMissions(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	/**
	 * Lister les prochaines missions
	 */
	@Override
	public void run() {
		LocalDate now = LocalDate.now();
//		System.out.println("LA DATE DU JOUR " + now);
		List<Mission> listerLesMissions = missionRepository.listerLesMissions(now);
		for (Mission mission : listerLesMissions) {
//			System.out.println(mission.getLibelle());
			LOGGER.info("MISSION DEBUTANT DATE AUJOURD'HUI OU ULTERIEURE ==> " + "ID : " + mission.getId() + ", Nom : " + mission.getLibelle() + ", Date de début : "
					+ mission.getDateDebut() + ", Date de fin : " + mission.getDateFin());
		}
	}
}
