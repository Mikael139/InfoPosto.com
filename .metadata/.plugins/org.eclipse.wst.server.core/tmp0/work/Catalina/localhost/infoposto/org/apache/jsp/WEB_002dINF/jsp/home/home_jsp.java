/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2022-12-06 14:31:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/jsp/home/../menu.jsp", Long.valueOf(1670336678434L));
    _jspx_dependants.put("jar:file:/C:/Users/npalmeira/InfoPosto/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/infoposto/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("/WEB-INF/jsp/home/../footer.jsp", Long.valueOf(1670336678432L));
    _jspx_dependants.put("jar:file:/C:/Users/npalmeira/InfoPosto/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/infoposto/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1670336678441L));
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-BR\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/css-home/home.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/css-home/slick.css\" />\r\n");
      out.write("    <title>InfoPosto</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("	<link rel=\"icon\" type=\"image/png\" href=\"IMG/images/icons/favicon.ico\"/>\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/css-formulariocadastro/vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/css-formulariocadastro/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/css-formulariocadastro/vendor/animate/animate.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/css-formulariocadastro/vendor/select2/select2.min.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/css-formulariocadastro/css/util.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/css-formulariocadastro/css/main.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<div id=\"area-cabecalho\">\r\n");
      out.write("        <div id=\"area-logo\">\r\n");
      out.write("            <h1 href=\"/infoposto/web?action=HomeAction\">Info<span class=\"branco\">Posto</span></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"area-menu\">\r\n");
      out.write("            <a href=\"/infoposto/web?action=HomeAction\">Home</a>\r\n");
      out.write("            <a href=\"/infoposto/web?action=FrmBlogAction\">Blog</a>\r\n");
      out.write("            <a href=\"/infoposto/web?action=FrmFaleConosco\">Fale Conosco</a>\r\n");
      out.write("            <a href=\"/infoposto/web?action=FrmLoginAction\" style =\"float:right\">Login</a>\r\n");
      out.write("            <img src =\"IMG/user.png\"style=\"float:right;width:2vw\">\r\n");
      out.write("             \r\n");
      out.write("        </div>\r\n");
      out.write("</div>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-100\">\r\n");
      out.write("        <div class=\"slider-principal\">\r\n");
      out.write("            <!--<img src=\"./img/imagem-principal1.jpg\" />\r\n");
      out.write("            <img src=\"./img/imagem-principal2.jpg\" /> -->\r\n");
      out.write("            <img style=\"max-width:100%\"src=\"IMG/img-home/posto_home2.jpg\" />\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <main>\r\n");
      out.write("    <div class=\"col-100\">\r\n");
      out.write("        <div class=\"content texto-destaque\">\r\n");
      out.write("\r\n");
      out.write("            <main>\r\n");
      out.write("                <ul class=\"produtos\">\r\n");
      out.write("                    <li style=\"height:30vw\">\r\n");
      out.write("                        <h2>Noticias</h2>\r\n");
      out.write("                        <img src=\"https://cdn-icons-png.flaticon.com/512/2495/2495007.png\" height=\"220px\">\r\n");
      out.write("                        <p class=\"produto-descricao\"><b>Noticias Diarias</b></p>\r\n");
      out.write("                        <p class=\"produto-descricao1\">Aqui no InfoPosto você fica por dentro de tudo o que acontece no mercado de petroleo, desde a cotação do barril de petroleo, Noticias em gerais que possam te impactar no seu dia a dia.</p>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30vw\">\r\n");
      out.write("                        <h2>Faça Parte!</h2>\r\n");
      out.write("                        <img src=\"https://cdn-icons-png.flaticon.com/512/1006/1006657.png\" height=\"220px\">\r\n");
      out.write("                        <p class=\"produto-descricao1\"><b>Cadastre seu Posto</b></p>\r\n");
      out.write("                        <p class=\"produto-preco\">Tem um posto de gasolina ou conhece alguém que possua? Cadastre e venha fazer parte da equipe de postos do InfoPosto.</p>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </main>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"mapa\">\r\n");
      out.write("				<h2 class=\"titulo-principal\">Nossos Parceiros</h2>\r\n");
      out.write("				<p class=\"texto-mapa\">Diversos postos proximo a você!</p>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"mapa-conteudo\">\r\n");
      out.write("				<iframe src=\"https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d117075.80907475454!2d-46.952562912089455!3d-23.51022771514106!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1spostos%20de%20gasolina%20em%20barueri!5e0!3m2!1spt-BR!2sbr!4v1650071393908!5m2!1spt-BR!2sbr\" width=\"100%\" height=\"300\" frameborder=\"0\" style=\"border: 2px;\" allowfullscreen=\"\"></iframe>\r\n");
      out.write("		\r\n");
      out.write("        </section>\r\n");
      out.write("    </main>\r\n");
      out.write("        <section class=\"mapa\">\r\n");
      out.write("        <h3 class=\"titulo-principal\">.</h3>\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
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
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/jquery.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/jquery-migrate.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/slick.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
