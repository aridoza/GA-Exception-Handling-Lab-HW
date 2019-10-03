package com.ga.superhero;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.io.*;
import java.util.*;

import static com.ga.superhero.Superhero.*;

public class Main {

    private static ArrayList<Superhero> superheroes = new ArrayList<Superhero>();

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        try {
            readFile("input.txt");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your superhero name: ");
            String name = scanner.nextLine();

            String result = playGame();
        try {
            writeFile("output.txt", name, result);
        } catch (IOException e){
            System.out.println("Error writing to the file: " + e.getMessage());
        }

//        playGame();
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

    public static void writeFile(String fileName, String name, String result) throws IOException {
        File file = new File(fileName);
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(name + "," + result);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        } finally {
            writer.close();
        }
    }

    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));

            String currentLine = reader.readLine();

            while(currentLine != null) {
                // create new Superhero instance
                Superhero superhero = new Superhero();
                String[] data = currentLine.split(",");
                superhero.setHeroName(data[0]);
                superhero.setHeroRealName(data[1]);
                superhero.setCity(data[2]);
                superheroes.add(superhero);
                currentLine = reader.readLine();
            }
        } finally {
            reader.close();
        }
    }

//    public static void playGame() {
//        int counter = 0;
//        int rightAnswers = 0;
//        int wrongAnswers = 0;
//        ArrayList<String> answers = new ArrayList<>();
//
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//            String line = null;
//
//
//            while ((line = br.readLine()) != null) {
//                String[] values = line.split(",");
//                for (String str : values) {
//                    answers.add(str);
//                }
//            }
//            System.out.println(answers);
//            br.close();
//            //System.out.println(answers);
//        } catch (IOException e) {
//            System.out.println(e.toString());
//        }
//
//
//
//        ArrayList<String> questions = new ArrayList<>();
//        questions.add("What is Superman's real name?");
//        questions.add("What is Batman's real name?");
//        questions.add("What is Spider-man's real name?");
//        questions.add("What is Wonder Woman's real name?");
//
//
//        System.out.println("===== Superhero Quiz =====");
//
//        while (counter < questions.size()) {
//            // Start the quiz
//            System.out.println(questions.toArray()[counter]);
//
//            Scanner mainScanner = new Scanner(System.in);
//            String userResponse = mainScanner.nextLine();
//
//            //System.out.println(userResponse);
//
//            if (counter == 0 && answers.get(1).contains(userResponse)) {
//                System.out.println("Correct!");
//                rightAnswers++;
//                counter++;
//            } else if (counter == 1 && answers.get(4).contains(userResponse)) {
//                System.out.println("Correct!");
//                rightAnswers++;
//                counter++;
//            } else if (counter == 2 && answers.get(7).contains(userResponse)) {
//                System.out.println("Correct!");
//                rightAnswers++;
//                counter++;
//            } else if (counter == 3 && answers.get(10).contains(userResponse)) {
//                System.out.println("Correct!");
//                rightAnswers++;
//                counter++;
//            } else {
//                System.out.println("Incorrect!");
//                wrongAnswers++;
//                counter++;
//            }
//
//        }
//
//        if (rightAnswers > wrongAnswers) {
//            System.out.println("You got " + rightAnswers + " answers right! You win!");
//        } else {
//            System.out.println("You got " + wrongAnswers + " answers wrong! You lose!");
//        }
//    }


    public static String playGame() {
        int rightAnswers = 0;
        int wrongAnswers = 0;

        Scanner scanner = new Scanner(System.in);

        for (Superhero superhero : superheroes) {
            System.out.println("What is " + superhero.getHeroName() + "'s real name?");
            String realName = scanner.nextLine();

            if(superhero.getHeroRealName().equalsIgnoreCase(realName)) {
                rightAnswers++;
                System.out.println("Correct!");
            } else {
                wrongAnswers++;
                System.out.println("Incorrect!");
            }

            System.out.println("What is " + superhero.getHeroName() + "'s hometown?");
            String hometown = scanner.nextLine();

            if(superhero.getCity().equalsIgnoreCase(hometown)) {
                rightAnswers++;
                System.out.println("Correct!");
            } else {
                wrongAnswers++;
                System.out.println("Incorrect!");
            }

        }

        if(rightAnswers > wrongAnswers) {
            System.out.println("You got " + rightAnswers + " answers right!");
            return "You win!";
        } else {
            System.out.println("You got " + wrongAnswers + " wrong.");
            return "You lose.";
        }
    }

}
