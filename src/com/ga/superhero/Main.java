package com.ga.superhero;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String line = null;

		ArrayList<String> answers = new ArrayList<>();

		while ((line = br.readLine()) != null) {
			String[] values = line.split(",");
			for (String str : values) {
				answers.add(str);
			}
		}
		br.close();
		System.out.println(answers);



//		try {
//			Scanner s = new Scanner(new File("input.txt"));
//			ArrayList<String> superheroes = new ArrayList<String>();
//			while (s.hasNext()) {
//				String superheroInfo = s.split(",");
//				superheroes.add(s.next().split(","));
//			}
//			//System.out.println(superheroes.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		int rightAnswers = 0;
		int wrongAnswers = 0;


		// Start the quiz
		System.out.println("===== Superhero Quiz =====");
		System.out.println("What is Batman's Real Name?");


		Scanner mainScanner = new Scanner(System.in);
		String userResponse = mainScanner.nextLine();

		if (answers.contains(userResponse)) {
			rightAnswers++;
		} else {
			wrongAnswers++;
		}


		System.out.println();

//		try {
//			File file = new File("input.txt");
//			FileReader fileReader = new FileReader(file);
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//			StringBuffer stringBuffer = new StringBuffer();
//			String line;
//			while ((line = bufferedReader.readLine()) != null) {
//				stringBuffer.append(line);
//				stringBuffer.append("\n");
//			}
//			fileReader.close();
//			System.out.println("Contents of file:");
//			System.out.println(stringBuffer.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}


	// reference to the output.txt file
//	public static void getAnswers(String fileName String username) {
//		try {
//			BufferedWriter userResponses = new BufferedWriter(new FileWriter("output.txt", true));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	
}
