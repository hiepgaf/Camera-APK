package p000;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: bvb */
public final class bvb implements buy {
    /* renamed from: a */
    private static final String f11317a = bli.m862a("SpeTpIdQuery");
    /* renamed from: b */
    private final bvm f11318b;

    public bvb(bvm bvm) {
        this.f11318b = bvm;
    }

    /* renamed from: a */
    public final Cursor mo589a(Uri uri, String[] strArr) {
        Object obj;
        long a = blx.m7532a(uri);
        Cursor matrixCursor = new MatrixCursor(new String[]{"special_type_id"});
        kbg a2 = this.f11318b.mo590a(a);
        if (a2.mo2084b() && !((bve) a2.mo2081a()).equals(bve.NONE)) {
            matrixCursor.addRow(new Object[]{((bve) a2.mo2081a()).m1007d()});
        }
        String str = f11317a;
        String valueOf = String.valueOf(uri);
        if (a2.mo2084b()) {
            obj = (Serializable) a2.mo2081a();
        } else {
            obj = " not available";
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 20) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(" find special type: ");
        stringBuilder.append(valueOf2);
        bli.m863a(str, stringBuilder.toString());
        return matrixCursor;
    }
}
