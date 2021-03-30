package patternts.behavioral.memento.example1;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("dat.txt");

        fileWriterUtil.write("First set of data \n");
        System.out.println(fileWriterUtil + "\n");

        caretaker.save(fileWriterUtil);

        fileWriterUtil.write("Second set of data\n");

        System.out.println(fileWriterUtil + "\n");

        caretaker.undo(fileWriterUtil);

        System.out.println(fileWriterUtil +" \n");
    }
}
