var ue1 = UE.getEditor('editor1',{
    toolbars: [
        ['source', 'undo', 'redo', 'bold','italic','underline','strikethrough',
            'forecolor','lineheight','paragraph','fontfamily','fontsize','justifyleft','justifyright',
            'justifycenter','justifyjustify','simpleupload','unlink','link']
    ],
    initialFrameWidth:1000,  //初始化编辑器宽度,默认1000
    initialFrameHeight:300,  //初始化编辑器高度,默认320

});
var ue2= UE.getEditor('editor2',{
    toolbars: [
        ['source', 'undo', 'redo', 'bold','italic','underline','strikethrough',
            'forecolor','lineheight','paragraph','fontfamily','fontsize','justifyleft','justifyright',
            'justifycenter','justifyjustify','simpleupload','unlink','link']
    ],
    initialFrameWidth:1000,  //初始化编辑器宽度,默认1000
    initialFrameHeight:300,  //初始化编辑器高度,默认320

});
var ue3= UE.getEditor('editor3',{
    toolbars: [
        ['source', 'undo', 'redo', 'bold','italic','underline','strikethrough',
            'forecolor','lineheight','paragraph','fontfamily','fontsize','justifyleft','justifyright',
            'justifycenter','justifyjustify','simpleupload','unlink','link']
    ],
    initialFrameWidth:1000,  //初始化编辑器宽度,默认1000
    initialFrameHeight:300,  //初始化编辑器高度,默认320

});
var ue4= UE.getEditor('editor4',{
    toolbars: [
        ['source', 'undo', 'redo', 'bold','italic','underline','strikethrough',
            'forecolor','lineheight','paragraph','fontfamily','fontsize','justifyleft','justifyright',
            'justifycenter','justifyjustify','simpleupload','unlink','link']
    ],
    initialFrameWidth:1000,  //初始化编辑器宽度,默认1000
    initialFrameHeight:300,  //初始化编辑器高度,默认320

});
var ue5= UE.getEditor('editor5',{
    toolbars: [
        ['source', 'undo', 'redo', 'bold','italic','underline','strikethrough',
            'forecolor','lineheight','paragraph','fontfamily','fontsize','justifyleft','justifyright',
            'justifycenter','justifyjustify','simpleupload','unlink','link']
    ],
    initialFrameWidth:1000,  //初始化编辑器宽度,默认1000
    initialFrameHeight:300,  //初始化编辑器高度,默认320

});
var ue6= UE.getEditor('editor6',{
    toolbars: [
        ['source', 'undo', 'redo', 'bold','italic','underline','strikethrough',
            'forecolor','lineheight','paragraph','fontfamily','fontsize','justifyleft','justifyright',
            'justifycenter','justifyjustify','simpleupload','unlink','link']
    ],
    initialFrameWidth:1000,  //初始化编辑器宽度,默认1000
    initialFrameHeight:300,  //初始化编辑器高度,默认320

});

$(".se").change(function () {
    var index=$(this).find("option:selected").index()+1
    $(".newsBox"+index).show().siblings("div").hide()
})

//单图上传
function imgUpLoad(fileId, ImgId) {
    $.ajaxFileUpload({
        url :"",
        type : 'post',
        secureuri : false, // 一般设置为false
        fileElementId : fileId, // 上传文件的id、name属性名
        dataType : 'text',
        success : function(data, status) {
            var obj = eval("(" + data + ")");
            if (!obj.success) {
                alert(obj.msg);
            } else {
                $("#" + ImgId).attr("src", obj.msg);
                imgSave();// 实时保存
            }
        },
        error : function(data, status, e) {
           alert("上传失败");
        }
    });
}
function imgSave() {

}
