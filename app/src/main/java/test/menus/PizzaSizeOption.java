package test.menus;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

public class PizzaSizeOption extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_size_option);

        //---RadioButton---
        if (((RadioButton) findViewById(R.id.small)).isChecked()){
            DisplayToast("Small Size!");
        }else if (((RadioButton) findViewById(R.id.medium)).isChecked()){
            DisplayToast("Medium Size!");
        }else if (((RadioButton) findViewById(R.id.large)).isChecked()){
            DisplayToast("Large Size!");
        }else if (((RadioButton) findViewById(R.id.extralarge)).isChecked()){
            DisplayToast("Extra Large Size!");
        }

    }

    public void DisplayToast(String msg)
    {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
