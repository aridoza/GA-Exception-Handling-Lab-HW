package com.ga.superhero;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.io.*;
import java.util.*;

import static com.ga.superhero.Superhero.*;

public class Main {


    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        playGame();
//        getAnswers();

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
        //}


        // reference to the output.txt file
//	public static void getAnswers(String fileName String username) {
//		try {
//			BufferedWriter userResponses = new BufferedWriter(new FileWriter("output.txt", true));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

//    public static void getAnswers() {
//
//    }


    }

    public static void showResults() {

    }

    public static String playGame() {
        int counter = 0;
        int rightAnswers = 0;
        int wrongAnswers = 0;
        ArrayList<String> answers = new ArrayList<>();


        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line = null;


            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String str : values) {
                    answers.add(str);
                }
            }
            System.out.println(answers);
            br.close();
            //System.out.println(answers);
        } catch (IOException e) {
            System.out.println(e.toString());
        }


        ArrayList<String> questions = new ArrayList<>();
        questions.add("What is Superman's real name?");
        questions.add("What is Batman's real name?");
        questions.add("What is Spider-man's real name?");
        questions.add("What is Wonder Woman's real name?");


        System.out.println("===== Superhero Quiz =====");

        while (counter < questions.size()) {
            // Start the quiz
            //System.out.println(questions.toArray()[counter]);

            Scanner mainScanner = new Scanner(System.in);
            String userResponse = mainScanner.nextLine();

            //System.out.println(userResponse);

            if (counter == 0 && answers.get(1).contains(userResponse)) {
                System.out.println("Correct!");
                rightAnswers++;
                counter++;
            } else if (counter == 1 && answers.get(4).contains(userResponse)) {
                System.out.println("Correct!");
                rightAnswers++;
                counter++;
            } else if (counter == 2 && answers.get(7).contains(userResponse)) {
                System.out.println("Correct!");
                rightAnswers++;
                counter++;
            } else if (counter == 3 && answers.get(10).contains(userResponse)) {
                System.out.println("Correct!");
                rightAnswers++;
                counter++;
            } else {
                System.out.println("Incorrect!");
                wrongAnswers++;
                counter++;
            }

        }

        if (rightAnswers > wrongAnswers) {
            return "You got " + rightAnswers + " answers right! You win!";
        } else {
            return "You got " + wrongAnswers + " answers wrong! You lose!";
        }
    }

}
