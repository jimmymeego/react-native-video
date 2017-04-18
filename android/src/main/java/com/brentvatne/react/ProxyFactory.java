package com.brentvatne.react;

import android.content.Context;

import com.danikula.videocache.HttpProxyCacheServer;

/**
 * Created by jimmy on 4/18/17.
 */

public class ProxyFactory {

    private static HttpProxyCacheServer sharedProxy;

    private ProxyFactory() {
    }

    public static HttpProxyCacheServer getProxy(Context context) {
        return sharedProxy == null ? (sharedProxy = newProxy(context)) : sharedProxy;
    }

    private static HttpProxyCacheServer newProxy(Context context) {
        return new HttpProxyCacheServer(context);
    }

}
