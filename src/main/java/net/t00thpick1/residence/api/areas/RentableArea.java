package net.t00thpick1.residence.api.areas;

public interface RentableArea extends MarketableArea {
    public boolean isForRent();
    public void setForRent(int cost, long rentPeriod, boolean autoRenewEnabled);
    public long getRentPeriod();
    public boolean isAutoRenewEnabled();
    public void setAutoRenewEnabled(boolean autoRenew);
    public boolean isRented();
    /**
    * @Deprecated Will be using a UUID system soonish
    */
    @Deprecated
    public boolean rent(String renter, boolean isAutoRenew);
    /**
    * @Deprecated Will be using a UUID system soonish
    */
    @Deprecated
    public String getRenter();
    public boolean isAutoRenew();
    public void setAutoRenew(boolean autoRenew);
    public long getLastPaymentDate();
    public void evict();
    public long getNextPaymentDate();
}
