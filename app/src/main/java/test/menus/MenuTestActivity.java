package test.menus;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MenuTestActivity extends Activity {
	
	private TextView displayTextView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        displayTextView = (TextView) findViewById(R.id.displayTextView);


    }
    //Initialize the contents of the Activity's standard options menu
    public boolean onCreateOptionsMenu(Menu menu) {
        //show the menu
    	getMenuInflater().inflate(R.menu.speed, menu);
    	return true;
    }
    // called whenever an item in your options menu is selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) 
    {    
    	//handle menu items  y their id
        switch (item.getItemId())
    	{        
    		case R.id.meat:
                DisplayToast("You selected Meat Supreme!");
	    		break;        
    		case R.id.superh:
                DisplayToast("You selected Meat Super Hawaiian!");
                break;
			case R.id.veggie:
                DisplayToast("You selected Meat Veggie!");
                break;
            case R.id.cheddar:
                DisplayToast("You selected Cheddar Supreme!");
                break;
            case R.id.medite:
                DisplayToast("You selected Meat Mediterranean!");
                break;
    	}    
    	return true;
    }

    public void DisplayToast(String msg)
    {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }
}