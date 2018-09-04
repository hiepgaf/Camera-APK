package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: mx */
final class mx implements OnClickListener {
    /* renamed from: a */
    private final View f8856a;
    /* renamed from: b */
    private final String f8857b;
    /* renamed from: c */
    private Method f8858c;
    /* renamed from: d */
    private Context f8859d;

    public mx(View view, String str) {
        this.f8856a = view;
        this.f8857b = str;
    }

    public final void onClick(View view) {
        if (this.f8858c == null) {
            String stringBuilder;
            Context context = this.f8856a.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f8857b, new Class[]{View.class});
                        if (method != null) {
                            this.f8858c = method;
                            this.f8859d = context;
                        }
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f8856a.getId();
            if (id != -1) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(" with id '");
                stringBuilder2.append(this.f8856a.getContext().getResources().getResourceEntryName(id));
                stringBuilder2.append("'");
                stringBuilder = stringBuilder2.toString();
            } else {
                stringBuilder = "";
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Could not find method ");
            stringBuilder3.append(this.f8857b);
            stringBuilder3.append("(View) in a parent or ancestor Context for android:onClick ");
            stringBuilder3.append("attribute defined on view ");
            stringBuilder3.append(this.f8856a.getClass());
            stringBuilder3.append(stringBuilder);
            throw new IllegalStateException(stringBuilder3.toString());
        }
        try {
            this.f8858c.invoke(this.f8859d, new Object[]{view});
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (Throwable e22) {
            throw new IllegalStateException("Could not execute method for android:onClick", e22);
        }
    }
}
