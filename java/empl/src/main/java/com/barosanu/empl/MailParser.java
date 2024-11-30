import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MailParser {
    public static void main(String[] args) {
        System.out.println("MailParser");
        

        System.out.println(parseMail("email.eml"));
    }

    private static String parseMail(String mailFilePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(mailFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}


