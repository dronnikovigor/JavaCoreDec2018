package task6;

import java.util.ArrayList;

class Notepad {
    private ArrayList<Note> notes;

    Notepad() {
        notes = new ArrayList<Note>();
    }

    void addNote(String text) {
        notes.add(new Note(text));
    }

    void removeNote(int i) {
        notes.remove(i);
    }

    void editNote(int i, String text) {
        notes.get(i).setText(text);
    }

    void showAll() {
        for (Note note : notes) {
            System.out.println(note.getText());
        }
    }
}
