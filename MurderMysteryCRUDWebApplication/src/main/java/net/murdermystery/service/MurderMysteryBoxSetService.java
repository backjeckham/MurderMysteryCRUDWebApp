package net.murdermystery.service;

import java.util.List;

import net.murdermystery.model.MurderMysteryBoxSet;

public interface MurderMysteryBoxSetService {

	/**
	 * Retrieves all murder mystery box sets.
	 *
	 * @return A list of all murder mystery box sets.
	 */
	List<MurderMysteryBoxSet> getAllMurderMysteryBoxSets();
	
	/**
	 * Saves a murder mystery box set.
	 *
	 * @param murderMysteryBoxSet The murder mystery box set to save.
	 */
	void saveMurderMysteryBoxSet(MurderMysteryBoxSet murderMysteryBoxSet);
	
	/**
	 * Retrieves a murder mystery box set by its ID.
	 *
	 * @param id The ID of the murder mystery box set.
	 * @return The murder mystery box set with the specified ID.
	 */
	MurderMysteryBoxSet getMurderMysteryBoxSetById(long id);
	
	/**
	 * Deletes a murder mystery box set by its ID.
	 *
	 * @param id The ID of the murder mystery box set to delete.
	 */
	void deleteMurderMysteryBoxSetById(long id);
	
}
