package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qv */
public class qv extends ImageButton {
    /* renamed from: a */
    private final ql f9087a;
    /* renamed from: b */
    private final qw f9088b;

    public qv(Context context) {
        this(context, null);
    }

    public qv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public qv(Context context, AttributeSet attributeSet, int i) {
        super(vh.m6044a(context), attributeSet, i);
        this.f9087a = new ql(this);
        this.f9087a.m5715a(attributeSet, i);
        this.f9088b = new qw(this);
        this.f9088b.m5744a(attributeSet, i);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ql qlVar = this.f9087a;
        if (qlVar != null) {
            qlVar.m5713a();
        }
        qw qwVar = this.f9088b;
        if (qwVar != null) {
            qwVar.m5742a();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f9088b.m5745b() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ql qlVar = this.f9087a;
        if (qlVar != null) {
            qlVar.m5716b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ql qlVar = this.f9087a;
        if (qlVar != null) {
            qlVar.m5714a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        qw qwVar = this.f9088b;
        if (qwVar != null) {
            qwVar.m5742a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        qw qwVar = this.f9088b;
        if (qwVar != null) {
            qwVar.m5742a();
        }
    }

    public void setImageResource(int i) {
        this.f9088b.m5743a(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        qw qwVar = this.f9088b;
        if (qwVar != null) {
            qwVar.m5742a();
        }
    }
}
