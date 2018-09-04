package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* compiled from: PG */
public class ListFragment extends Fragment {
    public static final int INTERNAL_EMPTY_ID = 16711681;
    public static final int INTERNAL_LIST_CONTAINER_ID = 16711683;
    public static final int INTERNAL_PROGRESS_CONTAINER_ID = 16711682;
    public ListAdapter mAdapter;
    public CharSequence mEmptyText;
    public View mEmptyView;
    public final Handler mHandler = new Handler();
    public ListView mList;
    public View mListContainer;
    public boolean mListShown;
    public final OnItemClickListener mOnClickListener = new C00272();
    public View mProgressContainer;
    public final Runnable mRequestFocus = new C00261();
    public TextView mStandardEmptyView;

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.ListFragment$1 */
    class C00261 implements Runnable {
        C00261() {
        }

        public void run() {
            View view = ListFragment.this.mList;
            view.focusableViewAvailable(view);
        }
    }

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.ListFragment$2 */
    class C00272 implements OnItemClickListener {
        C00272() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            ListFragment.this.onListItemClick((ListView) adapterView, view, i, j);
        }
    }

    private void ensureList() {
        if (this.mList == null) {
            View view = getView();
            if (view == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            if (view instanceof ListView) {
                this.mList = (ListView) view;
            } else {
                this.mStandardEmptyView = (TextView) view.findViewById(INTERNAL_EMPTY_ID);
                TextView textView = this.mStandardEmptyView;
                if (textView == null) {
                    this.mEmptyView = view.findViewById(16908292);
                } else {
                    textView.setVisibility(8);
                }
                this.mProgressContainer = view.findViewById(INTERNAL_PROGRESS_CONTAINER_ID);
                this.mListContainer = view.findViewById(INTERNAL_LIST_CONTAINER_ID);
                view = view.findViewById(16908298);
                if (view instanceof ListView) {
                    this.mList = (ListView) view;
                    view = this.mEmptyView;
                    if (view != null) {
                        this.mList.setEmptyView(view);
                    } else {
                        CharSequence charSequence = this.mEmptyText;
                        if (charSequence != null) {
                            this.mStandardEmptyView.setText(charSequence);
                            this.mList.setEmptyView(this.mStandardEmptyView);
                        }
                    }
                } else if (view == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                } else {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
            }
            this.mListShown = true;
            this.mList.setOnItemClickListener(this.mOnClickListener);
            ListAdapter listAdapter = this.mAdapter;
            if (listAdapter != null) {
                this.mAdapter = null;
                setListAdapter(listAdapter);
            } else if (this.mProgressContainer != null) {
                setListShown(false, false);
            }
            this.mHandler.post(this.mRequestFocus);
        }
    }

    public ListAdapter getListAdapter() {
        return this.mAdapter;
    }

    public ListView getListView() {
        ensureList();
        return this.mList;
    }

    public long getSelectedItemId() {
        ensureList();
        return this.mList.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        ensureList();
        return this.mList.getSelectedItemPosition();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        View frameLayout = new FrameLayout(context);
        View linearLayout = new LinearLayout(context);
        linearLayout.setId(INTERNAL_PROGRESS_CONTAINER_ID);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(context, null, 16842874), new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new LayoutParams(-1, -1));
        linearLayout = new FrameLayout(context);
        linearLayout.setId(INTERNAL_LIST_CONTAINER_ID);
        View textView = new TextView(context);
        textView.setId(INTERNAL_EMPTY_ID);
        textView.setGravity(17);
        linearLayout.addView(textView, new LayoutParams(-1, -1));
        textView = new ListView(context);
        textView.setId(16908298);
        textView.setDrawSelectorOnTop(false);
        linearLayout.addView(textView, new LayoutParams(-1, -1));
        frameLayout.addView(linearLayout, new LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mList = null;
        this.mListShown = false;
        this.mListContainer = null;
        this.mProgressContainer = null;
        this.mEmptyView = null;
        this.mStandardEmptyView = null;
        super.onDestroyView();
    }

    public void onListItemClick(ListView listView, View view, int i, long j) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ensureList();
    }

    public void setEmptyText(CharSequence charSequence) {
        ensureList();
        TextView textView = this.mStandardEmptyView;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.mEmptyText == null) {
            this.mList.setEmptyView(this.mStandardEmptyView);
        }
        this.mEmptyText = charSequence;
    }

    public void setListAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.mAdapter;
        this.mAdapter = listAdapter;
        ListView listView = this.mList;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.mListShown && listAdapter2 == null) {
                boolean z;
                if (getView().getWindowToken() != null) {
                    z = true;
                } else {
                    z = false;
                }
                setListShown(true, z);
            }
        }
    }

    public void setListShown(boolean z) {
        setListShown(z, true);
    }

    private void setListShown(boolean z, boolean z2) {
        ensureList();
        View view = this.mProgressContainer;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.mListShown != z) {
            this.mListShown = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.mListContainer.clearAnimation();
                }
                this.mProgressContainer.setVisibility(8);
                this.mListContainer.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.mListContainer.clearAnimation();
            }
            this.mProgressContainer.setVisibility(0);
            this.mListContainer.setVisibility(8);
        }
    }

    public void setListShownNoAnimation(boolean z) {
        setListShown(z, false);
    }

    public void setSelection(int i) {
        ensureList();
        this.mList.setSelection(i);
    }
}
