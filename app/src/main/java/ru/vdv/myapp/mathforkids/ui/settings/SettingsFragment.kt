package ru.vdv.myapp.mathforkids.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import ru.vdv.myapp.mathforkids.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}