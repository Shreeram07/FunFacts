package eyeworx.FunFacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intialization of views
        final TextView funFact = (TextView) findViewById(R.id.textView);

        // remains static text throughout our app!
        //final TextView funFactLabel = (TextView) findViewById(R.id.textView2);
        final Button showFunFactBtn = (Button) findViewById(R.id.button);

        final FactString factString = new FactString();
        final FactColor factColor = new FactColor();
        final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.layoutbg);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    funFact.setText(factString.getFact());
                    int Color = factColor.getColor();
                    relativeLayout.setBackgroundColor(Color);
                    showFunFactBtn.setTextColor(Color);
            }
        };
        showFunFactBtn.setOnClickListener(listener);
    }


}
