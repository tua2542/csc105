package sit.cs.csc105.banking.model;

import sit.cs.csc105.banking.utils.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BankAccount {
    private String accountNumber = null;
    private String accountName = null;
    private String address = null;
    private String district = null;
    private String province = null;
    private String phoneNumber = null;
    private String amount = null;

    public BankAccount() {
    }

    public BankAccount(ResultSet rs) throws SQLException {
        accountNumber = rs.getString("accountNumber");
        accountName = rs.getString("accountName");
        address = rs.getString("address");
        district = rs.getString("district");
        province = rs.getString("province");
        phoneNumber = rs.getString("phoneNumber");
        amount = rs.getString("amount");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
