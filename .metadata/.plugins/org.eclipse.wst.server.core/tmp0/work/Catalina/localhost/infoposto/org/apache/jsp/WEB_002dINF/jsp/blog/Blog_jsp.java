/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2022-12-07 00:47:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.blog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Blog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/jsp/blog/../menu.jsp", Long.valueOf(1670336678434L));
    _jspx_dependants.put("jar:file:/C:/Users/npalmeira/InfoPosto/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/infoposto/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("jar:file:/C:/Users/npalmeira/InfoPosto/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/infoposto/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1670336678441L));
    _jspx_dependants.put("/WEB-INF/jsp/blog/../footer.jsp", Long.valueOf(1670336678432L));
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/css-blog/home.css\">\r\n");
      out.write("    <title>InfoPosto - Blog</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("     ");
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
      out.write("    <div id=\"area-principal\">\r\n");
      out.write("        <!-- abertura de postagem -->\r\n");
      out.write("        <div class=\"area-postagens\">\r\n");
      out.write("            <div class=\"postagem\">\r\n");
      out.write("                <h2>Gasolina</h2>\r\n");
      out.write("                <span class=\"data-postagem\">postado em 22 de outubro de 2022</span>\r\n");
      out.write("                <img width=\"620px\" src=\"https://s2.glbimg.com/dy4yJcDtgKOkIHGKJwgMZL831xY=/0x0:1284x721/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2022/v/S/BIC9gdTKGg0XCt0gqYIQ/combustivel4.jpg\" alt=\"\">\r\n");
      out.write("                <p>\r\n");
      out.write("                    Preço do etanol tem alta de quase 5% nos postos; litro do diesel também avança, segundo ANP     \r\n");
      out.write("                </p>\r\n");
      out.write("                <a href=\"https://g1.globo.com/economia/noticia/2022/04/26/preco-do-etanol-tem-forte-alta-nos-postos-litro-do-diesel-tambem-avanca-segundo-anp.ghtml\">Leia mais</a>\r\n");
      out.write("            </div> \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"area-postagens\">\r\n");
      out.write("            <div class=\"postagem\">\r\n");
      out.write("                <h2>Preço médio da gasolina sobe após 15 quedas consecutivas, segundo ANP</h2>\r\n");
      out.write("                <span class=\"data-postagem\">postado em 17 de outubro de 2022</span>\r\n");
      out.write("                <img width=\"620px\" src=\"https://s2.glbimg.com/2C3v_mWkDdMc0R7URP50XSUmTcg=/0x0:1170x700/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2022/M/y/2VhohpQGyqlFppY56nBg/posto-de-combustivel-mcajr-abr-1609210451.jpg\" alt=\"\">\r\n");
      out.write("                <p>\r\n");
      out.write("                    Valor médio do litro do combustivel vendido nos postos do país subiu para R$ 4,86 na semana de 9 a 15 de outubro.\r\n");
      out.write("                </p>\r\n");
      out.write("                <a href=\"https://g1.globo.com/economia/noticia/2022/10/17/preco-medio-da-gasolina-sobe-apos-15-quedas-consecutivas-segundo-anp.ghtml\">Leia mais</a>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"area-postagens\">\r\n");
      out.write("            <div class=\"postagem\">\r\n");
      out.write("                <h2>Cerca de 10 postos de gasolina são flagrados com preços abusivos em Porto Velho</h2>\r\n");
      out.write("                <span class=\"data-postagem\">postado em 17 de outubro de 2022</span>\r\n");
      out.write("                <img width=\"620px\" src=\"https://s2.glbimg.com/zFfJ1hhkMSb5Vwc0SWdJBvn0nB0=/0x0:1050x558/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2022/f/k/uMBtA5RxWkIrKVwf9ukw/posto.png\" alt=\"\">\r\n");
      out.write("                <p>\r\n");
      out.write("                    Operaçãoo da Sefin e Procon iniciou no domingo (16). Em alguns postos de gasolina, os preços abusivos tinham um aumento de 10%.\r\n");
      out.write("                </p>\r\n");
      out.write("                <a href=\"https://g1.globo.com/ro/rondonia/noticia/2022/10/17/cerca-de-10-postos-de-gasolina-sao-flagrados-com-precos-abusivos-em-porto-velho.ghtml\">Leia mais</a>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"area-postagens\">\r\n");
      out.write("            <div class=\"postagem\">\r\n");
      out.write("                <h2>Gasolina tem reajuste de preço no estado do Rio de Janeiro</h2>\r\n");
      out.write("                <span class=\"data-postagem\">postado em 17 de outubro de 2022</span>\r\n");
      out.write("                <img width=\"620px\" src=\"https://pubimg.band.uol.com.br/files/bf9414075130ed67095c.webp\" alt=\"\">\r\n");
      out.write("                <p>\r\n");
      out.write("                    O aumento dos combustiveis percebido por moradores do Rio.\r\n");
      out.write("                </p>\r\n");
      out.write("                <a href=\"https://www.band.uol.com.br/bandnews-fm/rio-de-janeiro/noticias/gasolina-tem-reajuste-de-preco-no-estado-do-rio-de-janeiro-16548299\">Leia mais</a>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"area-postagens\">\r\n");
      out.write("            <div class=\"postagem\">\r\n");
      out.write("                <h2>P-71 produzirá até 150 mil barris/dia de petróleo na Bacia de Santos</h2>\r\n");
      out.write("                <span class=\"data-postagem\">postado em 17 de outubro de 2022</span>\r\n");
      out.write("                <img width=\"620px\" src=\"https://www.diariodepernambuco.com.br/static/app/noticia_127983242361/2022/10/17/910269/20221017140147170122u.jpg\" alt=\"\">\r\n");
      out.write("                <p>\r\n");
      out.write("                    A entrada em operação da P-71 está¡ prevista para dezembro deste ano, devendo atingir o pico de produção até o fim de 2023. \r\n");
      out.write("                </p>\r\n");
      out.write("                <a href=\"https://www.diariodepernambuco.com.br/noticia/economia/2022/10/p-71-produzira-ate-150-mil-barris-dia-de-petroleo-na-bacia-de-santos.html\">Leia mais</a>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"rodape\">\r\n");
      out.write("    ");
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
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
