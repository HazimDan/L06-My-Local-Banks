package sg.edu.rp.c346.id22012867.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String clicked = "";
    TextView dbs, ocbc, uob, mayB, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);
        dbs = findViewById(R.id.dbs);
        ocbc = findViewById(R.id.ocbc);
        uob = findViewById(R.id.uob);
        mayB = findViewById(R.id.mayB);
        registerForContextMenu(title);
        registerForContextMenu(dbs);
        registerForContextMenu(ocbc);
        registerForContextMenu(uob);
        registerForContextMenu(mayB);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if (v == dbs) {
            clicked = "dbs";
        } else if (v == ocbc) {
            clicked = "ocbc";
        } else if (v == uob) {
            clicked = "uob";
        } else if (v == mayB) {
            clicked = "mayB";
        }

        menu.add(0, 0, 0, R.string.contact);
        menu.add(0, 1, 1, R.string.website);
        menu.add(0, 2, 2, R.string.addFavourites);
        menu.add(0, 3, 3, R.string.removeFavourites);
    }

    @Override
    public boolean onContextItemSelected(MenuItem picked) {
        if (clicked.equalsIgnoreCase("dbs")) {
            if (picked.getItemId() == 0) {
                Intent Call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ "18001111111"));
                startActivity(Call);

            } else if (picked.getItemId() == 1) {
                Intent Site = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.dbs.com.sg"));
                startActivity(Site);
            } else if (picked.getItemId() == 2) {
                if (dbs.getCurrentTextColor() == getResources().getColor(R.color.black)) {
                    dbs.setTextColor(getResources().getColor(R.color.red));
                }
            } else if (picked.getItemId() == 3) {
                if (dbs.getCurrentTextColor() == getResources().getColor(R.color.red)) {
                    dbs.setTextColor(getResources().getColor(R.color.black));
                }
            }
        } else if (clicked.equalsIgnoreCase("ocbc")) {
            if (picked.getItemId() == 0) {
                Intent Call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ "18003633333"));
                startActivity(Call);

            } else if (picked.getItemId() == 1) {
                Intent Site = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.ocbc.com"));
                startActivity(Site);
            } else if (picked.getItemId() == 2) {
                if (ocbc.getCurrentTextColor() == getResources().getColor(R.color.black)) {
                    ocbc.setTextColor(getResources().getColor(R.color.red));
                }
            } else if (picked.getItemId() == 3) {
                if (ocbc.getCurrentTextColor() == getResources().getColor(R.color.red)) {
                    ocbc.setTextColor(getResources().getColor(R.color.black));
                }
            }
        } else if (clicked.equalsIgnoreCase("uob")) {
            if (picked.getItemId() == 0) {
                Intent Call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ "18002222121"));
                startActivity(Call);

            } else if (picked.getItemId() == 1) {
                Intent Site = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.uob.com.sg"));
                startActivity(Site);
            } else if (picked.getItemId() == 2) {
                if (uob.getCurrentTextColor() == getResources().getColor(R.color.black)) {
                    uob.setTextColor(getResources().getColor(R.color.red));
                }
            } else if (picked.getItemId() == 3) {
                if (uob.getCurrentTextColor() == getResources().getColor(R.color.red)) {
                    uob.setTextColor(getResources().getColor(R.color.black));
                }
            }
        } else if (clicked.equalsIgnoreCase("mayB")) {
            if (picked.getItemId() == 0) {
                Intent Call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ "18006292265"));
                startActivity(Call);

            } else if (picked.getItemId() == 1) {
                Intent Site = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.maybank2u.com.sg"));
                startActivity(Site);
            } else if (picked.getItemId() == 2) {
                if (mayB.getCurrentTextColor() == getResources().getColor(R.color.black)) {
                    mayB.setTextColor(getResources().getColor(R.color.red));
                }
            } else if (picked.getItemId() == 3) {
                if (mayB.getCurrentTextColor() == getResources().getColor(R.color.red)) {
                    mayB.setTextColor(getResources().getColor(R.color.black));
                }
            }
        }
        return false;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelected) {

            title.setText("BANK SELECTION");
            dbs.setText("DBS BANK");
            ocbc.setText("OCBC BANK");
            uob.setText("UOB BANK");
            mayB.setText("MAYBANK");
            Toast.makeText(MainActivity.this, "English language is chosen", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.ChineseSelected) {
            title.setText("銀行選擇");
            dbs.setText("星展银行");
            ocbc.setText("华侨银行");
            uob.setText("大华银行");
            mayB.setText("马来亚银行");
            Toast.makeText(MainActivity.this, "Chinese language is chosen", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.MalaySelected) {
            title.setText("PEMILIHAN BANK");
            dbs.setText("BANK DBS");
            ocbc.setText("BANK OCBC");
            uob.setText("BANK UOB");
            mayB.setText("MAYBANK");
            Toast.makeText(MainActivity.this, "Malay language is chosen", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.KoreanSelected) {
            title.setText("은행 선택");
            dbs.setText("DBS 은행");
            ocbc.setText("OCBC 은행");
            uob.setText("UOB 은행");
            mayB.setText("메이뱅크");
            Toast.makeText(MainActivity.this, "Korean language is chosen", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.JapaneseSelected) {
            title.setText("銀行の選択");
            dbs.setText("DBS 銀行");
            ocbc.setText("OCBC 銀行");
            uob.setText("UOB 銀行");
            mayB.setText("メイバンク");
            Toast.makeText(MainActivity.this, "Japanese language is chosen", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
