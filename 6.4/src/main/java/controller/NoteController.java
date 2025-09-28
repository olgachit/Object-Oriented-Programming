package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import javafx.scene.text.Text;
import model.Note;
import model.Notebook;

public class NoteController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    @FXML
    private Button addButton;

    @FXML
    private TextFlow notesDisplay;

    private Notebook notebook;

    @FXML
    public void initialize() {
        notebook = new Notebook();
    }

    @FXML
    public void handleAdd() {
        String title = titleField.getText().trim();
        String content = contentArea.getText().trim();

        if (!title.isEmpty() && !content.isEmpty()) {
            Note note = new Note(title, content);
            notebook.addNote(note);
            updateNotesDisplay();
            titleField.clear();
            contentArea.clear();
        }
    }

    private void updateNotesDisplay() {
        notesDisplay.getChildren().clear();
        for (Note note : notebook.getNotes()) {
            Text noteText = new Text(note.toString() + "\n");
            notesDisplay.getChildren().add(noteText);
        }
    }
}
