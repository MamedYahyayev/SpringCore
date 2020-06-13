package az.maqa.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReaderMethod {

	private File file;

	public FileReaderMethod() {

	}

	public FileReaderMethod(File file) {
		this.file = file;
	}

	public void setFile(File file) {
		this.file =  file;
	}

	public File getFile() {
		return file;
	}

	public void fileReader(String lang) throws FileNotFoundException {
		Map<String, String> azEnLang = new HashMap<String, String>();
		FileReader fileReader = new FileReader(file);
		Scanner scanner = new Scanner(fileReader);
		while (scanner.hasNext()) {
			String data = scanner.next();
			String[] dataSplit = data.split("--");
			azEnLang.put(dataSplit[0], dataSplit[1]);
			azEnLang.put(dataSplit[1], dataSplit[0]);

			if (lang.equals("az")) {
				System.out.println(dataSplit[0]);
			} else {
				System.out.println(dataSplit[1]);
			}
		}

	}

}
