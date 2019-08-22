

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void AddPlayer (View view){
        startActivity(new Intent(MainActivity.this, AddPlayer.class));
    }

    public void Scoreboard (View view){
        startActivity(new Intent(MainActivity.this, Scoreboard.class));
    }

    public void SelectPlayer1 (View view){
        startActivity(new Intent(MainActivity.this, SelectPlayer.class));
    }
}
