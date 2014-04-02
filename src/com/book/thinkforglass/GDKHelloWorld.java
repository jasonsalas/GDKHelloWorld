package com.book.thinkforglass;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.glass.app.Card;

public class GDKHelloWorld extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Card card = new Card(this)  
			.setText(R.string.GDK_greeting)
			.setFootnote(R.string.footer)
			.setImageLayout(Card.ImageLayout.FULL)
			.addImage(R.drawable.jerky);
		  
		setContentView(card.toView());
	}

}
