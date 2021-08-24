package com.example.pcapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DilemmaDialog extends AppCompatDialogFragment {


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dielemma_create_layout, null);
        EditText dilemmaDesc = view.findViewById(R.id.dilemmaName);

        builder.setView(view).setTitle("Dilemma Description")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
        .setPositiveButton("Create", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String dDesc = dilemmaDesc.getText().toString();
                Dilemma dilemma = new Dilemma(dDesc, null);
                DilemmaCollection dc = DilemmaCollection.getInstance();
                dc.addDilemma(dilemma);
                DialogAdapter.getInstance().notifyDataSetChanged();
            }
        })
        ;
        return builder.create();
    }
}
