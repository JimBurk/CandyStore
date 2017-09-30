package com.orion.candystore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_add:
                Log.w("Main Activity", "Add selected");
                Intent insertIntent = new Intent(this,InsertActivity.class);
                this.startActivity(insertIntent);
                return true;
            case R.id.action_delete:
                Intent deleteIntent = new Intent(this, DeleteActivity.class);
                this.startActivity(deleteIntent);
                Log.w("Main Activity", "Delete selected");
                return true;
            case R.id.action_update:
                Intent updateIntent = new Intent(this, UpdateActivity.class);
                this.startActivity(updateIntent);
                Log.w("Main Activity", "Update selected");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
