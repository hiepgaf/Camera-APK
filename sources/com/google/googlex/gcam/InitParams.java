package com.google.googlex.gcam;

/* compiled from: PG */
public class InitParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public InitParams() {
        this(GcamModuleJNI.new_InitParams(), true);
    }

    protected InitParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.InitParams_Check(this.swigCPtr, this);
    }

    public void Clear() {
        GcamModuleJNI.InitParams_Clear(this.swigCPtr, this);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.InitParams_DeserializeFromString__SWIG_0(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean DeserializeFromString(String str) {
        return GcamModuleJNI.InitParams_DeserializeFromString__SWIG_1(this.swigCPtr, this, str);
    }

    public boolean Equals(InitParams initParams) {
        return GcamModuleJNI.InitParams_Equals(this.swigCPtr, this, getCPtr(initParams), initParams);
    }

    public void Print(int i) {
        GcamModuleJNI.InitParams_Print(this.swigCPtr, this, i);
    }

    public void SerializeToString(SWIGTYPE_p_std__string sWIGTYPE_p_std__string) {
        GcamModuleJNI.InitParams_SerializeToString(this.swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string));
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InitParams(j);
            }
            this.swigCPtr = 0;
        }
    }

    protected void finalize() {
        delete();
    }

    public boolean getAllow_unknown_devices() {
        return GcamModuleJNI.InitParams_allow_unknown_devices_get(this.swigCPtr, this);
    }

    public BackgroundAeResultsCallback getBackground_ae_results_callback() {
        long InitParams_background_ae_results_callback_get = GcamModuleJNI.InitParams_background_ae_results_callback_get(this.swigCPtr, this);
        return InitParams_background_ae_results_callback_get != 0 ? new BackgroundAeResultsCallback(InitParams_background_ae_results_callback_get, false) : null;
    }

    protected static long getCPtr(InitParams initParams) {
        return initParams != null ? initParams.swigCPtr : 0;
    }

    public ThreadPriority getCapture_priority() {
        long InitParams_capture_priority_get = GcamModuleJNI.InitParams_capture_priority_get(this.swigCPtr, this);
        return InitParams_capture_priority_get != 0 ? new ThreadPriority(InitParams_capture_priority_get, false) : null;
    }

    public FileSaver getCustom_file_saver() {
        long InitParams_custom_file_saver_get = GcamModuleJNI.InitParams_custom_file_saver_get(this.swigCPtr, this);
        return InitParams_custom_file_saver_get != 0 ? new FileSaver(InitParams_custom_file_saver_get, false) : null;
    }

    public SWIGTYPE_p_f_p_void__void getCustom_free() {
        long InitParams_custom_free_get = GcamModuleJNI.InitParams_custom_free_get(this.swigCPtr, this);
        return InitParams_custom_free_get != 0 ? new SWIGTYPE_p_f_p_void__void(InitParams_custom_free_get, false) : null;
    }

    public SWIGTYPE_p_f_unsigned_long__p_void getCustom_malloc() {
        long InitParams_custom_malloc_get = GcamModuleJNI.InitParams_custom_malloc_get(this.swigCPtr, this);
        return InitParams_custom_malloc_get != 0 ? new SWIGTYPE_p_f_unsigned_long__p_void(InitParams_custom_malloc_get, false) : null;
    }

    public boolean getDisable_smart_metering() {
        return GcamModuleJNI.InitParams_disable_smart_metering_get(this.swigCPtr, this);
    }

    public int getExecute_finish_on() {
        return GcamModuleJNI.InitParams_execute_finish_on_get(this.swigCPtr, this);
    }

    public ThreadPriority getFinish_priority() {
        long InitParams_finish_priority_get = GcamModuleJNI.InitParams_finish_priority_get(this.swigCPtr, this);
        return InitParams_finish_priority_get != 0 ? new ThreadPriority(InitParams_finish_priority_get, false) : null;
    }

    public SimpleCallback getFinish_queue_empty_callback() {
        long InitParams_finish_queue_empty_callback_get = GcamModuleJNI.InitParams_finish_queue_empty_callback_get(this.swigCPtr, this);
        return InitParams_finish_queue_empty_callback_get != 0 ? new SimpleCallback(InitParams_finish_queue_empty_callback_get, false) : null;
    }

    public ImageReleaseCallback getImage_release_callback() {
        long InitParams_image_release_callback_get = GcamModuleJNI.InitParams_image_release_callback_get(this.swigCPtr, this);
        return InitParams_image_release_callback_get != 0 ? new ImageReleaseCallback(InitParams_image_release_callback_get, false) : null;
    }

    public int getMax_full_metering_sweep_frames() {
        return GcamModuleJNI.InitParams_max_full_metering_sweep_frames_get(this.swigCPtr, this);
    }

    public int getMax_payload_frames() {
        return GcamModuleJNI.InitParams_max_payload_frames_get(this.swigCPtr, this);
    }

    public int getMax_zsl_frames() {
        return GcamModuleJNI.InitParams_max_zsl_frames_get(this.swigCPtr, this);
    }

    public MemoryStateCallback getMemory_callback() {
        long InitParams_memory_callback_get = GcamModuleJNI.InitParams_memory_callback_get(this.swigCPtr, this);
        return InitParams_memory_callback_get != 0 ? new MemoryStateCallback(InitParams_memory_callback_get, false) : null;
    }

    public ThreadPriority getMerge_priority() {
        long InitParams_merge_priority_get = GcamModuleJNI.InitParams_merge_priority_get(this.swigCPtr, this);
        return InitParams_merge_priority_get != 0 ? new ThreadPriority(InitParams_merge_priority_get, false) : null;
    }

    public SimpleCallback getMerge_queue_empty_callback() {
        long InitParams_merge_queue_empty_callback_get = GcamModuleJNI.InitParams_merge_queue_empty_callback_get(this.swigCPtr, this);
        return InitParams_merge_queue_empty_callback_get != 0 ? new SimpleCallback(InitParams_merge_queue_empty_callback_get, false) : null;
    }

    public int getMin_full_metering_sweep_frames() {
        return GcamModuleJNI.InitParams_min_full_metering_sweep_frames_get(this.swigCPtr, this);
    }

    public int getMin_payload_frames() {
        return GcamModuleJNI.InitParams_min_payload_frames_get(this.swigCPtr, this);
    }

    public boolean getSimultaneous_merge_and_finish() {
        return GcamModuleJNI.InitParams_simultaneous_merge_and_finish_get(this.swigCPtr, this);
    }

    public int getThread_count() {
        return GcamModuleJNI.InitParams_thread_count_get(this.swigCPtr, this);
    }

    public boolean getTuning_locked() {
        return GcamModuleJNI.InitParams_tuning_locked_get(this.swigCPtr, this);
    }

    public boolean getVerbose() {
        return GcamModuleJNI.InitParams_verbose_get(this.swigCPtr, this);
    }

    public void setAllow_unknown_devices(boolean z) {
        GcamModuleJNI.InitParams_allow_unknown_devices_set(this.swigCPtr, this, z);
    }

    public void setBackground_ae_results_callback(BackgroundAeResultsCallback backgroundAeResultsCallback) {
        GcamModuleJNI.InitParams_background_ae_results_callback_set(this.swigCPtr, this, BackgroundAeResultsCallback.getCPtr(backgroundAeResultsCallback), backgroundAeResultsCallback);
    }

    public void setCapture_priority(ThreadPriority threadPriority) {
        GcamModuleJNI.InitParams_capture_priority_set(this.swigCPtr, this, ThreadPriority.getCPtr(threadPriority), threadPriority);
    }

    public void setCustom_file_saver(FileSaver fileSaver) {
        GcamModuleJNI.InitParams_custom_file_saver_set(this.swigCPtr, this, FileSaver.getCPtr(fileSaver), fileSaver);
    }

    public void setCustom_free(SWIGTYPE_p_f_p_void__void sWIGTYPE_p_f_p_void__void) {
        GcamModuleJNI.InitParams_custom_free_set(this.swigCPtr, this, SWIGTYPE_p_f_p_void__void.getCPtr(sWIGTYPE_p_f_p_void__void));
    }

    public void setCustom_malloc(SWIGTYPE_p_f_unsigned_long__p_void sWIGTYPE_p_f_unsigned_long__p_void) {
        GcamModuleJNI.InitParams_custom_malloc_set(this.swigCPtr, this, SWIGTYPE_p_f_unsigned_long__p_void.getCPtr(sWIGTYPE_p_f_unsigned_long__p_void));
    }

    public void setDisable_smart_metering(boolean z) {
        GcamModuleJNI.InitParams_disable_smart_metering_set(this.swigCPtr, this, z);
    }

    public void setExecute_finish_on(int i) {
        GcamModuleJNI.InitParams_execute_finish_on_set(this.swigCPtr, this, i);
    }

    public void setFinish_priority(ThreadPriority threadPriority) {
        GcamModuleJNI.InitParams_finish_priority_set(this.swigCPtr, this, ThreadPriority.getCPtr(threadPriority), threadPriority);
    }

    public void setFinish_queue_empty_callback(SimpleCallback simpleCallback) {
        GcamModuleJNI.InitParams_finish_queue_empty_callback_set(this.swigCPtr, this, SimpleCallback.getCPtr(simpleCallback), simpleCallback);
    }

    public void setImage_release_callback(ImageReleaseCallback imageReleaseCallback) {
        GcamModuleJNI.InitParams_image_release_callback_set(this.swigCPtr, this, ImageReleaseCallback.getCPtr(imageReleaseCallback), imageReleaseCallback);
    }

    public void setMax_full_metering_sweep_frames(int i) {
        GcamModuleJNI.InitParams_max_full_metering_sweep_frames_set(this.swigCPtr, this, i);
    }

    public void setMax_payload_frames(int i) {
        GcamModuleJNI.InitParams_max_payload_frames_set(this.swigCPtr, this, i);
    }

    public void setMax_zsl_frames(int i) {
        GcamModuleJNI.InitParams_max_zsl_frames_set(this.swigCPtr, this, i);
    }

    public void setMemory_callback(MemoryStateCallback memoryStateCallback) {
        GcamModuleJNI.InitParams_memory_callback_set(this.swigCPtr, this, MemoryStateCallback.getCPtr(memoryStateCallback), memoryStateCallback);
    }

    public void setMerge_priority(ThreadPriority threadPriority) {
        GcamModuleJNI.InitParams_merge_priority_set(this.swigCPtr, this, ThreadPriority.getCPtr(threadPriority), threadPriority);
    }

    public void setMerge_queue_empty_callback(SimpleCallback simpleCallback) {
        GcamModuleJNI.InitParams_merge_queue_empty_callback_set(this.swigCPtr, this, SimpleCallback.getCPtr(simpleCallback), simpleCallback);
    }

    public void setMin_full_metering_sweep_frames(int i) {
        GcamModuleJNI.InitParams_min_full_metering_sweep_frames_set(this.swigCPtr, this, i);
    }

    public void setMin_payload_frames(int i) {
        GcamModuleJNI.InitParams_min_payload_frames_set(this.swigCPtr, this, i);
    }

    public void setSimultaneous_merge_and_finish(boolean z) {
        GcamModuleJNI.InitParams_simultaneous_merge_and_finish_set(this.swigCPtr, this, z);
    }

    public void setThread_count(int i) {
        GcamModuleJNI.InitParams_thread_count_set(this.swigCPtr, this, i);
    }

    public void setTuning_locked(boolean z) {
        GcamModuleJNI.InitParams_tuning_locked_set(this.swigCPtr, this, z);
    }

    public void setVerbose(boolean z) {
        GcamModuleJNI.InitParams_verbose_set(this.swigCPtr, this, z);
    }
}
