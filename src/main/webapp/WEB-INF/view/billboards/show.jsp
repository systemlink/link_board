<!DOCTYPE html>
<html>

<head>
<title>詳細画面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}" />
</head>

<body>
	<div class="container">
		<header>
			<h3 align="center">掲示板</h3>
			<hr size=4>
		</header>

		<div align="right">
			<s:link href="/billboards/">
				<button type="submit">戻る</button>
			</s:link>
		</div>

		<div class="mid_title">添付ファイル</div>

		<!-- アップロードした添付ファイルがある場合のみ、submitボタンを表示します。 -->
		<c:if test="${billboardItems.fileName != null}">
			<s:form>
				<html:hidden property="id" />
				<input type="submit" name="download" value=" ${billboardItems.fileName}" />
			</s:form>
		</c:if>
		<br>

		<div class="mid_title">タイトル</div>
		<div class="report">${f:h(billboardItems.title)}</div>

		<div class="mid_title">内容</div>
		<div class="report">${f:br(f:h(billboardItems.note))}</div>

		<div class="mid_title">分類</div>
		<div class="report">${f:h(billboardItems.nameMst.name)}</div>

		<div class="mid_title">作成者</div>
		<div class="report">${f:h(billboardItems.user.name)}</div>
		<hr>

		<div align="center">
			<s:link href="edit/${id}">
				<button type="submit">編集</button>
			</s:link>

			<s:link href="/billboards/">
				<button type="submit">戻る</button>
			</s:link>
		</div>
	</div>
</body>

</html>