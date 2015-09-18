package com.ivelsproject.ivelsid;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class AppListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (isPackageInstalled("id.ac.uny.ivls.schedule")) {
            TextView scheduleApp = (TextView) findViewById(R.id.text_install_schedule);
            scheduleApp.setText("Installed");
            scheduleApp.setTextColor(getResources().getColor(R.color.accent_material_light));

            ImageView scheduleAppInstall = (ImageView) findViewById(R.id.logo_install_schedule);
            scheduleAppInstall.setColorFilter(getResources().getColor(R.color.accent_material_light));
        }

        if (isPackageInstalled("id.ac.uny.ivls.library")) {
            TextView scheduleApp = (TextView) findViewById(R.id.text_install_schedule);
            scheduleApp.setText("Installed");
            scheduleApp.setTextColor(getResources().getColor(R.color.accent_material_light));

            ImageView scheduleAppInstall = (ImageView) findViewById(R.id.logo_install_schedule);
            scheduleAppInstall.setColorFilter(getResources().getColor(R.color.accent_material_light));
        }

        if (isPackageInstalled("id.ac.uny.ivls.learning")) {
            TextView scheduleApp = (TextView) findViewById(R.id.text_install_schedule);
            scheduleApp.setText("Installed");
            scheduleApp.setTextColor(getResources().getColor(R.color.accent_material_light));

            ImageView scheduleAppInstall = (ImageView) findViewById(R.id.logo_install_schedule);
            scheduleAppInstall.setColorFilter(getResources().getColor(R.color.accent_material_light));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected boolean isPackageInstalled(String packageName) {
        PackageManager packageManager = getPackageManager();
        try {
            packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
