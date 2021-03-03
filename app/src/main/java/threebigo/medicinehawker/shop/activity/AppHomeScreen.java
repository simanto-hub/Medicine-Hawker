package threebigo.medicinehawker.shop.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jwetherell.heart_rate_monitor.HeartRateMonitor;

import threebigo.medicinehawker.shop.R;

public class AppHomeScreen extends AppCompatActivity implements View.OnClickListener {

    private CardView orderMedicine,measureHeartRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_home_screen);

        orderMedicine = findViewById(R.id.order_medicine);
        measureHeartRate = findViewById(R.id.heart_rate);


        orderMedicine.setOnClickListener(this);
        measureHeartRate.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.order_medicine) {
            Intent intent = new Intent(AppHomeScreen.this,SplashActivity.class);
            startActivity(intent);
        } else if(view.getId()==R.id.heart_rate){
            Intent intent = new Intent(AppHomeScreen.this, HeartRateMonitor.class);
            startActivity(intent);
        }
    }
}