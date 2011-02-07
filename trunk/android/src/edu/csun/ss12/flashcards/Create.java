package edu.csun.ss12.flashcards;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Create extends Activity  {

	Spinner spGroups;
	EditText textFront;
	EditText textBack;
	EditText textGroup;
	Button btnCreate;
	Button btnReset;
	private int mUserId;
	
	final String PREFERENCES = "FlashcardPreferences";
    SharedPreferences preferences;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create);
        
        spGroups = (Spinner)this.findViewById(R.id.Create_SpinnerGroup);
        textGroup = (EditText)this.findViewById(R.id.Create_EditTextGroup);
        
        String group = spGroups.getSelectedItem().toString();
        System.out.println(group);
        if (group.equals("Create Group"))
        	textGroup.setVisibility(0); //visible
        else
            textGroup.setVisibility(4); //invisible
        	
        textFront = (EditText)this.findViewById(R.id.Create_EditTextFront);
        textBack = (EditText)this.findViewById(R.id.Create_EditTextBack);
        btnCreate = (Button)this.findViewById(R.id.Create_ButtonCreate);
        btnReset = (Button)this.findViewById(R.id.Create_ButtonReset);
        
        preferences = getSharedPreferences(PREFERENCES, MODE_PRIVATE);
        mUserId = preferences.getInt("userId", 6);
        
        btnCreate.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		// TODO create
        	}
        });
        
        btnReset.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		// TODO reset
        	}
        });
        
    }
}
