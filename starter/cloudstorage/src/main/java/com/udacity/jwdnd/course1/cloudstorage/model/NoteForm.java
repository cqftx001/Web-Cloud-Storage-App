package com.udacity.jwdnd.course1.cloudstorage.model;

public class NoteForm {
    private String title;
    private String description;

    private String noteId;

    public NoteForm(String title, String description, String noteId) {
        this.title = title;
        this.description = description;
        this.noteId = noteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
}
