package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qm */
public class qm extends Button {
    /* renamed from: a */
    private final ql f9056a;
    /* renamed from: b */
    private final rm f9057b;

    public qm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public qm(Context context, AttributeSet attributeSet, int i) {
        super(vh.m6044a(context), attributeSet, i);
        this.f9056a = new ql(this);
        this.f9056a.m5715a(attributeSet, i);
        this.f9057b = new rm(this);
        this.f9057b.m5755a(attributeSet, i);
        this.f9057b.m5753a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ql qlVar = this.f9056a;
        if (qlVar != null) {
            qlVar.m5713a();
        }
        rm rmVar = this.f9057b;
        if (rmVar != null) {
            rmVar.m5753a();
        }
    }

    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() != 1 ? 0 : 1;
    }

    /* renamed from: a */
    public ColorStateList mo550a() {
        ql qlVar = this.f9056a;
        if (qlVar == null) {
            return null;
        }
        vi viVar = qlVar.f9050a;
        if (viVar != null) {
            return viVar.f9414a;
        }
        return null;
    }

    /* renamed from: b */
    public Mode mo553b() {
        ql qlVar = this.f9056a;
        if (qlVar == null) {
            return null;
        }
        vi viVar = qlVar.f9050a;
        if (viVar != null) {
            return viVar.f9415b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ql qlVar = this.f9056a;
        if (qlVar != null) {
            qlVar.m5716b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ql qlVar = this.f9056a;
        if (qlVar != null) {
            qlVar.m5714a(i);
        }
    }

    /* renamed from: a */
    public void mo551a(ColorStateList colorStateList) {
        ql qlVar = this.f9056a;
        if (qlVar != null) {
            if (qlVar.f9050a == null) {
                qlVar.f9050a = new vi();
            }
            vi viVar = qlVar.f9050a;
            viVar.f9414a = colorStateList;
            viVar.f9417d = true;
            qlVar.m5713a();
        }
    }

    /* renamed from: a */
    public void mo552a(Mode mode) {
        ql qlVar = this.f9056a;
        if (qlVar != null) {
            if (qlVar.f9050a == null) {
                qlVar.f9050a = new vi();
            }
            vi viVar = qlVar.f9050a;
            viVar.f9415b = mode;
            viVar.f9416c = true;
            qlVar.m5713a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        rm rmVar = this.f9057b;
        if (rmVar != null) {
            rmVar.m5754a(context, i);
        }
    }
}
