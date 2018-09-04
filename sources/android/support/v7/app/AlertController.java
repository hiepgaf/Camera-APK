package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import p000.lw;
import p000.lz;
import p000.mv;
import p000.ni;

/* compiled from: PG */
public final class AlertController {
    /* renamed from: a */
    public final Context f607a;
    /* renamed from: b */
    public final mv f608b;
    /* renamed from: c */
    public final Window f609c;
    /* renamed from: d */
    public CharSequence f610d;
    /* renamed from: e */
    public ListView f611e;
    /* renamed from: f */
    public Button f612f;
    /* renamed from: g */
    public Button f613g;
    /* renamed from: h */
    public Button f614h;
    /* renamed from: i */
    public NestedScrollView f615i;
    /* renamed from: j */
    public Drawable f616j;
    /* renamed from: k */
    public ImageView f617k;
    /* renamed from: l */
    public TextView f618l;
    /* renamed from: m */
    public TextView f619m;
    /* renamed from: n */
    public View f620n;
    /* renamed from: o */
    public ListAdapter f621o;
    /* renamed from: p */
    public int f622p = -1;
    /* renamed from: q */
    public int f623q;
    /* renamed from: r */
    public int f624r;
    /* renamed from: s */
    public int f625s;
    /* renamed from: t */
    public boolean f626t;
    /* renamed from: u */
    public Handler f627u;
    /* renamed from: v */
    public final OnClickListener f628v = new lw(this);

    /* compiled from: PG */
    public class RecycleListView extends ListView {
        /* renamed from: a */
        public final int f605a;
        /* renamed from: b */
        public final int f606b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ni.bK);
            this.f606b = obtainStyledAttributes.getDimensionPixelOffset(ni.bL, -1);
            this.f605a = obtainStyledAttributes.getDimensionPixelOffset(ni.bM, -1);
        }
    }

    public AlertController(Context context, mv mvVar, Window window) {
        this.f607a = context;
        this.f608b = mvVar;
        this.f609c = window;
        this.f627u = new lz(mvVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ni.f8876D, R.attr.alertDialogStyle, 0);
        this.f623q = obtainStyledAttributes.getResourceId(ni.f8877E, 0);
        obtainStyledAttributes.getResourceId(ni.f8879G, 0);
        this.f624r = obtainStyledAttributes.getResourceId(ni.f8881I, 0);
        obtainStyledAttributes.getResourceId(ni.f8882J, 0);
        obtainStyledAttributes.getResourceId(ni.f8884L, 0);
        this.f625s = obtainStyledAttributes.getResourceId(ni.f8880H, 0);
        this.f626t = obtainStyledAttributes.getBoolean(ni.f8883K, true);
        obtainStyledAttributes.getDimensionPixelSize(ni.f8878F, 0);
        obtainStyledAttributes.recycle();
        mvVar.m14104a().mo2341b(1);
    }

    /* renamed from: a */
    public static void m408a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static ViewGroup m407a(View view, View view2) {
        View inflate;
        if (view == null) {
            if (view2 instanceof ViewStub) {
                inflate = ((ViewStub) view2).inflate();
            } else {
                inflate = view2;
            }
            return (ViewGroup) inflate;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            inflate = ((ViewStub) view).inflate();
        } else {
            inflate = view;
        }
        return (ViewGroup) inflate;
    }

    /* renamed from: a */
    public final void m409a(CharSequence charSequence) {
        this.f610d = charSequence;
        TextView textView = this.f618l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
