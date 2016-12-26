package test.swipecards;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.List;

/**
 * Created by braj.kishore on 1/24/2016.
 */
public class FlingContainerFlingListener implements SwipeFlingAdapterView.onFlingListener {

    private  SwipeFlingAdapterView flingContainer;
    private  Context context;
    private ChatInviteAdapter chatInviteAdapter;
    private List<InviteUserModel> items;

    private FlingContainerFlingListener(){

    }
    public static FlingContainerFlingListener getInstance(Context context,SwipeFlingAdapterView flingContainer,List<InviteUserModel> items
                                                          ,ChatInviteAdapter chatInviteAdapter){

        FlingContainerFlingListener flingContainerFlingListener=new FlingContainerFlingListener();
        flingContainerFlingListener.context=context;
        flingContainerFlingListener.flingContainer=flingContainer;
        flingContainerFlingListener.chatInviteAdapter=chatInviteAdapter;
        flingContainerFlingListener.items=items;


        return flingContainerFlingListener;
    }
    @Override
    public void removeFirstObjectInAdapter() {
        // this is the simplest way to delete an object from the Adapter (/AdapterView)
        Log.d("LIST", "removed object!");
        items.remove(0);
        chatInviteAdapter.notifyDataSetChanged();

        if(items.size()==0) {
            Log.d("LIST", "remove method all items are shown");
            flingContainer.setVisibility(View.GONE);
            ChatNotifActivity activity=((ChatNotifActivity) context);
            activity.finish();
            activity.overridePendingTransition(R.anim.bottom_in, R.anim.top_out);


        }
    }

    @Override
    public void onLeftCardExit(Object dataObject) {
        //Do something on the left!
        //You also have access to the original object.
        //If you want to use it just cast it (String) dataObject
        makeToast(context, "Left!");
    }

    @Override
    public void onRightCardExit(Object dataObject) {
        makeToast(context, "Right!");
    }

    @Override
    public void onAdapterAboutToEmpty(int itemsInAdapter) {
        // Ask for more data here
               /* al.add("XML ".concat(String.valueOf(i)));
                arrayAdapter.notifyDataSetChanged();*/

        Log.d("LIST", "notified");
    }

    @Override
    public void onScroll(float scrollProgressPercent) {
        View view = flingContainer.getSelectedView();
        view.findViewById(R.id.item_swipe_right_indicator).setAlpha(scrollProgressPercent < 0 ? -scrollProgressPercent : 0);
        view.findViewById(R.id.item_swipe_left_indicator).setAlpha(scrollProgressPercent > 0 ? scrollProgressPercent : 0);
    }
    static void makeToast(Context ctx, String s){
        Toast.makeText(ctx, s, Toast.LENGTH_SHORT).show();
    }


}

