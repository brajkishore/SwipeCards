package test.swipecards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by braj.kishore on 1/24/2016.
 */
public class ChatInviteAdapter extends BaseAdapter {

    private List<InviteUserModel> invitations;
    private Context context;
    private LayoutInflater inflater ;


    public ChatInviteAdapter(Context context,List<InviteUserModel> invitations){
        this.context=context;
        this.invitations=invitations;
        inflater=(LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return invitations.size();
    }
    @Override
    public Object getItem(int pos) {
        return invitations.get(pos);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ViewHolder viewHolder;

        if (convertView == null) {

            v = inflater.inflate(R.layout.item, parent,false);
            viewHolder = new ViewHolder(v);
            v.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) v.getTag();
        }

        viewHolder.chatInvtImg.setImageResource(R.drawable.over);
        viewHolder.chatInvtName.setText(invitations.get(position).getUserDisplayName());
        viewHolder.chatDate.setText(invitations.get(position).getInviteDate());
        viewHolder.chatInvtMsg.setText(invitations.get(position).getMessage());
        return v;
    }
    class ViewHolder {
        public ImageView chatInvtImg;
        public TextView chatInvtName,chatDate,chatInvtMsg;

        public ViewHolder(View rootView) {
            chatInvtImg = (ImageView) rootView.findViewById(R.id.chatInvtImg);
            chatInvtName = (TextView) rootView.findViewById(R.id.chatInvtName);
            chatDate = (TextView) rootView.findViewById(R.id.chatDate);
            chatInvtMsg = (TextView) rootView.findViewById(R.id.chatInvtMsg);
        }
    }

}

