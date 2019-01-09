package task6;

import java.util.ArrayList;

/**
 * Class Notepad
 */
class Notepad {
    private ArrayList<Note> notes;

    /**
     * Constructor for Notepad
     */
    Notepad() {
        notes = new ArrayList<Note>();
    }

    /**
     * Add new Note to Notepad
     * @param text for new Note
     */
    void addNote(String text) {
        notes.add(new Note(text));
    }

    /**
     * Remove Note from Notepad
     * @param i id of Note to delete
     */
    void removeNote(int i) {
        notes.remove(i);
    }

    /**
     * Edit Note
     * @param i id of Note
     * @param text text to set
     */
    void editNote(int i, String text) {
        notes.get(i).setText(text);
    }

    /**
     * Show all notes in Notepad
     */
    void showAll() {
        for (Note note : notes) {
            System.out.println(note.getText());
        }
    }
}
