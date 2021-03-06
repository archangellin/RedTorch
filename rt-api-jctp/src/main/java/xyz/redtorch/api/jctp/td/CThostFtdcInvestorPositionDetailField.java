/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcInvestorPositionDetailField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorPositionDetailField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorPositionDetailField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcInvestorPositionDetailField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_HedgeFlag_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_Direction_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_OpenDate_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_TradeID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_Volume_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_OpenPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_SettlementID_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_TradeType_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_ExchangeID_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setPositionProfitByDate(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_PositionProfitByDate_set(swigCPtr, this, value);
  }

  public double getPositionProfitByDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_PositionProfitByDate_get(swigCPtr, this);
  }

  public void setPositionProfitByTrade(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_PositionProfitByTrade_set(swigCPtr, this, value);
  }

  public double getPositionProfitByTrade() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_PositionProfitByTrade_get(swigCPtr, this);
  }

  public void setMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_Margin_set(swigCPtr, this, value);
  }

  public double getMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_Margin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_ExchMargin_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setLastSettlementPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_LastSettlementPrice_set(swigCPtr, this, value);
  }

  public double getLastSettlementPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_LastSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_SettlementPrice_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_CloseVolume_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_CloseAmount_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionDetailField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorPositionDetailField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcInvestorPositionDetailField(), true);
  }

}
