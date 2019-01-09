package task6;

class Note {
    private String text;

    /**
     * Constructor for Note
     * @param text text for Note
     */
    Note(String text) {
        this.text = text;
    }

    /**
     * Get text from Note
     * @return text from Note
     */
    String getText() {
        return text;
    }

    /**
     * Set text for Note
     * @param text text for Note
     */
    void setText(String text) {
        this.text = text;
    }
}
