package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat.Action;
import android.support.v4.app.NotificationCompat.CarExtender;
import android.support.v4.app.NotificationCompat.Style;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    public final List mActionExtrasList = new ArrayList();
    public RemoteViews mBigContentView;
    public final Builder mBuilder;
    public final NotificationCompat.Builder mBuilderCompat;
    public RemoteViews mContentView;
    public final Bundle mExtras = new Bundle();
    public int mGroupAlertBehavior;
    public RemoteViews mHeadsUpContentView;

    NotificationCompatBuilder(NotificationCompat.Builder builder) {
        boolean z;
        Bundle bundle;
        this.mBuilderCompat = builder;
        this.mBuilder = new Builder(builder.mContext, builder.mChannelId);
        Notification notification = builder.mNotification;
        Builder lights = this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        lights = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        lights = lights.setOnlyAlertOnce(z);
        if ((notification.flags & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        lights = lights.setAutoCancel(z).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = builder.mFullScreenIntent;
        if ((notification.flags & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        lights.setFullScreenIntent(pendingIntent, z).setLargeIcon(builder.mLargeIcon).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        if (VERSION.SDK_INT < 21) {
            this.mBuilder.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
            ArrayList arrayList = builder.mActions;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                addAction((Action) arrayList.get(i));
                i = i2;
            }
            bundle = builder.mExtras;
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            if (VERSION.SDK_INT < 20) {
                if (builder.mLocalOnly) {
                    this.mExtras.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                String str = builder.mGroupKey;
                if (str != null) {
                    this.mExtras.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, str);
                    if (builder.mGroupSummary) {
                        this.mExtras.putBoolean(NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                    } else {
                        this.mExtras.putBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                    }
                }
                str = builder.mSortKey;
                if (str != null) {
                    this.mExtras.putString(NotificationCompatExtras.EXTRA_SORT_KEY, str);
                }
            }
            this.mContentView = builder.mContentView;
            this.mBigContentView = builder.mBigContentView;
        }
        if (VERSION.SDK_INT >= 19) {
            this.mBuilder.setShowWhen(builder.mShowWhen);
            if (VERSION.SDK_INT < 21) {
                ArrayList arrayList2 = builder.mPeople;
                if (!(arrayList2 == null || arrayList2.isEmpty())) {
                    Bundle bundle2 = this.mExtras;
                    arrayList2 = builder.mPeople;
                    bundle2.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.mBuilder.setLocalOnly(builder.mLocalOnly).setGroup(builder.mGroupKey).setGroupSummary(builder.mGroupSummary).setSortKey(builder.mSortKey);
            this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        }
        if (VERSION.SDK_INT >= 21) {
            this.mBuilder.setCategory(builder.mCategory).setColor(builder.mColor).setVisibility(builder.mVisibility).setPublicVersion(builder.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
            ArrayList arrayList3 = builder.mPeople;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList3.get(i3);
                i3++;
                this.mBuilder.addPerson((String) obj);
            }
            this.mHeadsUpContentView = builder.mHeadsUpContentView;
            if (builder.mInvisibleActions.size() > 0) {
                bundle = builder.getExtras().getBundle(CarExtender.EXTRA_CAR_EXTENDER);
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = bundle;
                }
                Bundle bundle3 = new Bundle();
                for (i2 = 0; i2 < builder.mInvisibleActions.size(); i2++) {
                    bundle3.putBundle(Integer.toString(i2), NotificationCompatJellybean.getBundleForAction((Action) builder.mInvisibleActions.get(i2)));
                }
                bundle2.putBundle(CarExtender.EXTRA_INVISIBLE_ACTIONS, bundle3);
                builder.getExtras().putBundle(CarExtender.EXTRA_CAR_EXTENDER, bundle2);
                this.mExtras.putBundle(CarExtender.EXTRA_CAR_EXTENDER, bundle2);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.mBuilder.setExtras(builder.mExtras).setRemoteInputHistory(builder.mRemoteInputHistory);
            RemoteViews remoteViews = builder.mContentView;
            if (remoteViews != null) {
                this.mBuilder.setCustomContentView(remoteViews);
            }
            remoteViews = builder.mBigContentView;
            if (remoteViews != null) {
                this.mBuilder.setCustomBigContentView(remoteViews);
            }
            remoteViews = builder.mHeadsUpContentView;
            if (remoteViews != null) {
                this.mBuilder.setCustomHeadsUpContentView(remoteViews);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.mBuilder.setBadgeIconType(builder.mBadgeIcon).setShortcutId(builder.mShortcutId).setTimeoutAfter(builder.mTimeout).setGroupAlertBehavior(builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                this.mBuilder.setColorized(builder.mColorized);
            }
            if (!TextUtils.isEmpty(builder.mChannelId)) {
                this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    private void addAction(Action action) {
        Bundle bundle;
        Notification.Action.Builder builder = new Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (RemoteInput addRemoteInput : RemoteInput.fromCompat(action.getRemoteInputs())) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        if (action.getExtras() != null) {
            bundle = new Bundle(action.getExtras());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(NotificationCompatJellybean.EXTRA_ALLOW_GENERATED_REPLIES, action.getAllowGeneratedReplies());
        builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
        bundle.putInt(Action.EXTRA_SEMANTIC_ACTION, action.getSemanticAction());
        builder.setSemanticAction(action.getSemanticAction());
        bundle.putBoolean(Action.EXTRA_SHOWS_USER_INTERFACE, action.getShowsUserInterface());
        builder.addExtras(bundle);
        this.mBuilder.addAction(builder.build());
    }

    public Notification build() {
        RemoteViews makeContentView;
        Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        if (style != null) {
            makeContentView = style.makeContentView(this);
        } else {
            makeContentView = null;
        }
        Notification buildInternal = buildInternal();
        if (makeContentView != null) {
            buildInternal.contentView = makeContentView;
        } else {
            makeContentView = this.mBuilderCompat.mContentView;
            if (makeContentView != null) {
                buildInternal.contentView = makeContentView;
            }
        }
        if (style != null) {
            makeContentView = style.makeBigContentView(this);
            if (makeContentView != null) {
                buildInternal.bigContentView = makeContentView;
            }
        }
        if (VERSION.SDK_INT >= 21 && style != null) {
            makeContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this);
            if (makeContentView != null) {
                buildInternal.headsUpContentView = makeContentView;
            }
        }
        if (VERSION.SDK_INT >= 16 && style != null) {
            Bundle extras = NotificationCompat.getExtras(buildInternal);
            if (extras != null) {
                style.addCompatExtras(extras);
            }
        }
        return buildInternal;
    }

    protected Notification buildInternal() {
        return this.mBuilder.build();
    }

    public Builder getBuilder() {
        return this.mBuilder;
    }

    private void removeSoundAndVibration(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
