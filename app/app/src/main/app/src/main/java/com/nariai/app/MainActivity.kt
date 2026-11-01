
package com.nariai.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 40, 32, 40)
            setBackgroundColor(Color.rgb(25, 20, 45))
        }

        val title = TextView(this).apply {
            text = "NARI AI"
            textSize = 34f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Your Smart AI Call Assistant"
            textSize = 17f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        val status = TextView(this).apply {
            text = "AI Assistant is OFF"
            textSize = 20f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            setPadding(0, 50, 0, 30)
        }

        val startButton = Button(this).apply {
            text = "ACTIVATE AI ASSISTANT"
        }

        val stopButton = Button(this).apply {
            text = "STOP AI ASSISTANT"
        }

        startButton.setOnClickListener {
            status.text = "AI Assistant is READY"
        }

        stopButton.setOnClickListener {
            status.text = "AI Assistant is OFF"
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(status)
        layout.addView(startButton)
        layout.addView(stopButton)

        setContentView(layout)
    }
}
