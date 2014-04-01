package com.book.thinkforglass;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.google.android.glass.app.Card;

public class GDKHelloWorld extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Context context = this;
		
		Card card = new Card(context);  
		card.setText(R.string.GDK_greeting);
		card.setFootnote(R.string.footer);
		
		View view = card.toView();
		
		setContentView(view);
	}

}