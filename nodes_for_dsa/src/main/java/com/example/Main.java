package com.example;
import java.util.ArrayList;
import java.util.List;

class LibraryItem {
    private String name, author, desc;
    private int deweyDecimal;
    private List<LibraryItem> children;

    public LibraryItem(String name, String author, String desc, int deweyDecimal) {
        this.name = name;
        this.author = author;
        this.desc = desc;
        this.deweyDecimal = deweyDecimal;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
    public String getAuthor() {
        return author;
    }

    public String getDesc() {
        return desc;
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
                if (child.getAuthor() == "" || child.getDesc() == ""){
                    System.out.println((i + 1) + ". " + child.getName() + " (Dewey Decimal: " + child.getDeweyDecimal() + ")");
                }
                else{
                    System.out.println((i + 1) + ". " + child.getName() + " (Dewey Decimal: " + child.getDeweyDecimal() + ")" + "\nAuthor: " + child.getAuthor() + "\nDescription: " + child.getDesc() + "\n");
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryItem library = new LibraryItem("Library", "", "", 0);

        LibraryItem class0 = new LibraryItem("Class 000 Computer science, information, and general works", "", "", 000);
        LibraryItem class1 = new LibraryItem("Class 100 Philosophy and psychology", "", "", 100);
        LibraryItem class2 = new LibraryItem("Class 200 Religion", "", "", 200);
        LibraryItem class3 = new LibraryItem("Class 300 Social sciences", "", "", 300);
        LibraryItem class4 = new LibraryItem("Class 400 Language", "", "", 400);
        LibraryItem class5 = new LibraryItem("Class 500 Science", "", "", 500);
        LibraryItem class6 = new LibraryItem("Class 600 Technology", "", "", 600);
        LibraryItem class7 = new LibraryItem("Class 700 Arts and recreation", "", "", 700);
        LibraryItem class8 = new LibraryItem("Class 800 Literature", "",  "", 800);
        LibraryItem class9 = new LibraryItem("Class 900 History and geography", "", "", 900);

        LibraryItem book0 = new LibraryItem("The Information: A History, A Theory, A Flood", "Gleick, James", "A sweeping history of how humanity has captured, stored, and shared knowledge.", 020);
        LibraryItem book00 = new LibraryItem("Code: The Hidden Language of Computer Hardware and Software", "Petzold, Charles", "An accessible introduction to the inner workings of computers and programming.", 002);

        LibraryItem book1 = new LibraryItem("Meditations: Marcus Aurelius", "Aurelius, Marcus",  "Personal writings of a Roman emperor on Stoic philosophy and self-discipline.", 188);
        LibraryItem book11 = new LibraryItem("Man's search for meaning", "Frankl, Viktor E.", "A psychiatrist's account of surviving Nazi concentration camps and finding purpose in life.", 150);


        LibraryItem book2 = new LibraryItem("The God Delusion", "Dawkins, Richard",  "A provocative critique of religion and a defense of atheism.", 211);
        LibraryItem book22 = new LibraryItem("Jesus Christ the Apple Tree: Reflecting on the Many Ways of Seeing Jesus", "Dove, Anthea",  "Reflections on Jesus Christ through various theological and artistic lenses.", 232);


        LibraryItem book3 = new LibraryItem("Guns, Germs, and Steel: The Fates of Human Societies Jared M. Diamond ", "Diamond, Jared M.", "A groundbreaking look at the environmental factors that shaped human history.", 303);
        LibraryItem book33 = new LibraryItem("The Tipping Point: How Little Things Can Make a Big Difference", "Gladwell, Malcolm", "An exploration of how small actions can create big changes in society and behavior.", 302);

        
        LibraryItem book4 = new LibraryItem("The Cambridge Encyclopedia of the English Language", "Crystal, David",  "A comprehensive guide to the English language, covering its history and usage.", 420);
        LibraryItem book44 = new LibraryItem("Eats Shoots & Leaves: The Zero Tolerance Approach to Punctuation", "Truss, Lynne", "A humorous guide to punctuation rules and their importance in writing.", 428);

        
        LibraryItem book5 = new LibraryItem("A Brief History of Time: From the Big Bang to Black Holes", "Hawking, Stephen W.",  "A layman's guide to the universe, covering time, space, and black holes.", 523);
        LibraryItem book55 = new LibraryItem("The Selfish Gene", "Dawkins, Richard",  "A revolutionary take on evolution, focusing on the role of genes in natural selection.", 576);

        
        LibraryItem book6 = new LibraryItem("An Electronic Silent Spring: Facing the Dangers and Creating Safe Limits", "Singer, Katie",  "A look at the health and environmental risks of electromagnetic fields.", 612);
        LibraryItem book66 = new LibraryItem("Presenting to Win: The Art of Telling Your Story", "Weissman, Jerry",  "A guide to crafting impactful presentations and communicating effectively.", 651);

        
        LibraryItem book7 = new LibraryItem("Beauty, Sex and Power: A Story of Debauchery and Decadent Art at the Late Stuart Court (1660-1714)", "Dolman, Brett",  "A fascinating look at art and culture during the reign of England's Stuarts.", 757);
        LibraryItem book77 = new LibraryItem("On Photography", "Ontag, Susan",  "A philosophical reflection on the cultural and ethical implications of photography.", 770);

        
        LibraryItem book8 = new LibraryItem("Shakespeare: The Invention of the Human", "Bloom, Harold",  "An analysis of Shakespeare's plays and their role in shaping modern concepts of humanity.", 822);
        LibraryItem book88 = new LibraryItem("The Odyssey", "Homer",  "An epic Greek poem recounting Odysseus's adventures on his journey home from the Trojan War.", 833);

        
        LibraryItem book9 = new LibraryItem("Sapiens: A Brief History of Humankind", "Harari, Yuval Noah.",  "A sweeping history of humanity, from the Stone Age to the modern era.", 909);
        LibraryItem book99 = new LibraryItem("The Guns of August", "Tuchman, Barbara W.",  "A detailed narrative of the events leading to and during the first month of World War I.", 940);

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

        class0.addChild(book0);
        class0.addChild(book00);
        class1.addChild(book1);
        class1.addChild(book11);
        class2.addChild(book2);
        class2.addChild(book22);
        class3.addChild(book3);
        class3.addChild(book33);
        class4.addChild(book4);
        class4.addChild(book44);
        class5.addChild(book5);
        class5.addChild(book55);
        class6.addChild(book6);
        class6.addChild(book66);
        class7.addChild(book7);
        class7.addChild(book77);
        class8.addChild(book8);
        class8.addChild(book88);
        class9.addChild(book9);
        class9.addChild(book99);

        library.displayChildren();
        class0.displayChildren();
        class1.displayChildren();
        class2.displayChildren();
        class3.displayChildren();
        class4.displayChildren();
        class5.displayChildren();
        class6.displayChildren();
        class7.displayChildren();
        class9.displayChildren();
        
        
    }
}
