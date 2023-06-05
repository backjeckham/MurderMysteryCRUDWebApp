package net.murdermystery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.murdermystery.model.MurderMysteryBoxSet;
import net.murdermystery.repository.MurderMysteryBoxSetRepository;

@Service
public class MurderMysterBoxSetServiceImpl implements MurderMysteryBoxSetService {

	@Autowired
	private MurderMysteryBoxSetRepository murderMysteryRepository;
	
	/**
	 * Retrieves all murder mystery box sets.
	 *
	 * @return A list of all murder mystery box sets. 
	 */
	@Override
	public List<MurderMysteryBoxSet> getAllMurderMysteryBoxSets() {
		return murderMysteryRepository.findAll();
	}

	/**
	 * Saves a murder mystery box set to the database.
	 *
	 * @param murderMysteryBoxSet The murder mystery box set to save. 
	 */
	@Override
	public void saveMurderMysteryBoxSet(MurderMysteryBoxSet murderMysteryBoxSet) {
		this.murderMysteryRepository.save(murderMysteryBoxSet);
		
	}

	/**
	 * Retrieves a murder mystery box set by its ID.
	 *
	 * @param id The ID of the murder mystery box set.
	 * @return The murder mystery box set with the specified ID.
	 * @throws RuntimeException if the murder mystery box set is not found. 
	 */
	@Override
	public MurderMysteryBoxSet getMurderMysteryBoxSetById(long id) {
		Optional<MurderMysteryBoxSet> optional = murderMysteryRepository.findById(id);
		MurderMysteryBoxSet murderMysteryBoxSet = null;
		if(optional.isPresent()) {
			murderMysteryBoxSet = optional.get();
		} else {
			throw new RuntimeException(" Murder Mystery Box Set not found for id :: " + id);
		}
		return murderMysteryBoxSet;
	}

	/**
	 * Deletes a murder mystery box set from the database.
	 *
	 * @param id The ID of the murder mystery box set to delete. 
	 */
	@Override
	public void deleteMurderMysteryBoxSetById(long id) {
		this.murderMysteryRepository.deleteById(id);
	}
	
}
