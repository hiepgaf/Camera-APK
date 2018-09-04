package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bvx */
public final class bvx implements kwk {
    /* renamed from: a */
    public final SharedPreferences f11343a = PreferenceManager.getDefaultSharedPreferences(this.f11345c);
    /* renamed from: b */
    public PreferenceScreen f11344b;
    /* renamed from: c */
    private final Context f11345c;
    /* renamed from: d */
    private final bkw f11346d;
    /* renamed from: e */
    private final bsn f11347e;
    /* renamed from: f */
    private final Set f11348f;
    /* renamed from: g */
    private final Set f11349g;
    /* renamed from: h */
    private final Set f11350h;
    /* renamed from: i */
    private final Set f11351i;
    /* renamed from: j */
    private final Set f11352j;
    /* renamed from: k */
    private final Set f11353k;
    /* renamed from: l */
    private final Set f11354l;
    /* renamed from: m */
    private final hjf f11355m;
    /* renamed from: n */
    private final boolean f11356n;

    public bvx(Context context, bkw bkw, bsn bsn, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, bul bul, hjf hjf) {
        this.f11345c = context;
        this.f11346d = bkw;
        this.f11347e = bsn;
        this.f11348f = set;
        this.f11349g = set2;
        this.f11350h = set3;
        this.f11351i = set4;
        this.f11352j = set5;
        this.f11354l = set7;
        this.f11353k = set6;
        this.f11356n = bul.m995a();
        this.f11355m = hjf;
    }

    /* renamed from: a */
    private final Preference m7807a(bsa bsa) {
        return m7811a(bsa.f1504b, this.f11347e.m953a((bry) bsa), false);
    }

    /* renamed from: a */
    private final Preference m7808a(bsb bsb) {
        return m7811a(bsb.f1504b, this.f11347e.m953a((bry) bsb), true);
    }

    /* renamed from: a */
    private final Preference m7809a(bsc bsc) {
        return m7811a(bsc.f1504b, this.f11347e.m953a((bry) bsc), false);
    }

    /* renamed from: a */
    private final Preference m7810a(bsk bsk) {
        return m7811a(bsk.f1504b, this.f11347e.m953a((bry) bsk), false);
    }

    /* renamed from: a */
    private final Preference m7811a(String str, boolean z, boolean z2) {
        Preference bmg = new bmg(this.f11345c, str);
        if (z) {
            bmg.setSummary("Property cannot be changed, already set via setprop!");
            if (z2) {
                bmg.setEnabled(false);
                bmg.f1312a = true;
            } else {
                bmg.setEnabled(false);
            }
        } else if (z2) {
            bmg.setChecked(true);
        }
        this.f11344b.addPreference(bmg);
        return bmg;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final void m7813a(PreferenceScreen preferenceScreen) {
        boolean z;
        this.f11344b = preferenceScreen;
        Preference preference = new Preference(this.f11345c);
        preference.setTitle("Reset to default values");
        preference.setOnPreferenceClickListener(new bmd(this));
        this.f11344b.addPreference(preference);
        m7807a(bmb.f1280c);
        m7807a(bmb.f1281d).setDependency(bmb.f1280c.f1504b);
        Preference editTextPreference = new EditTextPreference(this.f11344b.getContext());
        String str = "camera.onscreen_logcat_filter";
        editTextPreference.setTitle(str);
        this.f11344b.addPreference(editTextPreference);
        CharSequence charSequence = "Gca";
        if (this.f11343a.contains(str)) {
            charSequence = this.f11343a.getString(str, charSequence);
        }
        editTextPreference.setText(charSequence);
        editTextPreference.setSummary(charSequence);
        editTextPreference.setOnPreferenceChangeListener(new bme(this, str));
        editTextPreference.setDependency(bmb.f1281d.f1504b);
        m7807a(bmb.f1282e);
        String str2 = bmb.f1274C.f1504b;
        if (this.f11347e.m953a(bmb.f1274C)) {
            z = true;
        } else if (this.f11356n) {
            z = false;
        } else {
            z = true;
        }
        m7811a(str2, z, this.f11356n);
        m7808a(bmb.f1275D);
        m7807a(bmb.f1283f);
        m7807a(bmb.f1285h);
        m7807a(bmb.f1286i);
        m7810a(bin.f1189a);
        m7807a(bin.f1190b);
        m7807a(bmb.f1276E);
        m7807a(bmb.f1292o);
        m7807a(bmb.f1293p);
        m7807a(bmb.f1294q);
        m7807a(bmb.f1295r);
        m7807a(bmb.f1296s);
        m7808a(bmb.f1297t);
        m7808a(bmb.f1298u);
        m7810a(bmb.f1299v);
        m7807a(bmb.f1300w);
        m7807a(bmb.f1303z);
        m7808a(bmb.f1301x);
        m7807a(bmb.f1302y);
        z = this.f11346d.m853e();
        str2 = "camera:gcam_enabled";
        Preference bmg = new bmg(this.f11345c, str2);
        this.f11344b.addPreference(bmg);
        if (!this.f11343a.contains(str2)) {
            bmg.setChecked(z);
        }
        m7808a(bmb.f1291n);
        m7808a(bmb.f1272A);
        m7808a(bmb.f1273B);
        m7809a(hju.f6280a);
        if (this.f11355m.m3195c() || this.f11355m.m3196d()) {
            m7808a(bmb.f1289l);
            m7808a(bmb.f1290m).setDependency(bmb.f1289l.f1504b);
            m7807a(bmb.f1287j);
            m7810a(bmb.f1288k);
            m7808a(bmb.f1278G);
        }
        if (this.f11355m.m3196d()) {
            m7808a(bmb.f1279H);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f11348f);
        arrayList.addAll(this.f11349g);
        arrayList.addAll(this.f11350h);
        arrayList.addAll(this.f11351i);
        arrayList.addAll(this.f11352j);
        arrayList.addAll(this.f11353k);
        arrayList.addAll(this.f11354l);
        Collections.sort(arrayList, new bmf());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            brx brx = (brx) arrayList.get(i);
            if (brx instanceof bsa) {
                m7807a((bsa) brx);
                i = i2;
            } else if (brx instanceof bsb) {
                m7808a((bsb) brx);
                i = i2;
            } else if (brx instanceof bsj) {
                bry bry = (bsj) brx;
                m7811a(bry.f1504b, this.f11347e.m953a(bry), false);
                i = i2;
            } else if (brx instanceof bsk) {
                m7810a((bsk) brx);
                i = i2;
            } else if (brx instanceof bsc) {
                m7809a((bsc) brx);
                i = i2;
            } else if (brx instanceof bsq) {
                bsq bsq = (bsq) brx;
                m7811a(bsq.f1504b, this.f11347e.m953a((bry) bsq), this.f11347e.m954a(bsq));
                i = i2;
            } else {
                String valueOf = String.valueOf(brx);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
                stringBuilder.append("Unknown flag type: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }
}
