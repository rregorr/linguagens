package com.example.oraclewebapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/chamados")
public class ChamadosServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Lista de Chamados</h1>");
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM SA_TRE.chamados_full";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String ref = rs.getString("REF");
                String tipoChamado = rs.getString("TIPO_CHAMADO");
                String status = rs.getString("STATUS");

                out.println("<p>REF: " + ref + ", TIPO: " + tipoChamado + ", STATUS: " + status + "</p>");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        out.println("</body></html>");
    }
}
