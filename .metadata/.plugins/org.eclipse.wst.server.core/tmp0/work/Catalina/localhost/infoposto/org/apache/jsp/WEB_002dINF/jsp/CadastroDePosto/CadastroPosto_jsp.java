/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2022-12-07 13:14:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.CadastroDePosto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CadastroPosto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/npalmeira/InfoPosto/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/infoposto/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("jar:file:/C:/Users/npalmeira/InfoPosto/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/infoposto/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("/WEB-INF/jsp/CadastroDePosto/../footer.jsp", Long.valueOf(1670336678432L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1670336678441L));
    _jspx_dependants.put("/WEB-INF/jsp/CadastroDePosto/../menu-admin.jsp", Long.valueOf(1670418732278L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;  charset=UTF-8;");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/css-Posto/css/CadastroDePosto.css\">    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/css/bootstrap-select.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("    <title>InfoPosto</title>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/CSS-ListaPosto/CadastroDePosto.css\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <div id=\"area-cabecalho\">\r\n");
      out.write("        <div id=\"area-logo\">\r\n");
      out.write("            <h1 href=\"/infoposto/web?action=HomeAction\">Info<span class=\"branco\">Posto</span></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"area-menu\" style=\"margin-top:-20px;\">\r\n");
      out.write("        	<a href=\"/infoposto/web?action=FrmListaPostos\">Postos </a>\r\n");
      out.write("              ");
 
              String Admin = (String)request.getSession().getAttribute("Admin"); 
                    //Remove '@' 
                    if (Admin == "S") 
                    { 
                
      out.write("\r\n");
      out.write("            <a href=\"/infoposto/web?action=FrmListaFaleConosco\">Mensagens</a> \r\n");
      out.write("            <a href=\"/infoposto/web?action=FrmCadastroDePosto\">Cadastrar posto</a>\r\n");
      out.write("          	<a href=\"/infoposto/web?action=FrmListaUsuarios\">Usuários</a>\r\n");
      out.write("           ");
 } 
                
      out.write("\r\n");
      out.write("               <a href=\"/infoposto/web?action=FrmLogoutAction\">Sair</a>\r\n");
      out.write("<!--             <a href=\"/infoposto/web?action=FrmFaleConosco\">Fale Conosco</a> -->\r\n");
      out.write("			<p style = \"color: white; font-size:15px; text-align: center;\">Bem vindo ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("!</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"form-image\">\r\n");
      out.write("                <img src=\"https://cdn-icons-png.flaticon.com/512/753/753399.png\" alt=\"IMG\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form\">\r\n");
      out.write("            <form method = \"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CadastrarPostoAction\">\r\n");
      out.write("               \r\n");
      out.write("                    <div class=\"form-header\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            <h1 style=\"color: black;font-weight: bold;margin-bottom: -15px;margin-top:25px;\">Cadastre seu Posto!</h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("    \r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <label for=\"nomeposto\">Nome do posto</label>\r\n");
      out.write("                            <input id=\"nomeposto\" type=\"text\" name=\"nomeposto\" placeholder=\"Digite o nome\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <label for=\"NomeDono\">Nome do dono do Posto</label>\r\n");
      out.write("                            <input id=\"nomedono\" type=\"text\" name=\"nomedono\" placeholder=\"Digite seu nome e sobrenome\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <label for=\"Endereço\">Endereço</label>\r\n");
      out.write("                            <input id=\"Endereço\" type=\"text\" name=\"endereco\" placeholder=\"Digite seu endereço\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <label for=\"bairro\">Bairro</label>\r\n");
      out.write("                            <input id=\"bairro\" type=\"text\" name=\"bairro\" placeholder=\"Digite o bairro\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <label for=\"email\">E-mail</label>\r\n");
      out.write("                            <input id=\"email\" type=\"email\" name=\"email\" placeholder=\"Digite seu e-mail\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <label for=\"number\">Telefone</label>\r\n");
      out.write("                            <input id=\"Telefone\" type=\"tel\" name=\"number\" placeholder=\"(xx) xxxx-xxxx\" maxlength=\"10\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <label for=\"cnpj\">CNPJ</label>\r\n");
      out.write("                            <input id=\"cnpj\" type=\"text\" name=\"cnpj\" placeholder=\"Digite seu CNPJ\" maxlength=\"18\" autocomplete=\"off\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-box\">\r\n");
      out.write("                            <label for=\"combustivel\">Valor do combústivel</label>\r\n");
      out.write("                            <input id=\"combustivel\" type=\"text\" name=\"valorcombustivel\" placeholder=\"R$ 5,50\" maxlength=\"4\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("    \r\n");
      out.write("                    </div>\r\n");
      out.write("    \r\n");
      out.write("                    <div class=\"gender-inputs\">\r\n");
      out.write("                        <div class=\"gender-title\">\r\n");
      out.write("                            <h6>Bandeira do posto</h6>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"gender-group\" id=\"bandeira\" disabled>\r\n");
      out.write("                            <select class=\"form-control selectpicker\" name=\"bandeira\">\r\n");
      out.write("                                <option value=\"Ipiranga\">Ipiranga</option>\r\n");
      out.write("                                <option value=\"Shell\">Shell</option>\r\n");
      out.write("                                <option value=\"Petrobras\">Petrobras</option>\r\n");
      out.write("                                <option value=\"Ale\">Ale</option>\r\n");
      out.write("                                <option value=\"Boxter\">Boxter</option>\r\n");
      out.write("                                <option value=\"Rede Graal\">Rede Graal</option>\r\n");
      out.write("                                <option value=\"Sim\">Sim Rede de Postos</option>\r\n");
      out.write("                                <option value=\"Setee\">Setee</option>\r\n");
      out.write("                                <option value=\"Setta\">Setta</option>\r\n");
      out.write("                                <option value=\"larco\">Larco</option>\r\n");
      out.write("                                <option value=\"Outro\">Outro</option>\r\n");
      out.write("                              </select>\r\n");
      out.write("                              <div class=\"gender-title\">\r\n");
      out.write("                                <h6>Serviços</h6>\r\n");
      out.write("                            </div>\r\n");
      out.write("                              <select class=\"form-control selectpicker\" multiple data-live-search=\"true\" name= \"servicos\"> \r\n");
      out.write("                                <option value=\"Mercado\">Mercado</option> \r\n");
      out.write("                                <option value=\"Mecanica\">Mecânica</option> \r\n");
      out.write("                                <option value=\"Autopecas\">Autopeças</option> \r\n");
      out.write("                                <option value=\"Carregador p/ carro eletrico\">Carregador p/ carro eletrico</option> \r\n");
      out.write("                                <option value=\"Estacionamento\">Estacionamento</option> \r\n");
      out.write("                                <option value=\"Lava-rapido\">Lava-rápido</option> \r\n");
      out.write("                            </select>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"container-login100\" style=\"text-align: center; margin-top: 30px;\">\r\n");
      out.write("               			 <button type=\"submit\" style=\"height: 35px;width: 40%; color: black;font-weight: bold;margin-bottom: 25px; background: #00D3AD; border-radius: 10px;\">Cadastrar</button>	\r\n");
      out.write("                	</div>\r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                </form>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write(" \r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"container-footer\">\r\n");
      out.write("            <div class=\"row-footer\">\r\n");
      out.write("                <!-- footer col-->\r\n");
      out.write("            \r\n");
      out.write("                <!--end footer col-->\r\n");
      out.write("                <!-- footer col-->\r\n");
      out.write("                <div class=\"footer-col\">\r\n");
      out.write("                    <h4>Obter ajuda</h4>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"/infoposto/web?action=FrmFaleConosco\">Fale Conosco</a></li>\r\n");
      out.write("                        <li><a href=\"https://precos.petrobras.com.br/\">Entenda a politica de preços da Petrobras</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-col\">\r\n");
      out.write("<!--                     <h4>Envie uma sugestão!</h4> -->\r\n");
      out.write("<!--                     <div class=\"form-sub\"> -->\r\n");
      out.write("<!--                         <form> -->\r\n");
      out.write("<!--                             <input type=\"text\" placeholder=\"Digite aqui sua sugestÃ£o\" required> -->\r\n");
      out.write("<!--                             <button>Enviar</button> -->\r\n");
      out.write("<!--                         </form> -->\r\n");
      out.write("<!--                     </div> -->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"medias-socias\">\r\n");
      out.write("                        <a href=\"https://www.linkedin.com/login/pt\"><img src=\"IMG/img-home/linkedin.png.png\" alt=\"\"> </a>\r\n");
      out.write("                        <a href=\"https://www.facebook.com/\"><img src=\"IMG/img-home/face.png.png\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("	<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/js/bootstrap-select.min.js\"></script>\r\n");
      out.write("</html>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
