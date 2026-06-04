package com.dao;

import java.sql.*;

import com.db.DBConnection;
import com.model.Bank;

public class BankDAO {

    public Bank findBank(String ifsc) {

        Bank bank = null;

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(
                    "SELECT * FROM bank_details WHERE ifsc=?");

            ps.setString(1, ifsc);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                bank = new Bank();

                bank.setIfsc(rs.getString("ifsc"));
                bank.setBankName(rs.getString("bank_name"));
                bank.setBranch(rs.getString("branch"));
                bank.setAddress(rs.getString("address"));
                bank.setCity(rs.getString("city"));
                bank.setState(rs.getString("state"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return bank;
    }
}
