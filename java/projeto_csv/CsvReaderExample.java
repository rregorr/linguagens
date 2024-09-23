import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\67436528220\\Documents\\dados_serv.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            List<User> users = new ArrayList<>();

            // Ignorar a primeira linha (cabeçalhos)
            for (int i = 1; i < records.size(); i++) {
                String[] record = records.get(i);
                User user = new User(record[0], record[1], record[2]);
                users.add(user);
            }

            // Imprimir os usuários
            for (User user : users) {
                System.out.println(user);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
