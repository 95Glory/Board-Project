// 게시글 삭제
function remove(id) {
    $.ajax({
        type: "delete",
        url: `/remove/${id}`,
        dataType: "json"
    }).done(res => {
        alert("삭제가 성공하였습니다!")
    }).fail(error => {
        console.log("오류", error);
    });
}