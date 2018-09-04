package com.google.googlex.gcam;

/* compiled from: PG */
public class RawSharpenParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    /* compiled from: PG */
    public class Point {
        public boolean swigCMemOwn;
        public long swigCPtr;

        public Point() {
            this(GcamModuleJNI.new_RawSharpenParams_Point(), true);
        }

        protected Point(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    GcamModuleJNI.delete_RawSharpenParams_Point(j);
                }
                this.swigCPtr = 0;
            }
        }

        protected void finalize() {
            delete();
        }

        protected static long getCPtr(Point point) {
            return point != null ? point.swigCPtr : 0;
        }

        public float getX() {
            return GcamModuleJNI.RawSharpenParams_Point_x_get(this.swigCPtr, this);
        }

        public float getY() {
            return GcamModuleJNI.RawSharpenParams_Point_y_get(this.swigCPtr, this);
        }

        public void setX(float f) {
            GcamModuleJNI.RawSharpenParams_Point_x_set(this.swigCPtr, this, f);
        }

        public void setY(float f) {
            GcamModuleJNI.RawSharpenParams_Point_y_set(this.swigCPtr, this, f);
        }
    }

    public RawSharpenParams() {
        this(GcamModuleJNI.new_RawSharpenParams(), true);
    }

    protected RawSharpenParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawSharpenParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    protected static long getCPtr(RawSharpenParams rawSharpenParams) {
        return rawSharpenParams != null ? rawSharpenParams.swigCPtr : 0;
    }

    public SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t getCurves() {
        long RawSharpenParams_curves_get = GcamModuleJNI.RawSharpenParams_curves_get(this.swigCPtr, this);
        return RawSharpenParams_curves_get != 0 ? new SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t(RawSharpenParams_curves_get, false) : null;
    }

    public void setCurves(SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t sWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t) {
        GcamModuleJNI.RawSharpenParams_curves_set(this.swigCPtr, this, SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t.getCPtr(sWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t));
    }
}
