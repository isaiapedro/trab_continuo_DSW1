<%@ page import="br.ufscar.dc.dsw.User" %>
<%
String nomeLogin = request.getParameter("usuario");
String senha = request.getParameter("senha");
if(senha.equals(nomeLogin)) {
    User usuario = new User();
    usuario.setNome("Steve Jobs");
    usuario.setNomeLogin(nomeLogin);
    usuario.setSenha(senha);
    session.setAttribute("usuarioLogado", usuario);
%>
<jsp:forward page="principal.jsp" />
<% }
else { %>
<jsp:forward page="index.jsp" />
<% } %>
