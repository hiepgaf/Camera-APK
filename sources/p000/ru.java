package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: ru */
public final class ru {
    /* renamed from: a */
    public Toolbar f9146a;
    /* renamed from: b */
    public int f9147b;
    /* renamed from: c */
    public View f9148c;
    /* renamed from: d */
    public CharSequence f9149d;
    /* renamed from: e */
    public Callback f9150e;
    /* renamed from: f */
    public boolean f9151f;
    /* renamed from: g */
    public py f9152g;
    /* renamed from: h */
    private View f9153h;
    /* renamed from: i */
    private Drawable f9154i;
    /* renamed from: j */
    private Drawable f9155j;
    /* renamed from: k */
    private Drawable f9156k;
    /* renamed from: l */
    private boolean f9157l;
    /* renamed from: m */
    private CharSequence f9158m;
    /* renamed from: n */
    private CharSequence f9159n;
    /* renamed from: o */
    private int f9160o;
    /* renamed from: p */
    private Drawable f9161p;

    public ru(Toolbar toolbar) {
        this(toolbar, (byte) 0);
    }

    private ru(Toolbar toolbar, byte b) {
        boolean z;
        Context context;
        TextView textView;
        this.f9160o = 0;
        this.f9146a = toolbar;
        this.f9149d = toolbar.f724o;
        this.f9158m = toolbar.f725p;
        if (this.f9149d != null) {
            z = true;
        } else {
            z = false;
        }
        this.f9157l = z;
        this.f9156k = toolbar.m509f();
        vk a = vk.m6047a(toolbar.getContext(), null, ni.f8899a, R.attr.actionBarStyle, 0);
        this.f9161p = a.m6052b(ni.f8912n);
        CharSequence e = a.m6058e(ni.f8918t);
        if (!TextUtils.isEmpty(e)) {
            m5800a(e);
        }
        e = a.m6058e(ni.f8916r);
        if (!TextUtils.isEmpty(e)) {
            this.f9158m = e;
            if ((this.f9147b & 8) != 0) {
                this.f9146a.m505b(e);
            }
        }
        Drawable b2 = a.m6052b(ni.f8914p);
        if (b2 != null) {
            m5799a(b2);
        }
        b2 = a.m6052b(ni.f8913o);
        if (b2 != null) {
            this.f9154i = b2;
            m5795d();
        }
        if (this.f9156k == null) {
            b2 = this.f9161p;
            if (b2 != null) {
                this.f9156k = b2;
                m5793c();
            }
        }
        m5798a(a.m6055d(ni.f8908j, 0));
        int g = a.m6061g(ni.f8907i, 0);
        if (g != 0) {
            View inflate = LayoutInflater.from(this.f9146a.getContext()).inflate(g, this.f9146a, false);
            View view = this.f9153h;
            if (!(view == null || (this.f9147b & 16) == 0)) {
                this.f9146a.removeView(view);
            }
            this.f9153h = inflate;
            if (!(inflate == null || (this.f9147b & 16) == 0)) {
                this.f9146a.addView(this.f9153h);
            }
            m5798a(this.f9147b | 16);
        }
        g = a.m6059f(ni.f8910l, 0);
        if (g > 0) {
            LayoutParams layoutParams = this.f9146a.getLayoutParams();
            layoutParams.height = g;
            this.f9146a.setLayoutParams(layoutParams);
        }
        g = a.m6051b(ni.f8906h, -1);
        int b3 = a.m6051b(ni.f8905g, -1);
        if (g >= 0 || b3 >= 0) {
            Toolbar toolbar2 = this.f9146a;
            g = Math.max(g, 0);
            b3 = Math.max(b3, 0);
            toolbar2.m503b();
            toolbar2.f723n.m6038a(g, b3);
        }
        g = a.m6061g(ni.f8919u, 0);
        if (g != 0) {
            Toolbar toolbar3 = this.f9146a;
            context = toolbar3.getContext();
            toolbar3.f720k = g;
            textView = toolbar3.f711b;
            if (textView != null) {
                textView.setTextAppearance(context, g);
            }
        }
        g = a.m6061g(ni.f8917s, 0);
        if (g != 0) {
            toolbar3 = this.f9146a;
            context = toolbar3.getContext();
            toolbar3.f721l = g;
            textView = toolbar3.f712c;
            if (textView != null) {
                textView.setTextAppearance(context, g);
            }
        }
        int g2 = a.m6061g(ni.f8915q, 0);
        if (g2 != 0) {
            this.f9146a.m499a(g2);
        }
        a.f9419b.recycle();
        if (this.f9160o != R.string.abc_action_bar_up_description) {
            this.f9160o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f9146a.m508e())) {
                CharSequence charSequence;
                int i = this.f9160o;
                if (i == 0) {
                    charSequence = null;
                } else {
                    charSequence = this.f9146a.getContext().getString(i);
                }
                this.f9159n = charSequence;
                m5792b();
            }
        }
        this.f9159n = this.f9146a.m508e();
        Toolbar toolbar4 = this.f9146a;
        OnClickListener vrVar = new vr(this);
        toolbar4.m506c();
        toolbar4.f713d.setOnClickListener(vrVar);
    }

    /* renamed from: a */
    public final void m5797a() {
        ActionMenuView actionMenuView = this.f9146a.f710a;
        if (actionMenuView != null) {
            actionMenuView.m6818a();
        }
    }

    /* renamed from: a */
    public final void m5798a(int i) {
        int i2 = this.f9147b ^ i;
        this.f9147b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m5792b();
                }
                m5793c();
            }
            if ((i2 & 3) != 0) {
                m5795d();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f9146a.m507c(this.f9149d);
                    this.f9146a.m505b(this.f9158m);
                } else {
                    this.f9146a.m507c(null);
                    this.f9146a.m505b(null);
                }
            }
            if ((i2 & 16) != 0) {
                View view = this.f9153h;
                if (view == null) {
                    return;
                }
                if ((i & 16) != 0) {
                    this.f9146a.addView(view);
                } else {
                    this.f9146a.removeView(view);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m5799a(Drawable drawable) {
        this.f9155j = drawable;
        m5795d();
    }

    /* renamed from: a */
    public final void m5800a(CharSequence charSequence) {
        this.f9157l = true;
        m5794c(charSequence);
    }

    /* renamed from: c */
    private final void m5794c(CharSequence charSequence) {
        this.f9149d = charSequence;
        if ((this.f9147b & 8) != 0) {
            this.f9146a.m507c(charSequence);
        }
    }

    /* renamed from: b */
    public final void m5801b(int i) {
        this.f9146a.setVisibility(i);
    }

    /* renamed from: b */
    public final void m5802b(CharSequence charSequence) {
        if (!this.f9157l) {
            m5794c(charSequence);
        }
    }

    /* renamed from: a */
    public final kd m5796a(int i, long j) {
        float f;
        kd a = jm.m4547a(this.f9146a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return a.m4768a(f).m4769a(j).m4770a(new vs(this, i));
    }

    /* renamed from: b */
    private final void m5792b() {
        if ((this.f9147b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f9159n)) {
            CharSequence text;
            Toolbar toolbar = this.f9146a;
            int i = this.f9160o;
            if (i != 0) {
                text = toolbar.getContext().getText(i);
            } else {
                text = null;
            }
            toolbar.m502a(text);
            return;
        }
        this.f9146a.m502a(this.f9159n);
    }

    /* renamed from: c */
    private final void m5793c() {
        if ((this.f9147b & 4) != 0) {
            Toolbar toolbar = this.f9146a;
            Drawable drawable = this.f9156k;
            if (drawable == null) {
                drawable = this.f9161p;
            }
            toolbar.m504b(drawable);
            return;
        }
        this.f9146a.m504b(null);
    }

    /* renamed from: d */
    private final void m5795d() {
        Drawable drawable;
        int i = this.f9147b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f9155j;
            if (drawable == null) {
                drawable = this.f9154i;
            }
        } else {
            drawable = this.f9154i;
        }
        this.f9146a.m500a(drawable);
    }
}
