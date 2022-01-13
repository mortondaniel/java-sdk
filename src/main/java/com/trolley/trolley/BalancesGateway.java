package com.trolley.trolley;

import com.trolley.Exceptions.InvalidFieldException;

public class BalancesGateway {
    Client client;
    
    public BalancesGateway(Configuration config) {
        this.client = new Client(config);
    }

    public String find(String term) throws Exception {
        if (term == null) {
            throw new InvalidFieldException("Term cannot be null");
        }
        String endPoint = "/v1/balances/" + term;
        String response = this.client.get(endPoint);
        return response;
    }
}