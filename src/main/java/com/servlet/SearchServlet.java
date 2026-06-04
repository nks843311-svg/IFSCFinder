package com.servlet;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.BankDAO;
import com.model.Bank;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String ifsc =
                request.getParameter("ifsc");

        BankDAO dao = new BankDAO();

        Bank bank =
                dao.findBank(ifsc);

        request.setAttribute("bank", bank);

        RequestDispatcher rd =
                request.getRequestDispatcher("result.jsp");

        rd.forward(request, response);
    }
}
