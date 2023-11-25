package Assignment_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class roomDataIO {

    private static String line;
    private String roomTypeID, facilities, totalNumOfRoom, roomID, roomAvailable, fee, peoplePerRoom;

    public static void saveData(String roomTypeID, String facilities, String totalNumOfRoom, String roomID, String roomAvailable, String fee, String peoplePerRoom) throws IOException {
        //create a file writer for the file roomData.txt with append mode
        FileWriter output = new FileWriter("roomData.txt", true);

        //write student details
        output.write(roomTypeID + "!" + facilities + "!" + totalNumOfRoom + "!" + roomID + "!" + roomAvailable + "!" + fee + "!" + peoplePerRoom + "\n");

        //close the writer
        output.close();
    }

    public static String[] viewData() throws IOException {
        //create a file reader for the file roomData.txt
        FileReader input = new FileReader("roomData.txt");
        BufferedReader reader = new BufferedReader(input);

        while ((line = reader.readLine()) != null) {
            String[] data = line.split("!");
            String[] result = {data[0], data[1], data[2], data[3], data[4], data[5], data[6]};
            return result;
        }

        //close the reader
        reader.close();

        return null;
    }

    public static boolean checkID(String ID) throws FileNotFoundException, IOException {
        //create a file reader for the file studentData.txt
        FileReader input = new FileReader("roomData.txt");
        BufferedReader buffer = new BufferedReader(input);

        while ((line = buffer.readLine()) != null) {
            String[] fields = line.split("!");
            if (fields.length >= 1 && fields[0].equals(ID)) {
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

    public void deleteRoom(String ID) throws IOException {
        // read the contents of the file into an ArrayList
        List<String> lines = Files.readAllLines(Paths.get("roomData.txt"), StandardCharsets.UTF_8);

        // modify the data in the ArrayList
        for (int i = 0; i < lines.size(); i++) {
            String[] data = lines.get(i).split("!");
            if (data[0].equals(ID)) {
                lines.remove(i);
                break;
            }
        }

        // write the modified data back to the file, overwriting its contents
        Files.write(Paths.get("roomData.txt"), lines, StandardCharsets.UTF_8);
    }

    public void updateRoom(String roomTypeID, String facilities, String totalNumOfRoom, String roomID, String roomAvailable, String fee, String peoplePerRoom) throws IOException {
        // read the contents of the file into an ArrayList
        List<String> lines = Files.readAllLines(Paths.get("roomData.txt"), StandardCharsets.UTF_8);

        // modify the data in the ArrayList
        for (int i = 0; i < lines.size(); i++) {
            String[] data = lines.get(i).split("!");
            if (data[0].equals(roomTypeID)) {
                data[1] = facilities;
                data[2] = totalNumOfRoom;
                data[3] = roomID;
                data[4] = roomAvailable;
                data[5] = fee;
                data[6] = peoplePerRoom;
                lines.set(i, String.join("!", data));
                break;
            }
        }

        // write the modified data back to the file, overwriting its contents
        Files.write(Paths.get("roomData.txt"), lines, StandardCharsets.UTF_8);
    }

    public static String[] viewData2(String ID) throws IOException {
        //create a file reader for the file studentData.txt
        FileReader input = new FileReader("roomData.txt");
        BufferedReader reader = new BufferedReader(input);

        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("!");
            if (data[0].equals(ID)) {
                String[] result = {data[0], data[1], data[2], data[3], data[4], data[5], data[6]};
                return result;
            }
        }

        //close the reader
        reader.close();
        String[] result = null;
        return result;
    }
}
