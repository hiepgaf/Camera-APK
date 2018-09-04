package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: afk */
public final class afk {
    /* renamed from: a */
    public final aoo f405a;
    /* renamed from: b */
    private final Class f406b;
    /* renamed from: c */
    private final List f407c;
    /* renamed from: d */
    private final iw f408d;
    /* renamed from: e */
    private final String f409e;

    public afk(Class cls, Class cls2, Class cls3, List list, aoo aoo, iw iwVar) {
        this.f406b = cls;
        this.f407c = list;
        this.f405a = aoo;
        this.f408d = iwVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 23) + String.valueOf(simpleName2).length()) + String.valueOf(simpleName3).length());
        stringBuilder.append("Failed DecodePath{");
        stringBuilder.append(simpleName);
        stringBuilder.append("->");
        stringBuilder.append(simpleName2);
        stringBuilder.append("->");
        stringBuilder.append(simpleName3);
        stringBuilder.append("}");
        this.f409e = stringBuilder.toString();
    }

    /* renamed from: a */
    final agn m221a(ady ady, int i, int i2, adp adp) {
        List list = (List) aqe.m585a((List) this.f408d.mo341a(), "Argument must not be null");
        try {
            agn a = m220a(ady, i, i2, adp, list);
            return a;
        } finally {
            this.f408d.mo342a(list);
        }
    }

    /* renamed from: a */
    private final agn m220a(ady ady, int i, int i2, adp adp, List list) {
        agn a;
        Throwable e;
        String valueOf;
        StringBuilder stringBuilder;
        int size = this.f407c.size();
        agn agn = null;
        int i3 = 0;
        while (i3 < size) {
            adq adq = (adq) this.f407c.get(i3);
            try {
                if (adq.mo102a(ady.mo32b(), adp)) {
                    a = adq.mo101a(ady.mo32b(), i, i2, adp);
                } else {
                    a = agn;
                }
            } catch (IOException e2) {
                e = e2;
                if (Log.isLoggable("DecodePath", 2)) {
                    valueOf = String.valueOf(adq);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    stringBuilder.append("Failed to decode data for ");
                    stringBuilder.append(valueOf);
                    Log.v("DecodePath", stringBuilder.toString(), e);
                }
                list.add(e);
                a = agn;
                if (a != null) {
                    i3++;
                    agn = a;
                } else if (a != null) {
                    return a;
                } else {
                    throw new agg(this.f409e, new ArrayList(list));
                }
            } catch (RuntimeException e3) {
                e = e3;
                if (Log.isLoggable("DecodePath", 2)) {
                    valueOf = String.valueOf(adq);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    stringBuilder.append("Failed to decode data for ");
                    stringBuilder.append(valueOf);
                    Log.v("DecodePath", stringBuilder.toString(), e);
                }
                list.add(e);
                a = agn;
                if (a != null) {
                    i3++;
                    agn = a;
                } else if (a != null) {
                    return a;
                } else {
                    throw new agg(this.f409e, new ArrayList(list));
                }
            } catch (OutOfMemoryError e4) {
                e = e4;
                if (Log.isLoggable("DecodePath", 2)) {
                    valueOf = String.valueOf(adq);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    stringBuilder.append("Failed to decode data for ");
                    stringBuilder.append(valueOf);
                    Log.v("DecodePath", stringBuilder.toString(), e);
                }
                list.add(e);
                a = agn;
                if (a != null) {
                    i3++;
                    agn = a;
                } else if (a != null) {
                    return a;
                } else {
                    throw new agg(this.f409e, new ArrayList(list));
                }
            }
            if (a != null) {
                break;
            }
            i3++;
            agn = a;
        }
        a = agn;
        if (a != null) {
            return a;
        }
        throw new agg(this.f409e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f406b);
        String valueOf2 = String.valueOf(this.f407c);
        String valueOf3 = String.valueOf(this.f405a);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 47) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("DecodePath{ dataClass=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", decoders=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", transcoder=");
        stringBuilder.append(valueOf3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
