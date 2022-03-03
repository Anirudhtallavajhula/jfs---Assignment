package java2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Assignment10Q4 {

	public static void main(String[] args) throws IOException {
		var path = "C:\\Users\\aniru\\OneDrive\\Documents\\Main.java";
		
        String data = Files.readString(Path.of(path));

		
		System.out.println(data);
		
		List<String> lines = data.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip).toList();
		System.out.println("count : "+lines.size());
	}

}