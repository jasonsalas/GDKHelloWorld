package com.book.thinkforglass;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.glass.app.Card;

public class GDKHelloWorld extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Card card = new Card(this);  
		card.setText(R.string.GDK_greeting);
		card.setFootnote(R.string.footer);
		card.setImageLayout(Card.ImageLayout.FULL);
		card.addImage(R.drawable.jerky);
		
		setContentView(card.toView());
	}

}
