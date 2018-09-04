package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController;
import android.support.v7.app.AlertController.RecycleListView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: mb */
public final class mb extends mv implements DialogInterface {
    /* renamed from: a */
    public final AlertController f22477a = new AlertController(getContext(), this, getWindow());

    public mb(Context context, int i) {
        super(context, mb.m16694a(context, i));
    }

    protected final void onCreate(Bundle bundle) {
        int i;
        Object obj;
        int i2;
        super.onCreate(bundle);
        AlertController alertController = this.f22477a;
        alertController.f608b.setContentView(alertController.f623q);
        View findViewById = alertController.f609c.findViewById(R.id.parentPanel);
        View findViewById2 = findViewById.findViewById(R.id.topPanel);
        View findViewById3 = findViewById.findViewById(R.id.contentPanel);
        View findViewById4 = findViewById.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(R.id.customPanel);
        alertController.f609c.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById5 = viewGroup.findViewById(R.id.topPanel);
        View findViewById6 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById7 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a = AlertController.m407a(findViewById5, findViewById2);
        ViewGroup a2 = AlertController.m407a(findViewById6, findViewById3);
        ViewGroup a3 = AlertController.m407a(findViewById7, findViewById4);
        alertController.f615i = (NestedScrollView) alertController.f609c.findViewById(R.id.scrollView);
        alertController.f615i.setFocusable(false);
        alertController.f615i.setNestedScrollingEnabled(false);
        alertController.f619m = (TextView) a2.findViewById(16908299);
        TextView textView = alertController.f619m;
        if (textView != null) {
            textView.setVisibility(8);
            alertController.f615i.removeView(alertController.f619m);
            if (alertController.f611e != null) {
                ViewGroup viewGroup2 = (ViewGroup) alertController.f615i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(alertController.f615i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(alertController.f611e, indexOfChild, new LayoutParams(-1, -1));
            } else {
                a2.setVisibility(8);
            }
        }
        alertController.f612f = (Button) a3.findViewById(16908313);
        alertController.f612f.setOnClickListener(alertController.f628v);
        if (TextUtils.isEmpty(null)) {
            alertController.f612f.setVisibility(8);
            indexOfChild = 0;
        } else {
            alertController.f612f.setText(null);
            alertController.f612f.setVisibility(0);
            indexOfChild = 1;
        }
        alertController.f613g = (Button) a3.findViewById(16908314);
        alertController.f613g.setOnClickListener(alertController.f628v);
        if (TextUtils.isEmpty(null)) {
            alertController.f613g.setVisibility(8);
        } else {
            alertController.f613g.setText(null);
            alertController.f613g.setVisibility(0);
            indexOfChild |= 2;
        }
        alertController.f614h = (Button) a3.findViewById(16908315);
        alertController.f614h.setOnClickListener(alertController.f628v);
        if (TextUtils.isEmpty(null)) {
            alertController.f614h.setVisibility(8);
        } else {
            alertController.f614h.setText(null);
            alertController.f614h.setVisibility(0);
            indexOfChild |= 4;
        }
        Context context = alertController.f607a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (indexOfChild == 1) {
                AlertController.m408a(alertController.f612f);
            } else if (indexOfChild == 2) {
                AlertController.m408a(alertController.f613g);
            } else if (indexOfChild == 4) {
                AlertController.m408a(alertController.f614h);
            }
        }
        if (indexOfChild == 0) {
            a3.setVisibility(8);
        }
        if (alertController.f620n != null) {
            a.addView(alertController.f620n, 0, new LayoutParams(-1, -2));
            alertController.f609c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.f617k = (ImageView) alertController.f609c.findViewById(16908294);
            if ((TextUtils.isEmpty(alertController.f610d) ^ 1) == 0 || !alertController.f626t) {
                alertController.f609c.findViewById(R.id.title_template).setVisibility(8);
                alertController.f617k.setVisibility(8);
                a.setVisibility(8);
            } else {
                alertController.f618l = (TextView) alertController.f609c.findViewById(R.id.alertTitle);
                alertController.f618l.setText(alertController.f610d);
                Drawable drawable = alertController.f616j;
                if (drawable != null) {
                    alertController.f617k.setImageDrawable(drawable);
                } else {
                    alertController.f618l.setPadding(alertController.f617k.getPaddingLeft(), alertController.f617k.getPaddingTop(), alertController.f617k.getPaddingRight(), alertController.f617k.getPaddingBottom());
                    alertController.f617k.setVisibility(8);
                }
            }
        }
        Object obj2 = viewGroup != null ? viewGroup.getVisibility() != 8 ? 1 : null : null;
        if (a == null) {
            i = 0;
        } else if (a.getVisibility() != 8) {
            i = 1;
        } else {
            i = 0;
        }
        if (a3 == null) {
            obj = null;
        } else if (a3.getVisibility() != 8) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null && a2 != null) {
            findViewById = a2.findViewById(R.id.textSpacerNoButtons);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        if (i != 0) {
            NestedScrollView nestedScrollView = alertController.f615i;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (alertController.f611e != null) {
                findViewById = a.findViewById(R.id.titleDividerNoCustom);
            } else {
                findViewById = null;
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else if (a2 != null) {
            findViewById = a2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        ListView listView = alertController.f611e;
        if (listView instanceof RecycleListView) {
            RecycleListView recycleListView = (RecycleListView) listView;
            if (obj == null || i == 0) {
                int paddingLeft = recycleListView.getPaddingLeft();
                if (i == 0) {
                    i2 = recycleListView.f605a;
                } else {
                    i2 = recycleListView.getPaddingTop();
                }
                int paddingRight = recycleListView.getPaddingRight();
                if (obj == null) {
                    indexOfChild = recycleListView.f606b;
                } else {
                    indexOfChild = recycleListView.getPaddingBottom();
                }
                recycleListView.setPadding(paddingLeft, i2, paddingRight, indexOfChild);
            }
        }
        if (obj2 == null) {
            findViewById = alertController.f611e;
            if (findViewById == null) {
                findViewById2 = alertController.f615i;
            } else {
                findViewById2 = findViewById;
            }
            if (findViewById2 != null) {
                int i3;
                if (obj == null) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                findViewById3 = alertController.f609c.findViewById(R.id.scrollIndicatorUp);
                findViewById4 = alertController.f609c.findViewById(R.id.scrollIndicatorDown);
                jm.m4570d(findViewById2, i3 | i);
                if (findViewById3 != null) {
                    a2.removeView(findViewById3);
                }
                if (findViewById4 != null) {
                    a2.removeView(findViewById4);
                }
            }
        }
        listView = alertController.f611e;
        if (listView != null) {
            ListAdapter listAdapter = alertController.f621o;
            if (listAdapter != null) {
                listView.setAdapter(listAdapter);
                i2 = alertController.f622p;
                if (i2 >= 0) {
                    listView.setItemChecked(i2, true);
                    listView.setSelection(i2);
                }
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = false;
        NestedScrollView nestedScrollView = this.f22477a.f615i;
        if (nestedScrollView != null && nestedScrollView.m6767a(keyEvent)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z = false;
        NestedScrollView nestedScrollView = this.f22477a.f615i;
        if (nestedScrollView != null && nestedScrollView.m6767a(keyEvent)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: a */
    static int m16694a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f22477a.m409a(charSequence);
    }
}
