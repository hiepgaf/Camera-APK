package com.google.android.apps.camera.processing;

import android.annotation.TargetApi;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import p000.bbv;
import p000.bli;
import p000.blr;
import p000.bls;
import p000.ccs;
import p000.geo;
import p000.geq;
import p000.ger;
import p000.ges;
import p000.geu;
import p000.gev;
import p000.gew;
import p000.gh;
import p000.gj;
import p000.go;
import p000.hec;
import p000.ijj;
import p000.ikd;
import p000.iqz;
import p000.ird;
import p000.ivx;

@TargetApi(16)
/* compiled from: PG */
public class ProcessingService extends Service implements gew {
    /* renamed from: a */
    public static final String f12271a = bli.m862a("ProcessingService");
    /* renamed from: b */
    public Builder f12272b;
    /* renamed from: c */
    public final Object f12273c = new Object();
    /* renamed from: d */
    public geu f12274d;
    /* renamed from: e */
    public volatile boolean f12275e = false;
    /* renamed from: f */
    public final Object f12276f = new Object();
    /* renamed from: g */
    public boolean f12277g;
    /* renamed from: h */
    public boolean f12278h;
    /* renamed from: i */
    public boolean f12279i;
    /* renamed from: j */
    public NotificationManager f12280j;
    /* renamed from: k */
    public gev f12281k;
    /* renamed from: l */
    public PowerManager f12282l;
    /* renamed from: m */
    public gh f12283m;
    /* renamed from: n */
    public ird f12284n;
    /* renamed from: o */
    public ikd f12285o;
    /* renamed from: p */
    public ivx f12286p;
    /* renamed from: q */
    public bls f12287q;
    /* renamed from: r */
    private final ges f12288r = new ges(this);
    /* renamed from: s */
    private WakeLock f12289s;
    /* renamed from: t */
    private Thread f12290t;
    /* renamed from: u */
    private bbv f12291u;
    /* renamed from: v */
    private boolean f12292v;

    /* renamed from: b */
    private final void m8405b() {
        if (!this.f12292v) {
            this.f12292v = true;
            ((ger) ((ccs) getApplication()).mo750a(ger.class)).mo3395a(this);
            if (this.f12286p.f7502c) {
                this.f12280j.deleteNotificationChannel("camera");
                for (NotificationChannel id : this.f12280j.getNotificationChannels()) {
                    if ("processing".equals(id.getId())) {
                        return;
                    }
                }
                NotificationChannel id2 = new NotificationChannel("processing", getText(R.string.processing_notification_channel), 2);
                id2.setShowBadge(false);
                this.f12280j.createNotificationChannel(id2);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Builder builder;
        bli.m869c(f12271a, "ProcessingService#onCreate");
        m8405b();
        super.onCreate();
        synchronized (this.f12276f) {
            this.f12277g = true;
            this.f12278h = false;
            this.f12279i = false;
        }
        this.f12284n.mo1903a("ProcessingService#onCreate");
        this.f12291u = new bbv("ProcServ", 1000);
        this.f12284n.mo1903a("WakeLock#new");
        this.f12289s = this.f12282l.newWakeLock(1, f12271a);
        this.f12289s.acquire();
        this.f12284n.mo1904b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.PAUSE");
        intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.RESUME");
        gh ghVar = this.f12283m;
        BroadcastReceiver broadcastReceiver = this.f12288r;
        synchronized (ghVar.f5187b) {
            gj gjVar = new gj(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) ghVar.f5187b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                ghVar.f5187b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(gjVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                arrayList = (ArrayList) ghVar.f5188c.get(action);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    ghVar.f5188c.put(action, arrayList);
                }
                arrayList.add(gjVar);
            }
        }
        if (this.f12286p.f7502c) {
            builder = new Builder(this, "processing");
        } else {
            builder = new Builder(this);
        }
        this.f12272b = builder.setSmallIcon(R.drawable.ic_notification).setColor(getResources().getColor(R.color.processing_notification)).setWhen(System.currentTimeMillis()).setOngoing(true).setContentTitle(getText(R.string.app_name));
        this.f12284n.mo1904b();
        if (this.f12287q.mo564b()) {
            stopSelf();
            throw new blr();
        }
    }

    public void onDestroy() {
        bli.m869c(f12271a, "ProcessingService#onDestroy");
        this.f12291u.close();
        if (this.f12289s.isHeld()) {
            this.f12289s.release();
        }
        gh ghVar = this.f12283m;
        BroadcastReceiver broadcastReceiver = this.f12288r;
        synchronized (ghVar.f5187b) {
            ArrayList arrayList = (ArrayList) ghVar.f5187b.remove(broadcastReceiver);
            if (arrayList == null) {
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    gj gjVar = (gj) arrayList.get(size);
                    gjVar.f5263c = true;
                    for (int i = 0; i < gjVar.f5261a.countActions(); i++) {
                        String action = gjVar.f5261a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) ghVar.f5188c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                gj gjVar2 = (gj) arrayList2.get(size2);
                                if (gjVar2.f5262b == broadcastReceiver) {
                                    gjVar2.f5263c = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                ghVar.f5188c.remove(action);
                            }
                        }
                    }
                }
            }
        }
        stopForeground(true);
        gev gev = this.f12281k;
        synchronized (gev.f5118b) {
            Object obj;
            gev.f5120d = go.aL;
            iqz iqz = gev.f5117a;
            String str = "Service destroyed, restarting? ";
            if (gev.f5121e) {
                obj = "Yes";
            } else {
                obj = "No";
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            iqz.mo518d(valueOf);
            if (gev.f5121e) {
                gev.f5121e = false;
                gev.m2509a();
            } else if (!gev.f5119c.isEmpty()) {
                throw new IllegalStateException("Service destroyed, not restarting but queue has items.");
            }
        }
    }

    /* renamed from: a */
    public final void mo775a(int i) {
        this.f12272b.setProgress(100, i, false);
        m8406a();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        bli.m869c(f12271a, "ProcessingService#onStartCommand");
        m8405b();
        startForeground(2, this.f12272b.build());
        if (this.f12290t == null) {
            this.f12290t = new ijj(9, new geo(this), "CameraProcessingThread");
            this.f12290t.start();
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo776a(hec hec) {
        this.f12272b.setContentText(hec.mo1726a(getResources()));
        m8406a();
    }

    /* renamed from: a */
    public final void m8406a() {
        synchronized (this.f12276f) {
            if (!this.f12277g || this.f12279i) {
                this.f12278h = true;
            } else {
                bli.m863a(f12271a, "Posting notification");
                this.f12280j.notify(2, this.f12272b.build());
                this.f12277g = false;
                this.f12278h = false;
                this.f12291u.execute(new geq(this));
            }
        }
    }
}
