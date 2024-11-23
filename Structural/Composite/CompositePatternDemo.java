package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

// Component Interface:-This interface defines operations that both leaf and composite objects will implement.
 interface FileComponent {
    void showDetails();
}
// Leaf Class
 class File implements FileComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
// Composite Class

 class Folder implements FileComponent {
    private String name;
    private List<FileComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileComponent component) {
        components.add(component);
    }

    public void removeComponent(FileComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileComponent component : components) {
            component.showDetails();  // Calls showDetails on both files and sub-folders
        }
    }
}

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Leaf nodes (files)
        FileComponent file1 = new File("File1.txt");
        FileComponent file2 = new File("File2.txt");
        FileComponent file3 = new File("File3.doc");

        // Composite node (folder)
        Folder folder1 = new Folder("Documents");
        folder1.addComponent(file1);  // Add File1 to folder
        folder1.addComponent(file2);  // Add File2 to folder

        // Another composite node (folder)
        Folder folder2 = new Folder("My Folder");
        folder2.addComponent(folder1);  // Add Documents folder to My Folder
        folder2.addComponent(file3);    // Add File3 to My Folder

        // Display folder structure
        folder2.showDetails();
    }
}

