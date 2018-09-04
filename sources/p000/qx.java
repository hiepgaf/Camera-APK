package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: qx */
public class qx extends ImageView {
    /* renamed from: a */
    private final ql f9090a;
    /* renamed from: b */
    private final qw f9091b;

    public qx(Context context) {
        this(context, null);
    }

    public qx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public qx(Context context, AttributeSet attributeSet, int i) {
        super(vh.m6044a(context), attributeSet, i);
        this.f9090a = new ql(this);
        this.f9090a.m5715a(attributeSet, i);
        this.f9091b = new qw(this);
        this.f9091b.m5744a(attributeSet, i);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ql qlVar = this.f9090a;
        if (qlVar != null) {
            qlVar.m5713a();
        }
        qw qwVar = this.f9091b;
        if (qwVar != null) {
            qwVar.m5742a();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f9091b.m5745b() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ql qlVar = this.f9090a;
        if (qlVar != null) {
            qlVar.m5716b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ql qlVar = this.f9090a;
        if (qlVar != null) {
            qlVar.m5714a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        qw qwVar = this.f9091b;
        if (qwVar != null) {
            qwVar.m5742a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        qw qwVar = this.f9091b;
        if (qwVar != null) {
            qwVar.m5742a();
        }
    }

    public void setImageResource(int i) {
        qw qwVar = this.f9091b;
        if (qwVar != null) {
            qwVar.m5743a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        qw qwVar = this.f9091b;
        if (qwVar != null) {
            qwVar.m5742a();
        }
    }
}
