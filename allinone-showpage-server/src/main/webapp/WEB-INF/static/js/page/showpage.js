$(function () {
    var mk = {
        name: "kanma",
        age: 28
    };
    $("#clickme").click(function () {
        var param = {username : "kanma"};
        //获取模态框数据
        $.ajax({
            type: "POST",
            url: "getMessage",
            data: '{"username":"reader001","password":"psw001"}',
            contentType: "application/json;charset=utf-8",
            dataType: "json",
            success: function (result) {
                if (result != null) {
                    $("#mymodal").modal();
                }
            }
        });
    });
});