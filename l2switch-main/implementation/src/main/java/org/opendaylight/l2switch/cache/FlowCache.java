/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.l2switch.cache;

import java.util.HashMap;

/**
 * Created by sandaruwan on 7/9/16.
 */
public class FlowCache {

    private static HashMap<SourceMacAddress,FlowCacheEntry> cacheMap = null;

    static {
        if(cacheMap == null){
            cacheMap = new HashMap<>();
        }
    }

    public static void addToCache(String srceMac, String flow){
        SourceMacAddress sma = new SourceMacAddress();
        sma.setMacAddress(srceMac);
        FlowCacheEntry flowCacheEntry;

        if(cacheMap.containsKey(sma)){
            flowCacheEntry = cacheMap.get(sma);
        }else{
            flowCacheEntry = new FlowCacheEntry();
        }

        flowCacheEntry.addFlow(flow);
        cacheMap.put(sma, flowCacheEntry);
    }



}
