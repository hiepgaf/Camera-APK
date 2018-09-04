package p000;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: glt */
public final class glt implements glm {
    /* renamed from: a */
    private final Object f17033a = new Object();
    /* renamed from: b */
    private final LinkedList f17034b = new LinkedList();

    glt() {
    }

    /* renamed from: a */
    public final void m11177a(glm glm) {
        synchronized (this.f17033a) {
            this.f17034b.add(glm);
        }
    }

    public final void onCaptureCanceled(int i, int i2) {
        synchronized (this.f17033a) {
            Iterator it = this.f17034b.iterator();
            while (it.hasNext()) {
                ((glm) it.next()).onCaptureCanceled(i, i2);
            }
        }
    }

    public final void onCaptureDeleted() {
        synchronized (this.f17033a) {
            Iterator it = this.f17034b.iterator();
            while (it.hasNext()) {
                ((glm) it.next()).onCaptureDeleted();
            }
        }
    }

    public final void onCaptureFailed(int i, int i2) {
        synchronized (this.f17033a) {
            Iterator it = this.f17034b.iterator();
            while (it.hasNext()) {
                ((glm) it.next()).onCaptureFailed(i, i2);
            }
        }
    }

    public final void onCaptureFinalized() {
        synchronized (this.f17033a) {
            Iterator it = this.f17034b.iterator();
            while (it.hasNext()) {
                ((glm) it.next()).onCaptureFinalized();
            }
        }
    }

    public final void onCapturePersisted(int i, int i2) {
        synchronized (this.f17033a) {
            Iterator it = this.f17034b.iterator();
            while (it.hasNext()) {
                ((glm) it.next()).onCapturePersisted(i, i2);
            }
        }
    }

    public final void onCaptureStartCommitted(int i, int i2) {
        synchronized (this.f17033a) {
            Iterator it = this.f17034b.iterator();
            while (it.hasNext()) {
                ((glm) it.next()).onCaptureStartCommitted(i, i2);
            }
        }
    }

    public final void onCaptureStarted(glw glw) {
        synchronized (this.f17033a) {
            Iterator it = this.f17034b.iterator();
            while (it.hasNext()) {
                ((glm) it.next()).onCaptureStarted(glw);
            }
        }
    }

    public final void onMediumThumb() {
        synchronized (this.f17033a) {
            Iterator it = this.f17034b.iterator();
            while (it.hasNext()) {
                ((glm) it.next()).onMediumThumb();
            }
        }
    }

    public final void onTinyThumb() {
        synchronized (this.f17033a) {
            Iterator it = this.f17034b.iterator();
            while (it.hasNext()) {
                ((glm) it.next()).onTinyThumb();
            }
        }
    }
}
