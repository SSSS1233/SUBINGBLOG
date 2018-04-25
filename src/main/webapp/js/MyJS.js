/**
 * Created by Administrator on 2018/4/25.
 */
//分页
function checkPage(page) {
    alert("LLL");
      if(page<=0&&page!=-10)
      {
          page=1;
      }

        $(location).attr('href', '/admin/comment/replySubmitByPage/'+page);


}