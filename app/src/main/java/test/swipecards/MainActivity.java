package test.swipecards;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getSimpleName();
    private Context context;

    private ArrayList<String> al;
    private ArrayAdapter<String> arrayAdapter;
    private int i;

    SwipeFlingAdapterView flingContainer;


    Button btnChatInviteNotif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;

         btnChatInviteNotif=(Button)findViewById(R.id.btnChatInviteNotif);

        btnChatInviteNotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int loc[]=new int[2];
                v.getLocationOnScreen(loc);
                Log.d("Main","button x "+loc[0]+" :y "+loc[1]);

                Intent intent =new Intent(MainActivity.this,ChatNotifActivity.class);
                intent.putExtra("loc",loc);
                startActivity(intent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);

            }
        });


        List<ChatHistoryModel> chatHistory=new ArrayList<ChatHistoryModel>();
        ChatHistoryModel chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);

        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);

        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);


        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);


        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);


        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);


        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);


        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);


        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);

        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);

        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);
        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);
        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);
        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat); chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat); chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);
        chat=new ChatHistoryModel();
        chat.setChatDate("2016/01/24");
        chat.setChatUName("Amit");
        chat.setChatLine("sdbfjkdsgjetjjhklrdjhljskznrdjgshtefklnsglthtgvnfzjhest5ohetnfvjeh5litgjesvnsleh5ioy");
        chatHistory.add(chat);




        ChatHistoryAdapter chatHistoryAdapter=new ChatHistoryAdapter(this,chatHistory);

        ListView chatHistoryView=(ListView)findViewById(R.id.chatHistory);
        chatHistoryView.setAdapter(chatHistoryAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up buttons, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
