package task6;

import org.junit.Test;

public class NotepadTest {
    @Test
    public void test() {
        Notepad notepad = new Notepad();

        notepad.addNote("hello");
        notepad.addNote("let's");
        notepad.addNote("test");
        notepad.addNote("this");
        notepad.addNote("notepad!");
        notepad.showAll();

        notepad.removeNote(0);
        notepad.showAll();

        notepad.editNote(1, "edit");
        notepad.showAll();
    }
}