package com.ariondan.vendor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class CartActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    public void onClick(View view) {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ImageButton buttonCartBack = (ImageButton) findViewById(R.id.button_cart_back);
        buttonCartBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CartActivity.this, ProductsListActivity.class));
                finish();
            }
        });
        Button buttonBuy = (Button) findViewById(R.id.button_buy);
        buttonBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "Touch tablet with phone" , Toast.LENGTH_SHORT ).show();
                boolean wasPaymentDone =true;
                if(wasPaymentDone)
                {
                    Toast.makeText(getBaseContext(), "Payment succesfull" , Toast.LENGTH_SHORT ).show();
                    finish();
                }
                else
                {
                    Toast.makeText(getBaseContext(), "Payment unsuccesfull.Try again" , Toast.LENGTH_SHORT ).show();
                }
            }
        });



    }
}