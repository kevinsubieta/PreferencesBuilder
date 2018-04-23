package com.subieta.preferencesbuilder.builder;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;
import java.util.Set;

/**
 * Created by kevin Subieta on 8/22/17.
 * Clases POJO
 * Clase Producto (Con respecto al patrón)
 */

public class Preferences {

    public SharedPreferences sharedPreferences;
    public SharedPreferences.Editor editor;


    public Preferences initPrefs(Context context, String prefsName) {
        sharedPreferences = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);
        return this;
    }

    public void putString(final String key, final String newValue) {
        editor = sharedPreferences.edit();
        editor.putString(key, newValue);
        editor.apply();
    }

    public String getString(final String key, final String defValue) {
        return sharedPreferences.getString(key, defValue);
    }

    public void putInt(final String key, final int newValue) {
        editor = sharedPreferences.edit();
        editor.putInt(key, newValue);
        editor.apply();
    }

    public int getInt(final String key, final int defValue) {
        return sharedPreferences.getInt(key, defValue);
    }

    public void putFloat(final String key, final float newValue) {
        editor = sharedPreferences.edit();
        editor.putFloat(key, newValue);
        editor.apply();
    }

    public void putLong(final String key, final long newValue) {
        editor = sharedPreferences.edit();
        editor.putLong(key, newValue);
        editor.apply();
    }

    public long getLong(final String key, final long defValue) {
        return sharedPreferences.getLong(key, defValue);
    }

    public void clear() {
        editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

    public float getFloat(final String key, final float defValue) {
        return sharedPreferences.getFloat(key, defValue);
    }

    public void putBoolean(final String key, final Boolean newValue) {
        editor = sharedPreferences.edit();
        editor.putBoolean(key, newValue);
        editor.apply();
    }

    public boolean getBoolean(final String key, final Boolean defValue) {
        return sharedPreferences.getBoolean(key, defValue);
    }

    public void putStringSet(final String key, final Set<String> newValue) {
        editor = sharedPreferences.edit();
        editor.putStringSet(key, newValue);
        editor.apply();
    }

    public Set<String> getStringSet(final String key, final Set<String> defValue) {
        return sharedPreferences.getStringSet(key, defValue);
    }

    public Map<String, ?> getAll() {
        return sharedPreferences.getAll();
    }

    public boolean containsPreference(final String key) {
        return sharedPreferences.contains(key);
    }

    public void removeKey(final String key) {
        editor = sharedPreferences.edit();
        editor.remove(key);
        editor.apply();
    }


}
