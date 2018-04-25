<%@ page import="java.security.MessageDigest" %>
<%@ page import="java.security.NoSuchAlgorithmException" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>

<rapid:override name="title">
    - 评论列表
</rapid:override>
<rapid:override name="header-style">
    <style>
        /*覆盖 layui*/
        .layui-table {
            margin-top: 0;
        }

    </style>
</rapid:override>

<rapid:override name="content">
    <blockquote class="layui-elem-quote">
        <span class="layui-breadcrumb" lay-separator="/">
              <a href="/admin">首页</a>
              <a><cite>评论列表</cite></a>
        </span>
    </blockquote>
    <div class="layui-tab layui-tab-card">
        <ul class="layui-tab-title">
            <li class="layui-this">全部评论(${commentListVoList.size()})</li>
            <li>待审评论(${hiddenCommentListVoList.size()})</li>
        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show" style="margin-bottom: -10px">
                <table class="layui-table" lay-even lay-skin="nob">
                    <colgroup>
                        <col width="100">
                        <col width="300">
                        <col width=200">
                        <col width="150">
                        <col width="50">
                    </colgroup>
                    <thead>
                    <tr>
                        <th>作者</th>
                        <th>评论内容</th>
                        <th>回复至</th>
                        <th>提交于</th>
                        <th>ID</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${commentListVoList}" var="c">
                        <tr>
                            <td>
                                <img src="https://github.com/SSSS1233/myblog/blob/master/a.jpg?raw=true" alt=""
                                     width="64px">
                                <strong>${c.comment_author_name}</strong>
                                <c:if test="${c.comment_status==0}">
                                    <span class="approve">[待审]</span>
                                </c:if>
                                <br>
                                    ${c.comment_author_url} <br>
                                    ${c.comment_author_email} <br>
                                    ${c.comment_ip}
                            </td>
                            <td class="dashboard-comment-wrap">
                                <c:if test="${c.comment_pid!=0}">
                                    <span class="at">@ </span><a href="${c.comment_author_url}">${c.comment_pname}</a>
                                </c:if>
                                    ${c.comment_content}
                                <div class="row-actions">
                                     <span class="">
                                           <c:choose>
                                               <c:when test="${c.comment_status==0}">
                                                   <a href="javascript:void(0)" style="color:#5FB878;!important;"
                                                      onclick="approveComment(${c.comment_id})">批准</a>
                                               </c:when>
                                               <c:otherwise>
                                                   <a href="javascript:void(0)" style="color:#FF5722;!important;"
                                                      onclick="hideComment(${c.comment_id})">屏蔽</a>
                                               </c:otherwise>
                                           </c:choose>
                                     </span> |
                                    <span class="">
                                        <a href="/admin/comment/reply/${c.comment_id}">
                                            回复
                                        </a>
                                     </span>
                                    <span class=""> |
                                        <a href="/admin/comment/edit/${c.comment_id}">编辑</a>
                                     </span>
                                    <span class=""> |
                                        <a href="javascript:void(0)" onclick="deleteComment(${c.comment_id})">删除</a>
                                     </span>
                                </div>
                            </td>
                            <td>
                                <a href="/article/${c.comment_id}"
                                   target="_blank">${c.articles.article_title}</a>
                            </td>
                            <td>
                                <fmt:formatDate value="${c.comment_create_time}" pattern="yyyy年MM月dd日 HH:dd:ss"/>
                            </td>
                            <td>
                                    ${c.comment_id}
                            </td>

                        </tr>
                    </c:forEach>
                    </tbody>

                </table>

               <%-- <div id="nav" style="">
                    <c:if test="${commentListVoList[0].page.totalPageCount >1}">
                        &lt;%&ndash;分页 start&ndash;%&gt;
                        <nav class="navigation pagination" role="navigation">
                            <div class="nav-links">
                                <c:choose>
                                    <c:when test="${commentListVoList[0].page.totalPageCount <= 3 }">
                                        <c:set var="begin" value="1"/>
                                        <c:set var="end" value="${commentListVoList[0].page.totalPageCount }"/>
                                    </c:when>
                                    <c:otherwise>
                                        <c:set var="begin" value="${commentListVoList[0].page.pageNow-1 }"/>
                                        <c:set var="end" value="${commentListVoList[0].page.pageNow + 2}"/>
                                        <c:if test="${begin < 2 }">
                                            <c:set var="begin" value="1"/>
                                            <c:set var="end" value="3"/>
                                        </c:if>
                                        <c:if test="${end > commentListVoList[0].page.totalPageCount }">
                                            <c:set var="begin" value="${commentListVoList[0].page.totalPageCount-2 }"/>
                                            <c:set var="end" value="${commentListVoList[0].page.totalPageCount }"/>
                                        </c:if>
                                    </c:otherwise>
                                </c:choose>
                                    &lt;%&ndash;上一页 &ndash;%&gt;
                                <c:choose>
                                    <c:when test="${commentListVoList[0].page.pageNow eq 1 }">
                                        &lt;%&ndash;当前页为第一页，隐藏上一页按钮&ndash;%&gt;
                                    </c:when>
                                    <c:otherwise>
                                        <a class="page-numbers"
                                           href="/admin/comment/p/${commentListVoList[0].page.pageNow-1}">
                                            <i class="layui-icon">&#xe603;</i>
                                        </a>
                                    </c:otherwise>
                                </c:choose>
                                    &lt;%&ndash;显示第一页的页码&ndash;%&gt;
                                <c:if test="${begin >= 2 }">
                                    <a class="page-numbers" href="/admin/comment/p/1">1</a>
                                </c:if>
                                    &lt;%&ndash;显示点点点&ndash;%&gt;
                                <c:if test="${begin  > 2 }">
                                    <span class="page-numbers dots">…</span>
                                </c:if>
                                    &lt;%&ndash;打印 页码&ndash;%&gt;
                                <c:forEach begin="${begin }" end="${end }" var="i">
                                    <c:choose>
                                        <c:when test="${i eq commentListVoList[0].page.pageNow }">
                                            <a class="page-numbers current">${i}</a>
                                        </c:when>
                                        <c:otherwise>
                                            <a class="page-numbers" href="/admin/comment/p/${i}">${i}</a>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                                    &lt;%&ndash; 显示点点点 &ndash;%&gt;
                                <c:if test="${end < commentListVoList[0].page.totalPageCount-1 }">
                                    <span class="page-numbers dots">…</span>
                                </c:if>
                                    &lt;%&ndash; 显示最后一页的数字 &ndash;%&gt;
                                <c:if test="${end < commentListVoList[0].page.totalPageCount }">
                                    <a href="/admin/comment/p/${commentListVoList[0].page.totalPageCount}">
                                            ${commentListVoList[0].page.totalPageCount}
                                    </a>
                                </c:if>
                                    &lt;%&ndash;下一页 &ndash;%&gt;
                                <c:choose>
                                    <c:when test="${commentListVoList[0].page.pageNow eq commentListVoList[0].page.totalPageCount }">
                                        &lt;%&ndash;到了尾页隐藏，下一页按钮&ndash;%&gt;
                                    </c:when>
                                    <c:otherwise>
                                        <a class="page-numbers"
                                           href="/admin/comment/p/${commentListVoList[0].page.pageNow+1}">
                                            <i class="layui-icon">&#xe602;</i>
                                        </a>
                                    </c:otherwise>
                                </c:choose>

                            </div>
                        </nav>
                        &lt;%&ndash;分页 end&ndash;%&gt;
                    </c:if>
                </div>--%>
            </div>
            <div class="layui-tab-item">
                <table class="layui-table" lay-even lay-skin="nob">
                    <colgroup>
                        <col width="100">
                        <col width="300">
                        <col width=200">
                        <col width="150">
                        <col width="50">
                    </colgroup>
                    <thead>
                    <tr>
                        <th>作者</th>
                        <th>评论内容</th>
                        <th>回复至</th>
                        <th>提交于</th>
                        <th>ID</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${hiddenCommentListVoList}" var="c">
                        <tr>
                            <td>
                                <img src="https://github.com/SSSS1233/myblog/blob/master/a.jpg?raw=true" alt="" width="64px">
                                <strong>${c.comment_author_name}</strong> <br>
                                    ${c.comment_author_url} <br>
                                    ${c.comment_author_email} <br>
                                    ${c.comment_ip}
                            </td>
                            <td class="dashboard-comment-wrap">
                                <c:if test="${c.comment_pid!=0}">
                                    <a href="${c.comment_author_url}">@ ${c.comment_pname}</a></span>
                                </c:if>
                                    ${c.comment_content}
                                <div class="row-actions">
                                    <span class="">
                                        <c:choose>
                                            <c:when test="${c.comment_status==0}">
                                                <a href="javascript:void(0)" style="color:#5FB878;!important;"
                                                   onclick="approveComment(${c.comment_id})">批准</a>
                                            </c:when>
                                            <c:otherwise>
                                                <a href="javascript:void(0)" style="color:#FF5722;!important;"
                                                   onclick="hideComment(${c.comment_id})">屏蔽</a>
                                            </c:otherwise>
                                        </c:choose>
                                    </span>
                                    <span class=""> |
                                        <a href="/admin/comment/reply/${c.comment_id}">回复</a>
                                    </span>
                                    <span class=""> |
                                         <a href="/admin/comment/edit/${c.comment_id}">编辑</a>
                                    </span>
                                    <span class=""> |
                                        <a href="javascript:void(0)"
                                           onclick="deleteComment(${c.comment_id})">删除</a>
                                    </span>
                                </div>
                            </td>
                            <td>
                                <a href="/article/${c.comment_article_id}"
                                   target="_blank">${c.articles.article_title}</a>
                            </td>
                            <td>
                                <fmt:formatDate value="${c.comment_create_time}"
                                                pattern="yyyy年MM月dd日 HH:dd:ss"/>
                            </td>
                            <td>
                                    ${c.articles.article_id}
                            </td>

                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>


</rapid:override>
<rapid:override name="footer-script">
    <script>

    </script>
</rapid:override>

<%@ include file="../Public/framework.jsp" %>
