package com.trolley.trolley;

public class Balances {

    public EUR EUR;

    public USD USD;

    public CAD CAD;

    public EUR getEUR() {
        return EUR;
    }

    public void setEUR(EUR EUR) {
        this.EUR = EUR;
    }

    public USD getUSD() {
        return USD;
    }

    public void setUSD(USD USD) {
        this.USD = USD;
    }

    public CAD getCAD() {
        return CAD;
    }

    public void setCAD(CAD CAD) {
        this.CAD = CAD;
    }

    /**
     * Retrieves all account balances
     *
     * @return The response
     * @throws com.trolley.Exceptions.InvalidStatusCodeException
     * @throws com.trolley.Exceptions.InvalidFieldException
     * @throws com.trolley.Exceptions.InvalidConnectionException
     */
    public static String find() throws Exception {
        return find("");
    }

    /**
     * Retrieves balance based on term
     *
     * @param term (paypal or trolley)
     * @return The response
     * @throws com.trolley.Exceptions.InvalidStatusCodeException
     * @throws com.trolley.Exceptions.InvalidFieldException
     * @throws com.trolley.Exceptions.InvalidConnectionException
     */
    public static String find(String term) throws Exception {
        return Configuration.gateway().balances.find(term);
    }

}
