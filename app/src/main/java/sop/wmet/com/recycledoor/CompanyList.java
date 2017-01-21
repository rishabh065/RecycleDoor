package sop.wmet.com.recycledoor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by rishabh on 11/6/2016.
 */
public class CompanyList extends BaseAdapter {
    private Context mContext;
    private final String[]name;
    private final String[]add;
    private final String[]num;

    public CompanyList(Context c, String[] name, String[] add, String[] num) {
        mContext = c;
        this.add = add;
        this.name = name;
        this.num = num;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return add.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.company_list, null);

        } else {
            grid = (View) convertView;
        }
        TextView textView1 = (TextView) grid.findViewById(R.id.name);
        TextView textView2 = (TextView) grid.findViewById(R.id.add);
        TextView textView3 = (TextView) grid.findViewById(R.id.number);
        textView1.setText(name[position]);
        textView2.setText(add[position]);
        textView3.setText(num[position]);
        return grid;
    }
}
