package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import com.google.common.io.ByteStreams;
import java.util.ArrayList;

/* compiled from: PG */
public final class ShareCompat {
    public static final String EXTRA_CALLING_ACTIVITY = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_PACKAGE = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    public static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";

    /* compiled from: PG */
    public class IntentBuilder {
        public Activity mActivity;
        public ArrayList mBccAddresses;
        public ArrayList mCcAddresses;
        public CharSequence mChooserTitle;
        public Intent mIntent = new Intent().setAction("android.intent.action.SEND");
        public ArrayList mStreams;
        public ArrayList mToAddresses;

        private IntentBuilder(Activity activity) {
            this.mActivity = activity;
            this.mIntent.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE, activity.getPackageName());
            this.mIntent.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY, activity.getComponentName());
            this.mIntent.addFlags(ByteStreams.ZERO_COPY_CHUNK_SIZE);
        }

        public IntentBuilder addEmailBcc(String str) {
            if (this.mBccAddresses == null) {
                this.mBccAddresses = new ArrayList();
            }
            this.mBccAddresses.add(str);
            return this;
        }

        public IntentBuilder addEmailBcc(String[] strArr) {
            combineArrayExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        public IntentBuilder addEmailCc(String str) {
            if (this.mCcAddresses == null) {
                this.mCcAddresses = new ArrayList();
            }
            this.mCcAddresses.add(str);
            return this;
        }

        public IntentBuilder addEmailCc(String[] strArr) {
            combineArrayExtra("android.intent.extra.CC", strArr);
            return this;
        }

        public IntentBuilder addEmailTo(String str) {
            if (this.mToAddresses == null) {
                this.mToAddresses = new ArrayList();
            }
            this.mToAddresses.add(str);
            return this;
        }

        public IntentBuilder addEmailTo(String[] strArr) {
            combineArrayExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public IntentBuilder addStream(Uri uri) {
            Uri uri2 = (Uri) this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
            ArrayList arrayList = this.mStreams;
            if (arrayList == null && uri2 == null) {
                return setStream(uri);
            }
            if (arrayList == null) {
                this.mStreams = new ArrayList();
            }
            if (uri2 != null) {
                this.mIntent.removeExtra("android.intent.extra.STREAM");
                this.mStreams.add(uri2);
            }
            this.mStreams.add(uri);
            return this;
        }

        private void combineArrayExtra(String str, ArrayList arrayList) {
            int length;
            Object stringArrayExtra = this.mIntent.getStringArrayExtra(str);
            if (stringArrayExtra != null) {
                length = stringArrayExtra.length;
            } else {
                length = 0;
            }
            Object obj = new String[(arrayList.size() + length)];
            arrayList.toArray(obj);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, obj, arrayList.size(), length);
            }
            this.mIntent.putExtra(str, obj);
        }

        private void combineArrayExtra(String str, String[] strArr) {
            int length;
            Intent intent = getIntent();
            Object stringArrayExtra = intent.getStringArrayExtra(str);
            if (stringArrayExtra != null) {
                length = stringArrayExtra.length;
            } else {
                length = 0;
            }
            int length2 = strArr.length;
            Object obj = new String[(length + length2)];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, obj, 0, length);
            }
            System.arraycopy(strArr, 0, obj, length, length2);
            intent.putExtra(str, obj);
        }

        public Intent createChooserIntent() {
            return Intent.createChooser(getIntent(), this.mChooserTitle);
        }

        public static IntentBuilder from(Activity activity) {
            return new IntentBuilder(activity);
        }

        Activity getActivity() {
            return this.mActivity;
        }

        public Intent getIntent() {
            int i;
            ArrayList arrayList;
            ArrayList arrayList2 = this.mToAddresses;
            if (arrayList2 != null) {
                combineArrayExtra("android.intent.extra.EMAIL", arrayList2);
                this.mToAddresses = null;
            }
            arrayList2 = this.mCcAddresses;
            if (arrayList2 != null) {
                combineArrayExtra("android.intent.extra.CC", arrayList2);
                this.mCcAddresses = null;
            }
            arrayList2 = this.mBccAddresses;
            if (arrayList2 != null) {
                combineArrayExtra("android.intent.extra.BCC", arrayList2);
                this.mBccAddresses = null;
            }
            arrayList2 = this.mStreams;
            if (arrayList2 == null) {
                i = 0;
            } else if (arrayList2.size() > 1) {
                i = 1;
            } else {
                i = 0;
            }
            boolean equals = this.mIntent.getAction().equals("android.intent.action.SEND_MULTIPLE");
            if (i == 0 && equals) {
                this.mIntent.setAction("android.intent.action.SEND");
                arrayList = this.mStreams;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.mIntent.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.mIntent.putExtra("android.intent.extra.STREAM", (Parcelable) this.mStreams.get(0));
                }
                this.mStreams = null;
            }
            if (!(i == 0 || equals)) {
                this.mIntent.setAction("android.intent.action.SEND_MULTIPLE");
                arrayList = this.mStreams;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.mIntent.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.mStreams);
                }
            }
            return this.mIntent;
        }

        public IntentBuilder setChooserTitle(int i) {
            return setChooserTitle(this.mActivity.getText(i));
        }

        public IntentBuilder setChooserTitle(CharSequence charSequence) {
            this.mChooserTitle = charSequence;
            return this;
        }

        public IntentBuilder setEmailBcc(String[] strArr) {
            this.mIntent.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        public IntentBuilder setEmailCc(String[] strArr) {
            this.mIntent.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        public IntentBuilder setEmailTo(String[] strArr) {
            if (this.mToAddresses != null) {
                this.mToAddresses = null;
            }
            this.mIntent.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public IntentBuilder setHtmlText(String str) {
            this.mIntent.putExtra("android.intent.extra.HTML_TEXT", str);
            if (!this.mIntent.hasExtra("android.intent.extra.TEXT")) {
                setText(Html.fromHtml(str));
            }
            return this;
        }

        public IntentBuilder setStream(Uri uri) {
            if (!this.mIntent.getAction().equals("android.intent.action.SEND")) {
                this.mIntent.setAction("android.intent.action.SEND");
            }
            this.mStreams = null;
            this.mIntent.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }

        public IntentBuilder setSubject(String str) {
            this.mIntent.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        public IntentBuilder setText(CharSequence charSequence) {
            this.mIntent.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public IntentBuilder setType(String str) {
            this.mIntent.setType(str);
            return this;
        }

        public void startChooser() {
            this.mActivity.startActivity(createChooserIntent());
        }
    }

    /* compiled from: PG */
    public class IntentReader {
        public static final String TAG = "IntentReader";
        public Activity mActivity;
        public ComponentName mCallingActivity;
        public String mCallingPackage;
        public Intent mIntent;
        public ArrayList mStreams;

        private IntentReader(Activity activity) {
            this.mActivity = activity;
            this.mIntent = activity.getIntent();
            this.mCallingPackage = ShareCompat.getCallingPackage(activity);
            this.mCallingActivity = ShareCompat.getCallingActivity(activity);
        }

        public static IntentReader from(Activity activity) {
            return new IntentReader(activity);
        }

        public ComponentName getCallingActivity() {
            return this.mCallingActivity;
        }

        public Drawable getCallingActivityIcon() {
            Drawable drawable = null;
            if (this.mCallingActivity != null) {
                try {
                    drawable = this.mActivity.getPackageManager().getActivityIcon(this.mCallingActivity);
                } catch (Throwable e) {
                    Log.e(TAG, "Could not retrieve icon for calling activity", e);
                }
            }
            return drawable;
        }

        public Drawable getCallingApplicationIcon() {
            Drawable drawable = null;
            if (this.mCallingPackage != null) {
                try {
                    drawable = this.mActivity.getPackageManager().getApplicationIcon(this.mCallingPackage);
                } catch (Throwable e) {
                    Log.e(TAG, "Could not retrieve icon for calling application", e);
                }
            }
            return drawable;
        }

        public CharSequence getCallingApplicationLabel() {
            CharSequence charSequence = null;
            if (this.mCallingPackage != null) {
                PackageManager packageManager = this.mActivity.getPackageManager();
                try {
                    charSequence = packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.mCallingPackage, 0));
                } catch (Throwable e) {
                    Log.e(TAG, "Could not retrieve label for calling application", e);
                }
            }
            return charSequence;
        }

        public String getCallingPackage() {
            return this.mCallingPackage;
        }

        public String[] getEmailBcc() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.BCC");
        }

        public String[] getEmailCc() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.CC");
        }

        public String[] getEmailTo() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        public String getHtmlText() {
            String stringExtra = this.mIntent.getStringExtra("android.intent.extra.HTML_TEXT");
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence text = getText();
            if (text instanceof Spanned) {
                return Html.toHtml((Spanned) text);
            }
            if (text == null) {
                return stringExtra;
            }
            return Html.escapeHtml(text);
        }

        public Uri getStream() {
            return (Uri) this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
        }

        public Uri getStream(int i) {
            if (this.mStreams == null && isMultipleShare()) {
                this.mStreams = this.mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList = this.mStreams;
            if (arrayList != null) {
                return (Uri) arrayList.get(i);
            }
            if (i == 0) {
                return (Uri) this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Stream items available: ");
            stringBuilder.append(getStreamCount());
            stringBuilder.append(" index requested: ");
            stringBuilder.append(i);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }

        public int getStreamCount() {
            if (this.mStreams == null && isMultipleShare()) {
                this.mStreams = this.mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList = this.mStreams;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.mIntent.hasExtra("android.intent.extra.STREAM");
        }

        public String getSubject() {
            return this.mIntent.getStringExtra("android.intent.extra.SUBJECT");
        }

        public CharSequence getText() {
            return this.mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        public String getType() {
            return this.mIntent.getType();
        }

        public boolean isMultipleShare() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.mIntent.getAction());
        }

        public boolean isShareIntent() {
            String action = this.mIntent.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean isSingleShare() {
            return "android.intent.action.SEND".equals(this.mIntent.getAction());
        }

        private static void withinStyle(StringBuilder stringBuilder, CharSequence charSequence, int i, int i2) {
            int i3 = i;
            while (i3 < i2) {
                char charAt = charSequence.charAt(i3);
                if (charAt == '<') {
                    stringBuilder.append("&lt;");
                } else if (charAt == '>') {
                    stringBuilder.append("&gt;");
                } else if (charAt == '&') {
                    stringBuilder.append("&amp;");
                } else if (charAt > '~' || charAt < ' ') {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("&#");
                    stringBuilder2.append(charAt);
                    stringBuilder2.append(";");
                    stringBuilder.append(stringBuilder2.toString());
                } else if (charAt == ' ') {
                    while (true) {
                        int i4 = i3 + 1;
                        if (i4 >= i2 || charSequence.charAt(i4) != ' ') {
                            stringBuilder.append(' ');
                        } else {
                            stringBuilder.append("&nbsp;");
                            i3++;
                        }
                    }
                    stringBuilder.append(' ');
                } else {
                    stringBuilder.append(charAt);
                }
                i3++;
            }
        }
    }

    private ShareCompat() {
    }

    public static void configureMenuItem(Menu menu, int i, IntentBuilder intentBuilder) {
        MenuItem findItem = menu.findItem(i);
        if (findItem == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not find menu item with id ");
            stringBuilder.append(i);
            stringBuilder.append(" in the supplied menu");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        configureMenuItem(findItem, intentBuilder);
    }

    public static void configureMenuItem(MenuItem menuItem, IntentBuilder intentBuilder) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (actionProvider instanceof ShareActionProvider) {
            ShareActionProvider shareActionProvider = (ShareActionProvider) actionProvider;
        } else {
            actionProvider = new ShareActionProvider(intentBuilder.getActivity());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(HISTORY_FILENAME_PREFIX);
        stringBuilder.append(intentBuilder.getActivity().getClass().getName());
        actionProvider.setShareHistoryFileName(stringBuilder.toString());
        actionProvider.setShareIntent(intentBuilder.getIntent());
        menuItem.setActionProvider(actionProvider);
    }

    public static ComponentName getCallingActivity(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return (ComponentName) activity.getIntent().getParcelableExtra(EXTRA_CALLING_ACTIVITY);
        }
        return callingActivity;
    }

    public static String getCallingPackage(Activity activity) {
        String callingPackage = activity.getCallingPackage();
        if (callingPackage == null) {
            return activity.getIntent().getStringExtra(EXTRA_CALLING_PACKAGE);
        }
        return callingPackage;
    }
}
