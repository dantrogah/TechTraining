package exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		
		// define path of file
		String path = "C:\\SDETuniversity\\phone_number.txt";
		String data = null;
		String data2 = null;
		
		// create the file 
		File file = new File(path);
		
		// open the file
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			//read data
			data = br.readLine();
			data2 = br.readLine();
			
			// close file
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File cannot be found");
			System.out.println(e.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("Finished reading file");
		}
		
		// print data
		System.out.println(data);
		System.out.println(data2);
		
	}

}
