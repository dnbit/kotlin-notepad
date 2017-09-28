package com.udacity.notepad.data;

import android.content.Context;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class DataStore {

    private DataStore() {}

    public static final Executor EXEC = Executors.newSingleThreadExecutor();

    private static NotesDao notesDao;

    public static void init(Context context) {
        notesDao = new NotesDao(context);
    }

    public static NotesDao getNotesDao() {
        return notesDao;
    }

    public static void execute(Runnable runnable) {
        EXEC.execute(runnable);
    }
}
