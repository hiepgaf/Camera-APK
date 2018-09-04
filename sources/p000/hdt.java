package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hdt */
public final class hdt extends BaseAdapter {
    /* renamed from: b */
    public static final String f6068b = bli.m862a("TbxMnuAdap");
    /* renamed from: a */
    public final List f6069a = new ArrayList();
    /* renamed from: c */
    private final Context f6070c;
    /* renamed from: d */
    private final ilp f6071d;
    /* renamed from: e */
    private final ilp f6072e;
    /* renamed from: f */
    private final ilp f6073f;
    /* renamed from: g */
    private final boolean f6074g;

    public hdt(Context context, fbn fbn, boolean z, ilp ilp, ilp ilp2, ilp ilp3, ikd ikd, aws aws, gyl gyl, boolean z2) {
        this.f6070c = context;
        this.f6071d = ilp;
        this.f6072e = ilp2;
        this.f6073f = ilp3;
        this.f6074g = z2;
        if (fbn.mo1350d()) {
            this.f6069a.add(hhx.SLOW_MOTION);
        }
        this.f6069a.add(hhx.PANORAMA);
        this.f6069a.add(hhx.PHOTO_SPHERE);
        if (z) {
            this.f6069a.add(hhx.PORTRAIT);
        } else {
            this.f6069a.add(hhx.LENS_BLUR);
        }
        this.f6069a.add(hhx.SETTINGS);
        if (hak.m2982a(context)) {
            List list = this.f6069a;
            list.add(list.size() - 1, hhx.ORNAMENT);
            notifyDataSetChanged();
        }
        kow.m13622a(gyl.m2922a(), new hdx(this), ikd);
        aws.mo373a().mo1879a(this.f6071d.mo2859a(new hdu(this), ikd));
        aws.mo373a().mo1879a(this.f6072e.mo2859a(new hdv(this), ikd));
        aws.mo373a().mo1879a(this.f6073f.mo2859a(new hdw(this), ikd));
    }

    public final int getCount() {
        return this.f6069a.size();
    }

    public final Object getItem(int i) {
        return this.f6069a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f6070c).inflate(R.layout.toybox_menu_item, viewGroup, false);
        }
        hhx hhx = (hhx) getItem(i);
        Resources resources = this.f6070c.getResources();
        TextView textView = (TextView) jqk.m13102c((TextView) view.findViewById(R.id.menu_item_title));
        textView.setText(resources.getString(hhx.f6214o));
        textView.setContentDescription(resources.getString(hhx.f6215p));
        ((ImageView) jqk.m13102c((ImageView) view.findViewById(R.id.menu_item_icon))).setImageDrawable(hhx.m3151a(resources));
        if (!this.f6074g) {
            ImageView imageView;
            if (hhx.equals(hhx.PORTRAIT)) {
                imageView = (ImageView) view.findViewById(R.id.menu_item_dot);
                if (imageView != null) {
                    if (((Boolean) this.f6071d.mo2860b()).booleanValue()) {
                        ((ViewGroup) imageView.getParent()).removeView(imageView);
                    } else {
                        imageView.setVisibility(0);
                    }
                }
            }
            if (hhx.equals(hhx.ORNAMENT)) {
                imageView = (ImageView) view.findViewById(R.id.menu_item_dot);
                if (imageView != null) {
                    if (((Boolean) this.f6072e.mo2860b()).booleanValue()) {
                        ((ViewGroup) imageView.getParent()).removeView(imageView);
                    } else {
                        imageView.setVisibility(0);
                    }
                }
            }
            if (hhx.equals(hhx.LENS)) {
                ImageView imageView2 = (ImageView) view.findViewById(R.id.menu_item_dot);
                if (imageView2 != null) {
                    if (((Boolean) this.f6073f.mo2860b()).booleanValue()) {
                        ((ViewGroup) imageView2.getParent()).removeView(imageView2);
                    } else {
                        imageView2.setVisibility(0);
                    }
                }
            }
        }
        return view;
    }
}
