package test.swipecards;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;
import java.util.List;

public class ChatNotifActivity extends Activity {

    private static final String TAG=ChatNotifActivity.class.getSimpleName();

    private ArrayList<String> al;
    private ArrayAdapter<String> arrayAdapter;
    private int i;

    SwipeFlingAdapterView flingContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_invite_notif);


       /* Intent i=getIntent();
        int loc[]=i.getIntArrayExtra("loc");

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.chatNotifMain);
        Button button=new Button(this);

        LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.leftMargin=loc[0];
        layoutParams.topMargin=loc[1];
        linearLayout.addView(button, layoutParams);*/

        addChatInviteNotifLayout();


    }

    private void addChatInviteNotifLayout() {

        Log.d(TAG, "Inside to add notif alerts");

        flingContainer=(SwipeFlingAdapterView)findViewById(R.id.frame);

       /* al = new ArrayList<>();
        al.add("php");
        al.add("c");
        al.add("python");
        al.add("java");
        al.add("html");
        al.add("c++");
        al.add("css");
        al.add("javascript");

        arrayAdapter = new ArrayAdapter<>(this, R.layout.item, R.id.helloText, al );
        */

         List<InviteUserModel> invitations=new ArrayList<InviteUserModel>();
        InviteUserModel us=new InviteUserModel();
        us.setMessage("sdbfjsnfkerlger;gleg'gt;'g;e' bfksfkrfsmlsrvhsgfdsedsdcscsagdcgeccsd sdcwedo dccasfcxwygdccysa2324 cwfeftw sfgrfaesfyuvsdgcvwef cd");
        us.setUserDisplayName("Braj");
        us.setInviteDate("1e12324");
        invitations.add(us);

        us = new InviteUserModel();
        us.setMessage("sfgrfaesfyuvsdgcvwef cd");
        us.setUserDisplayName("Braj");
        us.setInviteDate("1e12324");
        invitations.add(us);

         us=new InviteUserModel();
        us.setMessage("sfgrfaesfyuvsdgcvwef cd");
        us.setUserDisplayName("Braj");
        us.setInviteDate("1e12324");
        invitations.add(us);

        ChatInviteAdapter a=new ChatInviteAdapter(this,invitations);
        flingContainer.setAdapter(a);
        //flingContainer.setAdapter(arrayAdapter);

        FlingContainerFlingListener flingContainerFlingListener=FlingContainerFlingListener.getInstance(this,flingContainer,invitations,a);
        flingContainer.setFlingListener(flingContainerFlingListener);

        // Optionally add an OnItemClickListener
        FlingContainerOnItemClickListener flingContainerOnItemClickListener =FlingContainerOnItemClickListener.getInstance(this);
        flingContainer.setOnItemClickListener(flingContainerOnItemClickListener);

    }

}
