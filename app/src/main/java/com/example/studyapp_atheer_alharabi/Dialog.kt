package com.example.studyapp_atheer_alharabi

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface

class Dialog( activity:Activity, title:String,description:String) {
    init {
        val dialogBuilder = AlertDialog.Builder(activity)


        dialogBuilder.setMessage(description)

            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })


        val alert = dialogBuilder.create()

        alert.setTitle(title)

        alert.show()
    }
}