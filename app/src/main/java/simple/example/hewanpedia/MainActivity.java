package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKucing,btnSemut,btnUlar;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnSemut = findViewById(R.id.btn_buka_ras_semut);
        btnUlar = findViewById(R.id.btn_buka_ras_ular);
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnSemut.setOnClickListener(view -> bukaGaleri("Semut"));
        btnUlar.setOnClickListener(view -> bukaGaleri("Ular"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity kucing");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void btn_profil(View view) {
        Intent intent = new Intent(MainActivity.this, Myprofil.class);
        startActivity(intent);
    }
}