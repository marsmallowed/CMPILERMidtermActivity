package lang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class ReadFile {

	public static ArrayList<String> read(String fileName) {
		ArrayList<String> fileContents = new ArrayList<String>();
		
		try {
			File file = new File(fileName);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
//			System.out.println("Contents of file:");
//			System.out.println(stringBuffer.toString());
			
			String[] arr = stringBuffer.toString().split("\n");
			for (String s : arr)
				fileContents.add(s);
			
//			System.out.println("Strings:");
//			for (int i=0; i<equations.size(); i++)
//				System.out.println((i+1) + ": " + equations.get(i));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return fileContents;
	}
}