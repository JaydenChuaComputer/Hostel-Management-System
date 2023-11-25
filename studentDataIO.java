package Assignment_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; //saveData
import java.io.IOException; //saveData
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class studentDataIO {

    private String name, pwd, email, phone, ID;
    private char gender;

    public static void saveData(String name, String pwd, char gender, String email, String phone, String ID) throws IOException {
        //create a file writer for the file studentData.txt with append mode
        FileWriter output = new FileWriter("studentData.txt", true);

        //write student details
        output.write(name + "!" + pwd + "!" + gender + "!" + email + "!" + phone + "!" + ID + "!No Status!-!-!-" + "\n");

        //close the writer
        output.close();
    }

    public static boolean login(String ID, String pwd) throws FileNotFoundException, IOException {
        //create a file reader for the file studentData.txt
        FileReader input = new FileReader("studentData.txt");
        BufferedReader buffer = new BufferedReader(input);

        String line;
        while ((line = buffer.readLine()) != null) {
            String[] fields = line.split("!");
            if (fields.length >= 2 && fields[1].equals(pwd) && fields[5].equals(ID)) {
                //pwd and ID match, login successful
                buffer.close();
                input.close();
                return true;
            }
        }

        //no matching ID and pwd found, login failed
        buffer.close();
        input.close();
        return false;
    }

    public static String[] viewData(String ID) throws IOException {
        //create a file reader for the file studentData.txt
        FileReader input = new FileReader("studentData.txt");
        BufferedReader reader = new BufferedReader(input);

        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("!");
            if (data[5].equals(ID)) {
                String[] result = {data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9]};
                return result;
            }
        }

        //close the reader
        reader.close();

        return null;
    }

    public static void updateData(String ID, String newPassword, String newGender, String newEmail, String newPhone) throws IOException {
        // read the contents of the file into an ArrayList
        List<String> lines = Files.readAllLines(Paths.get("studentData.txt"), StandardCharsets.UTF_8);

        // modify the data in the ArrayList
        for (int i = 0; i < lines.size(); i++) {
            String[] data = lines.get(i).split("!");
            if (data[5].equals(ID)) {
                data[1] = newPassword;
                data[2] = newGender;
                data[3] = newEmail;
                data[4] = newPhone;
                lines.set(i, String.join("!", data));
                break;
            }
        }

        // write the modified data back to the file, overwriting its contents
        Files.write(Paths.get("studentData.txt"), lines, StandardCharsets.UTF_8);
    }

    public static boolean registerID(String ID) throws FileNotFoundException, IOException {
        //create a file reader for the file studentData.txt
        FileReader input = new FileReader("studentData.txt");
        BufferedReader buffer = new BufferedReader(input);

        String line;
        while ((line = buffer.readLine()) != null) {
            String[] fields = line.split("!");
            if (fields.length >= 1 && fields[5].equals(ID)) {
                //ID exist in database
                buffer.close();
                input.close();
                return true;
            }
        }

        //no matching ID found
        buffer.close();
        input.close();
        return false;
    }

    public static void adminUpdateData(String pwd, String gender, String email, String phone, String ID, String status, String fee, String due, String moveIn) throws IOException {
        // read the contents of the file into an ArrayList
        List<String> lines = Files.readAllLines(Paths.get("studentData.txt"), StandardCharsets.UTF_8);

        // modify the data in the ArrayList
        for (int i = 0; i < lines.size(); i++) {
            String[] data = lines.get(i).split("!");
            if (data[5].equals(ID)) {
                data[1] = pwd;
                data[2] = gender;
                data[3] = email;
                data[4] = phone;
                data[6] = status;
                data[7] = fee;
                data[8] = due;
                data[9] = moveIn;
                lines.set(i, String.join("!", data));
                break;
            }
        }

        // write the modified data back to the file, overwriting its contents
        Files.write(Paths.get("studentData.txt"), lines, StandardCharsets.UTF_8);
    }

    public void deleteStudent(String ID) throws IOException {
        // read the contents of the file into an ArrayList
        List<String> lines = Files.readAllLines(Paths.get("studentData.txt"), StandardCharsets.UTF_8);

        // modify the data in the ArrayList
        for (int i = 0; i < lines.size(); i++) {
            String[] data = lines.get(i).split("!");
            if (data[5].equals(ID)) {
                lines.remove(i);
                break;
            }
        }

        // write the modified data back to the file, overwriting its contents
        Files.write(Paths.get("studentData.txt"), lines, StandardCharsets.UTF_8);
    }
}
