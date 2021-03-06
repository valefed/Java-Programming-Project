package it.twm.stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/** La classe <code>GestoreFile</code> contiene i metodi necessari per leggere
  * e scrivere su file.
  * 
  * @see GestoreStream
  * @author Silvia Florio, Valeria Fedel, Davide Mariuzzi
  */
public class GestoreFile extends GestoreStream {

    /* ---------------------------- COSTRUTTORE ---------------------------- */
    /** Il costruttore di <code>GestoreFile</code> richiama quello della 
      * sopraclasse <code>GestoreStream</code>.
      *
      * @param destinazione contiene il percorso del file di destinazione.
      */
	public GestoreFile(String destinazione) {
		super(destinazione);
	}
  
  
    /* ------------------------------ METODI ------------------------------- */
    /** Procedura che estrae il contenuto di un file json e lo salva in un
      * nuovo file.
      *
      * @see GestoreStream
      * @param percorso indica il percorso del file sul filesystem.
      * @param nome     indica il nome del file da cui leggere il contenuto.
      */
	public void importaContenuto(String percorso, String nome) {
		File originale = new File(percorso);
		File inCartella = new File(destinazione+""+nome);		
		try {
			Files.copy(originale.toPath(), inCartella.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("Errore durante la copia del file");
			return;
		} 


	}
}