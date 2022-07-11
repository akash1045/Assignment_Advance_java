package com.cdac.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("textEditor")
public class TextEditor {
	@Autowired
	private SpellChecker spellChecker;

	
	 public TextEditor() {
	      System.out.println("Inside TextEditor constructor." );
	   }

	 
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	/*public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}*/
	public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
}
