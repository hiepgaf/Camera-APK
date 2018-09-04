package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: aeg */
public final class aeg implements adw {
    /* renamed from: a */
    private static final aeh f9641a = new aeh();
    /* renamed from: b */
    private final ajl f9642b;
    /* renamed from: c */
    private final int f9643c;
    /* renamed from: d */
    private HttpURLConnection f9644d;
    /* renamed from: e */
    private InputStream f9645e;
    /* renamed from: f */
    private volatile boolean f9646f;

    public aeg(ajl ajl, int i) {
        this(ajl, i, f9641a);
    }

    private aeg(ajl ajl, int i, aeh aeh) {
        this.f9642b = ajl;
        this.f9643c = i;
    }

    /* renamed from: b */
    public final void mo25b() {
        this.f9646f = true;
    }

    /* renamed from: c */
    public final void mo26c() {
        InputStream inputStream = this.f9645e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9644d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f9644d = null;
    }

    /* renamed from: a */
    public final Class mo33a() {
        return InputStream.class;
    }

    /* renamed from: d */
    public final adf mo27d() {
        return adf.REMOTE;
    }

    /* renamed from: a */
    public final void mo24a(acg acg, adx adx) {
        long a = arm.m630a();
        double a2;
        StringBuilder stringBuilder;
        try {
            ajl ajl = this.f9642b;
            if (ajl.f9836f == null) {
                if (TextUtils.isEmpty(ajl.f9835e)) {
                    String str = ajl.f9834d;
                    if (TextUtils.isEmpty(str)) {
                        str = ((URL) aqe.m585a(ajl.f9833c, "Argument must not be null")).toString();
                    }
                    ajl.f9835e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                }
                ajl.f9836f = new URL(ajl.f9835e);
            }
            adx.mo37a(m6319a(ajl.f9836f, this.f9642b.f9832b.mo98a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                a2 = arm.m629a(a);
                stringBuilder = new StringBuilder(59);
                stringBuilder.append("Finished http url fetcher fetch in ");
                stringBuilder.append(a2);
                Log.v("HttpUrlFetcher", stringBuilder.toString());
            }
        } catch (Exception e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            adx.mo36a(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                a2 = arm.m629a(a);
                stringBuilder = new StringBuilder(59);
                stringBuilder.append("Finished http url fetcher fetch in ");
                stringBuilder.append(a2);
                Log.v("HttpUrlFetcher", stringBuilder.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                double a3 = arm.m629a(a);
                StringBuilder stringBuilder2 = new StringBuilder(59);
                stringBuilder2.append("Finished http url fetcher fetch in ");
                stringBuilder2.append(a3);
                Log.v("HttpUrlFetcher", stringBuilder2.toString());
            }
        }
    }

    /* renamed from: a */
    private final InputStream m6319a(URL url, Map map) {
        URL url2 = null;
        int i = 0;
        URL url3 = url;
        while (i < 5) {
            if (url2 != null) {
                try {
                    if (url3.toURI().equals(url2.toURI())) {
                        throw new adj("In re-direct loop");
                    }
                } catch (URISyntaxException e) {
                }
            }
            this.f9644d = (HttpURLConnection) url3.openConnection();
            for (Entry entry : map.entrySet()) {
                this.f9644d.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f9644d.setConnectTimeout(this.f9643c);
            this.f9644d.setReadTimeout(this.f9643c);
            this.f9644d.setUseCaches(false);
            this.f9644d.setDoInput(true);
            this.f9644d.setInstanceFollowRedirects(false);
            this.f9644d.connect();
            this.f9645e = this.f9644d.getInputStream();
            if (this.f9646f) {
                return null;
            }
            int responseCode = this.f9644d.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                HttpURLConnection httpURLConnection = this.f9644d;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f9645e = new ark(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        String valueOf = String.valueOf(httpURLConnection.getContentEncoding());
                        String str = "Got non empty content encoding: ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str);
                        } else {
                            valueOf = str.concat(valueOf);
                        }
                        Log.d("HttpUrlFetcher", valueOf);
                    }
                    this.f9645e = httpURLConnection.getInputStream();
                }
                return this.f9645e;
            } else if (i2 == 3) {
                Object headerField = this.f9644d.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new adj("Received empty or null redirect url");
                }
                url = new URL(url3, headerField);
                mo26c();
                i++;
                url2 = url3;
                url3 = url;
            } else if (responseCode == -1) {
                throw new adj(responseCode);
            } else {
                throw new adj(this.f9644d.getResponseMessage(), '\u0000');
            }
        }
        throw new adj("Too many (> 5) redirects!");
    }
}
