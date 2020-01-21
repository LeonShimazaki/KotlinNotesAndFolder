package com.thilux.notes.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.thilux.notes.R
import com.thilux.notes.adapter.NotesListAdapter
import com.thilux.notes.db.NoteRepository
import com.thilux.notes.model.Note
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.notes_list_item.*

class FolderListActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        loadNotes()
    }

    fun loadNotes() {
        var notes = NoteRepository(this).findAll()
        val notesListAdapter = NotesListAdapter(this, notes)
        listNotes.adapter = notesListAdapter
        notesListAdapter.notifyDataSetChanged()
    }

    override fun onResume() {
        super.onResume()

    }

    override fun onClick(view: View) {
    }
}
