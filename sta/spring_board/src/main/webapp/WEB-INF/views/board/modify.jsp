<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="../includes/header.jsp" %>
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Board Modify</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>            
            <div class="row">
                <div class="col-lg-12">
                	<div class="panel panel-default">
                        <div class="panel-heading">
                           Board Modify Page
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                			<form action="" method="post" role="form">
                				<div class="form-group">
                					<label>Bno</label>
                					<input class="form-control" name="bno" readonly="readonly" value="${vo.bno }">                				
                				</div> 
                				<div class="form-group">
                					<label>Title</label>
                					<input class="form-control" name="title" value="${vo.title }">                				
                				</div>  
                				<div class="form-group">
                					<label>Content</label>
                					<textarea class="form-control" rows="3" name="content">${vo.content }</textarea>               				
                				</div> 
                				<div class="form-group">
                					<label>Writer</label>
                					<input class="form-control" name="writer" readonly="readonly" value="${vo.writer }">                				
                				</div>  
                				<button type="submit" data-oper='modsfy' class="btn btn-default">Modify</button>              			
                				<button type="submit" data-oper='remove' class="btn btn-danger">Remove</button>              			
                				<button type="submit" data-oper='list' class="btn btn-info">List</button>              			
                			</form>
                		</div>
                	</div>
                </div>
            </div>
			<%-- remove와 list를 위한 폼--%>
			<form action="" method="post" name="form1">
				<input type="hidden" name="bno" value="${vo.bno }" />
				<input type="hidden" name="pageNum" value="${cri.pageNum}"/>
				<input type="hidden" name="amount" value="${cri.amount}"/>
				<input type="hidden" name="type" value="${cri.type}"/>
				<input type="hidden" name="keyword" value="${cri.keyword}"/>
					
			</form>
			<%-- 스크립트 --%>
			<script>
				$(function(){
					
					//remove 와 list 버튼 클릭시 사용할 폼 가져오기
					var form=$("form[name='form1']");
					$("button").click(function(e){
						//submit기능 막기
						e.preventDefault();
						
						var oper=$(this).data("oper");
						
						if(oper==='list'){//새로만든 폼 보내기
							form.find("input[name='bno']").remove();
							form.attr("action","/board/list");
							form.attr("method","get");
							
						}else if(oper==='remove'){//새로마든 폼 보내기
							form.attr("action","/board/remove");
							
							
						}else if(oper==='modify'){
							//원래 폼 보내기
							form=$("form[role='form']");
							
						}
						
						form.submit();
						
					})
					
				})
			
			</script>
			
<%@include file="../includes/footer.jsp" %>       