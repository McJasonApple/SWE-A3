package com.swe.janalyzer.cli;

import java.io.IOException;
import java.nio.file.Path;

import com.swe.janalyzer.util.Constants;
//import com.swe.janalyzer.storage.*;
//import com.swe.janalyzer.data.metriken.Summary;




/**
 * Optionen werden verarbeitet
 */
public class OptionenVerarbeitung {

	public static boolean verboseIsSet = false;
	
	/**
	 * Der Outputpfad wird vom Benutzer gesetzt
	 * @param filePath ist der Outputpfad der in der Command Line mit gegeben wird.
	 * @throws IOException 
	 * @throws NullPointerException 
	 */
	public void saveFileAtPath (Path filePath) throws NullPointerException, IOException  {
//		Summary summary = new Summary();
//		JSONConverter.saveSummary(summary, filePath);
		Constants.outputPath = filePath;
	}

	/**
	 * Verbose wird gesetzt, um es dann weiter zu verwerten Ausgabe des Programmsablauf
	 * @return verboseIsSet
	 */
	public boolean verboseSet() {
		verboseIsSet = true;

		return verboseIsSet;
	}

}
