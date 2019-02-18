/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dziri.polybot.formatting2

import com.google.inject.Inject
import fr.unice.polytech.dziri.polybot.services.PolybotGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import polybot.Bot

class PolybotFormatter extends AbstractFormatter2 {
	
	@Inject extension PolybotGrammarAccess

	def dispatch void format(Bot bot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		bot.initialPosition.format
		for (instruction : bot.instructionList) {
			instruction.format
		}
	}
	
	// TODO: implement for 
}