package sit.cs.csc105.banking.model;

import sit.cs.csc105.banking.utils.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class AccountOperation
{
    BankAccount bankAccount = null;
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    boolean executeState = false;
    String executeMessage;
    
    public BankAccount searchByAccountNumber(String accountNumber)
    {
        try
        {
            conn = DBconnection.getMySQLConnection();
            pstm = conn.prepareStatement("SELECT * FROM bank_account WHERE accountNumber = " + accountNumber);
            rs = pstm.executeQuery();
            if (rs.next())
            {
                bankAccount = new BankAccount(rs);
            } else
            {
            
            }
            return bankAccount;
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                rs.close();
                pstm.close();
                conn.close();
            } catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        return null;
    }
    
    public void addAccount(String accountNumber, String accountName, String address, String district, String province, String phoneNumber, String amount)
    {
        try
        {
            conn = DBconnection.getMySQLConnection();
            String statement = String.format("INSERT INTO bank_account VALUES ('%s','%s','%s','%s','%s',%s,%s)", accountNumber, accountName, address, district, province, phoneNumber, amount);
            System.out.println(statement);
            pstm = conn.prepareStatement(statement);
            executeState = pstm.execute();
            executeMessage = "INSERT SUCCESSFUL";
                
        } catch (Exception e)
        {
            e.printStackTrace();
            executeMessage = "INSERT FAILED";
        }
    }
    
    public boolean isExecuteState()
    {
        return executeState;
    }
    
    public String getExecuteMessage()
    {
        return executeMessage;
    }
	public LinkedList<BankAccount> getAllAccount(){
		LinkedList customerAccount = new LinkedList();
		try{
			conn = DBconnection.getMySQLConnection();
			pstm = conn.prepareStatement("SELECT * FROM bank_account");
			rs = pstm.executeQuery();
			while(rs.next()) {
				customerAccount.add(new BankAccount());
			}
			return customerAccount;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public  void printAccountList(LinkedList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

