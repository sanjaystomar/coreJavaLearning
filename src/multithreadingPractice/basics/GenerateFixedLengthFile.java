package multithreadingPractice.basics;

    import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

    public class GenerateFixedLengthFile {

        private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");

        public static void main(String[] args) throws IOException {
            String filePath = "output_fixed_length.txt";
            generateFile(filePath);
        }

        public static void generateFile(String filePath) throws IOException {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

                // Generate header
                String header = generateHeader();
                writer.write(header);
                writer.newLine();

                // Example data records
                writer.write(generateDataRecord("12345", "987654321", "John Doe",
                        "123 Main St", "Apt 45"));
                writer.newLine();

                writer.write(generateDataRecord("999999", "111222333444", "Jane Smith",
                        "456 Elm St", "Suite 789"));
                writer.newLine();
            }
        }

        private static String generateHeader() {
            String createdDate = LocalDate.now().format(DATE_FORMAT); // yyyyMMdd
            String systemDate = LocalDate.now().format(DATE_FORMAT);
            String fileName = "ACLFP001.AFP";

            // Index 10 for created_date means 7 spaces after "1HD"
            StringBuilder header = new StringBuilder();
            header.append("1HD");                         // 3 chars
            header.append(String.format("%-7s", ""));     // spaces until index 10
            header.append(createdDate);                   // yyyyMMdd (8 chars)
            header.append(fileName);                      // ACLFP001.AFP
            header.append(systemDate);                    // yyyyMMdd
            return header.toString();
        }

        private static String generateDataRecord(String bankNumber, String accountNumber,
                                                 String custName, String address1, String address2) {
            StringBuilder record = new StringBuilder();

            record.append("5DT"); // Prefix

            // Bank number - 10 digits left padded with zeros
            record.append(String.format("%010d", Long.parseLong(bankNumber)));

            // Account number - 23 digits left padded with zeros
            record.append(String.format("%023d", Long.parseLong(accountNumber)));

            // Customer name - 40 chars left padded with spaces
            record.append(String.format("%40s", custName));

            // Address1 - 40 chars left padded with spaces
            record.append(String.format("%40s", address1));

            // Address2 - 40 chars left padded with spaces
            record.append(String.format("%40s", address2));

            return record.toString();
        }
    }

