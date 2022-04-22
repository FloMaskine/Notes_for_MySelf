package com.flomask.notesformyself;

import androidx.cardview.widget.CardView;

import com.flomask.notesformyself.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
