package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ebp */
public final class ebp extends BaseAdapter {
    /* renamed from: a */
    private final Context f3512a;
    /* renamed from: b */
    private final cqd f3513b;
    /* renamed from: c */
    private final ArrayList f3514c;
    /* renamed from: d */
    private final Locale f3515d = Locale.getDefault();
    /* renamed from: e */
    private final DecimalFormat f3516e = new DecimalFormat(".####");
    /* renamed from: f */
    private int f3517f = -1;
    /* renamed from: g */
    private int f3518g = -1;

    public ebp(Context context, cqd cqd) {
        this.f3512a = context;
        this.f3513b = cqd;
        this.f3514c = new ArrayList(cqd.f2558a.size());
        Iterator it = cqd.iterator();
        Object obj = 1;
        String str = null;
        while (it.hasNext()) {
            String str2;
            Object obj2;
            String string;
            Object format;
            Entry entry = (Entry) it.next();
            Object obj3;
            String str3;
            switch (((Integer) entry.getKey()).intValue()) {
                case 5:
                    this.f3517f = this.f3514c.size();
                    if (!entry.getValue().toString().equalsIgnoreCase("0")) {
                        obj3 = obj;
                        str2 = str;
                        str = m1746a(entry.getValue());
                        obj2 = obj3;
                        break;
                    }
                    obj2 = null;
                    str3 = str;
                    str = context.getString(R.string.unknown);
                    str2 = str3;
                    break;
                case 6:
                    this.f3518g = this.f3514c.size();
                    if (!entry.getValue().toString().equalsIgnoreCase("0")) {
                        obj3 = obj;
                        str2 = str;
                        str = m1746a(entry.getValue());
                        obj2 = obj3;
                        break;
                    }
                    obj2 = null;
                    str3 = str;
                    str = context.getString(R.string.unknown);
                    str2 = str3;
                    break;
                case 10:
                    obj3 = obj;
                    str2 = str;
                    str = Formatter.formatFileSize(context, ((Long) entry.getValue()).longValue());
                    obj2 = obj3;
                    break;
                case 102:
                    if ((((cqe) entry.getValue()).f2561b & cqe.f2560a) == 0) {
                        obj3 = obj;
                        str2 = str;
                        str = context.getString(R.string.flash_off);
                        obj2 = obj3;
                        break;
                    }
                    obj3 = obj;
                    str2 = str;
                    str = context.getString(R.string.flash_on);
                    obj2 = obj3;
                    break;
                case 103:
                    obj3 = obj;
                    str2 = str;
                    str = this.f3516e.format(Double.parseDouble(entry.getValue().toString()));
                    obj2 = obj3;
                    break;
                case 104:
                    if ("1".equals(entry.getValue())) {
                        string = context.getString(R.string.manual);
                    } else {
                        string = context.getString(R.string.auto);
                    }
                    obj3 = obj;
                    str2 = str;
                    str = string;
                    obj2 = obj3;
                    break;
                case 107:
                    double parseDouble = Double.parseDouble((String) entry.getValue());
                    if (parseDouble >= 1.0d) {
                        int i = (int) parseDouble;
                        parseDouble -= (double) i;
                        string = String.valueOf(String.valueOf(i)).concat("''");
                        if (parseDouble > 1.0E-4d) {
                            String valueOf = String.valueOf(string);
                            string = String.valueOf(String.format(this.f3515d, " %d/%d", new Object[]{Integer.valueOf(1), Integer.valueOf((int) ((1.0d / parseDouble) + 0.5d))}));
                            if (string.length() == 0) {
                                string = new String(valueOf);
                            } else {
                                string = valueOf.concat(string);
                            }
                        }
                        obj3 = obj;
                        str2 = str;
                        str = string;
                        obj2 = obj3;
                        break;
                    }
                    obj3 = obj;
                    str2 = str;
                    str = String.format(this.f3515d, "%d/%d", new Object[]{Integer.valueOf(1), Integer.valueOf((int) ((1.0d / parseDouble) + 0.5d))});
                    obj2 = obj3;
                    break;
                case 108:
                    obj3 = obj;
                    str2 = str;
                    str = m1745a(Integer.parseInt((String) entry.getValue()));
                    obj2 = obj3;
                    break;
                case 200:
                    string = String.valueOf(entry.getValue().toString());
                    str = "\n";
                    if (string.length() == 0) {
                        string = new String(str);
                    } else {
                        string = str.concat(string);
                    }
                    obj3 = obj;
                    str2 = entry.getValue().toString();
                    str = string;
                    obj2 = obj3;
                    break;
                default:
                    obj2 = entry.getValue();
                    if (obj2 != null) {
                        obj3 = obj;
                        str2 = str;
                        Object obj4 = obj2.toString();
                        obj2 = obj3;
                        break;
                    }
                    throw new AssertionError(String.format("%s's value is Null", new Object[]{dta.m9346a(context, ((Integer) entry.getKey()).intValue())}));
            }
            if (cqd.f2559b.indexOfKey(((Integer) entry.getKey()).intValue()) >= 0) {
                format = String.format("%s: %s %s", new Object[]{dta.m9346a(context, ((Integer) entry.getKey()).intValue()), obj4, context.getString(cqd.f2559b.get(((Integer) entry.getKey()).intValue()))});
            } else {
                format = String.format("%s: %s", new Object[]{dta.m9346a(context, ((Integer) entry.getKey()).intValue()), obj4});
            }
            this.f3514c.add(format);
            str = str2;
            obj = obj2;
        }
        if (obj == null) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            if (decodeFile != null) {
                i = decodeFile.getWidth();
                int height = decodeFile.getHeight();
                if (i != 0 && height != 0) {
                    string = String.format(this.f3515d, "%s: %d", new Object[]{dta.m9346a(this.f3512a, 5), Integer.valueOf(i)});
                    String format2 = String.format(this.f3515d, "%s: %d", new Object[]{dta.m9346a(this.f3512a, 6), Integer.valueOf(height)});
                    this.f3514c.set(this.f3517f, String.valueOf(string));
                    this.f3514c.set(this.f3518g, String.valueOf(format2));
                    notifyDataSetChanged();
                }
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getCount() {
        return this.f3514c.size();
    }

    public final Object getItem(int i) {
        return this.f3513b.f2558a.get(Integer.valueOf(i));
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = (TextView) LayoutInflater.from(this.f3512a).inflate(R.layout.details, viewGroup, false);
        } else {
            TextView textView = (TextView) view;
        }
        view.setText((CharSequence) this.f3514c.get(i));
        return view;
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    /* renamed from: a */
    private final String m1746a(Object obj) {
        if (obj instanceof Integer) {
            return m1745a(((Integer) obj).intValue());
        }
        String obj2 = obj.toString();
        try {
            return m1745a(Integer.parseInt(obj2));
        } catch (NumberFormatException e) {
            return obj2;
        }
    }

    /* renamed from: a */
    private final String m1745a(int i) {
        return String.format(this.f3515d, "%d", new Object[]{Integer.valueOf(i)});
    }
}
