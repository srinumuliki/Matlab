package Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInfoReader {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists.");

            if (file.canRead()) {
                System.out.println("File is readable.");
            } else {
                System.out.println("File is not readable.");
            }

            if (file.canWrite()) {
                System.out.println("File is writable.");
            } else {
                System.out.println("File is not writable.");
            }

            if (file.isDirectory()) {
                System.out.println("File is a directory.");
            } else if (file.isFile()) {
                System.out.println("File is a regular file.");
            }

            System.out.println("File length: " + file.length() + " bytes");

            try (FileInputStream fis = new FileInputStream(file)) {
                System.out.println("File content:");
                int data;
                while ((data = fis.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist.");
        }
        scanner.close();
    }
}

/* 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInfoReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the file name from the user
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // Create a File object with the given file name
        File file = new File(fileName);

        // Display information about the file
        displayFileInfo(file);

        // Display the content of the file using FileInputStream
        displayFileContent(file);

        scanner.close();
    }

    private static void displayFileInfo(File file) {
        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists: Yes");
            System.out.println("Is readable: " + (file.canRead() ? "Yes" : "No"));
            System.out.println("Is writable: " + (file.canWrite() ? "Yes" : "No"));
            System.out.println("File type: " + getFileType(file));
            System.out.println("File length (bytes): " + file.length());
        } else {
            System.out.println("File does not exist.");
        }
    }

    private static String getFileType(File file) {
        // Get the file extension to determine the file type
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex != -1 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1);
        }
        return "Unknown";
    }

    private static void displayFileContent(File file) {
        try (FileInputStream fis = new FileInputStream(file)) {
            System.out.println("\nFile content:");
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
} */
