// Copyright 2022 VMware, Inc.
// SPDX-License-Identifier: BSD-2-Clause

package com.example.integrationguide;

import android.content.Intent;

import androidx.appcompat.app.AppCompatDelegate;

import org.jetbrains.annotations.NotNull;

import java.security.cert.X509Certificate;

// Note the fully qualified class name in the extends declaration.
public class AWApplication extends com.airwatch.app.AWApplication {
    @NotNull
    @Override
    public Intent getMainActivityIntent() {
        return new Intent(getApplicationContext(), MainActivity.class);
    }

    @Override
    public void onSSLPinningRequestFailure(
            @NotNull String host, X509Certificate x509Certificate
    ) {
    }

    @Override
    public void onSSLPinningValidationFailure(
            @NotNull String host, X509Certificate x509Certificate
    ) {
    }

    @Override
    public int getNightMode() {
        return AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
    }
}
