/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-21 16:38:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.certificate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class input_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>事故录入</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/themes/icon.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.easyui.mobile.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/easyloader.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("//ajax发送请求session--导入\r\n");
      out.write("function getSession(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/hazard/manageObjectAction_findSession.action',\r\n");
      out.write("\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t$('#p').progressbar('setValue',data);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t},\"json\");\r\n");
      out.write("};\r\n");
      out.write("<!--确认导入-->\r\n");
      out.write("function importcer(){\r\n");
      out.write("\tvar ex=$('#excel').filebox('getValue');\r\n");
      out.write("\tif(ex!=\"\"){\r\n");
      out.write("\t\t var d1=/\\.[^\\.]+$/.exec(ex);   \r\n");
      out.write("\t    if(d1==\".xlsx\"){\r\n");
      out.write("\t\t //进度条显示\r\n");
      out.write("\t\t  $('#p').progressbar('setValue',0);\r\n");
      out.write("\t\t  $('#winPro').window('open');\r\n");
      out.write("\t\t  var timer = setInterval(getSession,500);\r\n");
      out.write("\t\t$('#form').form('submit',{\r\n");
      out.write("\t\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/certificate/import\",\r\n");
      out.write("\t\t\tsuccess: function(pag){\r\n");
      out.write("\t\t\t\t\t//var a=eval(pag);\r\n");
      out.write("\t\t\t\t\t$('#p').progressbar('setValue','100');\r\n");
      out.write("\t\t\t\t\tclearInterval(timer);\r\n");
      out.write("\t\t\t\t\t$('#winPro').window('close');\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$('#winImport').window('close');\r\n");
      out.write("\t\t\t\t\t$.messager.alert('提示',pag.substring(1,pag.length-1));\r\n");
      out.write("\t\t\t\t\t$('#dg').datagrid('reload');\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t    }    \r\n");
      out.write("\t    else{\r\n");
      out.write("\t    \t $.messager.alert('提示','请选择.xlsx文件！');\r\n");
      out.write("\t    \t $('#excel').filebox('setValue','');\r\n");
      out.write("\t     }\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$.messager.alert('提示','请选择文件！');\r\n");
      out.write("\t}\r\n");
      out.write("};\r\n");
      out.write("var str=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['permissions']}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("$(function() {\r\n");
      out.write("\t<!--数据网络-->\r\n");
      out.write("\t$('#dg').datagrid({\r\n");
      out.write("\t\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/certificate/showCertificate\",\r\n");
      out.write("\t\t\t\t\t\trownumbers : true,\r\n");
      out.write("\t\t\t\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\t\t\t\tfit:true,\r\n");
      out.write("\t\t\t\t\t\tpageNumber : 1,\r\n");
      out.write("\t\t\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\t\t\tpageSize : 100,\r\n");
      out.write("\t\t\t\t\t\t//singleSelect : true,\r\n");
      out.write("\t\t\t\t\t\tpageList : [ 100, 150, 200, 250 ],\r\n");
      out.write("\t\t\t\t\t\ttoolbar : [\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid:'importtool',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ticonCls : 'icon-import',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext : '证件导入',\r\n");
      out.write("\t\t\t\t\t\t\t\t\thandler: function()\r\n");
      out.write("\t\t\t\t\t  \t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(str.indexOf(\"170104\")==-1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#importtool\").css('display','none');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t  \t\t\t\t\t$('#winImport').window('open');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t  \t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext : '增加',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid:'addtool',\r\n");
      out.write("\t\t\t\t\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(str.indexOf(\"170101\")==-1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#addtool\").css('display','none');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t\t$('#addbtn').show();\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t\t$('#editbtn').hide(); \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#form0').form('reset');\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t\t$('#win').window('open');\t \r\n");
      out.write("\t\t\t\t\t\t\t    \t\t\t$('#form0').form('disableValidation');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\ticonCls : 'icon-edit',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext : '修改',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid:'edittool',\r\n");
      out.write("\t\t\t\t\t\t\t\t\thandler : function() {\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(str.indexOf(\"170102\")==-1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#edittool\").css('display','none');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t//数据回显\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t\tvar rows=$(\"#dg\").datagrid(\"getSelections\");\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t\tif (rows.length>0){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#editbtn').show();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#addbtn').hide();\t\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t$('#win').window('open'); \r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t$('#form0').form('disableValidation'); \r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t//对表单数据进行填充\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t$('#form0').form('load',{\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t\tid:rows[0].id,\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t\tissuedBy:rows[0].issuedBy,\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t\tissuedDate:rows[0].issuedDate,\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t\tvalidStartDate:rows[0].validStartDate,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    \t\t\t\tvalidEndDate:rows[0].validEndDate,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    \t\t\t\tcertificationSn:rows[0].certificationSn\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t$('#holder').combogrid('setValue',rows[0].holderSn);\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t$('#certificationType').combogrid('setValue',rows[0].certificationTypeSn);\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttitle:'消息提示',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmsg:'请先选择您要编辑的行！',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tshowType:'null',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttop:'50'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\ticonCls : 'icon-remove',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext : '删除',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid:'deletetool',\r\n");
      out.write("\t\t\t\t\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(str.indexOf(\"170103\")==-1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#deletetool\").css('display','none');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar row = $('#dg').datagrid('getChecked');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar ids = \"\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfor( var i in row ){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tids = ids + row[i].id + \",\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tids = ids.substring(0, ids.length - 1);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(ids);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (row) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$.messager.confirm('选择是否删除','您确定要删除该证件吗?',function(fn) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif(fn){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/certificate/deleteCertificate',{ids:ids},function(message){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.messager.alert('提示',message); \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('#dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$.messager.alert('提示','请先选择要删除的行');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t} ],\r\n");
      out.write("\t\t\t\t\t\tcolumns : [ [\r\n");
      out.write("\t\t\t            {\tfield:'xyz',\r\n");
      out.write("\t\t\t            \tcheckbox:true\r\n");
      out.write("\t\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\t\t\t\thidden:true   \r\n");
      out.write("\t\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\tfield : 'holderSn',\r\n");
      out.write("\t\t\t\t\t\t\thidden:true \r\n");
      out.write("\t\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\t\tfield : 'certificationTypeSn',\r\n");
      out.write("\t\t\t\t\t\t\thidden:true \r\n");
      out.write("\t\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\t\tfield : 'certificationTypeName',\r\n");
      out.write("\t\t\t\t\t\t\ttitle : '证件名称',\r\n");
      out.write("\t\t\t\t\t\t\twidth : 150\r\n");
      out.write("\t\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\t\tfield : 'certificationSn',\r\n");
      out.write("\t\t\t\t\t\t\ttitle : '证件编号',\r\n");
      out.write("\t\t\t\t\t\t\twidth : 150\r\n");
      out.write("\t\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\t\tfield : 'issuedBy',\r\n");
      out.write("\t\t\t\t\t\t\ttitle : '发证单位',\r\n");
      out.write("\t\t\t\t\t\t\twidth : 150\r\n");
      out.write("\t\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\t\tfield : 'holderName',\r\n");
      out.write("\t\t\t\t\t\t\ttitle : '持有人',\r\n");
      out.write("\t\t\t\t\t\t\twidth : 60\r\n");
      out.write("\t\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\t\tfield : 'issuedDate',\r\n");
      out.write("\t\t\t\t\t\t\ttitle : '发证日期',\r\n");
      out.write("\t\t\t\t\t\t\twidth : 70\r\n");
      out.write("\t\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\t\tfield : 'validStartDate',\r\n");
      out.write("\t\t\t\t\t\t\ttitle : '开始日期',\r\n");
      out.write("\t\t\t\t\t\t\twidth : 70\r\n");
      out.write("\t\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\t\tfield : 'validEndDate',\r\n");
      out.write("\t\t\t\t\t\t\ttitle : '到期日期',\r\n");
      out.write("\t\t\t\t\t\t\twidth : 70\r\n");
      out.write("\t\t\t\t\t\t} ] ]\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t$('#addbtn').bind('click', function(){    \r\n");
      out.write("\t\t$('#form0').form('enableValidation');\r\n");
      out.write("\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/person/exists\",{personId:$('#holder').combobox('getValue')},function(text, status){if(text.exists){\r\n");
      out.write("\t\t\t$('#form0').form('submit', {\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/certificate/addCertificate\",\r\n");
      out.write("\t\t\t\tsuccess: function(message){\r\n");
      out.write("\t\t\t\t\t$.messager.alert('提示',message); \r\n");
      out.write("\t\t\t\t\t$('#dg').datagrid('reload'); \r\n");
      out.write("\t    \t\t\t$('#win').window('close');\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("    \t }else{\r\n");
      out.write("    \t\t $.messager.alert('警告','必须选择持证人！');    \r\n");
      out.write("      }},'json');\r\n");
      out.write("    });\r\n");
      out.write("\t$('#editbtn').bind('click', function(){    \r\n");
      out.write("\t\t$('#form0').form('enableValidation');\r\n");
      out.write("\t\t$('#form0').form('submit', {\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/certificate/updateCertificate\",\r\n");
      out.write("\t\t\tsuccess: function(message){\r\n");
      out.write("\t\t\t\t$.messager.alert('提示',message); \r\n");
      out.write("\t\t\t\t$('#dg').datagrid('reload');\t \r\n");
      out.write("    \t\t\t$('#win').window('close');\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}) ; \r\n");
      out.write("    });\r\n");
      out.write("\t//证件类型\r\n");
      out.write("\t$('#certificationType').combogrid({\t\t\r\n");
      out.write("\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/certificate/showCType',\r\n");
      out.write("\t  \tpanelWidth:170,    \r\n");
      out.write("\t\tprompt : '请选择证件类型',    \t     \r\n");
      out.write("\t    idField:'certificationTypeSn',    \r\n");
      out.write("\t    textField:'certificationTypeName',  \r\n");
      out.write("        delay:200,\r\n");
      out.write("        mode:\"remote\",\r\n");
      out.write("\t    columns:[[    \r\n");
      out.write("\t        {field:'certificationTypeSn',title:'类型编号',width:60},    \r\n");
      out.write("\t        {field:'certificationTypeName',title:'类型名称',width:100} \r\n");
      out.write("\t    ]] \r\n");
      out.write("\t});\r\n");
      out.write("\t$('#holder').combogrid({\t\t\r\n");
      out.write("\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/certificate/personsCertificate',\r\n");
      out.write("\t  \tpanelWidth:170,    \r\n");
      out.write("\t\tprompt : '请搜索持有人',    \t     \r\n");
      out.write("\t    idField:'personId',    \r\n");
      out.write("\t    textField:'personName',  \r\n");
      out.write("        delay:200,\r\n");
      out.write("        mode:\"remote\",\r\n");
      out.write("\t    columns:[[    \r\n");
      out.write("\t        {field:'personId',title:'人员编号',width:60},    \r\n");
      out.write("\t        {field:'personName',title:'人员姓名',width:100} \r\n");
      out.write("\t    ]] \r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tif(str.indexOf(\"170101\")==-1){\r\n");
      out.write("\t\t$(\"#addtool\").css('display','none');\r\n");
      out.write("\t}\r\n");
      out.write("\tif(str.indexOf(\"170102\")==-1){\r\n");
      out.write("\t\t$(\"#edittool\").css('display','none');\r\n");
      out.write("\t}\r\n");
      out.write("\tif(str.indexOf(\"170103\")==-1){\r\n");
      out.write("\t\t$(\"#deletetool\").css('display','none');\r\n");
      out.write("\t}\r\n");
      out.write("\tif(str.indexOf(\"170104\")==-1){\r\n");
      out.write("\t\t$(\"#importtool\").css('display','none');\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$('#importtool').linkbutton({\r\n");
      out.write("\t\tplain:false\r\n");
      out.write("\t});\r\n");
      out.write("\t$('#addtool').linkbutton({\r\n");
      out.write("\t\tplain:false\r\n");
      out.write("\t});\r\n");
      out.write("\t$('#edittool').linkbutton({\r\n");
      out.write("\t\tplain:false\r\n");
      out.write("\t});\r\n");
      out.write("\t$('#deletetool').linkbutton({\r\n");
      out.write("\t\tplain:false\r\n");
      out.write("\t});\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 未遂事件数据列表 -->\r\n");
      out.write("\t<table id=\"dg\"></table>\r\n");
      out.write("\t<!-- 事故填写窗口-->\r\n");
      out.write("\t<div id=\"win\" class=\"easyui-window\" title=\"填写证件信息\" closed=\"true\" style=\"width: 360px; height: 360px; padding: 5px;\">\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<form id=\"form0\" method=\"post\">\r\n");
      out.write("\t\t\t<div style=\"margin-left: 30px;\">\r\n");
      out.write("\t\t\t\t<div style=\"diapaly: inline\">\t\t\t\t\r\n");
      out.write("\t\t\t\t\t <input name=\"id\" hidden/>\r\n");
      out.write("\t\t\t\t\t <label style=\"padding-right: 25px\">证件编号：</label>\r\n");
      out.write("\t\t\t\t\t <input class=\"easyui-textbox\" required=\"true\" style=\"height: 25px\" name=\"certificationSn\"> \t\r\n");
      out.write("\t\t\t\t\t <br/><br/>\t\r\n");
      out.write("\t\t\t\t\t <label style=\"padding-right: 25px\">证件类型：</label>\r\n");
      out.write("\t\t\t\t\t <input id=\"certificationType\" required=\"true\" data-options=\"editable:false\"  style=\"height: 25px\" name=\"certificationTypeSn\"> \t\r\n");
      out.write("\t\t\t\t\t <br/><br/>\t\r\n");
      out.write("\t\t\t\t\t <label style=\"padding-right: 38px\">持有人：</label>\r\n");
      out.write("\t\t\t\t\t <input id=\"holder\" class=\"easyui-validatebox\" style=\"height: 25px\" name=\"holderSn\"> \t\r\n");
      out.write("\t\t\t\t\t <br/> <br/>\t\t\t\t\t\t\t \t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t <label style=\"padding-right: 25px\">发证时间：</label> \r\n");
      out.write("\t\t\t\t\t <input name=\"issuedDate\" required=\"true\" data-options=\"editable:false\" style=\"height: 25px\" class=\"easyui-datebox\"/> \r\n");
      out.write("\t\t\t\t\t <br/> <br/>\t\r\n");
      out.write("\t\t\t\t\t <label style=\"padding-right: 25px\">开始时间：</label> \r\n");
      out.write("\t\t\t\t\t <input name=\"validStartDate\" required=\"true\" data-options=\"editable:false\" style=\"height: 25px\" class=\"easyui-datebox\"/> \r\n");
      out.write("\t\t\t\t\t <br/> <br/>\r\n");
      out.write("\t\t\t\t\t <label style=\"padding-right: 25px\">到期时间：</label> \r\n");
      out.write("\t\t\t\t\t <input name=\"validEndDate\" required=\"true\" data-options=\"editable:false\"  style=\"height: 25px\" class=\"easyui-datebox\"/> \r\n");
      out.write("\t\t\t\t\t <br/> <br/>\t\r\n");
      out.write("\t\t\t\t\t <label style=\"padding-right: 25px\">发证单位：</label>\r\n");
      out.write("\t\t\t\t\t <input name=\"issuedBy\" required=\"true\" style=\"height: 25px\" class=\"easyui-textbox\"/> \r\n");
      out.write("\t\t\t\t</div><br />\r\n");
      out.write("\t\t\t\t<div id=\"dlg-buttons\" style=\"text-align:center\">\r\n");
      out.write("\t\t\t\t\t<a id=\"addbtn\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" >确认添加</a>\r\n");
      out.write("\t\t\t\t\t<a id=\"editbtn\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\">确认修改</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 导入窗口 -->\r\n");
      out.write("\t<div id=\"winImport\" class=\"easyui-window\" title=\"导入窗口\" closed=\"true\" style=\"width:210px;height:180px;padding:5px;\">\r\n");
      out.write("\t\t<form id=\"form\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t<input id=\"excel\" data-options=\"buttonText:'选择文件'\" class=\"easyui-filebox\" name=\"excel\"/>\r\n");
      out.write("\t\t\t\t<br/><br/><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/certificate/import/download\" class=\"easyui-linkbutton\" iconCls=\"icon-download\">下载模板</a>\r\n");
      out.write("\t\t\t\t<br/><br/><a class=\"easyui-linkbutton\" iconCls=\"icon-import\" onclick=\"importcer()\">导入证件</a>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 进度条窗口 -->\r\n");
      out.write("\t<div id=\"winPro\" class=\"easyui-window\" closed=true title=\"操作中,请等待...\" style=\"width:400px;height:100px\"   \r\n");
      out.write("\t        data-options=\"collapsible:false,minimizable:false,maximizable:false,modal:true\">   \r\n");
      out.write("\t      <div id=\"p\" class=\"easyui-progressbar\" style=\"width:300px;margin-top:20px;margin-left:50px\"></div>\r\n");
      out.write("\t</div>\r\n");
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
