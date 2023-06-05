package net.murdermystery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.murdermystery.model.MurderMysteryBoxSet;
import net.murdermystery.service.MurderMysteryBoxSetService;

@Controller
public class MurderMysteryBoxSetController {
	
	@Autowired
	private MurderMysteryBoxSetService murderMysteryBoxSetService;
	
	/**
	 * Displays the homepage with a list of murder mystery box sets.
	 * 
	 * @param model The model object to hold attributes for the view.
	 * @return The name of the view to render.
	 */
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listMurderMysteryBoxSets", murderMysteryBoxSetService.getAllMurderMysteryBoxSets());
		return "homepage";
		
	}
	
	/**
	 * Displays the form to create a new murder mystery box set.
	 * 
	 * @param model The model object to hold attributes for the view.
	 * @return The name of the view to render.
	 */
	@GetMapping("/showNewMurderMysteryBoxSetForm")
	public String showNewMurderMysteryBoxSetForm(Model model) {
		// create model attribute to bind form data
		MurderMysteryBoxSet murderMysteryBoxSet = new MurderMysteryBoxSet();
		model.addAttribute("murderMysteryBoxSet", murderMysteryBoxSet);
		return "new_murder_mystery_box_set";
	}
	
	/**
	 * Saves a new murder mystery box set to the database.
	 * 
	 * @param murderMysteryBoxSet The murder mystery box set object to save.
	 * @return The name of the view to redirect to.
	 */
	@PostMapping("/saveMurderMysteryBoxSet")
	public String saveMurderMysteryBoxSet(@ModelAttribute("murderMysteryBoxSet")MurderMysteryBoxSet murderMysteryBoxSet) {
		// save murder mystery to the database
		murderMysteryBoxSetService.saveMurderMysteryBoxSet(murderMysteryBoxSet);
		return "redirect:/";
	}
	
	/**
	 * Displays the form to update an existing murder mystery box set.
	 * 
	 * @param id The ID of the murder mystery box set to update.
	 * @param model The model object to hold attributes for the view.
	 * @return The name of the view to render.
	 */
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		
		// get murderMysteryBoxSet from the service
		MurderMysteryBoxSet murderMysteryBoxSet = murderMysteryBoxSetService.getMurderMysteryBoxSetById(id);
		
		// set murderMysteryBoxSet as a model attribute to pre populate the form
		model.addAttribute("murderMysteryBoxSet", murderMysteryBoxSet);
		return "update_murder_mystery_box_set";
	}
	
	/**
	 * Deletes a murder mystery box set from the database.
	 * 
	 * @param id The ID of the murder mystery box set to delete.
	 * @return The name of the view to redirect to.
	 */
	@GetMapping("/deleteMurderMysteryBoxSet/{id}")
	public String deleteMurderMysteryBoxSet(@PathVariable (value = "id") long id) {
		
		// call delete murder mystery method
		this.murderMysteryBoxSetService.deleteMurderMysteryBoxSetById(id);
		return "redirect:/";
		
	}

}