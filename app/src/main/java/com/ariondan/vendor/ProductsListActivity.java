package com.ariondan.vendor;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class ProductsListActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View view) {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_list);

        ImageButton buttonMainBack = (ImageButton) findViewById(R.id.button_main_back);

        buttonMainBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(ProductsListActivity.this, MainActivity.class));
                finish();

            }
        });
        ImageButton buttonCart = (ImageButton) findViewById(R.id.button_cart_go);

        buttonCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(ProductsListActivity.this, CartActivity.class));
                finish();
            }
        });
    }


}
