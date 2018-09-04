package com.google.android.vision.face;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.app.DownloadManager.Request;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.provider.Settings.Secure;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import com.google.android.vision.face.Detector.Settings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
public final class ModelManager {
    public static final boolean DEBUG = false;
    public static final String MODELS_VERSION_STRING = "v2";
    public static final int MSG_CHECK_PROGRESS = 0;
    public static final int MSG_INSTALLATION_FAILURE = 2;
    public static final int MSG_INSTALLATION_SUCCESS = 1;
    public static final int PROGRESS_UPDATE_FREQUENCY_MS = 500;
    public static final int STATUS_CANNOT_ACCESS_STORAGE = 4;
    public static final int STATUS_COULD_NOT_CREATE_MODELS_DIRECTORY = 6;
    public static final int STATUS_DOWNLOAD_FAILURE = 1;
    public static final int STATUS_INSTALLATION_FAILURE = 2;
    public static final int STATUS_METERED_NETWORK = 3;
    public static final int STATUS_READ_ONLY_STORAGE = 5;
    public static final int STATUS_UNKNOWN_ERROR = 0;
    public static final String TAG = "ModelManager";
    public ModelManagerCallbacks mCallbacks;
    public Context mContext;
    public String mDataDirectoryName;
    public String mDataSubdirectoryName;
    public boolean mDownloadComplete = false;
    public BroadcastReceiver mDownloadCompleteReceiver;
    public long mDownloadId;
    public DownloadManager mDownloadManager;
    public Handler mHandler = new Handler(new ModelManagerHandlerCallback());
    public String mRemoteModelsDirectoryName;

    /* compiled from: PG */
    interface ModelManagerCallbacks {
        void onModelDownloadProgressUpdate(int i);

        void onModelInstallationFailure(int i);

        void onModelInstallationSuccess();
    }

