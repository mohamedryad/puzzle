package p8.demo.p8sokoban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


/**
 * Created by ryad on 29/12/16.
 */

public class P8_cassetete3 extends Activity {

    private CasseteteView3 mCasseteteView3;



    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        P8_cassetete.niveau=3;
        // initialise notre activity avec le constructeur parent
        super.onCreate(savedInstanceState);
        // charge le fichier main.xml comme vue de l'activit�
        setContentView(R.layout.main3);
        // recuperation de la vue une voie cree � partir de son id
        mCasseteteView3 = (CasseteteView3) findViewById(R.id.CasseteteView3);
        // rend visible la vue
        mCasseteteView3.setVisibility(View.VISIBLE);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.level_1:
                Intent intent1 = new Intent(getApplicationContext(), P8_cassetete.class);
                startActivity(intent1);

                return true;
            case R.id.level_2:
                Intent intent2 = new Intent(getApplicationContext(), P8_cassetete2.class);
                startActivity(intent2);
                return true;
            case R.id.level_3:
                Intent intent3 = new Intent(getApplicationContext(), P8_cassetete3.class);
                startActivity(intent3);
                return true;
            case R.id.restart_game:
                if(P8_cassetete.niveau==1){
                    Intent intent4 = new Intent(getApplicationContext(), P8_cassetete.class);
                    startActivity(intent4);
                }
                else if (P8_cassetete.niveau==2){
                    Intent intent5 = new Intent(getApplicationContext(), P8_cassetete2.class);
                    startActivity(intent5);
                }
                else
                   {
                Intent intent6 = new Intent(getApplicationContext(), P8_cassetete3.class);
                startActivity(intent6);
            }
            return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
