package com.subieta.preferencesbuilder.builder;

import android.content.Context;

import java.util.Map;
import java.util.Set;

/**
 * Created by Kevin Subieta on 8/22/17.
 * Concrete builder
 */

public class PreferencesBuilder implements Builder {
    private Preferences preferences;

    
    public static Preferences build(Context context, String name){
        return new Preferences().initPrefs(context,name);
    }

    @Override
    public void putString(String key, String newValue) {
        this.preferences.putString(key, newValue);
    }

    @Override
    public String getString(String key, String defValue) {
        return this.preferences.getString(key,defValue);
    }

    @Override
    public void putInt(String key, int newValue) {
        this.preferences.putInt(key,newValue);
    }

    @Override
    public int getInt(String key, int defValue) {
        return this.preferences.getInt(key, defValue);
    }

    @Override
    public void putLong(String key, long newValue) {
        this.preferences.putLong(key, newValue);
    }

    @Override
    public long getLong(String key, long defValue) {
        return this.preferences.getLong(key, defValue);
    }

    @Override
    public void clear() {
        this.preferences.clear();
    }

    @Override
    public void putFloat(String key, float newValue) {
        this.preferences.putFloat(key, newValue);
    }

    @Override
    public float getFloat(String key, float defValue) {
        return this.preferences.getFloat(key, defValue);
    }

    @Override
    public void putBoolean(String key, Boolean newValue) {
        this.preferences.putBoolean(key, newValue);
    }

    @Override
    public boolean getBoolean(String key, Boolean defValue) {
        return this.preferences.getBoolean(key, defValue);
    }

    @Override
    public void putStringSet(String key, Set<String> newValue) {
        this.preferences.putStringSet(key, newValue);
    }

    @Override
    public Set<String> getStringSet(String key, Set<String> defValue) {
        return this.preferences.getStringSet(key, defValue);
    }

    @Override
    public Map<String, ?> getAll() {
        return this.preferences.getAll();
    }

    @Override
    public boolean containsPreference(String key) {
        return this.preferences.containsPreference(key);
    }

    @Override
    public void removeKey(String key) {
        this.preferences.removeKey(key);
    }

}
