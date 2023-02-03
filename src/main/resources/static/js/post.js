// 게시글 삭제
function remove(id) {
    $.ajax({
        type: "delete",
        url: `/remove/${id}`,
    }).done(res => {
        alert("삭제가 성공하였습니다!")
        console.log("성공")
        location.reload();
    }).fail(error => {
        console.log("오류", error);
    });
}

// 게시글 수정
function update(id) {
    event.preventDefault();
    let data = $("#postUpdate").serialize();
    console.log(data);
    console.log(id);

    $.ajax({
        url: `/update/${id}`,
        type:'put',
        data:JSON.stringify(data),
        dataType: "json",
        contentType:'application/json;charset=UTF-8'
    }).done(res => {
        alert("수정 성공하였습니다!")
        console.log("성공");
    }).fail(error => {
        console.log("오류", error);
    });
}