package com.mappy.twitter.utils

import android.content.Context
import android.net.ConnectivityManager

/**
 * Created by Asif Kazmi.
 */

object ConnectivityUtil {

    fun isConnected(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }
}