    /* compiled from: PG */
    class ModelManagerHandlerCallback implements Callback {
        private ModelManagerHandlerCallback() {
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ModelManager.this.handleCheckProgress();
                    return true;
                case 1:
                    ModelManager.this.handleInstallationSuccess();
                    return true;
                case 2:
                    ModelManager.this.handleInstallationFailure(message.arg1);
                    return true;
                default:
                    Log.e(ModelManager.TAG, "Unhandled message");
                    return false;
            }
        }
    }

    static {
        try {
            System.loadLibrary(Detector.JNI_LIBRARY_NAME);
        } catch (UnsatisfiedLinkError e) {
            Log.e(TAG, "Could not load library: vision_face_jni");
        }
    }

    private static native boolean areApkModelsInstalledJni(Settings settings, AssetManager assetManager);

    private static native String[] getModelNamesJni();

    ModelManager(Context context) {
        this.mContext = context;
        ContentResolver contentResolver = this.mContext.getContentResolver();
        this.mDataSubdirectoryName = getDataSubdirectoryName(contentResolver);
        this.mRemoteModelsDirectoryName = getRemoteModelsDirectoryName(contentResolver);
        this.mDataDirectoryName = getDataDirectoryName(context);
    }

    public static boolean areApkModelsInstalled(Context context, Settings settings) {
        return areApkModelsInstalledJni(settings, context.getAssets());
    }

    final boolean areModelsInstalled() {
        String[] modelNamesJni = getModelNamesJni();
        for (String str : modelNamesJni) {
            String str2 = this.mDataDirectoryName;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length());
            stringBuilder.append(str2);
            stringBuilder.append("/");
            stringBuilder.append(str);
            if (!new File(stringBuilder.toString()).exists()) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(21)
    final void downloadAndInstallModels(ModelManagerCallbacks modelManagerCallbacks) {
        this.mCallbacks = modelManagerCallbacks;
        if (isConnectionMetered()) {
            Log.e(TAG, "Cannot download models over a metered network");
            this.mCallbacks.onModelInstallationFailure(3);
            return;
        }
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted_ro".equals(externalStorageState)) {
            Log.e(TAG, "Storage is read-only");
            this.mCallbacks.onModelInstallationFailure(5);
        } else if ("mounted".equals(externalStorageState)) {
            File file = new File(this.mDataDirectoryName);
            if (file.exists() || file.mkdirs()) {
                externalStorageState = getModelsZipBasename(this.mContext.getContentResolver());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(externalStorageState).length() + 7);
                stringBuilder.append(externalStorageState);
                stringBuilder.append("-");
                stringBuilder.append(MODELS_VERSION_STRING);
                stringBuilder.append(".zip");
                externalStorageState = stringBuilder.toString();
                r1 = Environment.getExternalStorageDirectory().toString();
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(r1).length() + 1) + String.valueOf(externalStorageState).length());
                stringBuilder2.append(r1);
                stringBuilder2.append("/");
                stringBuilder2.append(externalStorageState);
                r1 = stringBuilder2.toString();
                new File(r1).delete();
                String str = this.mRemoteModelsDirectoryName;
                StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(externalStorageState).length());
                stringBuilder3.append(str);
                stringBuilder3.append("/");
                stringBuilder3.append(externalStorageState);
                Request request = new Request(Uri.parse(stringBuilder3.toString()));
                externalStorageState = String.valueOf(r1);
                String str2 = "file://";
                if (externalStorageState.length() == 0) {
                    externalStorageState = new String(str2);
                } else {
                    externalStorageState = str2.concat(externalStorageState);
                }
                request.setDestinationUri(Uri.parse(externalStorageState));
                request.setNotificationVisibility(2);
                request.setVisibleInDownloadsUi(false);
                request.setAllowedOverMetered(false);
                request.setAllowedOverRoaming(false);
                this.mDownloadComplete = false;
                this.mDownloadManager = (DownloadManager) this.mContext.getSystemService("download");
                this.mDownloadId = this.mDownloadManager.enqueue(request);
                this.mDownloadCompleteReceiver = new BroadcastReceiver() {
                    public void onReceive(Context context, Intent intent) {
                        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                            int i;
                            Query query = new Query();
                            query.setFilterById(new long[]{ModelManager.this.mDownloadId});
                            Cursor query2 = ModelManager.this.mDownloadManager.query(query);
                            String str = r1;
                            if (query2.moveToFirst()) {
                                String string = query2.getString(query2.getColumnIndex("local_filename"));
                                int i2 = query2.getInt(query2.getColumnIndex(NotificationCompat.CATEGORY_STATUS));
                                if (i2 == 8) {
                                    Log.i(ModelManager.TAG, "Model download was successful");
                                    str = String.valueOf(string);
                                    String str2 = "Downloaded file: ";
                                    if (str.length() == 0) {
                                        str = new String(str2);
                                    } else {
                                        str = str2.concat(str);
                                    }
                                    Log.i(ModelManager.TAG, str);
                                    try {
                                        ModelManager.this.unzipFile(string, new File(ModelManager.this.mDataDirectoryName));
                                        i2 = 0;
                                    } catch (IOException e) {
                                        Log.e(ModelManager.TAG, "Could not unzip models");
                                        i2 = 2;
                                    }
                                    Log.i(ModelManager.TAG, "Model unzip completed");
                                    String str3 = string;
                                    i = i2;
                                    str = str3;
                                } else if (i2 == 16) {
                                    i2 = query2.getInt(query2.getColumnIndex("reason"));
                                    r3 = new StringBuilder(41);
                                    r3.append("Download failed, error code = ");
                                    r3.append(i2);
                                    Log.e(ModelManager.TAG, r3.toString());
                                    str = string;
                                    i = 1;
                                } else {
                                    r3 = new StringBuilder(37);
                                    r3.append("Download failed, status = ");
                                    r3.append(i2);
                                    Log.e(ModelManager.TAG, r3.toString());
                                    str = string;
                                    i = 1;
                                }
                            } else {
                                Log.e(ModelManager.TAG, "Could not move cursor");
                                i = 0;
                            }
                            query2.close();
                            context.unregisterReceiver(ModelManager.this.mDownloadCompleteReceiver);
                            if (!new File(str).delete()) {
                                str = String.valueOf(str);
                                String str4 = "Could not delete: ";
                                if (str.length() == 0) {
                                    str = new String(str4);
                                } else {
                                    str = str4.concat(str);
                                }
                                Log.e(ModelManager.TAG, str);
                            }
                            if (ModelManager.this.areModelsInstalled()) {
                                ModelManager.this.mHandler.sendEmptyMessage(1);
                                return;
                            }
                            ModelManager.this.mHandler.sendMessage(ModelManager.this.mHandler.obtainMessage(2, i, -1));
                        }
                    }
                };
                this.mHandler.sendEmptyMessageDelayed(0, 500);
                this.mContext.registerReceiver(this.mDownloadCompleteReceiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
                return;
            }
            externalStorageState = String.valueOf(this.mDataDirectoryName);
            r1 = "Could not create directory: ";
            if (externalStorageState.length() == 0) {
                externalStorageState = new String(r1);
            } else {
                externalStorageState = r1.concat(externalStorageState);
            }
            Log.e(TAG, externalStorageState);
            this.mCallbacks.onModelInstallationFailure(6);
        } else {
            externalStorageState = String.valueOf(externalStorageState);
            r1 = "Cannot access storage, state = ";
            if (externalStorageState.length() == 0) {
                externalStorageState = new String(r1);
            } else {
                externalStorageState = r1.concat(externalStorageState);
            }
            Log.e(TAG, externalStorageState);
            this.mCallbacks.onModelInstallationFailure(4);
        }
    }

    private static String getDataDirectoryName(Context context) {
        return new File(context.getFilesDir(), getDataSubdirectoryName(context.getContentResolver())).toString();
    }

    static String getDataSubdirectoryName(ContentResolver contentResolver) {
        String string = Secure.getString(contentResolver, "vision_face_data_subdirectory_name");
        if (string == null) {
            return "com.google.android.vision.face";
        }
        return string;
    }

    static String getModelsDirectoryName(Context context) {
        return new File(getDataDirectoryName(context), "models").toString();
    }

    private static String getModelsZipBasename(ContentResolver contentResolver) {
        String string = Secure.getString(contentResolver, "vision_face_models_zip_basename");
        if (string == null) {
            return "models";
        }
        return string;
    }

    private static String getRemoteModelsDirectoryName(ContentResolver contentResolver) {
        String string = Secure.getString(contentResolver, "vision_face_remote_models_directory_name");
        if (string == null) {
            return "http://dl.google.com/dl/android/face";
        }
        return string;
    }

    private final void handleCheckProgress() {
        if (!this.mDownloadComplete) {
            Query query = new Query();
            query.setFilterById(new long[]{this.mDownloadId});
            Cursor query2 = this.mDownloadManager.query(query);
            if (query2.moveToFirst()) {
                this.mCallbacks.onModelDownloadProgressUpdate((int) ((((float) query2.getInt(query2.getColumnIndex("bytes_so_far"))) / ((float) query2.getInt(query2.getColumnIndex("total_size")))) * 100.0f));
            }
            query2.close();
            this.mHandler.sendEmptyMessageDelayed(0, 500);
        }
    }

    private final void handleInstallationFailure(int i) {
        this.mDownloadComplete = true;
        this.mCallbacks.onModelInstallationFailure(i);
    }

    private final void handleInstallationSuccess() {
        this.mDownloadComplete = true;
        this.mCallbacks.onModelInstallationSuccess();
    }

    @TargetApi(21)
    private final boolean isConnectionMetered() {
        if (((ConnectivityManager) this.mContext.getSystemService("connectivity")).isActiveNetworkMetered()) {
            return true;
        }
        return false;
    }

    private final void unzipFile(String str, File file) {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    File file2 = new File(file, new File(nextEntry.getName()).getPath());
                    if (nextEntry.isDirectory()) {
                        file2.mkdirs();
                    } else {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.close();
                        } catch (IOException e) {
                            Log.e(TAG, "IOException writing to file");
                            throw e;
                        } catch (Throwable th) {
                            fileOutputStream.close();
                        }
                    }
                } else {
                    zipInputStream.close();
                    return;
                }
            } catch (IOException e2) {
                Log.e(TAG, "IOException unzipping file");
                throw e2;
            } catch (Throwable th2) {
                zipInputStream.close();
            }
        }
    }
}
