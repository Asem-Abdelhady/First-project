package e.asemsh.ordering2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }


    private int counter = 0;

    private void display()
    {
        TextView change = (TextView) findViewById(R.id.counter);
        change.setText("" + counter);
    }
   private void display1()
    {
        TextView change = (TextView) findViewById(R.id.na);
        change.setText("Name: Asem Shawkey");
        TextView qchange = (TextView) findViewById(R.id.qu);
        qchange.setText("Quantity: " + counter);
        TextView tchange = (TextView) findViewById(R.id.total);
        tchange.setText("Total: $"+counter*3);
        TextView thchange = (TextView) findViewById(R.id.th);
        thchange.setText("Thank you!");
    }

    public void inc(View v)
    {
        counter++;
        display();
    }

    public void dec1(View v)
    {
        counter--;
        if(counter < 0)
        {
            counter = 0;
        }
        display();
    }

   public void order(View x)
    {

        display1();
         Toast.makeText(getApplicationContext(), "Asem!your order is coming in 15 mins", Toast.LENGTH_LONG).show();

    }

}
