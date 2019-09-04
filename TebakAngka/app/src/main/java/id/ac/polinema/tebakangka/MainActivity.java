package id.ac.polinema.tebakangka;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private int angka;
	private EditText numberInput;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		numberInput = findViewById(R.id.number_input);
		Button btn = (Button) findViewById(R.id.guess_button);
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		Random random = new Random();
		angka = random.nextInt(100) + 1;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		String test = numberInput.getText().toString();
		int tester = Integer.parseInt(test);
		if (tester > angka) {
			Toast.makeText(this,"Angka Anda Terlalu Besar",Toast.LENGTH_SHORT).show();
		}
		else if(tester == angka) {
			Toast.makeText(this,"Angka Anda Benar",Toast.LENGTH_SHORT).show();
		}
		else {
			Toast.makeText(this,"Angka Anda Kurang",Toast.LENGTH_SHORT).show();
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		numberInput.setText("");
		initRandomNumber();
	}
}
