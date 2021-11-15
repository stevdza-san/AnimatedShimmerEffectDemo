package com.example.animatedshimmereffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.example.animatedshimmereffect.ui.theme.AnimatedShimmerEffectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedShimmerEffectTheme {
                Column {
                    repeat(7) {
                        AnimatedShimmer()
                    }
                }
            }
        }
    }
}
