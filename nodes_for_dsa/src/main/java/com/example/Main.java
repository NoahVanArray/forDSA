package com.example;
import java.util.ArrayList;
import java.util.List;

class LibraryItem {
    private String name, author;
    private int deweyDecimal;
    private List<LibraryItem> children;

    public LibraryItem(String name, String author, int deweyDecimal) {
        this.name = name;
        this.author = author;
        this.deweyDecimal = deweyDecimal;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getDeweyDecimal() {
        return deweyDecimal;
    }

    public List<LibraryItem> getChildren() {
        return children;
    }

    public void addChild(LibraryItem child) {
        this.children.add(child);
    }

    public void displayChildren() {
        if (children.isEmpty()) {
            System.out.println("No children to display.");
        } else {
            System.out.println("Children of " + name + ":");
            for (int i = 0; i < children.size(); i++) {
                LibraryItem child = children.get(i);
                System.out.println((i + 1) + ". " + child.getName() + " (Dewey Decimal: " + child.getDeweyDecimal() + ")");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryItem library = new LibraryItem("Library", "", 0);

        LibraryItem class0 = new LibraryItem("Class 000 Computer science, information, and general works", "",000);
        LibraryItem class1 = new LibraryItem("Class 100 Philosophy and psychology", "",100);
        LibraryItem class2 = new LibraryItem("Class 200 Religion", "",200);
        LibraryItem class3 = new LibraryItem("Class 300 Social sciences", "",300);
        LibraryItem class4 = new LibraryItem("Class 400 Language", "",400);
        LibraryItem class5 = new LibraryItem("Class 500 Science", "",500);
        LibraryItem class6 = new LibraryItem("Class 600 Technology", "",600);
        LibraryItem class7 = new LibraryItem("Class 700 Arts and recreation", "",700);
        LibraryItem class8 = new LibraryItem("Class 800 Literature", "", 800);
        LibraryItem class9 = new LibraryItem("Class 900 History and geography", "",900);

        LibraryItem book0 = new LibraryItem("The Information: A History, A Theory, A Flood", "Gleick, James",020);
        LibraryItem book00 = new LibraryItem("Book 2", "",112);

        LibraryItem book1 = new LibraryItem("Meditations: Marcus Aurelius", "Aurelius, Marcus", 188);
        LibraryItem book11 = new LibraryItem("Man's search for meaning", "Frankl, Viktor E.",150);


        LibraryItem book2 = new LibraryItem("The God Delusion", "Dawkins, Richard", 211);
        LibraryItem book22 = new LibraryItem("Book 2", "",112);


        LibraryItem book3 = new LibraryItem("Guns, Germs, and Steel: The Fates of Human Societies Jared M. Diamond ", "Diamond, Jared M.",303);
        LibraryItem book33 = new LibraryItem("Book 2", "",112);

        
        LibraryItem book4 = new LibraryItem("Book 2", "",112);
        LibraryItem book44 = new LibraryItem("Book 2", "",112);

        
        LibraryItem book5 = new LibraryItem("Book 2", "",112);
        LibraryItem book55 = new LibraryItem("Book 2", "",112);

        
        LibraryItem book6 = new LibraryItem("Book 2", "",112);
        LibraryItem book66 = new LibraryItem("Book 2", "",112);

        
        LibraryItem book7 = new LibraryItem("Book 2", "",112);
        LibraryItem book77 = new LibraryItem("Book 2", "",112);

        
        LibraryItem book8 = new LibraryItem("Book 2", "",112);
        LibraryItem book88 = new LibraryItem("Book 2", "",112);

        
        LibraryItem book9 = new LibraryItem("Sapiens: A Brief History of Humankind", "Harari, Yuval Noah.", 909);
        LibraryItem book99 = new LibraryItem("Book 2", "",112);

        library.addChild(class0);
        library.addChild(class1);
        library.addChild(class2);
        library.addChild(class3);
        library.addChild(class4);
        library.addChild(class5);
        library.addChild(class6);
        library.addChild(class7);
        library.addChild(class8);
        library.addChild(class9);

        class1.addChild(book1);
        class1.addChild(book2);

        library.displayChildren();
        class1.displayChildren();
        
    }
}
