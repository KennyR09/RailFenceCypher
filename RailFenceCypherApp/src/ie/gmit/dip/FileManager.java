package ie.gmit.dip;

import java.io.*;
import java.net.URL;

public class FileManager {
	private RailFence cypher;
	// private File f = new File("input");

	public FileManager(RailFence c) throws FileNotFoundException {
		cypher = c;
		// FileInputStream in = new FileInputStream (new File("./in.txt"));
		// parse (new URL ("http://").openStream(), true);

	}

	public FileManager(InputStream in, boolean encrypt) throws IOException {
		FileWriter fw = new FileWriter(new File("out1.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line = null;

		while ((line = br.readLine()) != null) {
			String text = encrypt ? cypher.encrypt(line) : cypher.decrypt(line);
			fw.write(text + "\n");
		}
		br.close();
		fw.flush();
		fw.close();
	}
}
