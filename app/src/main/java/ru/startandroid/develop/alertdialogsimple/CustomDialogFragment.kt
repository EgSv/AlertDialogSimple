package ru.startandroid.develop.alertdialogsimple

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class CustomDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val bilder: AlertDialog.Builder = AlertDialog.Builder(activity)
        return bilder
            .setTitle("Диалоговое окно")
            .setMessage(R.string.save_date)
            .setView(R.layout.dialog)
            .setIcon(android.R.drawable.ic_dialog_info)
            .setPositiveButton(R.string.yes, null)
            .setNegativeButton(R.string.no, null)
            .setNeutralButton(R.string.cancel, null)
            .create()
    }
}