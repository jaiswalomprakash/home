package com.home.java8.Stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileWordCount {
	
	 public static void main(String args[]) {
		    long wordCount = 0;
		    Path textFilePath = Paths.get("WordCount.txt");
		    try {
		      Stream<String> fileLines = Files.lines(textFilePath, Charset.defaultCharset());
		      wordCount = fileLines.flatMap(line -> Arrays.stream(line.split(" "))).count();
		    } catch (IOException ioException) {
		      ioException.printStackTrace();
		    }
		    System.out.println("Number of words in WordCount.txt: "+ wordCount);
		  }

}
