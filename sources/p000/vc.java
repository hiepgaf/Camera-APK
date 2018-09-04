package p000;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: vc */
public final class vc {
    /* renamed from: a */
    public Method f9403a;
    /* renamed from: b */
    private Method f9404b;
    /* renamed from: c */
    private Method f9405c;

    public vc() {
        try {
            this.f9404b = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f9404b.setAccessible(true);
        } catch (NoSuchMethodException e) {
        }
        try {
            this.f9405c = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f9405c.setAccessible(true);
        } catch (NoSuchMethodException e2) {
        }
        try {
            this.f9403a = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
            this.f9403a.setAccessible(true);
        } catch (NoSuchMethodException e3) {
        }
    }
}
