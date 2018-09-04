package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: hte */
public final class hte {
    /* renamed from: a */
    private static final Lock f6636a = new ReentrantLock();
    /* renamed from: b */
    private static hte f6637b;
    /* renamed from: c */
    private final Lock f6638c = new ReentrantLock();
    /* renamed from: d */
    private final SharedPreferences f6639d;

    private hte(Context context) {
        this.f6639d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static hte m3369a(Context context) {
        htl.m3431b((Object) context);
        f6636a.lock();
        try {
            if (f6637b == null) {
                f6637b = new hte(context.getApplicationContext());
            }
            hte hte = f6637b;
            return hte;
        } finally {
            f6636a.unlock();
        }
    }

    /* renamed from: a */
    private static String m3370a(String str, String str2) {
        String valueOf = String.valueOf(":");
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + String.valueOf(valueOf).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(valueOf);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final GoogleSignInAccount m3371a(String str) {
        GoogleSignInAccount googleSignInAccount = null;
        if (!TextUtils.isEmpty(str)) {
            String c = m3373c(hte.m3370a("googleSignInAccount", str));
            if (c != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.m15088a(c);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInAccount;
    }

    /* renamed from: b */
    public final GoogleSignInOptions m3372b(String str) {
        GoogleSignInOptions googleSignInOptions = null;
        if (!TextUtils.isEmpty(str)) {
            String c = m3373c(hte.m3370a("googleSignInOptions", str));
            if (c != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.m15090a(c);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInOptions;
    }

    /* renamed from: c */
    public final String m3373c(String str) {
        this.f6638c.lock();
        try {
            String string = this.f6639d.getString(str, null);
            return string;
        } finally {
            this.f6638c.unlock();
        }
    }
}
