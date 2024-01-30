package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var displayEditText: EditText
    lateinit var displayButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        displayEditText = findViewById(R.id.nameEditText)
        displayButton = findViewById(R.id.clickMeButton)

        
        // Respond to button click event per specifications

        displayButton.setOnClickListener{
            var name = displayEditText.text
            displayTextView.text = "Hello, $name" }

    }
}