package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import p000.jm;
import p000.ni;
import p000.ot;
import p000.ph;
import p000.vk;

/* compiled from: PG */
public class ListMenuItemView extends LinearLayout implements SelectionBoundsAdjuster, ph {
    /* renamed from: a */
    public ot f10016a;
    /* renamed from: b */
    public ImageView f10017b;
    /* renamed from: c */
    public boolean f10018c;
    /* renamed from: d */
    public boolean f10019d;
    /* renamed from: e */
    public boolean f10020e;
    /* renamed from: f */
    private ImageView f10021f;
    /* renamed from: g */
    private RadioButton f10022g;
    /* renamed from: h */
    private TextView f10023h;
    /* renamed from: i */
    private CheckBox f10024i;
    /* renamed from: j */
    private TextView f10025j;
    /* renamed from: k */
    private ImageView f10026k;
    /* renamed from: l */
    private LinearLayout f10027l;
    /* renamed from: m */
    private Drawable f10028m;
    /* renamed from: n */
    private int f10029n;
    /* renamed from: o */
    private Context f10030o;
    /* renamed from: p */
    private Drawable f10031p;
    /* renamed from: q */
    private LayoutInflater f10032q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        vk a = vk.m6047a(getContext(), attributeSet, ni.bC, i, 0);
        this.f10028m = a.m6052b(ni.bD);
        this.f10029n = a.m6061g(ni.bE, -1);
        this.f10018c = a.m6050a(ni.bF, false);
        this.f10030o = context;
        this.f10031p = a.m6052b(ni.bG);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f10019d = obtainStyledAttributes.hasValue(0);
        a.f9419b.recycle();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m6781a(View view, int i) {
        LinearLayout linearLayout = this.f10027l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f10017b;
        if (imageView != null && imageView.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f10017b.getLayoutParams();
            rect.top = (layoutParams.bottomMargin + (this.f10017b.getHeight() + layoutParams.topMargin)) + rect.top;
        }
    }

    /* renamed from: c */
    private final LayoutInflater m6782c() {
        if (this.f10032q == null) {
            this.f10032q = LayoutInflater.from(getContext());
        }
        return this.f10032q;
    }

    /* renamed from: a */
    public final ot mo280a() {
        return this.f10016a;
    }

    /* renamed from: a */
    public final void mo281a(ot otVar) {
        int i;
        int i2;
        int i3 = 8;
        this.f10016a = otVar;
        if (otVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        CharSequence a = otVar.m14275a((ph) this);
        if (a != null) {
            this.f10023h.setText(a);
            if (this.f10023h.getVisibility() != 0) {
                this.f10023h.setVisibility(0);
            }
        } else if (this.f10023h.getVisibility() != 8) {
            this.f10023h.setVisibility(8);
        }
        boolean isCheckable = otVar.isCheckable();
        if (!(!isCheckable && this.f10022g == null && this.f10024i == null)) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.f10016a.m14287f()) {
                if (this.f10022g == null) {
                    this.f10022g = (RadioButton) m6782c().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    m6781a(this.f10022g, -1);
                }
                compoundButton = this.f10022g;
                compoundButton2 = this.f10024i;
            } else {
                if (this.f10024i == null) {
                    this.f10024i = (CheckBox) m6782c().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    m6781a(this.f10024i, -1);
                }
                compoundButton = this.f10024i;
                compoundButton2 = this.f10022g;
            }
            if (isCheckable) {
                compoundButton.setChecked(this.f10016a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (!(compoundButton2 == null || compoundButton2.getVisibility() == 8)) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.f10024i;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.f10022g;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
        boolean h = otVar.m14289h();
        otVar.m14279b();
        if (!h) {
            i2 = 8;
        } else if (this.f10016a.m14289h()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        if (i2 == 0) {
            TextView textView = this.f10025j;
            ot otVar2 = this.f10016a;
            char b = otVar2.m14279b();
            if (b == '\u0000') {
                a = "";
            } else {
                Resources resources = otVar2.f19512d.f19479a.getResources();
                StringBuilder stringBuilder = new StringBuilder();
                if (ViewConfiguration.get(otVar2.f19512d.f19479a).hasPermanentMenuKey()) {
                    stringBuilder.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                if (otVar2.f19512d.mo3320g()) {
                    i = otVar2.f19511c;
                } else {
                    i = otVar2.f19510b;
                }
                ot.m14271a(stringBuilder, i, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                ot.m14271a(stringBuilder, i, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                ot.m14271a(stringBuilder, i, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                ot.m14271a(stringBuilder, i, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                ot.m14271a(stringBuilder, i, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                ot.m14271a(stringBuilder, i, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                switch (b) {
                    case '\b':
                        stringBuilder.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        break;
                    case '\n':
                        stringBuilder.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        break;
                    case ' ':
                        stringBuilder.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        break;
                    default:
                        stringBuilder.append(b);
                        break;
                }
                a = stringBuilder.toString();
            }
            textView.setText(a);
        }
        if (this.f10025j.getVisibility() != i2) {
            this.f10025j.setVisibility(i2);
        }
        Drawable icon = otVar.getIcon();
        isCheckable = this.f10020e;
        if (isCheckable || this.f10018c) {
            ImageView imageView = this.f10021f;
            if (!(imageView == null && icon == null && !this.f10018c)) {
                if (imageView == null) {
                    this.f10021f = (ImageView) m6782c().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    m6781a(this.f10021f, 0);
                }
                if (icon != null || this.f10018c) {
                    Drawable drawable;
                    ImageView imageView2 = this.f10021f;
                    if (isCheckable) {
                        drawable = icon;
                    } else {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f10021f.getVisibility() != 0) {
                        this.f10021f.setVisibility(0);
                    }
                } else {
                    this.f10021f.setVisibility(8);
                }
            }
        }
        setEnabled(otVar.isEnabled());
        h = otVar.hasSubMenu();
        ImageView imageView3 = this.f10026k;
        if (imageView3 != null) {
            if (h) {
                i3 = 0;
            }
            imageView3.setVisibility(i3);
        }
        setContentDescription(otVar.getContentDescription());
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        jm.m4555a((View) this, this.f10028m);
        this.f10023h = (TextView) findViewById(R.id.title);
        int i = this.f10029n;
        if (i != -1) {
            this.f10023h.setTextAppearance(this.f10030o, i);
        }
        this.f10025j = (TextView) findViewById(R.id.shortcut);
        this.f10026k = (ImageView) findViewById(R.id.submenuarrow);
        ImageView imageView = this.f10026k;
        if (imageView != null) {
            imageView.setImageDrawable(this.f10031p);
        }
        this.f10017b = (ImageView) findViewById(R.id.group_divider);
        this.f10027l = (LinearLayout) findViewById(R.id.content);
    }

    protected void onMeasure(int i, int i2) {
        if (this.f10021f != null && this.f10018c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f10021f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: b */
    public final boolean mo282b() {
        return false;
    }
}
