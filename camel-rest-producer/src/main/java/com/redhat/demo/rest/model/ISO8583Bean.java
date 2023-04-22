package com.redhat.demo.rest.model;


public class ISO8583Bean {
    private String mti;
    private String pan;
    private String processingCode;
    private String transactionAmount;
    private String cardBillingAmount;
    private String dateTime;
    private String panCountryCode;
    private String posCaptureCode;
    private String air;
    private String cati;
    private String canl;
    private String isoData;
    private String nationalData;
    private String addPrivateData;
 
    public String getMti() {
        return mti;
    }
 
    public void setMti(String mti) {
        this.mti = mti;
    }
 
    public String getPan() {
        return pan;
    }
 
    public void setPan(String pan) {
        this.pan = pan;
    }
 
    public String getProcessingCode() {
        return processingCode;
    }
 
    public void setProcessingCode(String processingCode) {
        this.processingCode = processingCode;
    }
 
    public String getTransactionAmount() {
        return transactionAmount;
    }
 
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
 
    public String getCardBillingAmount() {
        return cardBillingAmount;
    }
 
    public void setCardBillingAmount(String cardBillingAmount) {
        this.cardBillingAmount = cardBillingAmount;
    }
 
    public String getDateTime() {
        return dateTime;
    }
 
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
 
    public String getPanCountryCode() {
        return panCountryCode;
    }
 
    public void setPanCountryCode(String panCountryCode) {
        this.panCountryCode = panCountryCode;
    }
 
    public String getPosCaptureCode() {
        return posCaptureCode;
    }
 
    public void setPosCaptureCode(String posCaptureCode) {
        this.posCaptureCode = posCaptureCode;
    }
 
    public String getAir() {
        return air;
    }
 
    public void setAir(String air) {
        this.air = air;
    }
 
    public String getCati() {
        return cati;
    }
 
    public void setCati(String cati) {
        this.cati = cati;
    }
 
    public String getCanl() {
        return canl;
    }
 
    public void setCanl(String canl) {
        this.canl = canl;
    }
 
    public String getIsoData() {
        return isoData;
    }
 
    public void setIsoData(String isoData) {
        this.isoData = isoData;
    }
 
    public String getNationalData() {
        return nationalData;
    }
 
    public void setNationalData(String nationalData) {
        this.nationalData = nationalData;
    }
 
    public String getAddPrivateData() {
        return addPrivateData;
    }
 
    public void setAddPrivateData(String addPrivateData) {
        this.addPrivateData = addPrivateData;
    }
 
    @Override
    public String toString() {
        return  "Message type Indicator: " + mti +
                "\nPrimary account number: " + pan +
                "\nProcessing Code: " + processingCode +
                "\nTransaction Amount: " + transactionAmount +
                "\nCardholder billing amount: " + cardBillingAmount +
                "\nTransmission date & time: " + dateTime +
                "\nPAN extended: " + panCountryCode +
                "\nPoint of service capture code: " + posCaptureCode +
                "\nAuthorization identification response: " + air +
                "\nCard acceptor terminal indentification: " + cati +
                "\nCard acceptor name/location: " + canl +
                "\nAdditional ISO data: " + isoData +
                "\nAdditional national data: " + nationalData +
                "\nAdditional private data: " + addPrivateData;
    }
}