package com.example.active2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.active2.Model.Product;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText prodName;
    Button insertBtn;
    Product product;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prodName=(EditText) findViewById(R.id.txt_productName);

        insertBtn=(Button) findViewById(R.id.btn_addProduct);


        insertBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        product=new Product();

        String prod_name=prodName.getText().toString();


        product.setProductName(prod_name);

        product.save();

        Toast.makeText(getApplication(),"insert data success",Toast.LENGTH_SHORT).show();

        // prodName.setText("");

        // prodName.requestFocus();
    }
}
