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
public class ChatHistoryAdapter extends BaseAdapter {

    private List<ChatHistoryModel> chatHistory;
    private Context context;
    private LayoutInflater inflater ;

    public ChatHistoryAdapter(Context context,List<ChatHistoryModel> chatHistory){
        this.context=context;
        this.chatHistory=chatHistory;
        inflater=(LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return chatHistory.size();
    }
    @Override
    public Object getItem(int pos) {
        return chatHistory.get(pos);
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

            v = inflater.inflate(R.layout.chat_history_item, null);
            viewHolder = new ViewHolder(v);
            v.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) v.getTag();
        }

        viewHolder.chatImg.setImageResource(R.drawable.over);
        viewHolder.chatUName.setText(chatHistory.get(position).getChatUName());
        viewHolder.chatDate.setText(chatHistory.get(position).getChatDate());
        viewHolder.chatLine.setText(chatHistory.get(position).getChatLine());
        return v;
    }
    class ViewHolder {
        public ImageView chatImg;
        public TextView chatUName,chatDate,chatLine;

        public ViewHolder(View rootView) {
            chatImg = (ImageView) rootView.findViewById(R.id.chatImg);
            chatUName = (TextView) rootView.findViewById(R.id.chatUName);
            chatDate = (TextView) rootView.findViewById(R.id.chatDate);
            chatLine = (TextView) rootView.findViewById(R.id.chatLine);
        }
    }

}

