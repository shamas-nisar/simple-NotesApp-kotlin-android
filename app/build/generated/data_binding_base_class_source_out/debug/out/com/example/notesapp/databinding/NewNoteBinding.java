// Generated by view binder compiler. Do not edit!
package com.example.notesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notesapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NewNoteBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnOK;

  @NonNull
  public final TextView craftNoteTitle;

  @NonNull
  public final EditText editContents;

  @NonNull
  public final EditText editTitle;

  @NonNull
  public final LinearLayout noteItemLayoutParent;

  private NewNoteBinding(@NonNull ScrollView rootView, @NonNull Button btnCancel,
      @NonNull Button btnOK, @NonNull TextView craftNoteTitle, @NonNull EditText editContents,
      @NonNull EditText editTitle, @NonNull LinearLayout noteItemLayoutParent) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnOK = btnOK;
    this.craftNoteTitle = craftNoteTitle;
    this.editContents = editContents;
    this.editTitle = editTitle;
    this.noteItemLayoutParent = noteItemLayoutParent;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static NewNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewNoteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.new_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCancel;
      Button btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btnOK;
      Button btnOK = ViewBindings.findChildViewById(rootView, id);
      if (btnOK == null) {
        break missingId;
      }

      id = R.id.craftNoteTitle;
      TextView craftNoteTitle = ViewBindings.findChildViewById(rootView, id);
      if (craftNoteTitle == null) {
        break missingId;
      }

      id = R.id.editContents;
      EditText editContents = ViewBindings.findChildViewById(rootView, id);
      if (editContents == null) {
        break missingId;
      }

      id = R.id.editTitle;
      EditText editTitle = ViewBindings.findChildViewById(rootView, id);
      if (editTitle == null) {
        break missingId;
      }

      id = R.id.noteItemLayoutParent;
      LinearLayout noteItemLayoutParent = ViewBindings.findChildViewById(rootView, id);
      if (noteItemLayoutParent == null) {
        break missingId;
      }

      return new NewNoteBinding((ScrollView) rootView, btnCancel, btnOK, craftNoteTitle,
          editContents, editTitle, noteItemLayoutParent);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
