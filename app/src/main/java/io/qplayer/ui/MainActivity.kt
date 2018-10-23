package io.qplayer.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler

import com.google.android.exoplayer2.SimpleExoPlayer

import io.qplayer.R


/**
 * An activity that plays media using [SimpleExoPlayer].
 */
class MainActivity : Activity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		Handler().postDelayed({
			startActivity(Intent(this@MainActivity, PlayerActivity::class.java))
			finishAfterTransition()
		}, 800)
		
	}
	
}
