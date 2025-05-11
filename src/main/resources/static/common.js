function doDeleteArticle(id) {
    if (!confirm(id + "번 글을 삭제하시겠습니까?")) return;

    fetch("/usr/article/doDelete?id=" + id)
        .then(res => res.text())
        .then(msg => {
            alert(msg);
            location.reload(); // 또는 location.href = '/usr/article/list';
        });
}
