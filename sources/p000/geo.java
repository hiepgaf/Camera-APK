package p000;

import com.google.android.apps.camera.processing.ProcessingService;

/* compiled from: PG */
/* renamed from: geo */
public final class geo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ProcessingService f5113a;

    public geo(ProcessingService processingService) {
        this.f5113a = processingService;
    }

    public final void run() {
        while (true) {
            try {
                geu c = this.f5113a.f12281k.m2512c();
                if (c == null) {
                    synchronized (this.f5113a.f12273c) {
                        this.f5113a.f12274d = null;
                    }
                    synchronized (this.f5113a.f12276f) {
                        ProcessingService processingService = this.f5113a;
                        processingService.f12277g = false;
                        processingService.f12278h = false;
                        processingService.f12279i = true;
                    }
                    this.f5113a.stopSelf();
                    return;
                }
                synchronized (this.f5113a.f12273c) {
                    ProcessingService processingService2 = this.f5113a;
                    processingService2.f12274d = c;
                    if (processingService2.f12275e) {
                        processingService2.f12274d.suspend();
                    }
                }
                Object obj = this.f5113a;
                if (c == null) {
                    bli.m866b(ProcessingService.f12271a, "Reference to ProcessingTask is null");
                } else {
                    bli.m863a(ProcessingService.f12271a, "Resetting notification");
                    obj.f12272b.setContentText("…").setProgress(100, 0, false);
                    obj.m8406a();
                    get session = c.getSession();
                    if (session != null) {
                        session.mo1480a(obj);
                    }
                    System.gc();
                    String str = ProcessingService.f12271a;
                    String valueOf = String.valueOf(c);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                    stringBuilder.append("Processing start ");
                    stringBuilder.append(valueOf);
                    bli.m863a(str, stringBuilder.toString());
                    c.process(obj);
                    String str2 = ProcessingService.f12271a;
                    String valueOf2 = String.valueOf(c);
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 16);
                    stringBuilder2.append("Processing done ");
                    stringBuilder2.append(valueOf2);
                    bli.m863a(str2, stringBuilder2.toString());
                }
            } catch (Exception e) {
                this.f5113a.f12285o.execute(new gep(e));
                this.f5113a.stopSelf();
                return;
            } catch (Throwable th) {
                this.f5113a.stopSelf();
            }
        }
    }
}
