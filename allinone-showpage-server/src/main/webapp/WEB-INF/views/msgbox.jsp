<%--
  Created by IntelliJ IDEA.
  User: MaKang
  Date: 2018/12/9
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<html>
<head>
    <title>弹出框</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <script src="resources/js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/select2.css">
    <script src="resources/js/bootstrap.js"></script>
    <script src="resources/js/page/showpage.js"></script>
    <script src="resources/js/select2.js"></script>
</head>
<body>
<div>
    <label class="label-primary">使用Bootstrap弹出框替换alert弹出框,显示更多信息</label>
</div>
<button class="btn btn-primary" id="clickme" type="button">点击我</button>
<!-- 模态弹出窗内容 -->
<div class="modal" id="mymodal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span
                        class="sr-only">Close</span></button>
                <h4 class="modal-title">模态弹出窗标题</h4>
            </div>
            <div class="modal-body">
                <p>模态弹出窗主体内容</p>
                <p>模态弹出窗主体内容</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<select class="js-data-example-ajax" id="ddlsupplierid" style="width: 130px">
    <option value="0">全部</option>
    <option value="-100">白名单</option>
</select>
</body>
</html>
<script type="text/javascript">

    function loadVendorList() {
        /*
                //加载供应商数据
                for(var key in VendorList){
                    $('#ddlsupplierid').append('<option value="' + key + '">' + VendorList[key] + '-' + key + '</option>');
                }*/
        var list = [];
        var list1 = [];
        for (var i = 1; i < 500; i++) {
            list.push({
                supplierid: i,
                suppliername: "测试供应商" + i
            });
        }

        for (var j = 1; j < 18000; j++) {
            list1.push({
                id: j,
                text: "测试供应商" + j
            });
        }


        /*        var length = list.length;
                for(var len = 1;len<length;len++){
                    $('#ddlsupplierid').append('<option value="' +  list[len].supplierid + '">' + list[len].suppliername + '-' + list[len].supplierid + '</option>');

                }*/

        /*        $('#ddlsupplierid').select2(
                    {
                        closeOnSelect: true,
                        data: list1
                    }
                );*/
               $('#ddlsupplierid').select2(
                    {
                        ajax: {
                            url: "/getSupplierList",
                            type: 'get',
                            dataType: 'json',
                            data: function (params) {
                                return {
                                    q: params.term // search term
                                };
                            },
                            processResults: function (data) {
                                var tem = [];
                                for (var i = 0; i < data.length; i++) {
                                    tem.push({
                                        id :data[i].supplierId,
                                        text:data[i].supplierName
                                })
                                    ;
                                }
                                return {
                                    results: tem
                                };
                            },
                            cache: true
                        }
                    }
                );
    }

    window.onload = function () {
        loadVendorList();
    }

</script>

