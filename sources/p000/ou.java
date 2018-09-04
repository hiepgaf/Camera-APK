package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: ou */
public class ou extends oe implements MenuItem {
    /* renamed from: e */
    public Method f22513e;

    ou(Context context, hg hgVar) {
        super(context, hgVar);
    }

    public boolean collapseActionView() {
        return ((hg) this.d).collapseActionView();
    }

    /* renamed from: a */
    ov mo3553a(ActionProvider actionProvider) {
        return new ov(this, actionProvider);
    }

    public boolean expandActionView() {
        return ((hg) this.d).expandActionView();
    }

    public ActionProvider getActionProvider() {
        jf a = ((hg) this.d).mo2412a();
        return a instanceof ov ? ((ov) a).f19535b : null;
    }

    public View getActionView() {
        View actionView = ((hg) this.d).getActionView();
        if (actionView instanceof ow) {
            return (View) ((ow) actionView).f19537a;
        }
        return actionView;
    }

    public int getAlphabeticModifiers() {
        return ((hg) this.d).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((hg) this.d).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((hg) this.d).getContentDescription();
    }

    public int getGroupId() {
        return ((hg) this.d).getGroupId();
    }

    public Drawable getIcon() {
        return ((hg) this.d).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((hg) this.d).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((hg) this.d).getIconTintMode();
    }

    public Intent getIntent() {
        return ((hg) this.d).getIntent();
    }

    public int getItemId() {
        return ((hg) this.d).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((hg) this.d).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((hg) this.d).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((hg) this.d).getNumericShortcut();
    }

    public int getOrder() {
        return ((hg) this.d).getOrder();
    }

    public SubMenu getSubMenu() {
        return m14226a(((hg) this.d).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((hg) this.d).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((hg) this.d).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((hg) this.d).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((hg) this.d).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((hg) this.d).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((hg) this.d).isCheckable();
    }

    public boolean isChecked() {
        return ((hg) this.d).isChecked();
    }

    public boolean isEnabled() {
        return ((hg) this.d).isEnabled();
    }

    public boolean isVisible() {
        return ((hg) this.d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        jf jfVar;
        hg hgVar = (hg) this.d;
        if (actionProvider == null) {
            jfVar = null;
        } else {
            jfVar = mo3553a(actionProvider);
        }
        hgVar.mo2411a(jfVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((hg) this.d).setActionView(i);
        View actionView = ((hg) this.d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((hg) this.d).setActionView(new ow(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new ow(view);
        }
        ((hg) this.d).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((hg) this.d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((hg) this.d).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((hg) this.d).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((hg) this.d).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((hg) this.d).mo2410a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((hg) this.d).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((hg) this.d).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((hg) this.d).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((hg) this.d).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((hg) this.d).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((hg) this.d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((hg) this.d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((hg) this.d).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        OnActionExpandListener oxVar;
        hg hgVar = (hg) this.d;
        if (onActionExpandListener != null) {
            oxVar = new ox(this, onActionExpandListener);
        } else {
            oxVar = null;
        }
        hgVar.setOnActionExpandListener(oxVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        OnMenuItemClickListener oyVar;
        hg hgVar = (hg) this.d;
        if (onMenuItemClickListener != null) {
            oyVar = new oy(this, onMenuItemClickListener);
        } else {
            oyVar = null;
        }
        hgVar.setOnMenuItemClickListener(oyVar);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((hg) this.d).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((hg) this.d).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((hg) this.d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((hg) this.d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((hg) this.d).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((hg) this.d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((hg) this.d).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((hg) this.d).mo2413b(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((hg) this.d).setVisible(z);
    }
}
