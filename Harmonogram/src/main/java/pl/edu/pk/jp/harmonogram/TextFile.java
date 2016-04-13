package pl.edu.pk.jp.harmonogram;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TextFile {

	public void create(String filename,String content){
		
		try {
            File statText = new File(filename);
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
            w.write(content);
            w.close();
            System.out.println("Utworzono plik: "+filename);
        } catch (IOException e) {
            System.err.println("Problem z utworzeniem pliku: "+filename);
        }
		
	}
}
