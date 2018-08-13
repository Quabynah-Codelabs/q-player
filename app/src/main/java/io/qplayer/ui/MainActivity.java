package io.qplayer.ui;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

import io.qplayer.R;
import io.qplayer.util.PlayerManager;


/**
 * An activity that plays media using {@link SimpleExoPlayer}.
 */
public class MainActivity extends Activity {
	//public static final Uri VIDEO_URI = Uri.parse("https://firebasestorage.googleapis.com/v0/b/creators-of-awesome-apps.appspot.com/o/Realm%20Database%20Android.mp4?alt=media&token=35249634-f54f-44af-ae50-d333d5fd916d");
	
	private PlayerView playerView;
	private PlayerManager player;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		playerView = findViewById(R.id.player_view);
		player = new PlayerManager(this);
	}
	
	@Override
	public void onResume() {
		super.onResume();
		player.init(this, playerView);
	}
	
	@Override
	public void onPause() {
		super.onPause();
		player.reset();
	}
	
	@Override
	public void onDestroy() {
		player.release();
		super.onDestroy();
	}
}
