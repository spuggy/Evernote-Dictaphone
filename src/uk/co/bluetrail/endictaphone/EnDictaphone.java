package uk.co.bluetrail.endictaphone;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class EnDictaphone extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
            Intent intent = new Intent();
            intent.setAction("com.evernote.action.NEW_VOICE_NOTE");
            try {
              startActivity(intent);
            } catch (android.content.ActivityNotFoundException ex) {
              Toast.makeText(this,"Wowa  .. inent not foud", Toast.LENGTH_SHORT).show();
            } 
      
        this.finish();
        
        
    }
}