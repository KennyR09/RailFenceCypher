package ie.gmit.dip;

import java.util.*;
import java.io.*;

public class Menu {
	// private RailFence rf = new RailFence(0,0,0);
	// private String FileManager fm = new FileManager(c);
	private Scanner user;
	private boolean keepRunning = true;

	public Menu() {
		user = new Scanner(System.in);
		String inputFileName, outputFileName;
	}

	public void start() throws IOException {

		while (keepRunning) {
			showOptions();
			int choice = Integer.parseInt(user.next());
			if (choice == 1) {
				select();
			} else if (choice == 2) {// Select File
				railKey();
			} else if (choice == 3) {// Enter Rail Fence Key
				encrypt();
			} else if (choice == 4) {// Encrypt File
				Decrypt();
			} else if (choice == 5) {// Decrypt File
				displayKey();
			} else if (choice == 6) {// Display Rail Fence Key
				System.out.println("Shutting down");
				keepRunning = false;
			} else {
				System.out.println("ERROR Invalid input.");
			}
		}
	}

	private void select() throws FileNotFoundException {
		System.out.println("[INFO] Select text file  >");
		System.out.print("Input File Name: ");
		Scanner user = new Scanner(System.in);
		String inputFileName;
		inputFileName = user.nextLine().trim();
		File input = new File(inputFileName);
		user = new Scanner(input);
	}

	private int railKey() {
		System.out.println("Enter Rail Fence Key");
		int key = user.nextInt();
		return key;
	}

	private String encrypt() {
		System.out.println("Encrypt Selected File ");
		// rf = encrypt(inputFileName);
		return null;

	}

	private void Decrypt() throws FileNotFoundException {
		System.out.println("Decrypt Selected File ");

		System.out.print("Output File Name: ");
		Scanner user = new Scanner(System.in);
		String outputFileName;
		outputFileName = user.nextLine().trim();
		PrintWriter output = new PrintWriter(outputFileName);
		user = new Scanner((Readable) output);

	}

	private void displayKey() {
		System.out.println("Display Rail Fence Key");

	}

	private void showOptions() {
		System.out.println("-------------------------");
		System.out.println("-- RailFenceCypher 5.0 --");
		System.out.println("-------------------------");
		System.out.println("(1) Select File");
		System.out.println("(2) Enter Rail Fence Key");
		System.out.println("(3) Encrypt File ");
		System.out.println("(4) Decrypt File");
		System.out.println("(5) Display Rail Fence Key");
		System.out.println("(6) Quit");
		System.out.println("Select and Option [1-5]>");
	}

}
