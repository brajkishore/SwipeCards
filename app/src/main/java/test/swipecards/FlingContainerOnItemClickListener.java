package test.swipecards;

import android.content.Context;
import android.widget.Toast;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

/**
 * Created by braj.kishore on 1/24/2016.
 */
public class FlingContainerOnItemClickListener  implements SwipeFlingAdapterView.OnItemClickListener {

    private static  FlingContainerOnItemClickListener flingContainerOnItemClickListener;
    private static Context context;

    private FlingContainerOnItemClickListener(){

    }
    public static FlingContainerOnItemClickListener getInstance(Context context){

        flingContainerOnItemClickListener=new FlingContainerOnItemClickListener();
        flingContainerOnItemClickListener.context=context;

        return flingContainerOnItemClickListener;
    }
    @Override
    public void onItemClicked(int itemPosition, Object dataObject) {
        makeToast(context, "Clicked!");
    }

    static void makeToast(Context ctx, String s){
        Toast.makeText(ctx, s, Toast.LENGTH_SHORT).show();
    }


}

