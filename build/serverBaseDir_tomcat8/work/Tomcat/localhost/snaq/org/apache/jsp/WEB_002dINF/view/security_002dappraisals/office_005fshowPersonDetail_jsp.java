/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-06-17 17:17:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.security_002dappraisals;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class office_005fshowPersonDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/themes/default/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/themes/icon.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/datagrid-detailview.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\tform div{\r\n");
      out.write("\t\t\tmargin:10px\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tif(parent.$('#da').val() != \"checkTask\"){\r\n");
      out.write("\t\t\tvar rows = parent.$(\"iframe\").get(0).contentWindow.$('#dg').datagrid('getSelections');\r\n");
      out.write("\t\t\tvar personId = rows[0].personId;\r\n");
      out.write("\t\t\tvar monthTime = parent.$('#da').val();\r\n");
      out.write("\t\t\tvar yearTime = parent.$('#selectTime').combobox('getValue');\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tvar personId = parent.$('#personId').val();\r\n");
      out.write("\t\t\tvar monthTime = parent.$('#selectMonth').combobox('getValue');\r\n");
      out.write("\t\t\tvar yearTime = parent.$('#selectYear').combobox('getValue');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar endTime = getLastDay(yearTime,monthTime);\r\n");
      out.write("\t\tif(monthTime < 10){\r\n");
      out.write("\t\t\tmonthTime = \"0\" + monthTime;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tendTime = yearTime + \"-\" + monthTime + \"-\" + endTime;\r\n");
      out.write("\t\tvar beginTime = yearTime + \"-\" + monthTime + \"-01\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//隐患\r\n");
      out.write("\t\tvar standardIndexValue = new Array();\r\n");
      out.write("\t\tvar hazardValue = new Array();\r\n");
      out.write("\t\tvar correctPrincipalValue = new Array();\r\n");
      out.write("\t\tvar inconformityLevelValue = new Array();\r\n");
      out.write("\t\tvar specialityValue = new Array();\r\n");
      out.write("\t\tvar deductPointsValue = new Array();\r\n");
      out.write("\t\tvar machineValue = new Array();\r\n");
      out.write("\t\tvar inconformityItemNatureValue = new Array();\r\n");
      out.write("\t\tvar inconformityItemSnValue = new Array();\r\n");
      out.write("\t\t//不安全行为\r\n");
      out.write("\t\tvar inconformityItemSnValue = new Array();\r\n");
      out.write("\t\tvar specialityValue = new Array();\r\n");
      out.write("\t\tvar unsafeActMarkValue = new Array();\r\n");
      out.write("\t\tvar unsafeActStandardValue = new Array();\r\n");
      out.write("\t\tvar UnsafeActLevelValue = new Array();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t$('#dg').datagrid({\r\n");
      out.write("\t            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/unsafeCondition/query/queryAction_showData.action',\r\n");
      out.write("\t\t\t\tidField: 'id',\r\n");
      out.write("\t\t\t\tqueryParams:{'departmentSn':1,'checkers':personId,'beginTime':beginTime,'endTime':endTime},\r\n");
      out.write("\t            rownumbers: true,\t//显示一个行号列\r\n");
      out.write("\t            fitColumns:true,\t//自动适应列\r\n");
      out.write("\t           \tfit:true,\t\t\t//表格宽高自适应\r\n");
      out.write("\t            nowrap:false,\r\n");
      out.write("\t            striped:true,\t\t//斑马线效果\r\n");
      out.write("\t\t\t\tsingleSelect:true,\t//单行选中\r\n");
      out.write("\t            loadmsg:'请等待...',\t//加载等待时显示\r\n");
      out.write("\t            pagination:true,\t//显示分页组件\r\n");
      out.write("\t            pageNumber:1,\r\n");
      out.write("\t            pageSize:5,\r\n");
      out.write("\t            pageList:[5,10,15,20,25,30],\r\n");
      out.write("\t\t\t\tcolumns:[[\r\n");
      out.write("\t\t\t\t\t\t  {field:'id',hidden:true},\r\n");
      out.write("\t\t\t\t          {field:'checkedDepartmentImplType',title:'贯标单位',width:80,align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'checkedDepartment',title:'被检部门',width:80,align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'checkType',title:'检查类型',width:80,align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'systemAudit',title:'审核类型',width:80,align:'center',hidden:true},\r\n");
      out.write("\t\t\t\t          {field:'checkers',title:'检查人',width:80,align:'left'},\r\n");
      out.write("\t\t\t\t          {field:'checkerFrom',title:'检查人来自',width:100,align:'center',hidden:true},    \r\n");
      out.write("\t\t\t\t          {field:'checkDateTime',title:'检查时间',width:80,align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'checkLocation',title:'检查地点',width:100,align:'center'},    \r\n");
      out.write("\t\t\t\t          {field:'problemDescription',title:'问题描述',width:280,align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'riskLevel',title:'原风险等级',width:90,align:'center'},\r\n");
      out.write("\t\t                  {field:'editor',width:80,title:'录入人'},\r\n");
      out.write("\t\t\t\t          {field:'correctType',title:'整改类型',width:80,align:'center',hidden:true},\r\n");
      out.write("\t\t\t\t          {field:'correctDeadline',title:'整改期限',width:80,align:'center',hidden:true},\r\n");
      out.write("\t\t\t\t          {field:'correctProposal',title:'整改建议',width:150,align:'center',hidden:true},\r\n");
      out.write("\t\t\t\t          {field:'hasCorrectConfirmed',title:'整改确认',width:80,align:'center',hidden:true},\r\n");
      out.write("\t\t\t\t          {field:'hasReviewed',title:'复查',width:60,align:'center',hidden:true},\r\n");
      out.write("\t\t\t\t          {field:'hasCorrectFinished',title:'整改完成',width:80,align:'center',hidden:true},\r\n");
      out.write("\t\t\t\t          {field:'inconformityItemSn',title:'不符合项编号',width:120,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  inconformityItemSnValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  inconformityItemSnValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},    \r\n");
      out.write("\t\t\t\t          {field:'inconformityItemNature',title:'不符合项性质',width:120,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  inconformityItemNatureValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  inconformityItemNatureValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'machine',title:'机',width:100,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  machineValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  machineValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'standardIndex',title:'指标',width:100,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t  \t\tstandardIndexValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstandardIndexValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'deductPoints',title:'扣分',width:100,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  deductPointsValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  deductPointsValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'hazrd',title:'对应的危险源',width:120,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  hazardValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  hazardValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'speciality',title:'所属专业',width:100,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  specialityValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  specialityValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'inconformityLevel',title:'不符合项等级',width:120,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  inconformityLevelValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  inconformityLevelValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'correctPrincipal',title:'整改负责人',width:120,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  correctPrincipalValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  correctPrincipalValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'attachments',title:'附件详情',width:90,align:'center',\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t\t        \t  //console.log(value);\r\n");
      out.write("\t\t\t\t\t  \t\t\t\tif (value!=0){\r\n");
      out.write("\t\t\t\t\t  \t\t\t\t\treturn \"<a href='javascript:;' onclick=showUnsafecondition()>附件[\"+value+\"]</a>\";\r\n");
      out.write("\t\t\t\t\t  \t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t  \t\t\t\t\treturn \"<a href='javascript:;' onclick=showUnsafecondition()>附件[0]</a>\";\r\n");
      out.write("\t\t\t\t\t  \t\t\t\t}\r\n");
      out.write("\t\t\t\t  \t\t\t}}\r\n");
      out.write("\t\t\t\t     ]],\r\n");
      out.write("\t\t\t\t\t onDblClickCell: function(){\r\n");
      out.write("\t\t\t\t\t\t$('#dg').datagrid(\"uncheckAll\");\r\n");
      out.write("\t\t\t\t\t },\r\n");
      out.write("\t\t\t\t\tview: detailview, \r\n");
      out.write("\t\t\t\t\tdetailFormatter: function(rowIndex, row){\r\n");
      out.write("\t\t\t\t\treturn '<table style=\"border:1\"><tr>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\">'+'不符合项编号：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:150px;text-align:center\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + inconformityItemSnValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:90px;text-align:center\">'+'不符合项性质：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:70px;text-align:center\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + inconformityItemNatureValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:90px;text-align:center\">'+'不符合项等级：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:90px;text-align:center\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + inconformityLevelValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:60px;text-align:center\">'+'专业：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:60px;text-align:center\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + specialityValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:90px;text-align:center\">'+'整改负责人：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:60px;text-align:center\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + correctPrincipalValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:60px;text-align:center\">'+'扣分：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:60px;text-align:center\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + deductPointsValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:60px;text-align:center\">'+'机器：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + machineValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'</tr><tr>' +\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\">'+'危险源：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:200px;text-align:center\"colspan=\"13\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + hazardValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t'</tr><tr>' +\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\">'+'指标：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\" colspan=\"13\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + standardIndexValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'</tr></table>'; \r\n");
      out.write("\t\t\t\t\t} \t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#dg2').datagrid({\r\n");
      out.write("\t\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/inconformity/item/unsafeActAction_showData.action',\r\n");
      out.write("\t\t\t\tidField: 'id',\r\n");
      out.write("\t\t\t\tqueryParams:{'checkers':personId,'beginTime':beginTime,'endTime':endTime},\r\n");
      out.write("\t            rownumbers: true,\t//显示一个行号列\r\n");
      out.write("\t            fitColumns:true,\t//自动适应列\r\n");
      out.write("\t           \tfit:true,\t\t\t//表格宽高自适应\r\n");
      out.write("\t            nowrap:false,\r\n");
      out.write("\t            striped:true,\t\t//斑马线效果\r\n");
      out.write("\t\t\t\tsingleSelect:true,\t//单行选中\r\n");
      out.write("\t            loadmsg:'请等待...',\t//加载等待时显示\r\n");
      out.write("\t            pagination:true,\t//显示分页组件\r\n");
      out.write("\t            pageNumber:1,\r\n");
      out.write("\t            pageSize:5,\r\n");
      out.write("\t            pageList:[5,10,15,20,25,30],\r\n");
      out.write("\t\t\t\tcolumns:[[\r\n");
      out.write("\t\t\t\t\t\t  {field:'id',hidden:true},\r\n");
      out.write("\t\t\t\t          {field:'checkedDepartmentImplType',title:'贯标单位',width:80,align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'checkedDepartment',title:'被检部门',width:80,align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'violator',title:'不安全<br />行为人员',width:50,align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'actDescription',title:'行为描述',width:200,align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'checkType',title:'检查类型',width:50,align:'center'},\r\n");
      out.write("\t\t                  {field:'systemAudit',title:'审核类型',width:50,align:'center',hidden:true},\r\n");
      out.write("\t\t                  {field:'editor',width:50,title:'录入人',align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'checkers',title:'检查成员',width:70,align:'center'},        \r\n");
      out.write("\t\t\t\t          {field:'checkerFrom',title:'检查人来自',width:80,align:'center'},    \r\n");
      out.write("\t\t\t\t          {field:'checkDateTime',title:'检查时间',width:50,align:'center'},    \r\n");
      out.write("\t\t\t\t          {field:'checkLocation',title:'检查地点',width:70,align:'center'},\r\n");
      out.write("\t\t\t\t          {field:'inconformityItemSn',width:100,title:'不符合项编号',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  inconformityItemSnValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  inconformityItemSnValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'speciality',title:'所属专业',width:120,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  specialityValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  specialityValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'unsafeActMark',title:'不安全行为痕迹',width:120,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  unsafeActMarkValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  unsafeActMarkValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'unsafeActStandard',title:'不安全行为标准',width:120,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  unsafeActStandardValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  unsafeActStandardValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'UnsafeActLevel',title:'不安全行为等级',width:120,align:'center',hidden:true,\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t        \t\t  if(value!=null && value!=\"\"){\r\n");
      out.write("\t\t\t\t        \t\t\t  UnsafeActLevelValue[index]=value;\r\n");
      out.write("\t\t\t\t        \t\t  }else{\r\n");
      out.write("\t\t\t\t        \t\t\t  UnsafeActLevelValue[index]=\"无\";\r\n");
      out.write("\t\t\t\t        \t\t  }\r\n");
      out.write("\t\t\t\t  \t\t  }},\r\n");
      out.write("\t\t\t\t          {field:'attachments',title:'附件详情',width:50,align:'center',\r\n");
      out.write("\t\t\t\t        \t  formatter: function(value,row,index){\r\n");
      out.write("\t\t\t\t\t  \t\t\t\tif (value!=0){\r\n");
      out.write("\t\t\t\t\t  \t\t\t\t\treturn \"<a href='javascript:;' onclick=showUnsafeAct()>附件[\"+value+\"]</a>\";\r\n");
      out.write("\t\t\t\t\t  \t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t  \t\t\t\t\treturn \"<a href='javascript:;' onclick=showUnsafeAct()>附件[0]</a>\";\r\n");
      out.write("\t\t\t\t\t  \t\t\t\t}\r\n");
      out.write("\t\t\t\t  \t\t  }}\r\n");
      out.write("\t\t\t\t     ]],\r\n");
      out.write("\t\t\t\t\t onDblClickCell: function(){\r\n");
      out.write("\t\t\t\t\t\t$('#dg').datagrid(\"uncheckAll\");\r\n");
      out.write("\t\t\t\t\t },\r\n");
      out.write("\t\t\t\t\tview: detailview, \r\n");
      out.write("\t\t\t\t\tdetailFormatter: function(rowIndex, row){\r\n");
      out.write("\t\t\t\t\treturn '<table style=\"border:1\"><tr>' + \t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\">'+'不符合项编号：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:140px;text-align:center\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + inconformityItemSnValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\">'+'不安全行为等级：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:140px;text-align:center\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + UnsafeActLevelValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\">'+'专业：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\" >' + \r\n");
      out.write("\t\t\t\t\t'<p>' + specialityValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\">'+'痕迹：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + unsafeActMarkValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'</tr><tr>' +\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t'<td style=\"width:100px;text-align:center\">'+'标准：' + '</td>' + \r\n");
      out.write("\t\t\t\t\t'<td style=\"width:380px;text-align:center\" colspan=\"7\">' + \r\n");
      out.write("\t\t\t\t\t'<p>' + unsafeActStandardValue[rowIndex] + '</p>' + \r\n");
      out.write("\t\t\t\t\t'</td>' +\r\n");
      out.write("\t\t\t\t\t'</tr></table>'; \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t <!--展示不安全行为详情-附件-->\r\n");
      out.write("        function showUnsafeAct(){\r\n");
      out.write("        \t$('#win').window({\r\n");
      out.write("\t\t\t\ttitle:\"附件详情\",\r\n");
      out.write("\t\t\t\twidth:400,\r\n");
      out.write("\t\t\t\theight:300,\r\n");
      out.write("\t\t\t\tcontent:'<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/inconformity/item/query/inconformity-query/unsafeact_show\" frameborder=\"0\" width=\"100%\" height=\"100%\" />'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("        };\r\n");
      out.write("        <!--展示隐患详情-附件-->\r\n");
      out.write("        function showUnsafecondition(){\r\n");
      out.write("        \t$('#win').window({\r\n");
      out.write("\t\t\t\ttitle:\"附件详情\",\r\n");
      out.write("\t\t\t\twidth:400,\r\n");
      out.write("\t\t\t\theight:300,\r\n");
      out.write("\t\t\t\tcontent:'<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/inconformity/item/query/inconformity-query/unsafeact_show\" frameborder=\"0\" width=\"100%\" height=\"100%\" />'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("        };\r\n");
      out.write("        function getLastDay(year,month){          \r\n");
      out.write("        \tvar new_year = year;    //取当前的年份           \r\n");
      out.write("        \tvar new_month = month++;//取下一个月的第一天，方便计算（最后一天不固定）           \r\n");
      out.write("        \tif(month>12)            //如果当前大于12月，则年份转到下一年           \r\n");
      out.write("        \t\t{          \r\n");
      out.write("         \t\t\tnew_month -=12;        //月份减           \r\n");
      out.write("         \t\t\tnew_year++;            //年份增           \r\n");
      out.write("         \t\t}          \r\n");
      out.write("         \tvar new_date = new Date(new_year,new_month,1);                //取当年当月中的第一天           \r\n");
      out.write("         \tvar date_count =   (new Date(new_date.getTime()-1000*60*60*24)).getDate();//获取当月的天数         \r\n");
      out.write("         \tvar last_date =   new Date(new_date.getTime()-1000*60*60*24);//获得当月最后一天的日期  \r\n");
      out.write("        \treturn date_count;\r\n");
      out.write("        } \r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"tt\" class=\"easyui-tabs\" data-options=\"fit:true\">   \r\n");
      out.write("    \t<div title=\"隐患\"  style=\"padding:1px;display:none;\">   \r\n");
      out.write("        \t<table id=\"dg\"></table>   \r\n");
      out.write("   \t\t</div>   \r\n");
      out.write("    \t <div title=\"不安全行为\" style=\"padding:1px;display:none;\"> \r\n");
      out.write("    \t\t<table id=\"dg2\"></table>\r\n");
      out.write("    \t</div>  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"win\" data-options=\"collapsible:false,minimizable:false,maximizable:false,modal:true\"></div>\r\n");
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
