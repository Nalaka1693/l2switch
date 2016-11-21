/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.l2switch.cache;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sandaruwan on 7/9/16.
 */
public class FlowCacheEntry {

    String flowDetails;
    String flowProtocol;
    List<String> flows = new ArrayList<>();

    public void addFlow(String flow){
        flows.add(flow);
    }

    public List<String> getFlows() {
        return flows;
    }

    public void setFlows(List<String> flows) {
        this.flows = flows;
    }

    public String getFlowProtocol() {
        return flowProtocol;
    }

    public void setFlowProtocol(String flowProtocol) {
        this.flowProtocol = flowProtocol;
    }

    public String getFlowDetails() {
        return flowDetails;
    }

    public void setFlowDetails(String flowDetails) {
        this.flowDetails = flowDetails;
    }
}
