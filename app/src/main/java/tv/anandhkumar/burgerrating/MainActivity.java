package tv.anandhkumar.burgerrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

    }

    public void submit(View view) {
        float ratingValue = ratingBar.getRating();

        if (ratingValue <=1){
            textView.setText("Rating : "+ratingValue+" We are sory for your inconvenience");
        }
        else if (ratingValue <=2){
            textView.setText("Rating : "+ratingValue+" We will try better next time..!");
        }
        else if (ratingValue <=3){
            textView.setText("Rating : "+ratingValue+" We are constantly improving..!");
        }
        else if (ratingValue >=4){
            textView.setText("Rating : "+ratingValue+" Thank you for your Rating..!");
        }


    }
}
