package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Update {
    private int id;
    private String content;

    public Update(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return id + "," + content;
    }
}


//        Scanner scanner = new Scanner(System.in);
//
//        // Create a list to store records
//        List<Update> records = new ArrayList<>();
//
//        // Populate the list with some initial data (you can replace this with your own data source)
//        records.add(new Update(1, "Data1"));
//        records.add(new Update(2, "Data2"));
//        records.add(new Update(3, "Data3"));
//
//        // Get user input for ID and updated content
//        System.out.print("Enter ID to update: ");
//        int targetId = scanner.nextInt();
//        scanner.nextLine(); // Consume the newline character
//
//        System.out.print("Enter updated content: ");
//        String updatedContent = scanner.nextLine();
//
//        // Find and update the record in the list
//        boolean found = false;
//        for (Update record : records) {
//            if (record.getId() == targetId) {
//                record.setContent(updatedContent);
//                found = true;
//                break;
//            }
//        }
//
//        // Display the updated records
//        if (found) {
//            System.out.println("Update successful. Updated records:");
//            for (Update record : records) {
//                System.out.println(record);
//            }
//        } else {
//            System.out.println("Record with ID " + targetId + " not found.");
//        }
//    }

