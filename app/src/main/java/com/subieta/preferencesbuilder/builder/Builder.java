package com.subieta.preferencesbuilder.builder;

import java.util.Map;
import java.util.Set;

/**
 * Created by Kevin Subieta on 9/29/17.
 * Clase Builder
 * Bibliografía del patrón de WIKIPEDIA
 * https://en.wikipedia.org/wiki/Builder_pattern
 */

public interface Builder {

    void putString(final String key, final String newValue);
    String getString(final String key, final String defValue);

    void putInt(final String key, final int newValue);
    int getInt(final String key, final int defValue);

    void putLong(final String key, final long newValue);
    long getLong(final String key, final long defValue);

    void clear();

    void putFloat(final String key, final float newValue);
    float getFloat(final String key, final float defValue);

    void putBoolean(final String key, final Boolean newValue);
    boolean getBoolean(final String key, final Boolean defValue);

    void putStringSet(final String key, final Set<String> newValue);
    Set<String> getStringSet(final String key, final Set<String> defValue);

    Map<String, ?> getAll();
    boolean containsPreference(final String key);
    void removeKey(final String key);





}
