<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>詳細画面</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}" />
</head>

<body>

	<html:errors />
	<s:form>
		<html:hidden property="id" />
		<div id="main" class="container">
			<h3 align="center">掲示板</h3>
			<hr size="4" />
			<div align="right">
				<input type="submit" name="index" value="戻る" />
			</div>
			<div class="mid_title">タイトル</div>
			<div class="report">${f:h(billboardItem.title)}</div>
			<div class="mid_title">内容</div>
			<div class="report">${f:br(f:h(billboardItem.note))}</div>
			<div class="mid_title">分類</div>
			<div class="report">${f:h(billboardItem.nameMst.name)}</div>
			<div class="mid_title">作成者</div>
			<div class="report">${f:h(billboardItem.user.name)}</div>
			<div class="mid_title">添付ファイル</div>
			<div class="report">
				<input type="submit" name="download" value="${billboardItem.fileName}" />
			</div>

			<hr size="1" />
			<div align="center">
				<input type="submit" name="edit" value="編集" /> <input type="submit"
					name="index" value="キャンセル" />
			</div>
		</div>
	</s:form>
</body>

</html>